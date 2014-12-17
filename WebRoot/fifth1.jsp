<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fifth1.jsp' starting page</title>
    
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
   <!-- 如果页面输入验证失败需要返回回来再显示，必须使用s标签处理
		theme能够去掉默认样式和html格式，但验证框架的前端验证就失效了   
    -->
  
  	<s:actionerror cssStyle="color:red;" />
  	<s:fielderror cssStyle="color:red;" />
    <s:form theme="simple" action="fifth1">
    	id:<s:textfield name="testDate.id" ></s:textfield> <s:fielderror fieldName="id"></s:fielderror>
		name:<s:textfield name="testDate.name"></s:textfield>
		date:<s:textfield name="testDate.date"></s:textfield>
    	<s:submit value="submit" id="btn"></s:submit>
    </s:form>
  </body>
</html>
