package com.pk.exceptionMapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pk.exception.SSADataNotFoundException;

/**
 * This Class is to handel Exception
 * @author Pankaj Kumar
 *
 */
@Controller
@ControllerAdvice
public class SSADataNotFoundExceptionMapper {

	@ExceptionHandler(SSADataNotFoundException.class)
	public ResponseEntity<String> handleSSAdataException(){
		
		ResponseEntity<String> entity = new ResponseEntity<String>("Invalid SSN Number", HttpStatus.BAD_REQUEST);
		return entity;
	}
}
