package com.pointgenesis.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pointgenesis.rest.webservices.restfulwebservices.post.Post;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int count = 3;
	
	static {
		Post firstPost = new Post(new Date(), "My First Post.", "What a wonderful day.");
		
		User adam = new User(1, "Adam", new Date());
		adam.addPost(firstPost);
		users.add(adam);
		users.add(new User(2, "John", new Date()));
		users.add(new User(3, "Mary", new Date()));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++count);
		}
		users.add(user);
		return user;		
	}
	
	public User findById(int id) {
		for (User user:users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
