package com.springbbotdocker.bootdpcker.restcontroller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbbotdocker.bootdpcker.exceptionhandler.ExceptionTask;
import com.springbbotdocker.bootdpcker.exceptionhandler.MessageError;

@RestController
@RequestMapping("/api/hello")
public class HelloWorld {

	
	@GetMapping("/boot")
	public String helloWorld(@RequestParam String name) {
		return name;
	}
	
	@PostMapping("/myname")
	public ResponseEntity<Student> getName(@RequestBody Student student){
		String a=student.getAge();	
		if(a==null) throw new ExceptionTask("field is null");
		return ResponseEntity.accepted().body(student);	
	}
	
	
	
}
