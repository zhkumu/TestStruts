<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'validate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<s:debug />
  	<!-- 自带的错误信息生成有个ul和li，不好用 -->
<%--   	<s:fielderror  fieldName="date" theme="simple"  /> --%>
	<s:property value="fieldErrors.date[0]"/>
	<s:property value="fieldErrors.id[0]" />
    <form action="validate">
    	id:<input type="text" name="id" /><br/>
    	name:<input type="text" name="name" /><br/>
    	date:<input type="text" name="date" /><br/>
    	<input type="submit" value="submit" />
    </form>
  </body>
</html>
