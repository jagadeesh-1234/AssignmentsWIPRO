package com.surya.hibernate;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.surya.hibernate.entity.Students;
import com.surya.hibernate.util.HibernateUtil;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Students student = new Students();
        student.setFirstName("Ravi");
        student.setLastName("Kumar");
        student.setUsername("ravi.kumar"); // must be unique
        student.setGender(Students.Gender.MALE);
        student.setDob(LocalDate.of(2000, 5, 10));
        student.setAddress("Hyderabad, Telangana");
        session.persist(student);
        System.out.println("New student created: " + student);
        tx.commit();
        session.close();

      
        session = HibernateUtil.getSessionFactory().openSession();
        Students fetchedStudent = session.get(Students.class, student.getId());
        System.out.println("Fetched from DB: " + fetchedStudent);
        session.close();

 
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        fetchedStudent.setAddress("Updated Address - Gachibowli, Hyderabad");
        session.merge(fetchedStudent);
        System.out.println("Address updated: " + fetchedStudent);
        tx.commit();
        session.close();


        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        fetchedStudent.setFirstName("Ravi Teja");
        session.merge(fetchedStudent);
        System.out.println("First name updated: " + fetchedStudent);
        tx.commit();
        session.close();

  
    }
}
