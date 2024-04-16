package com.example.core.service;

import org.springframework.stereotype.Service;

import com.example.core.exception.ValidationException;
import com.example.core.model.ValidationFacadeModel;

@Service
public class ValidationFacadeService {
	 public void validateInput(ValidationFacadeModel model) throws ValidationException {
	       
	        if (model.getName() == null || model.getName().isEmpty()) {
	            throw new ValidationException("Name cannot be empty");
	        }
	         if (model.getAge() == null) {  
	            throw new ValidationException("Age cannot be empty");
	        } else if (model.getAge() <= 0) {
	            throw new ValidationException("Age must be greater than 0");
	        }
	 }
}

