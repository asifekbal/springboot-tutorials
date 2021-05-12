package org.asif.dao;

import java.util.List;

import org.asif.pojo.Post;

public interface PostDao {

	public List<Post> fetchPosts(Integer userId);

	public void addPost(Integer userId, Post post);
}
