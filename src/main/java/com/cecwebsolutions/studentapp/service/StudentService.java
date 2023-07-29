package com.cecwebsolutions.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cecwebsolutions.studentapp.model.Student;
import com.cecwebsolutions.studentapp.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private final StudentRepository repository;

	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}

	public List<Student> getAllStudents() {
		return (List<Student>) repository.findAll();
	}

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public Student getStudent(Long id) {
		return repository.findById(id).orElse(null);
	}

}
