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
<link rel="stylesheet" href="./static/css/addproduce.css" type="text/css">
</head>

<body>
	<div>
			<h3 align="center">添加产品</h3>
			<form action="produce/saveproduce.action" method="post">
				<ul>
					<li>
						产品名称：<input type="text" name="name" />
					</li>
					<li>
						产品价格：<input type="text" name="price" />
					</li>
					<li>
						产品分类：
						<select name="kind">
							<c:forEach items="${kindlist}" var="kind">
								<option value="${kind.id}">${kind.name}</option>
							</c:forEach>
						</select>
					</li>
					<li>
						产品描述：<input type="text" name="desc" />
					</li>
					<li>
						产品数量：<input type="text" name="count" />
					</li>
					<li>
						<button type="submit">添加</button>
					</li>
				</ul>
			</form>
		</div>
</body>

</html>