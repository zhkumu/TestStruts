package com.mu.resulttype;

import com.opensymphony.xwork2.ActionSupport;

public class MuJsonAction extends ActionSupport {

	private String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
