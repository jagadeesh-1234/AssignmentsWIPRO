package com.surya.hibernate.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Username", unique = true)
    private String username;
    
    public enum Gender {
		MALE,
		FEMALE,
		OTHER;

}

    @Enumerated(EnumType.STRING)
    @Column(name = "Gender")
    private Gender gender;

    @Column(name = "DOB")
    private LocalDate dob;

    @Column(name = "Address")
    private String address;

    // ----- Getters and Setters -----

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Students() {
    
    }

    public Students(String firstName, String lastName, String username, Gender gender, LocalDate dob, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +
               ", username=" + username + ", gender=" + gender + ", dob=" + dob + ", address=" + address + "]";
    }
}
