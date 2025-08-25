package com.surya.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.surya.example.entities.Teacher;
import com.surya.example.entities.Teacher.Qualification;
import com.surya.example.repo.TeacherRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TeacherServiceImpla implements TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> findAllTeachers() {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher updateTeacher(Long id, Teacher t) {
		Teacher existingTeacher = teacherRepository.findById(id)
		        .orElseThrow(() -> new EntityNotFoundException("Teacher not found with id: " + id));

		    existingTeacher.setTeacherName(t.getTeacherName());
		    existingTeacher.setTeacherAddress(t.getTeacherAddress());
		    existingTeacher.setQualification(t.getQualification());
		    existingTeacher.setAge(t.getAge());
		    existingTeacher.setDob(t.getDob());
		    existingTeacher.setExperience(t.getExperience());
		    

		    return teacherRepository.save(existingTeacher);
	}

	@Override
	public Teacher patchTeacherName(Long id, String name) {
		Teacher existingTeacher = teacherRepository.findById(id)
		        .orElseThrow(() -> new RuntimeException("Teacher not found with id: " + id));

		    existingTeacher.setTeacherName(name);  

		    return teacherRepository.save(existingTeacher);
	}

	@Override
	public void deleteTeacher(Long id) {
		teacherRepository.deleteById(id);
		
	}

	@Override
	public List<Teacher> getTeachersByQualification(Qualification qualification) {
	    return teacherRepository.findByQualification(qualification);
	}

	@Override
	public void deleteTeacherByAddress(String teacherAddress) {
		teacherRepository.deleteByTeacherAddress(teacherAddress);
	}


	
}
