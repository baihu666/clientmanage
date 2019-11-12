<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="bp" value="<%=basePath%>"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${bp}/static/css/bootstrap.min.css" rel="stylesheet">
<script src="${bp}/static/js/jquery-3.4.1.js"></script>
<script src="${bp}/static/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="${bp}/linkman/delete.action" method="post">
		<table class="table table-striped">
			<tr>
			<th><input type="checkbox"></th>
				<th>姓名</th>
				<th>角色</th>
				<th>性别</th>
				<th>手机</th>
				<th>qq</th>
				<th>邮箱</th>
				<th>备注</th>
				<th>客户</th>
			</tr>
			<c:forEach items="${list }" var="linkman">
				<tr>
				    <td><input name="ids" value="${linkman.id }" type="checkbox"></td>
					<td>${linkman.name }</td>
					<td>${linkman.role}</td>
					<td>${linkman.sex }</td>
					<td>${linkman.phone }</td>
					<td>${linkman.qq }</td>
					<td>${linkman.email }</td>
					<td>${linkman.remark }</td>
					<td>${linkman.cid }</td>
				</tr>
			</c:forEach>
			
			<tr style="text-align: center;">
				<td colspan="9"><input type="text" name="cid" style="display: none;" value="${cid }"><input type="button" value="添加"
					onclick="javascript:location.href='${bp}/linkman/toadd.action'"><input
					type="submit" value="删除"></td>
			</tr>
		</table>
	</form>
</body>
</html>