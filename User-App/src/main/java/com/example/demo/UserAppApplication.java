package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.repo.UserRepository;

@SpringBootApplication
public class UserAppApplication implements ApplicationRunner{
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserAppApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		User u1=new User(null,"Jagadeesh","jagadeesh@gmail.com");
		userRepository.save(u1);
		
		User u2=new User(null,"Rana","Rana@gmail.com");
		userRepository.save(u2);
		
		User u3=new User(null,"Prabhas","Prabhas@gmail.com");
		userRepository.save(u3);
		
		User u4=new User(null,"Shivagami","Shivagami@gmail.com");
		userRepository.save(u4);
		
	}

}
