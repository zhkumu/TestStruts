package com.mu.resulttype;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StrutsJsonObjectAction extends ActionSupport implements ModelDriven<UserInfo> {
	
	private UserInfo userInfo;
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	@Override
	public UserInfo getModel() {
		userInfo=new UserInfo();
		return userInfo;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(userInfo);
		return SUCCESS;
	}
	
}
