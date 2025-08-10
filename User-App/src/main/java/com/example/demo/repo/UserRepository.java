package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {



	List<User> findByName(String name);

	List<User> findByNameIgnoreCase(String name);

}
