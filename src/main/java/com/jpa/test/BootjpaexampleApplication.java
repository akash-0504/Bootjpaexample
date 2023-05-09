package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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

		
//		  User user = new User(); user.setName("akash bairagi");
//		  user.setCity("indore"); user.setStatus("java developer");
//		  
//		  User user2 = userRepository.save(user); System.out.println(user2);
		 
		 //create object of user
//		User user1 = new User();
//		user1.setName("anil");
//		user1.setCity("pune");
//		user1.setStatus("c++ developer");
//
//		User user2 = new User();
//		user2.setName("veer");
//		user2.setCity("Mumbai");
//		user2.setStatus("c# developer");

		// saving single user
		// User resultUser = userRepository.save(user2);
		//List<User> users = List.of(user1, user2);
//		
		
//		//save multiple objects
//      	Iterable<User> result = userRepository.saveAll(users);
//
//		result.forEach(user -> {
//			System.out.println(user);
//
//		});

//		// System.out.println("saved user" + resultUser);
//		System.out.println("done");

		
		// update the user of id 53
//		Optional<User> optional = userRepository.findById(53);
//		User user = optional.get();
//		user.setName("raj kapoor");
//		User result = userRepository.save(user);
//		System.out.println(result);

		
		
		//how to get data 
		//findById(id) - return optional containing your data 
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
		
		/*
		 * while(iterator.hasNext()) 
		 * { User user = iterator.next();
		 * System.out.println(user);
		 * 
		 * }
		 */
		
	//	itr.forEach(user->{System.out.println(user);}); 
		
		//Deleting the user element by id 
//		userRepository.deleteById(53);
//		System.out.println("deleted");
//	}
        
		//deleting by all users
		
//		Iterable<User> alluser = userRepository.findAll();
//		
//		alluser.forEach(user->System.out.println(user));
//		
//		userRepository.deleteAll(alluser);
		
		
		
		
		  List<User> users =  userRepository.findByName("anil");
		  
		  users.forEach(e->System.out.println(e));
	}
}
