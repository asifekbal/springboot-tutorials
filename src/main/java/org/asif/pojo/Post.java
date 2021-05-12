package org.asif.pojo;

import java.util.Date;

public class Post {
	private String title;
	private String message;
	private int userId;
	private Date time;
	
	Post(){
		
	}

	public Post(String title, String message, int userId, Date time) {
		super();
		this.title = title;
		this.message = message;
		this.userId = userId;
		this.time = time;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Post [title=" + title + ", message=" + message + ", userId=" + userId + ", time=" + time + "]";
	}

}
