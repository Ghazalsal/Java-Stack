package com.axsos.logandreg.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.axsos.logandreg.models.Course;
import com.axsos.logandreg.models.User;
import com.axsos.logandreg.repositories.CourseRepository;
import com.axsos.logandreg.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CourseRepository courseRepository;
   
    
    public UserService(UserRepository userRepository,CourseRepository courseRepository) {
        this.userRepository = userRepository;
        this.courseRepository= courseRepository;
   
    }
    
    // register user and hash their password
    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }
    
    // find user by email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    // find user by id
    public User findUserById(Long id) {
    	Optional<User> u = userRepository.findById(id);
    	
    	if(u.isPresent()) {
            return u.get();
    	} else {
    	    return null;
    	}
    }
    
    // authenticate user
    public boolean authenticateUser(String email, String password) {
        // first find the user by email
        User user = userRepository.findByEmail(email);
        // if we can't find it by email, return false
        if(user == null) {
            return false;
        } else {
            // if the passwords match, return true, else, return false
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    public List<Course> findAllCourses(){
		return courseRepository.findAll();
	}
	

	
	public Course findCourseById(Long id) {
		Optional<Course> myCourse = courseRepository.findById(id);
		if(myCourse.isPresent()) {
			return myCourse.get();
		}else {
			return null;
		}
	}
	
	
	public Course createCourse(Course myCourse) {
		return courseRepository.save(myCourse);
	}

	public void updateCourse(Course myCourse) {
		courseRepository.save(myCourse);
	}

	public void deleteCourse(Course course) {
		courseRepository.delete(course);
	}

	public void updateUser(User user) {
    	userRepository.save(user);
    }

}
