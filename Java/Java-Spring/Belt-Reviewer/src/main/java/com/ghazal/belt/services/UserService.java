package com.ghazal.belt.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.ghazal.belt.models.Event;
import com.ghazal.belt.models.Message;
import com.ghazal.belt.models.User;
import com.ghazal.belt.repositories.EventRepository;
import com.ghazal.belt.repositories.MessageRepository;
import com.ghazal.belt.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	private final EventRepository eventRepository;
	private final MessageRepository messageRepository;

	public UserService(UserRepository userRepository, EventRepository eventRepository,
			MessageRepository messageRepository) {
		this.userRepository = userRepository;
		this.eventRepository = eventRepository;
		this.messageRepository = messageRepository;
	}

	public void deleteEvent(Long id) {
		eventRepository.deleteById(id);
	}

	public List<Event> allEvents() {
		return (List<Event>) eventRepository.findAll();
	}

	public Event addEvent(Event event) {
		return eventRepository.save(event);
	}

	public Message addMessage(Message message) {
		return messageRepository.save(message);
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

	public Event findEventById(Long id) {
		Optional<Event> e = eventRepository.findById(id);
		if (e.isPresent()) {
			return e.get();
		} else {
			return null;
		}
	}

	public void updateEvent(Event event) {
		eventRepository.save(event);
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

	public void updateMessage(Message message) {
		messageRepository.save(message);
	}

	public void newMessage(Message message) {
		messageRepository.save(message);
	}

	// Authentication
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

}