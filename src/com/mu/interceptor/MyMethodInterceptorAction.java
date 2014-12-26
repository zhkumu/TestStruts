package com.mu.interceptor;

import com.opensymphony.xwork2.ActionSupport;

public class MyMethodInterceptorAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	public void show(){
		System.out.println("执行自定义方法");
	}
}
