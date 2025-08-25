package com.surya.student.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.surya.student.entities.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
