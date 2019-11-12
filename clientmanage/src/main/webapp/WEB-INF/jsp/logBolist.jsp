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
	<script src="./static/js/jquery.js"></script>
	<script type="text/javascript">
		function add() {
			var page = $("#page").val()+1;
			alert(page);
		}
		function t11(){
			var page = $("#page1").val();
			window.location.href="logbo/tiao.action?page="+page
		}
	</script>
</head>
<body marginwidth="0" marginheight="0">
	<div class="container">
		<div class="public-nav">您当前的位置：<a href="">办公</a>><a href="">操作日志</a></div>
		<div class="public-content">
			<div class="public-content-header">
				<h3>员工工作日志列表</h3>
			</div>
			<div class="public-content-cont">
				<table class="public-cont-table">
					<tr>
						<th style="width:10%">id</th>
						<th style="width:10%">操作人</th>
						<th style="width:10%">操作模块</th>
						<th style="width:10%">执行方法</th>
						<th style="width:25%">操作内容</th>
						<th style="width:10%">请求路径</th>
						<th style="width:10%">IP</th>
						<th style="width:15%">操作时间</th>
					</tr>
					
					<c:forEach items="${list }" var="logBo">
					<tr>
					
						<td>${logBo.id }</td>
						<td>${logBo.uname }</td>
						<td>${logBo.module }</td>
						<td>${logBo.methods }</td>
						<td>${logBo.content }</td>
						<td>${logBo.actionurl }</td>
						<td>${logBo.ip }</td>
						<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${logBo.date }"/></td>
					
					</tr>
					</c:forEach>
				</table>
				<div class="page">
					<form action="" method="get">
						<a href="">首页</a>
						<a href="logbo/reduce.action?page=${page }">上一页</a>
						<a href="logbo/add.action?page=${page }">下一页</a>
						第<span style="color:red;font-weight:600" id="page">${page }</span>页
						共<span style="color:red;font-weight:600">${currPage }</span>页
						<input type="text" class="page-input" id="page1">
						<input type="button" class="page-btn" value="跳转" onclick="t11()">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>