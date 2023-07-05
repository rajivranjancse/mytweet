package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TweetService {
	
	@Autowired
	TweetRepo tweetRepo;
	public void addTweet( MyTweet ob)
	{
		tweetRepo.save(ob);
	}
	
	public ArrayList getAllTweet()
	{
		ArrayList tweetList=new ArrayList();
		tweetRepo.findAll().forEach(tweetList::add);
		return tweetList;
	}
}
