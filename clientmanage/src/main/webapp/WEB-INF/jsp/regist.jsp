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

</head>
<body style="background-color: #87CEFA; text-align: justify;" class="">
	<div style="margin: 0px auto; width: 20%;">
		<form action="staff/regist.action" method="post"
			class="form-horizontal">
			<div class="form-group">
				<label for="inputEmail1" class="col-sm-2 control-label" style="">员工姓名：</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="inputEmail1">
				</div>
			</div>
			<div style="margin-top: 20px"></div>
			<div class="form-group">
				<label for="inputEmail2" class="col-sm-2 control-label">账 号：</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="inputEmail2">
				</div>
			</div>
			<div style="margin-top: 20px"></div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">密 码：</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="inputEmail3">
				</div>
			</div>
			<div style="margin-top: 20px"></div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">确认密码：</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="confirm_password">
				</div>
			</div>
			<div style="margin-top: 20px"></div>
			<div class="form-group">
				<label for="inputEmail4" class="col-sm-2 control-label">职   位：</label>
				<div class="col-sm-10">
					<select name="role" id="inputEmail4">
						<c:forEach items="${list1}" var="role">
							<option value="${role.id}">${role.name}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div style="margin-top: 20px"></div>
			<div class="form-group">
				<label for="inputEmail5" class="col-sm-2 control-label">性  别：</label>
				<div class="col-sm-10">
					男<input type="radio" name="sex" value="男" id="inputEmail5">
					女<input type="radio" name="sex" value="女" id="inputEmail5">
				</div>
			</div>
			<div style="margin-top: 20px"></div>
			<div class="form-group">
				<label for="inputEmail6" class="col-sm-2 control-label">部  门：</label>
				<div class="col-sm-10"> 
					<select name="department" id="inputEmail6">
						<c:forEach items="${list2}" var="depart">
							<option value="${depart.id}">${depart.name}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div style="margin-top: 20px"></div>
			<div class="form-group">
				<label class="col-sm-2 control-label">地  址：</label>
				<div class="col-sm-10">
					<select id="provinceId" name="provinceId"
						onchange="showCity(this.value)"><option value='0'>-省-</option></select>
					<select id="cityId" name="cityId" onchange="showArea(this.value)"><option
							value='0'>-市-</option></select> <select id="areaId" name="areaId"><option
							value='0'>-区-</option></select><br>
				</div>
			</div>
			<div style="margin-top: 20px"></div>
			<div class="form-group">
				<label for="inputEmail7" class="col-sm-2 control-label">生  日：</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" id="inputEmail7">
				</div>
			</div>
			<div style="margin-top: 20px"></div>
			<div class="form-group">
				<label for="inputEmail8" class="col-sm-2 control-label">入职时间：</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" id="inputEmail8">
				</div>
			</div>
			<div style="margin-top: 20px"></div>
			<div class="form-group">
				<div class="col-sm-10">
					<input type="submit" class="form-control">
				</div>
			</div>
		</form>
	</div>
</body>
</html>