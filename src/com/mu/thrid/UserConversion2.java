package com.mu.thrid;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.mu.second.User;

//类型转换错误放在filed级别错误信息里
public class UserConversion2 extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map map, String[] values, Class type) {
		String value=values[0];
		String[] strs=value.split(",");
		User user=new User();
		user.setUserName(strs[0]);
		user.setPwd(strs[1]);
		user.setAge(Integer.parseInt(strs[2]));
		return user;
	}

	@Override
	public String convertToString(Map map, Object object) {
		User user=(User)object;
		String result="userName is "+ user.getUserName()+" and he is "+ user.getAge()+" age old";
		return result;
	}

	
}
