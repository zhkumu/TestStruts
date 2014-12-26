package com.mu.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyMethodInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation  invocation) throws Exception {
		
		System.out.println("方法处理前");
		String result=invocation.invoke();
		System.out.println("方法处理后");
		return result;
	}

}
