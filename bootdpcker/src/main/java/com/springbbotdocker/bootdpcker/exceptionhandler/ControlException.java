package com.springbbotdocker.bootdpcker.exceptionhandler;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControlException  {

	@ExceptionHandler
	public ResponseEntity<MessageError> handleException(ExceptionTask et) {
		MessageError msg= new MessageError();
		msg.setTimestamp(new Date());
		msg.setError(et.getMessage());
		 return ResponseEntity.badRequest().body(msg);
		
	}
}
