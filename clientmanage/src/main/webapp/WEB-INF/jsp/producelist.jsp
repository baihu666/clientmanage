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
<link rel="stylesheet" href="${bp}/static/css/produce.css"
	type="text/css">
<script src="${bp}/static/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function fun(){
		var text = $("#name").value;
		$("#form").sumbit();
	}
</script>
</head>

<body>
	<div class="body">
		<div class="top" style="position: relative;">
			<div class="row " id="title-show">
				<ul style="margin: 20px 0 0 154px;">
					<li><a href="produce/addproduce.action"
						class="btn btn-primary btn-sm" style="margin-right: 8px"> 添加产品</a>
					<li>
				</ul>
				<div class="input-group">
					<select class="btn btn-primary btn-sm"
						onchange="window.open(this.options[this.selectedIndex].title,target='_self')"
						style="margin-bottom: 5px;">
						<c:forEach items="${statuslist }" var="status">
							<c:if test="${status.id==statusid}">
								<option value="${status.id }"
									title="produce/findlistbystatus.action?statusid=${status.id }"
									selected="selected">${status.name }</option>
							</c:if>
							<c:if test="${status.id!=statusid }">
								<option value="${status.id }"
									title="produce/findlistbystatus.action?statusid=${status.id }">${status.name }</option>
							</c:if>
						</c:forEach>

					</select>
				</div>
				<div class="search" style="margin-bottom: 0px;">
					<form id="form" action="produce/findbyname.action?name=${text }" method="post">
						<div style="width: 400px; float: right">
							搜索:<input id="name" type="text" style="width: 160px;"
								placeholder="请输入产品名称/编号">
							<button class="btn btn-default btn-search" id="searchbut"
								onclick="fun()" style="height: 22px; width: 50px">搜索</button>
						</div>
					</form>
				</div>
			</div>
		</div>
		<div class="row" style="margin: 0;">
			<div class="pull-left" style="width: 30%; color: #000;">
				<div class="ibox-title clearfix">
					<div style="text-align: center">
						<a href="produce/findlist.action">全部产品 </a>
					</div>
				</div>
				<div class="ibox-content"
					style="min-height: 300px; border-top: none;">
					<div class="slimScrollDiv"
						style="position: relative; overflow: hidden; width: auto; height: 100%;">
						<div class="left" style="overflow: hidden; width: auto;">
							<div>
								<c:forEach items="${kindlist }" var="kindlist">
									<ul style="padding: 0px">
										<li style="margin: 16px 0"><a
											href="produce/findlistbykind.action?kind=${kindlist. id}">
												<i class="jstree-icon jstree-themeicon" role="presentation"></i>${kindlist.name }</a>
										</li>
									</ul>
								</c:forEach>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="pull-right" style="width: 70%; float: left">
				<form id="form1" action="produce/deleteproduce.action" method="Post"
					style="position: relative;">
					<table class="table table-striped" id="tab_Test3">
						<tbody>
							<tr>
								<td><input type="checkbox"></td>
								<td style="width: 20%; line-height: 2.42857; float: left"
									nowrap="nowrap">产品名称</td>
								<td style="width: 20%; line-height: 2.42857; float: left"
									nowrap="nowrap">产品类别</td>
								<td style="width: 20%; line-height: 2.42857; float: left"
									nowrap="nowrap">产品编号</td>
								<td style="width: 20%; line-height: 2.42857; float: left"
									nowrap="nowrap">产品价格</td>
							</tr>
						</tbody>
						<c:forEach items="${list }" var="list">
							<tbody>
								<tr class="controls_tr">
									<td nowrap="nowrap"><input name="ids" type="checkbox"
										value="${list.id }"></td>
									<td
										style="color: #021012; width: 20%; line-height: 2.42857; float: left"
										nowrap="nowrap"><a
										href="produce/findbyid.action?id=${list.id }"> <span
											class="substr"> ${list.name } </span>
									</a></td>
									<td
										style="color: #; width: 20%; line-height: 2.42857; float: left"
										nowrap="nowrap">${list.kindname }</td>
									<td
										style="color: #333333; width: 20%; line-height: 2.42857; float: left"
										nowrap="nowrap"><span class="substr"> ${list.id }
									</span></td>
									<td
										style="color: #333333; width: 20%; line-height: 2.42857; float: left"
										nowrap="nowrap"><span class="substr"> ${list.price }
									</span></td>
									<td
										style="color: #; width: 18%; line-height: 2.42857; float: left"
										nowrap="nowrap"><a
										href="produce/updateproduce.action?id=${list.id }"> <span
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
					<span>${mess }</span>
				</form>
			</div>
		</div>
	</div>
</body>

</html>