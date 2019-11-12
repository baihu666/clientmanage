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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加客户跟踪页面</title>
<!-- 引入 Bootstrap -->
<link href="./static/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="./static/js/jquery.js"></script>
<script src="./static/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			type : "post",
			url : "record/allOpinion.action",
			contentType : 'application/json;charset=utf-8',
			success : function(data) {
				// 返回响应的字符串，需要转换成为JSON对象
				var json = JSON.parse(data);
				var html = "<option value='0'>-prov-</option>";
				$.each(json, function(i, item) {
					html += "<option value='" + item.id + "'>" + item.name
							+ "</option>"
				});
				$("#oid").html(html);
			}
		})
	})

	function nameBlur() {
		var cid = $("#cid").val();
		var eid = $("#eid").val();
		console.log(cid);
		console.log(eid);
		$.ajax({
			type : "post",
			url : "record/check.action",
			contentType : 'application/json;charset=utf-8',
			data : cid,
			success : function(data) {
				if (data == eid) {
					$("#h").html("");
				} else {
					$("#h").html("该客户不是你的客户");
				}

			}
		});
	}
</script>
</head>
<body>
	<div style="margin: 0 auto;">
		<form action="record/insertrecord.action" method="post"
			class="form-horizontal">
			<input type="hidden" id="eid" value="${current_staff.id }"> <label
				for="inputEmail1" class="col-sm-2 control-label">客户id</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" onblur="nameBlur()" id="cid"
					name="cid" style="width: 600px; height: 30px"><span id="h" style="color: red"></span>
			</div>
			<label for="inputEmail1" class="col-sm-2 control-label">意见</label>
			<div class="col-sm-10">
				<select id="oid" name="oid" style="width: 600px; height: 30px">
					<option value='0'></option>
				</select>
			</div>
			<!-- <label for="inputEmail1" class="col-sm-2 control-label">意见</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputEmail1" name="oid"
					style="width: 600px; height: 30px">
			</div> -->



			<label for="inputEmail2" class="col-sm-2 control-label">产品id</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputEmail2" name="pid"
					style="width: 600px; height: 30px">
			</div>




			<label for="inputEmail3" class="col-sm-2 control-label">处理意见</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputEmail3"
					name="doopinion" style="width: 600px; height: 30px">
			</div>



			<label for="inputEmail3" class="col-sm-2 control-label">结果</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputEmail3"
					name="result" style="width: 600px; height: 30px">
			</div>
			<input type="hidden" id="document" name="document" value="1">

			<c:if test="${current_staff.role =='1'}">
			<input type="hidden" class="form-control" id="point" name="point"
				style="width: 600px; height: 30px" value="1">
			</c:if>

			<c:if test="${current_staff.role =='2'}">
			<input type="hidden" class="form-control" id="point" name="point"
				style="width: 600px; height: 30px" value="3">
				<input type="hidden" id="address" name="address" value="同意">
			</c:if>
			
			
			
			<div style="margin: 0 500px">
				<input type="submit" value="提交"> <input type="reset"
					value="取消">
			</div>
			
		</form>


	</div>
</body>
</html>