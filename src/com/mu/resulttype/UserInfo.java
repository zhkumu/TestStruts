package com.mu.resulttype;

import java.util.Date;

import org.apache.struts2.json.annotations.JSON;

public class UserInfo extends UserBase {
	private String name;
	private Date date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", date=" + date + ", getId()="
				+ getId() + "]";
	}
	
}
