package com.pointgenesis.rest.webservices.restfulwebservices.post;

import java.util.Date;

public class Post {

	private Integer id;
	private Date timestamp;
	private String title;
	private String message;

	protected Post() {
		
	}
	
	public Post(Date timestamp, String title, String message) {
		super();
		this.timestamp = timestamp;
		this.title = title;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
