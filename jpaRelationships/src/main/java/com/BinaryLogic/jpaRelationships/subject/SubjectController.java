package com.BinaryLogic.jpaRelationships.subject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BinaryLogic.jpaRelationships.student.Student;
import com.BinaryLogic.jpaRelationships.student.StudentRepo;
import com.BinaryLogic.jpaRelationships.teacher.Teacher;
import com.BinaryLogic.jpaRelationships.teacher.TeacherRepo;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

	@Autowired
	SubjectRepo subjectRepo;
	
	@Autowired 
	StudentRepo studentRepo;
	
	@Autowired
	TeacherRepo teacherRepo;
	
	@GetMapping
	List<Subject> getSubjects(){
		return subjectRepo.findAll();
	}
	
	@PostMapping
	Subject createSubject(@RequestBody Subject subject) {
		return subjectRepo.save(subject);
		
	}
	
	@PutMapping("/{subjectId}/students/{studentId}")
	Subject enrollStudentToSubject(
			@PathVariable int subjectId,
			@PathVariable int studentId
			) {
		Subject subject = subjectRepo.findById(subjectId).get();
		Student student = studentRepo.findById(studentId).get();
		
		subject.enrollStudent(student);
		return subjectRepo.save(subject);
		
	}
	
	@PutMapping("/{subjectId}/teachers/{teacherId}")
	Subject assignTeacherToSubject(
			@PathVariable int subjectId,
			@PathVariable int teacherId
			) {
		Subject subject = subjectRepo.findById(subjectId).get();
		Teacher teacher = teacherRepo.findById(teacherId).get();
		subject.assignTeacher(teacher);
		return subjectRepo.save(subject);

		
	}
	
	
	
	
}
