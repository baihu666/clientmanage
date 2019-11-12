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
<link rel="stylesheet" href="./static/css/kind.css" type="text/css">
<script src="${bp}/static/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function fun() {
		var text = $("#search").val();
		console.log(text);

		$.ajax({
			type : 'POST',
			url : 'produce/findbyname?name=',
			data : {
				name : text
			},
			success : function(result) {
				console.log(123);
			},
			dataType : 'text'
		});
	}
</script>
</head>

<body>
	<div class="body">
		<div class="top" style="position: relative;">
			<div class="row " id="title-show">
				<ul style="margin: 20px 0 0 190px;">
					<li><a href="kind/addkind.action"
						class="btn btn-primary btn-sm" style="margin-right: 8px"> 添加类别</a>
					<li>
				</ul>
			</div>
		</div>
		<div class="row" style="margin: 0;">

			<div class="pull-right1" style="width: 70%; margin: 10px auto">
				<form id="form1" action="kind/deletekind.action" method="Post"
					style="position: relative;">
					<table class="table table-striped" id="tab_Test3">
						<tbody>
							<tr>
								<td><input type="checkbox"></td>
								<td style="width: 20%; line-height: 2.42857; float: left"
									nowrap="nowrap">类别编号</td>
								<td style="width: 20%; line-height: 2.42857; float: left"
									nowrap="nowrap">类别名称</td>
							</tr>
						</tbody>
						<c:forEach items="${list }" var="list">
							<tbody>
								<tr class="controls_tr">
									<td nowrap="nowrap"><input name="ids" type="checkbox"
										value="${list.id }"></td>
									<td
										style="color: #021012; width: 20%; line-height: 2.42857; float: left"
										nowrap="nowrap"><span class="substr"> ${list.id }
									</span></td>
									<td
										style="color: #021012; width: 20%; line-height: 2.42857; float: left"
										nowrap="nowrap"><span class="substr"> ${list.name }
									</span></td>
									<td
										style="color: #; width: 18%; line-height: 2.42857; float: left"
										nowrap="nowrap"><a
										href="kind/updatekind.action?id=${list.id }"> <span
											class="substr"> 编辑</span>
									</a></td>
								</tr>
							</tbody>
						</c:forEach>
						<tbody>
						</tbody>
					</table>
					<button class="btn btn-primary btn-sm" type="submit"
						style="width: 60px; height: 30px">删除</button>
				</form>
			</div>
		</div>
	</div>
</body>

</html>