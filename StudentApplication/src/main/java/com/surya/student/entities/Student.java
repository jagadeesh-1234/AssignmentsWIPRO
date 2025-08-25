package com.surya.student.entities;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private String id; // MongoDB usually uses String/ObjectId

    private String studentName;

    private String studentMail;

    private Long rollNo;

    private Long age;

    private LocalDate dob;

    private Gender gender; 

    private String address;

    public enum Gender {
        MALE, FEMALE, OTHERS
    }
}
