package com.axsos.logandreg.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.logandreg.models.Course;
import com.axsos.logandreg.models.User;
import com.axsos.logandreg.services.UserService;
import com.axsos.logandreg.validation.UserValidator;

@Controller
public class UserController {
	private final UserService userService;
	private final UserValidator userValidator;

	public UserController(UserService userService, UserValidator userValidator) {
		this.userService = userService;
		this.userValidator = userValidator;
	}

	@RequestMapping("")
	public String registerForm(@ModelAttribute("user") User user) {
		return "home.jsp";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, Model model,
			HttpSession session) {
		userValidator.validate(user, result);

		if (result.hasErrors())
			return "home.jsp";
		if (userService.findByEmail(user.getEmail()) != null) {
			model.addAttribute("error", "This email already exist!!");
			return "home.jsp";
		}else {
			
			userService.registerUser(user);
			return "redirect:/courses";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@ModelAttribute("user") User user, @RequestParam("email") String email,
			@RequestParam("password") String password, Model model, HttpSession session) {
		
		if (userService.authenticateUser(email, password)) {
			session.setAttribute("userId", userService.findByEmail(email).getId());
			return "redirect:/courses";
		} else {
			model.addAttribute("error", "Invalid User name or Password");
			return "home.jsp";
		}
	}

// -------------------------------------------------------courses page-------------------------------------------------------
	@RequestMapping("/courses")
	public String home(HttpSession session, Model model) {
		// get user from session, save them in the model and return the home page
		if (session.getAttribute("userId") == null)
			return "redirect:/";
		Long Id = (Long) session.getAttribute("userId");
		User u = userService.findUserById(Id);
		List<Course> courses = userService.findAllCourses();
		model.addAttribute("user", u);
		model.addAttribute("courses", courses);
		return "welcome.jsp";

	}

//		-------------------------------------------------------Create course-------------------------------------------------------
	@RequestMapping("/courses/new")
	public String courseCreation(@ModelAttribute("course") Course myCourse) {
		return "newcourse.jsp";
	}

	
	@PostMapping("/courses/new")
	public String createCourse(@Valid @ModelAttribute("course") Course myCourse, BindingResult result) {
		if (result.hasErrors()) {

			
			return "newcourse.jsp";
		} else {
			
			userService.createCourse(myCourse);
			return "redirect:/courses";
		}
	}

//		-------------------------------------------------------Create course-------------------------------------------------------

	// display course information
	@RequestMapping("courses/{id}")
	public String displayCourse(@PathVariable("id") Long myId, Model model, HttpSession session) {
		Course myCourse = userService.findCourseById(myId);
		model.addAttribute("course", myCourse);

		List<User> users = myCourse.getUsers();
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUserById(userId);
		model.addAttribute("currentUser",u);
		System.out.println("--get id-- "+u.getId());
		return "courseinfo.jsp";
	}

	// add user to a course
	@RequestMapping("/courses/add/{id}")
	public String addCourse(@PathVariable("id") Long myId, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUserById(userId);
		Course course = userService.findCourseById(myId);
		
		u.getCourses().add(course);
		userService.updateUser(u);
		
		
		return "redirect:/courses";
	}

	
	// edit page
	@RequestMapping("/courses/{id}/edit")
	public String editPage(@ModelAttribute("course") Course myCourse, @PathVariable("id") Long myId, Model model) {
		Course course = userService.findCourseById(myId);
		model.addAttribute("course", course);
		return "edit.jsp";
	}

	// update course
	@PostMapping("/courses/update")
	public String updateCourse(@Valid @ModelAttribute("course") Course myCourse, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			List<User> myStudents =myCourse.getUsers();
			System.out.println("--- all students --- "+ myStudents);
//			myCourse.setUsers(myStudents);
			userService.updateCourse(myCourse);
			
			return "redirect:/courses";
		}
	}

	// Delete Course
	@RequestMapping("/courses/delete/{id}")
	public String deleteCourse(@PathVariable("id") Long id) {
		Course myCourse = userService.findCourseById(id);
		if (myCourse != null) {
			userService.deleteCourse(myCourse);
			return "redirect:/courses";
		} else {
			System.out.println("Course doesn't exist");
			return "redirect:/courses";
		}

	}

	// remove a current login user from a course
	// add user to a course
	@RequestMapping("/courses/{id}/remove")
	public String removeUserFromCourse(@PathVariable("id") Long myId, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUserById(userId);
		Course course = userService.findCourseById(myId);
		
		u.getCourses().remove(course);
		userService.updateUser(u);
		
		return "redirect:/courses";
	}
	
	//add a current login user to a course (in display course info page)
	@RequestMapping("/courses/{id}/add")
		public String addUserToCourse(@PathVariable("id") Long myId, Model model, HttpSession session) {
			Long userId = (Long) session.getAttribute("userId");
			User u = userService.findUserById(userId);
			Course course = userService.findCourseById(myId);
			
			u.getCourses().add(course);
			userService.updateUser(u);
			
			return "redirect:/courses";
		}
	
	@RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
        session.invalidate();
        return "redirect:/"; 
    }
}
