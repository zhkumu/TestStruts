package com.mu.error;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ErrorAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		String header=request.getHeader("X-Requested-With");
		//处理ajax请求的异常处理
		if(header!=null&&header.equals("XMLHttpRequest")){
			HttpServletResponse response=ServletActionContext.getResponse();
			response.setContentType("application/json");
			Gson gson=new Gson();
			String result=gson.toJson("json error");
			PrintWriter writer=response.getWriter();
			writer.write(result);
			writer.flush();
			writer.close();
			return null;
		}
		return super.execute();
	}
}
