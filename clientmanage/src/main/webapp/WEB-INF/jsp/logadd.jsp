<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>后台欢迎页</title>
<link rel="stylesheet" href="./static/css/reset.css" />
<link rel="stylesheet" href="./static/css/public.css" />
<link rel="stylesheet" href="./static/css/content.css" />
</head>
<body marginwidth="0" marginheight="0">
	<div class="container">
		<div class="public-nav">
			您当前的位置：<a href="">办公</a>><a href="">添加日志</a>
		</div>
		<div class="public-content">
			<div class="public-content-header">
				<h3>修改网站配置</h3>
			</div>
			<div class="public-content-cont">
				<form action="log/add.action" method="post" target="content">
					<input type="hidden" name="uid" value="${current_staff.id }">
					<div class="form-group">
						<label>姓名：</label> <label>${current_staff.name }</label>
					</div>
					<div class="form-group">
						<label for="">网页描述</label>
						<textarea class="form-input-textara" type="text"
							name="content" ></textarea>
					</div>

					<div class="form-group" style="margin-left: 150px;">
						<input type="submit" class="sub-btn" value="提  交" /> <input
							type="reset" class="sub-btn" value="重  置" />
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="../kingediter/kindeditor-all-min.js"></script>
	<script src="../js/laydate.js"></script>
	<script>
		KindEditor.ready(function(K) {
			window.editor = K.create('#editor_id');
		});
	</script>
</body>
</html>