package com.mu.fourth;

import com.opensymphony.xwork2.ActionSupport;

public class MultiAction extends ActionSupport {
	/*
	 * 如果有action多个属性，每个方法都会生成这个属性，不方便 
	*/
	
	
	//常见的处理方法
	public String execute(){
		return SUCCESS;
	}
	
	//自定义处理方法，通过配置method来指定
	public String myexecute(){
		return SUCCESS;
	}
	
}
