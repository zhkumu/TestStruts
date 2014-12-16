package com.mu.second;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class UserConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map map, String[] as, Class type) {
		if(type==User.class){
			User user=new User();
			String val=as[0];
			String[] strs=val.split(",");
			user.setUserName(strs[0]);
			user.setPwd(strs[1]);
			user.setAge(Integer.parseInt(strs[2]));
			return user;
		}
		return null;
	}

	//标签显示的时候调用，其它方法调用toString
	@Override
	public String convertToString(Map map, Object obj) {
		User user=(User)obj;
		String result="userName is "+ user.getUserName()+" and he is "+ user.getAge()+" age old";
		return result;
	}

}
