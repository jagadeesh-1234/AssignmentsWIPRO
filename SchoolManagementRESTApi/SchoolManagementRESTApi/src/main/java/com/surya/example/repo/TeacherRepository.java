package com.surya.example.repo;

import com.surya.example.entities.Teacher;
import com.surya.example.entities.Teacher.Qualification;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	List<Teacher> findByQualification(Qualification qualification);

	void deleteByTeacherAddress(String teacherAddress);

}
