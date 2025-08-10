package com.surya.student.entities;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String studentName;

	private String studentMail;

	private Long rollNo;

	private Long age;

	private LocalDate dob;

	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String address;

	public enum Gender {
		MALE, FEMALE, OTHERS
    }
}
