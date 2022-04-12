package com.mani.Demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public  List<Student> getStudents()
	{
		return List.of(
				new Student(
						1L,
						"Manikanth",
						"dasamani@00",
						LocalDate.of(1998, 05, 05),
						24
						
						)
				
				
				);
}
	}
