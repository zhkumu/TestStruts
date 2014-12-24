package com.mu.resulttype;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.util.ValueStack;

public class MuResultType implements Result {
	private Gson gson=new Gson();
	private String dataName;
	public String getDataName() {
		return dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}
	
	@Override
	public void execute(ActionInvocation actionInvocation) throws Exception {
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("application/json");
		if(dataName==null){
			dataName="resultData";
		}
		ValueStack valueStack=actionInvocation.getStack();
		Object data= valueStack.findValue(dataName);
		String result=gson.toJson(data);
		PrintWriter writer=response.getWriter();
		writer.write(result);
		writer.flush();
		writer.close();
	}
}
