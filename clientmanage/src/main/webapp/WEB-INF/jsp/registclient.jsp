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
<script src="${bp}/static/js/regist.js"></script>
<link href="${bp}/static/css/bootstrap.min.css">
</head>
<body>
	<form class="form-horizontal" action="client/add.action" method="post">
		<div>
		<div style="margin:50px auto; width: 40%;">
			<div class="control-group">
				<label class="control-label">姓名：</label>
				<div class="controls">
					<input type="text" name="name">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">员工编号：</label>
				<div class="controls">
					<input type="text" name="eid">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">下次联系时间：</label>
				<div class="controls">
					<input type="date" name="nextdate">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">客户行业编号：</label>
				<div class="controls">
					<input type="text" name="iid">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">地址:</label>
				<div class="controls">
					<select id="provinceId" name="provinceId"
						onchange="showCity(this.value)"><option value='0'>-prov-</option></select>
					<select id="cityId" name="cityId" onchange="showArea(this.value)"><option
							value='0'>-city-</option></select> <select id="areaId" name="areaId"><option
							value='0'>-area-</option></select>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">客户信息来源:</label>
				<div class="controls">
					<input type="text" name="source">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">客户等级:</label>
				<div class="controls">
					<input type="text" name="level">
				</div>
			</div>
			
			<div class="control-group">
				<label class="control-label">客户状态sid:</label>
				<div class="controls">
					<input type="text" name="sid">
				</div>
			</div>
			<input type="submit" value="登记">
			</div>
		</div>
	</form>
</body>
</html>