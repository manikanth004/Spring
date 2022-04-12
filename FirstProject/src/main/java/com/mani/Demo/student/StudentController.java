package com.mani.Demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Home")
public class StudentController
{
	public final StudentService studentservice;
	@Autowired
	public StudentController(StudentService studentservice) {
		this.studentservice = studentservice;
}
	
	@GetMapping
	public  List<Student> getStudents()
	{
		return studentservice.getStudents(); 
		

	
	}
}


	
