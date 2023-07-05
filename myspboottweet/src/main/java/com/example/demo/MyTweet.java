package com.example.demo;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="TweetTab")
public class MyTweet {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String strName;
private String strTweet;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStrName() {
	return strName;
}
public void setStrName(String strName) {
	this.strName = strName;
}
public String getStrTweet() {
	return strTweet;
}
public void setStrTweet(String strTweet) {
	this.strTweet = strTweet;
}
}
