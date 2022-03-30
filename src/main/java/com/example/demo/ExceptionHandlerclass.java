package com.example.demo;

import java.time.LocalDateTime;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class ExceptionHandlerclass extends ResponseEntityExceptionHandler {
	 
		@ExceptionHandler(EmployeeAlreadyExistsException.class)
		public ResponseEntity<Object> EmployeeAlreadyExistsHandling(EmployeeAlreadyExistsException ex, WebRequest request){
			
			return new ResponseEntity<Object>(new Error(ex.getMessage(),HttpStatus.CONFLICT,LocalDateTime.now()) , HttpStatus.CONFLICT);
		}
}

