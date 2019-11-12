<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
	<meta charset="UTF-8">
	<title>后台欢迎页</title>
	<link rel="stylesheet" href="./static/css/reset.css" />
	<link rel="stylesheet" href="./static/css/content.css" />
 	<!-- <script src="./static/js/jquery.js"></script> -->
	<script src="./static/js/bootstrap.min.js"></script>
	<script src="./static/js/jquery-3.4.1.js"></script>
	<script src="./static/js/loglist.js"></script>
	
</head>
<body marginwidth="0" marginheight="0">
	<div class="container">
		<div class="public-nav">您当前的位置：<a href="">办公</a>><a href="">工作日志</a></div>
		<div class="public-content">
			<div class="public-content-header">
				<h3>员工工作日志列表</h3>
			</div>
			<div class="public-content-cont">
				<table class="public-cont-table" >
					<tr>
						<th style="width:20%">序号</th>
						<th style="width:20%">员工姓名
						<select id=uname name="uname" onchange="find()">
						<option value='0'>-姓名-</option></select>
						</th>
						<th style="width:20%">部门
						<select id=dname name="dname" onchange="find()">
						<option value='0'>-部门-</option></select></th>
						<th style="width:20%">职位
						<select id=rname name="rname" onchange="find()">
						<option value='0'>-职位-</option></select></th>
						<th style="width:20%">时间</th>
					</tr></table>
					<table class="public-cont-table" id="lists">
					<%-- <c:forEach items="${list }" var="log">
					<tr>
					
						<td>${log.xh }</td>
						<td><a href="log/findById.action?id=${log.id }" target="content">${log.uname }</a></td>
						<td>${log.dname }</td>
						<td>${log.rname }</td>
						<td><a href="log/test.action?datetime=${log.datetime }"><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${log.datetime }"/></a></td>
					
					</tr>
					</c:forEach>  --%>
				</table>
				<div class="page">
					<form action="" method="get">
					共<span>42</span>个站点
						<a href="">首页</a>
						<a href="">上一页</a>
						<a href="">下一页</a>
						第<span style="color:red;font-weight:600">12</span>页
						共<span style="color:red;font-weight:600">120</span>页
						<input type="text" class="page-input">
						<input type="submit" class="page-btn" value="跳转">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>