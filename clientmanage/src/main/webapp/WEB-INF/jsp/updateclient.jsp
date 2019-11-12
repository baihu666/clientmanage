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
	<form class="form-horizontal" action="${bp}client/update.action"
		method="post">
		<div>
		    <input type="text" name="id" style="display: none;" value="${client.id }"> 
			<div style="margin: 50px auto; width: 40%;">
				<div class="control-group">
					<label class="control-label">姓名：</label>
					<div class="controls">
						<input type="text" name="name" value="${client.name}">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">员工编号：</label>
					<div class="controls">
						<input type="text" name="eid" value="${client.eid}">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">下次练习时间：</label>
					<div class="controls">
						<input type="date" name="nextdate" value="${client.eid}">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">客户行业编号：</label>
					<div class="controls">
						<input type="text" name="iid" value="${client.eid}">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">地址:</label>
					<div class="controls">
						<select id="provinceId" name="provinceId"
							onchange="showCity(this.value)"><option
								value="${province.province}">selected='selected'</option></select> <select id="cityId"
							name="cityId" onchange="showArea(this.value)"><option
								value="${city.city}">-city-</option></select> <select id="areaId" name="areaId"><option
								value="${area.areas}">-area-</option></select>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">客户信息来源:</label>
					<div class="controls">
						<input type="text" name="source" value="${client.source}">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">客户等级:</label>
					<div class="controls">
						<input type="text" name="level" value="${client.level}">
					</div>
				</div>

				
				<div class="control-group">
					<label class="control-label">客户状态sid:</label>
					<div class="controls">
						<input type="text" name="sid" value="${client.sid}">
					</div>
				</div>
				<input type="submit" value="登记">
			</div>
		</div>
	</form>
</body>
</html>