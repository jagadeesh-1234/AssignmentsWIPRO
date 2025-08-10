package com.surya.example.services;

import java.util.List;

import com.surya.example.entities.Teacher;
import com.surya.example.entities.Teacher.Qualification;

public interface TeacherService {

	Teacher addTeacher(Teacher teacher);

	List<Teacher> findAllTeachers();

	Teacher updateTeacher(Long id, Teacher t);

	Teacher patchTeacherName(Long id, String name);

	void deleteTeacher(Long id);

	List<Teacher> getTeachersByQualification(Qualification qualification);

	void deleteTeacherByAddress(String teacherAddress);


	

	
	

}
