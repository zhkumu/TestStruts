package com.mu.second;

public class User {
	private String userName;
	private String pwd;
	private int age;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", pwd=" + pwd + ", age=" + age
				+ "]";
	}
	
}
