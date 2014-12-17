package com.mu.fifth;

import com.opensymphony.xwork2.ActionSupport;

public class ValidateAction extends ActionSupport {
	private TestDate testDate;
	
	public TestDate getTestDate() {
		return testDate;
	}

	public void setTestDate(TestDate testDate) {
		this.testDate = testDate;
	}

	//常见的处理方法
	public String execute(){
		return SUCCESS;
	}
	
	//自定义处理方法，通过配置method来指定
	public String myexecute(){
		return SUCCESS;
	}
	
	
	//只要addActionError或addFieldError有错误信息就不会再执行任何处理方法
	//自定义验证方法
	//自定义验证方法 validate开头+自定义处理方法名（首字母大写）
	public void validateMyexecute(){
		if(testDate.getId()<0){
			addActionError("id 自定义错误");
			addFieldError("id", "自定义field错误");
		}
		if(testDate.getName().equals("")){
			addFieldError("name", "自定义field错误");
		}
	}
	
	//无论是否自定义处理方法都会执行
	@Override
	public void validate() {
		if(testDate.getId()<0){
			addActionError("id 错误");
			addFieldError("id", "id错误");
		}
		if(testDate.getName().equals("")){
			addFieldError("name", "name 错误");
		}
	}
	
}
