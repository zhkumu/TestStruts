package com.mu.action;

import com.opensymphony.xwork2.ActionSupport;

public class ProParamAction extends ActionSupport {
	private UserInfo userInfo;

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(userInfo);
		return super.execute();
	}
}
