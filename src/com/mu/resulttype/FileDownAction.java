package com.mu.resulttype;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownAction extends ActionSupport {
	
	private String fileName;

	public String getFileName() throws UnsupportedEncodingException {
		fileName+=".txt";
		HttpServletRequest request=ServletActionContext.getRequest();
		String agent= request.getHeader("User-Agent");
		//解决文件名中文乱码问题
		if(agent!=null && agent.toLowerCase().contains("ie")){
			fileName=URLEncoder.encode(fileName,"utf-8");
		}else {
			//这是非ie使用
			fileName=new String(fileName.getBytes("utf-8"),"iso-8859-1");
		}
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getFileStream() throws MalformedURLException, UnsupportedEncodingException{
		return ServletActionContext.getServletContext().getResourceAsStream("/WEB-INF/classes/XJad.rar");
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
}
