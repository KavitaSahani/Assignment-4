package com.example.core.controller;
 
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.exception.ValidationException;
import com.example.core.model.ValidationFacadeModel;
 
import com.example.core.service.ValidationFacadeService;

@RestController
@RequestMapping("/api")
public class ValidationFacadeController {

    @Autowired
    private ValidationFacadeService validationFacadeService;

    @PostMapping("/endpoint")
    public ResponseEntity<Object> Endpoint(@RequestBody ValidationFacadeModel model) {
        try {
            validationFacadeService.validateInput(model);
           
            return ResponseEntity.ok("Request processed successfully");
        } catch (ValidationException e) {
          
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}