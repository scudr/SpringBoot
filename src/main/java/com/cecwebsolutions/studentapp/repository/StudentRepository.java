package com.cecwebsolutions.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cecwebsolutions.studentapp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {}

//public interface StudentRepository extends CrudRepository<Student, Long> {}
