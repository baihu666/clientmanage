<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<c:set var="bp" value="<%=basePath%>"></c:set>
<title>Insert title here</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${bp}/static/css/order.css" rel="stylesheet">
</head>
<body>
	
		<div style="width: 1080px;margin:40px auto">
			<form action="toorder/addSave.action" method="post">
				<div class="form-group">
				<ul>
					<li>客户id:<input type="text" name="cid"/></li>
					<li>商品id:<input type="text" name="pid"></li>
					<li>商品总价：<input type="text" name="totalprice"/></li>
					<li>订单状态：<input type="text" name="status"/></li>
					<li>员工id:<input type="text" name="sid">
					<li>付款方式：<input type="text" name="paymethod"/></li>
					<li><input type="submit" value="保存合同" class="btn"></li>
					</ul>
				</div>
			</form>
		</div>
	
</body>
</html>