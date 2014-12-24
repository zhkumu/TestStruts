package com.mu.action;

import java.util.Date;

public class UserInfo {
	private int id;
	private String name;
	private String pwd;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", pwd=" + pwd
				+ ", date=" + date + "]";
	}
	
}
