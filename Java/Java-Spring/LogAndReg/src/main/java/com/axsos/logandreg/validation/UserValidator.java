package com.axsos.logandreg.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.axsos.logandreg.models.User;

@Component
public class UserValidator implements Validator {

	// 1
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	// 2
	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;

		if (!user.getPasswordConfirmation().equals(user.getPassword())) {
			// 3
			errors.rejectValue("passwordConfirmation", "Match");
		}
	}
}