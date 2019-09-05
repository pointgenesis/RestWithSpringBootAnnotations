package com.pointgenesis.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.pointgenesis.rest.webservices.restfulwebservices.post.Post;

public class User {
	private Integer id;
	
	@Size(min=2, message="Variable: name - should be greater then 2-characters long.")
	private String name;
	
	@Past
	private Date birthday;
	
	private static int postCount = 0;
	private Map<Integer, Post> posts = new HashMap<>();

	protected User() {
		
	}
	
	public User(Integer id, String name, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public List<Post> getAllPosts() {
		List<Post> post = new ArrayList<>(posts.values());
		return post;
	}

	public Post getPost(Integer id) {
		return posts.get(id);
	}
	
	public void addPost(Post post) {
		if (post.getId() != null) {
			post.setId(++postCount);
		}
		this.posts.put(postCount, post);
	}
	
	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, birthday=%s]", id, name, birthday);
	}
	
}
