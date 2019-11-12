<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
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
	<form action="${bp}/client/deleteclient.action" method="post" target="content">
		<table class="table table-striped">
			<tr>
				<th><input type="checkbox"></th>
				<th>客户名字</th>
				<th>客户负责人</th>
				<th>联系时间</th>
				<th>客户行业</th>
				<th>省</th>
				<th>市</th>
				<th>区</th>
				<th>信息来源</th>
				<th>客户等级</th>
				<th>客户状态</th>
				<th>联系人</th>
				<th>#</th>
			</tr>
			<c:forEach items="${list }" var="clientvo">
				<tr>
					<td><input name="ids" value="${clientvo.id }" type="checkbox"></td>
					<td>${clientvo.name }</td>
					<td>${clientvo.ename }</td>
					<td>${clientvo.nextdate }</td>
					<td>${clientvo.iid }</td>
					<td>${clientvo.province }</td>
					<td>${clientvo.city }</td>
					<td>${clientvo.areas }</td>
					<td>${clientvo.source }</td>
					<td>${clientvo.level }</td>
					<td>${clientvo.sname }</td>
					<td><input
						onclick="javascript:location.href='${bp}/linkman/findbyfid.action?cid=${clientvo.id }'"
						value="查看" type="button" /></td>
				    
					<td><input
						onclick="javascript:location.href='${bp}/client/toupdate.action?id=${clientvo.id }'"
						value="修改" type="button" /></td>
				    </tr>
			</c:forEach>
			<tr>
				<td style="text-align: center;" colspan="13"> <input
					onclick="javascript:location.href='${bp}/client/toadd.action'"
					value="添加" type="button" /> <input type="submit" value="删除"></td>
			</tr>
		</table>
	</form>
</body>
</html>