package com.example.student.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.dao.StudentDao;
import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao dao;
	
	@Override
	public Student addStudent(Student student) {
		Student student1=dao.save(student);
		return student1;
	}

}
