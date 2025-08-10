package com.example.demo.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

		private final UserService userService;
		
		@PostMapping("/addNewUser")
		private User addUser(@Valid @RequestBody User user) {
			User ExistedUser =userService.save(user);
			return ExistedUser;
		}
		
		@GetMapping("/getUserById/{id}")
		public User getUserById(@PathVariable Long id) {
			return userService.getUserById(id);
		}
		
		@GetMapping("getAllUsers")
		
		public List<User> getAllUser(){
			return userService.findAllUser();
		}
		
		@GetMapping("getAllUsersPage")
		
		public Page<User> getAllUserPage(Pageable pageable){
			return userService.findAllUserPage(pageable);
		}
		
		@GetMapping("/deleteUserById/{id}")
		public String deleteUser(@PathVariable Long id) {
			userService.deleteUserById(id);
			System.out.println("Deleted Successfully"+id);
			return "User Deleted Successfully";
		
		}
		
		@PutMapping("/updateUserById/{id}")
		public User updateUserById(@PathVariable Long id, @RequestBody User user) {
			return userService.updateUserById(id, user);
		}
		
		@PatchMapping("/patchUpdateUserById/{id}")
		public User patchUpdateUserById(@PathVariable Long id, @RequestBody User user) {
			return userService.patchUpdateUserById(id, user);
		}
		
		@GetMapping("/findAllByName/{name}")
		public List<User> findAllByName(@PathVariable String name){
			return userService.findAllUserByName(name);
		}
		
		
		
		
}
