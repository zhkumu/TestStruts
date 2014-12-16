package com.mu.second;

public class UserAction {
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
