package com.example.core;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.core.exception.ValidationException;
import com.example.core.model.ValidationFacadeModel;
import com.example.core.service.ValidationFacadeService;

@SpringBootTest
class ValidationFacadeApplicationTests {

	 private final ValidationFacadeService validationService = new ValidationFacadeService();

	    @Test
	    void testValidationWithValidInput() throws ValidationException {
	        ValidationFacadeModel model = new ValidationFacadeModel(); // Update to use ValidationFacadeModel
	        model.setName("John");
	        model.setAge(30);
	        validationService.validateInput(model); // Should not throw any exception
	    }

	    @Test
	    void testValidationWithInvalidName() {
	        ValidationFacadeModel model = new ValidationFacadeModel(); // Update to use ValidationFacadeModel
	        model.setName(""); // Empty name
	        model.setAge(30);
	        assertThrows(ValidationException.class, () -> validationService.validateInput(model));
	    }

	    @Test
	    void testValidationWithInvalidAge() {
	        ValidationFacadeModel model = new ValidationFacadeModel(); // Update to use ValidationFacadeModel
	        model.setName("John");
	        model.setAge(0); // Zero age
	        assertThrows(ValidationException.class, () -> validationService.validateInput(model));
	    }
	}
