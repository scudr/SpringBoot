package com.cecwebsolutions.studentapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cecwebsolutions.studentapp.model.Student;
import com.cecwebsolutions.studentapp.service.StudentService;

//@RestController
@Controller
//@RequestMapping("/students")
public class StudentController {
	private final StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	@GetMapping("/students")
	public String getStudents(Model model) {
		List<Student> students = service.getAllStudents();
		System.out.println(students);
		model.addAttribute("students", students);
		return "students.html";
	}

//	 @GetMapping
//	    public List<Student> getAllStudents() {
//	        return service.getAllStudents();
//	    }

//    @GetMapping("/")
//    public String home() {
//        return "Welcome to the Home Page!";
//    }

//    @GetMapping("/students")
//    public Student testDatabase() {
//        Student student = new Student();
//        student.setName("Test Student");
//        student.setAge(20);
//        
//        // Save the student
//        student = service.saveStudent(student);
//        
//        // Retrieve the student
//        Student retrievedStudent = service.getStudent(student.getId());
//
//        return retrievedStudent;
//    }
}
