package org.asif.service.impl;

import java.util.List;

import org.asif.dao.PostDao;
import org.asif.pojo.Post;
import org.asif.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostDao postDao;

	@Override
	public List<Post> fetchPosts(Integer userId) {
		return postDao.fetchPosts(userId);
	}

	@Override
	public void addPost(Integer userId, Post post) {
		postDao.addPost(userId, post);
	}

}
