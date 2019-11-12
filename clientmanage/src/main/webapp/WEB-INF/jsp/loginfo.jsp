<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="./static/css/reset.css" />
	<link rel="stylesheet" href="./static/css/content.css" />
</head>
<body>
	<div class="container">
		<div class="public-nav">您当前的位置：<a href="">办公</a>><a href="">工作日志</a></div>
		<div class="public-content">
			<div class="public-content-header">
				<h3>员工工作日志列表</h3>
			</div>
			<div class="public-content-cont">
				<table class="public-cont-table">
					<tr>
						<th style="width:20%">序号</th>
						<th style="width:20%">员工姓名</th>
						<th style="width:20%">部门</th>
						<th style="width:20%">职位</th>
						<th style="width:20%">时间</th>
					</tr>
					
					<tr>
					
						<td>${log.xh }</td>
						<td><a href="log/findById.action?id=${log.id }" target="content">${log.uname }</a></td>
						<td>${log.dname }</td>
						<td>${log.rname }</td>
						<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${log.datetime }"/></td>
					</tr>
				</table>
				
				<P style="font-size: 20px;font-weight: bolder;margin-top: 50px;">日志详情：</P>
				
				<P style="font-size: 16px;font-weight: bolder;margin-top: 50px;font-family: 宋体;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${log.content }</P>
			</div>
		</div>
	</div>	
</body>
</html>