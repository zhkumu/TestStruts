package com.mu.resulttype;

import java.util.Date;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsJsonAction extends ActionSupport {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private Date date;
	
	//如果在root指定这个属性，则该注解无效
	@JSON(format="yyyy-MM-dd")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
}
