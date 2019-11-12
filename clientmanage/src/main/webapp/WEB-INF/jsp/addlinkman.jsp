<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path+ "/" ;
%>
<c:set var="bp" value="<%=basePath%>"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${bp}/static/js/jquery-3.4.1.js"></script>
</head>
<body>
     <form action="${bp}linkman/add.action" method="post">
        
      联系人姓名:<input type="text" name="name"><br>
     联系人角色:<input type="text" name="role"><br>
         联系人性别:男<input type="radio" name="sex" value="男">&nbsp;&nbsp;&nbsp;女<input type="radio" name="sex" value="女"><br>
        联系人手机: <input type="text" name="phone"><br>
        联系人qq:<input type="text" name="qq"><br>
     联系人邮箱  :<input type="text" name="email"><br>
     客户: <input type="text" name="cid"><br>
        备注: <input type="text" name="remark"><br>
        <input type="submit" value="提交"> 
     </form>
     
</body>
</html>