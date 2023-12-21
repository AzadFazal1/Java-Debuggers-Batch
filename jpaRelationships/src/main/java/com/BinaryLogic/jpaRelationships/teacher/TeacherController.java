package com.BinaryLogic.jpaRelationships.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	TeacherRepo teacherRepo;
	
	@GetMapping
	List<Teacher> getTeachers(){
		return teacherRepo.findAll();
	}
	
	@PostMapping
	Teacher createTeacher(@RequestBody Teacher teacher) {
		return teacherRepo.save(teacher);
	}
	
}
