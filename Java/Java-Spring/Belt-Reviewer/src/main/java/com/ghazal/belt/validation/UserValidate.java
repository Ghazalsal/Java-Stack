package com.ghazal.belt.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ghazal.belt.models.User;

@Component
public class UserValidate implements Validator {

	  @Override
	    public boolean supports(Class<?> cla$$) {
	        return User.class.equals(cla$$);
	    }
	    
	    @Override
	    public void validate(Object target, Errors errors) {
	        User u = (User) target;    
	        if (!u.getConfirmPassword().equals(u.getPassword())) {
	            errors.rejectValue("passwordConfirmation", "Match");
	        }         
	    }
}