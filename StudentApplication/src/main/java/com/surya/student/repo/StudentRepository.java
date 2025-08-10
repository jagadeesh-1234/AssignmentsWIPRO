package com.surya.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.student.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
