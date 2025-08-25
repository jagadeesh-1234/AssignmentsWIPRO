package com.surya.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.student.entities.Student;
import com.surya.student.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getById(String id) {   // changed to String
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(String id) {   // changed to String
        studentRepository.deleteById(id);
    }
}

