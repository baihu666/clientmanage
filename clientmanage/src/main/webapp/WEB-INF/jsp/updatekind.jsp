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
<link rel="stylesheet" href="./static/css/produce.css" type="text/css">
</head>

<body>
	<div class="body">
		<div class="row" style="margin: 0;">
			<div class="pull-right" style="width: 80%; margin-top: 100px">
				<form id="form1"
					action="kind/saveupdate.action?id=${produceKind.id }" method="Post"
					style="position: relative;">
					产品类别名称：<input type="text" name="name" value="${produceKind.name }">
					<button class="btn btn-primary btn-sm" type="submit"
						style="width: 60px; height: 30px">修改</button>
				</form>
			</div>
		</div>
	</div>
</body>

</html>