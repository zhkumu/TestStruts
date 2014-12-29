package com.mu.datatype;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class DataTypeAction extends ActionSupport {

	private Date date; 
	public Date getDate() {
		return date;
	} 
	public void setDate(Date date) {
		this.date = date;
	} 

	@Override
	public void validate() {
		//类型转换失败会给默认值基本类型设置为0,对象类型设置为null
		System.out.println(date);
		if(date==null){
			addFieldError("date", "时间格式必须为dd-MM-yyyy");
		}
		System.out.println("数据验证方法被执行");
	} 
	
	@Override
	public String execute() throws Exception {
		System.out.println(date);
		return super.execute();
	}
}
