package org.asif.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.asif.dao.PostDao;
import org.asif.pojo.Post;
import org.springframework.stereotype.Repository;

@Repository
public class PostDaoImpl implements PostDao {

	private Map<Integer, List<Post>> map;

	public PostDaoImpl() {
		this.map = new HashMap<>();
	}

	@Override
	public List<Post> fetchPosts(Integer userId) {
		List<Post> posts = map.get(userId);
		return posts;
	}

	@Override
	public void addPost(Integer userId, Post post) {
		List<Post> posts = map.get(userId);
		if (posts == null) {
			posts = new ArrayList<>();
		}
		posts.add(post);
		map.put(userId, posts);
	}

}
