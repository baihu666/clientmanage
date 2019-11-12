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
<base href="<%=basePath%>>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${bp}/static/js/jquery-3.4.1.js"></script>
<link rel="stylesheet" href="${bp}/static/css/reset.css" />
<link rel="stylesheet" href="${bp}/static/css/login.css" />
<script type="text/javascript">
function fun1() {
	$("#kong").text("");
}
function fun2() {
	$("#kong").text("");
}
</script>
</head>
<body>
	<div class="page">
		<div class="loginwarrp">
			<div class="logo">管理员登陆</div>
			<div class="login_form">
				<form id="Login" name="Login" method="post"
					action="staff/login.action">
					<ul>
						<li class="login-item"><span>用户名：</span> <input id="name1" onfocus="fun1()" type="text"
							name="registername" class="login_input"></li>
						<li class="login-item"><span>密&nbsp;&nbsp;&nbsp;码：</span> <input
							id="pass1" onfocus="fun2()" type="password" name="password" class="login_input"></li>
						<li class="login-sub"><input type="submit" name="Submit"
							value="登录" /></li>
						<li class="regist-login"><span id="kong" style="color: red;" >${requestScope.mes }</span>
							<a class="regist-login" href="staff/toregist.action">注册</a></li>
					</ul>
				</form>
			</div>
		</div>
	</div>
</body>
</html>