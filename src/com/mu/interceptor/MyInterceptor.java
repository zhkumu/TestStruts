package com.mu.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation actioninvocation) throws Exception {
		System.out.println("拦截器处理前");
		HttpServletRequest request= ServletActionContext.getRequest();
		String type= request.getHeader("X-Requested-With");
		//处理json方式
		if(type!=null && type.equals("XMLHttpRequest")){
			HttpServletResponse response=ServletActionContext.getResponse();
			response.setContentType("application/json");
			PrintWriter writer=response.getWriter();
			writer.write("hello world");
			writer.flush();
			writer.close();
			//输出json不需要返回结果
			return null;
		}
		//result action返回的结果
		String result= actioninvocation.invoke();
		System.out.println("result:"+result);
		System.out.println("拦截器处理后");
		return result;
	}

}
