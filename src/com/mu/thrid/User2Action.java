package com.mu.thrid;

import com.mu.second.User;

public class User2Action {
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute(){
		return "success";
	}
}
