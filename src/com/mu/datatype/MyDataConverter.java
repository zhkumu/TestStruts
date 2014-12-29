package com.mu.datatype;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

public class MyDataConverter extends StrutsTypeConverter {
	private SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
	
	@Override
	public Object convertFromString(Map map, String[] values, Class type) {
		//对于集合类型参数局部转换和全局转换是不一样的
		//局部转换传的values是几个值的数组，全局转换传的是values是单独一个值的数组
		//局部必须返回集合对象，因为局部转换只调用这个方法一次
		//全局返回集合的元素类型对象，因为全局转换对值每个都调用一次方法
		
		if(type.equals(List.class)){
			int length=values.length;
			List<Date> list=new ArrayList<Date>(length);
			for(int i=0;i<length;i++){
				String dateStr=values[0];
				try {
					list.add((Date)format.parseObject(dateStr));
				} catch (ParseException e) {
					throw new RuntimeException(e);
				}
			}
			System.out.println("转换成功");
			return list;
		}
		
		String dateStr=values[0];
		try {
			System.out.println("转换成功");
			return format.parseObject(dateStr);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String convertToString(Map map, Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
