package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	//to handle Specific exception
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails> exceptionHandler(StudentException ae, WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ae.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	
	//to handler any generic type exception
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptionHandler2(Exception ae, WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ae.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		
		
		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	
		@ExceptionHandler(NoHandlerFoundException.class)
		public ResponseEntity<MyErrorDetails> exceptionHandler3(NoHandlerFoundException ne, WebRequest req){
			
			MyErrorDetails err = new MyErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage(ne.getMessage());
			err.setDetails(req.getDescription(false));
			
			
			
			
			return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
			
		}
		
		
		@ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<MyErrorDetails> myMANVExceptionHandler(MethodArgumentNotValidException me)  {
		
			


			MyErrorDetails err = new MyErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage("Validation Error");
			err.setDetails(me.getBindingResult().getFieldError().getDefaultMessage());
			
			
			
			
			
			return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
				
		}
	
	
	

}
