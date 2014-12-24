package com.mu.action;

import java.io.File;

public class FileParam {
	//文件上传固定的三个属性 File（假设名字为x），还必须有另外两个属性xFileName，xContentType
	private File file;
	private String fileFileName;
	private String fileContentType;
	private String saveName;
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getSaveName() {
		return saveName;
	}
	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}
	
	
	
}
