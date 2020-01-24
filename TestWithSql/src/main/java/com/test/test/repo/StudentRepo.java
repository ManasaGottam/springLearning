package com.test.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}