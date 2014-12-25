package com.mu.action;

import javax.enterprise.inject.New;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModelParam2Action extends ActionSupport implements ModelDriven<UserInfo> {
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
		//这里重新赋值后原来的valusstack里的userInfo对象就不是这个了，需要在配置文件里修改配置
		userInfo=new UserInfo();
		userInfo.setName("smell");
		return super.execute();
	}
}
