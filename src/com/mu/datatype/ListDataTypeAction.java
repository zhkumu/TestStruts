package com.mu.datatype;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ListDataTypeAction extends ActionSupport {
	private List<Date> list;

	public List<Date> getList() {
		return list;
	}

	public void setList(List<Date> list) {
		this.list = list;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
}
