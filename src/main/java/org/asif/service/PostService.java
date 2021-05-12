package org.asif.service;

import java.util.List;

import org.asif.pojo.Post;

public interface PostService {
	
	public List<Post> fetchPosts(Integer userId);

	public void addPost(Integer userId, Post post);
}
