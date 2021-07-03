package com.ghazal.beltexam.service;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;

import com.ghazal.beltexam.models.User;
import com.ghazal.beltexam.repositories.UserRepository;

public class UserService {
	private final UserRepository userRepository;
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	
	}
	public boolean authenticateUser(String email, String password) {
		User user = userRepository.findByEmail(email);
		if (user == null) {
			return false;
		} else {
			if (BCrypt.checkpw(password, user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean duplicateUser(String email) {
		User user = userRepository.findByEmail(email);
		if (user == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return userRepository.save(user);
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public User findUserById(Long id) {
		Optional<User> u = userRepository.findById(id);
		if (u.isPresent()) {
			return u.get();
		} else {
			return null;
		}
	}
	
	
	public void updateUser(User user) {
		userRepository.save(user);
	}
}
