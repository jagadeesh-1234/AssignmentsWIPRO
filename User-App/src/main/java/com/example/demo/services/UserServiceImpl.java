package com.example.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User save(User user) {

		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findAllUser() {
	
		return userRepository.findAll();
	}

	@Override
	public Page<User> findAllUserPage(Pageable pageable) {
		
		return userRepository.findAll(pageable);
	}

	@Override
	public void deleteUserById(Long id) {
		
		userRepository.deleteById(id);
		
	}

	@Override
	public User updateUserById(Long id, User user) {
		
		User existedUser = userRepository.findById(id).
				orElseThrow(()-> new RuntimeException("User with id is not Present" + id));
		
		
		existedUser.setName(user.getName());
		existedUser.setEmail(user.getEmail());
		
		return userRepository.save(existedUser);
	
	}

	@Override
	public User patchUpdateUserById(Long id, User user) {
		
		User existedUser = userRepository.findById(id).
				orElseThrow(()-> new RuntimeException("User with id is not Present" + id));
		
		if(user.getName()!=null) {
		existedUser.setName(user.getName());
		}
		if(user.getEmail()!=null) {
		existedUser.setEmail(user.getEmail());
		}
		
		return userRepository.save(existedUser);
		
	}

	@Override
	public List<User> findAllUserByName(String name) {
		
		return userRepository.findByNameIgnoreCase(name);
	}

}
