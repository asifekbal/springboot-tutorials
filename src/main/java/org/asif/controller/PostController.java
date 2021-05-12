package org.asif.controller;

import java.util.Collections;
import java.util.List;

import org.asif.pojo.Post;
import org.asif.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	private PostServiceImpl postService;

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello Asif";
	}

	@PostMapping("/hello/{userId}")
	@ResponseBody
	public String hello(@PathVariable("userId") Integer userId,@RequestBody String name) {
		return "Hello " + name + " Your userid is " + userId;
	}

	@GetMapping("/fetch/{userId}")
	public List<Post> fetchPost(@PathVariable("userId") Integer userId) {
		if (userId > 0)
			return postService.fetchPosts(userId);
		return Collections.emptyList();
	}

	@PostMapping("/add/{userId}")
	public String addPost(@PathVariable("userId") Integer userId,@RequestBody Post post) {
		postService.addPost(userId, post);
		return "OK";
	}
}
