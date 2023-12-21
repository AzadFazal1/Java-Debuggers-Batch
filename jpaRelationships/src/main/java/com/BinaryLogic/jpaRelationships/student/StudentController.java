package com.BinaryLogic.jpaRelationships.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	
	@Autowired
	StudentRepo studentRepo;
	
	@GetMapping
	public List<Student> getStudents(){
		return studentRepo.findAll();
		
	}
	
	@PostMapping
	Student createStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
}
