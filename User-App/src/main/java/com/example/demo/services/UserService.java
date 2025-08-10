package com.example.demo.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.entities.User;

public interface UserService {
	User save(User save);

	User getUserById(Long id);

	List<User> findAllUser();

	Page<User> findAllUserPage(Pageable pageable);

	void deleteUserById(Long id);

	User updateUserById(Long id, User user);

	User patchUpdateUserById(Long id, User user);

	List<User> findAllUserByName(String n);
}
