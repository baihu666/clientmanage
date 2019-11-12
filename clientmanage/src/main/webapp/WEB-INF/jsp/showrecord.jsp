<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
</head>
<body>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>客户名称</th>
				<th>关注商品</th>
				<th>员工建议</th>
				<th>建议内容</th>
				<th>建议date</th>
				<th>员工</th>
				<c:if test="${current_staff.role == '1' }">
				<th>经理意见</th>
				
				</c:if>
				<th>总经理意见</th>
				<th>审批状态</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="clientVO">
				<tr>
					<td>${clientVO.clientName }</td>
					<td>${clientVO.produceName }</td>
					<td>${clientVO.opinion }</td>
					<td>${clientVO.content }</td>
					<td> <fmt:formatDate pattern="yyyy/MM/dd"
							value="${clientVO.recordtime }" /></td>
					<td><a href="#" class="edit-row"> ${clientVO.staff } </a></td>
					
					<c:if test="${current_staff.role == '1' }">
				<td><c:if
								test="${clientVO.agree1 == null }">
								<span>待审批</span>
							</c:if> <c:if test="${clientVO.agree1 == '同意' }">
								<span>同意</span>
							</c:if> <c:if test="${clientVO.agree1 == '不同意' }">
								<span>不同意</span>
							</c:if>

					</td>
				
				</c:if>
					
					
					
					<td>
					<c:if test="${clientVO.status == '1' }">
							<span>待审批</span>
						</c:if>
						<c:if test="${clientVO.status =='2' }">
							<c:if
								test="${clientVO.agree2 == null }">
								<span>-</span>
							</c:if> <c:if test="${clientVO.agree2 == '同意' }">
								<span>同意</span>
							</c:if> <c:if test="${clientVO.agree2 == '不同意' }">
								<span>不同意</span>
							</c:if>
						</c:if> 
					
					
					</td>


					<td><c:if test="${clientVO.status == '1' }">
							<span>审批进行中...</span>
						</c:if> <c:if test="${clientVO.status =='2' }">
							<span>审批结束</span>
						</c:if> 
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>