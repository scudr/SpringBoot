package com.cecwebsolutions.studentapp.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cecwebsolutions.studentapp.model.Student;
import com.cecwebsolutions.studentapp.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private final StudentRepository repository;

	// Autowiring DataSource
//	@Autowired
//	private DataSource dataSource;

	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}

	public List<Student> getAllStudents() {
		List<Student> students = (List<Student>) repository.findAll();
		System.out.println(students);
		return students;
	}

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public Student getStudent(Long id) {
		return repository.findById(id).orElse(null);
	}

//	@PostConstruct
//	public void printDataSource() {
//		System.out.println(dataSource);
//	}

}
