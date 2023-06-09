package com.jpa.test;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		/*
		 * User user = new User(); user.setName("akash bairagi");
		 * user.setCity("indore"); user.setStatus("java developer");
		 * 
		 * User user2 = userRepository.save(user); System.out.println(user2);
		 */
		// create object of user
//		User user1 = new User();
//		user1.setName("anil");
//		user1.setCity("pune");
//		user1.setStatus("c++ developer");
//
//		User user2 = new User();
//		user2.setName("veer");
//		user2.setCity("Mumbai");
//		user2.setStatus("c# developer");
//
//		// saving single user
//		// User resultUser = userRepository.save(user2);
//		List<User> users = List.of(user1, user2);
//		
//		//save multiple objects
//		Iterable<User> result = userRepository.saveAll(users);
//
//		result.forEach(user -> {
//			System.out.println(user);
//
//		});
//
//		// System.out.println("saved user" + resultUser);
//		System.out.println("done");

		// update the user of id 53

		Optional<User> optional = userRepository.findById(53);

		User user = optional.get();

		user.setName("raj kapoor");

		User result = userRepository.save(user);

		System.out.println(result);

	}

}
