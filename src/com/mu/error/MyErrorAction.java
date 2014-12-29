package com.mu.error;

import com.opensymphony.xwork2.ActionSupport;

public class MyErrorAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		throw new Exception("hehe");
	}
}
