package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/mytweet")
public class MyTweetCon {
    @Autowired
	TweetService tweetServ;
	@PostMapping("/add")
	public void funAddTweet(@RequestBody MyTweet obt)
	{
		
		tweetServ.addTweet(obt);
	}
	
	@GetMapping("/allTweets")
	public @ResponseBody ArrayList getAllTweet()
	{
	
		
		return tweetServ.getAllTweet();
	}
}
