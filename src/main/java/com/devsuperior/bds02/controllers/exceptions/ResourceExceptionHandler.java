package com.devsuperior.bds02.controllers.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.bds02.services.exceptions.DatabaseException;
import com.devsuperior.bds02.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Void> entityNotFound(){
		return ResponseEntity.notFound().build();
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<Void> integrityViolation(){
		return ResponseEntity.badRequest().build();
	}
}
