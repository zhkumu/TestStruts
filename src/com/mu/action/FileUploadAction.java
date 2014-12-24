package com.mu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class FileUploadAction extends ActionSupport implements ModelDriven<FileParam> {
	private FileParam fileParam=new FileParam();

	public FileParam getFileParam() {
		return fileParam;
	}

	public void setFileParam(FileParam fileParam) {
		this.fileParam = fileParam;
	}
	
	@Override
	public FileParam getModel() {
		return fileParam;
	}
	
	@Override
	public String execute() throws Exception {
		String path=ServletActionContext.getServletContext().getRealPath("upload\\")+fileParam.getSaveName()+".txt";
		File file= new File(path);
		InputStream input=new FileInputStream(fileParam.getFile());
		OutputStream out=new FileOutputStream(file);
		int i=-1;
		while((i=input.read())!=-1){
			out.write(i);
		}
		input.close();
		out.close();
		return super.execute();
	}
}
