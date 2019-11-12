<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title></title>
<c:set var="bp" value="<%=basePath%>"></c:set>
<script src="${bp}/static/js/jquery-3.4.1.js"></script>
<link href="${bp}/static/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="./static/css/produceinfo.css" type="text/css">
<script src="${bp}/static/js/bootstrap.min.js"></script>
</head>
<body>
		<div style="width: 1440px;margin: 0 auto;">
			<h3 align="center">产品详情</h3>
			<ul>
				<li>
					<img src="">
				</li>
				<li>
					<span>产品编号：${produce.id}</span>
				</li>
				<li>
					<span>产品名称：${produce.name}</span>
				</li>
				<li>
					<span>产品价格：${produce.price}</span>
				</li>
				<li>
					<span>产品名称：${produce.name}</span>
				</li>
				<li>
					<span>产品描述：${produce.desc}</span>
				</li>
				<li>
					<span>产品数量：${produce.count}</span>
				</li>
				<li>
				<c:if test="${produce.statusid==1}">
					<a href="produce/updatestatus.action?id=${produce.id}&statusid=2">下架产品</a>
				</c:if>
				</li>
				<li>
				<c:if test="${produce.statusid==2}">
					<a href="produce/updatestatus.action?id=${produce.id}&statusid=1">上架产品</a>
				</c:if>
				</li>
			</ul>
		</div>
		
	</body>
</html>