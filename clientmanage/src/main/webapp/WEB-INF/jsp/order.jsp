<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<c:set var="bp" value="<%=basePath%>"></c:set>
<link href="${bp}/static/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
<c:import url="common.jsp"></c:import>
</head>
<body>

	<div style="margin: 0 5%">
		<form>
			<table class="table table-hover">
			<tr>
				<th><input type="checkbox"/></th>
				<th>id</th>
				<th>cid</th>
				<th>pid</th>
				<th>sid</th>
				<th>status</th>
				<th>totalprice</th>
				<th>paymethod</th>
			</tr>
			
			<c:forEach var="order" items="${list }">
				<tr>
					<td><input name="ids" type="checkbox" value="${order.id}"></td>
					<td>${order.id }</td>
					<td>${order.cid }</td>
					<td>${order.pid }</td>
					<td>${order.sid }</td>
					<td>${order.status }</td>
					<td>${order.totalprice }</td>
					<td>${order.paymethod }</td>		
				</tr>
			</c:forEach>
			<tr align="center">
				<td colspan="8">
					<a href="toorder/add.action">添加合同</a>
				</td>
			</tr>
			</table>
		</form>
	</div>
	
</body>
</html>