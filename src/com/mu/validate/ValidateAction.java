package com.mu.validate;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ValidateAction extends ActionSupport implements ModelDriven<ValidateBean> {
	private ValidateBean bean=new ValidateBean();
	
	public ValidateBean getBean() {
		return bean;
	}

	public void setBean(ValidateBean bean) {
		this.bean = bean;
	}

	@Override
	public ValidateBean getModel() {
		return bean;
	}
	
	@Override
	public String execute() throws Exception {
		return super.execute();
	}
	
	//如果默认不是execute还可定义validateXXX方法
	public void validateExecute(){
		if(bean.getId()!=1){
			addFieldError("id", "id不为1");
		}
	}
	
	@Override
	public void validate() {
		if(bean.getName()!=null && !bean.getName().equals("mu")){
			addFieldError("name", "名字错误");
		}
	}
}
