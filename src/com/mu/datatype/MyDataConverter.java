package com.mu.datatype;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class MyDataConverter extends StrutsTypeConverter {
	private SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
	
	@Override
	public Object convertFromString(Map map, String[] values, Class type) {
		String dateStr=values[0];
		try {
			return format.parseObject(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String convertToString(Map map, Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
