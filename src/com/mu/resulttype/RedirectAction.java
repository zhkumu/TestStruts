package com.mu.resulttype;

import com.opensymphony.xwork2.ActionSupport;

public class RedirectAction extends ActionSupport {
	
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
}
