package com.BinaryLogic.jpaRelationships.subject;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import java.util.*;
import com.BinaryLogic.jpaRelationships.student.*;
import com.BinaryLogic.jpaRelationships.teacher.Teacher;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@ManyToMany
	@JoinTable(name="students_enrolled", 
	joinColumns = @JoinColumn(name = "subject_id"),
	inverseJoinColumns = @JoinColumn(name= "student_id")
	)
	private Set<Student> enrolledStudents = new HashSet<>();

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "teacher_id", referencedColumnName ="id")
	private Teacher teacher;
	
	public void enrollStudent(Student student) {
		enrolledStudents.add(student);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(Set<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public void assignTeacher(Teacher teacher2) {
		this.teacher = teacher2;
	}

}
