package com.mu.action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModelParamAction extends ActionSupport implements ModelDriven<UserInfo> {
	private UserInfo userInfo=new UserInfo();

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	@Override
	public UserInfo getModel() {
		return userInfo;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(userInfo);
		return super.execute();
	}
}
