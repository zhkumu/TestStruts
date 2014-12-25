package com.mu.datatype;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class DataTypeAction extends ActionSupport {

	private Date date; 
	public Date getDate() {
		return date;
	} 
	public void setDate(Date date) {
		this.date = date;
	} 

	@Override
	public String execute() throws Exception {
		System.out.println(date);
		return super.execute();
	}
}
