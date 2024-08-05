package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@RestController
public class Controller {

	@Autowired
	private StudentService service;
	
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student student1=service.addStudent(student);
		return ResponseEntity.ok().body(student1);
	}
}
