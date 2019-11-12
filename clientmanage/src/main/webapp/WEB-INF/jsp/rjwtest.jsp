<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>                                                                                                           
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list }" var="log" varStatus="vs">
<h1>findAll~~~~日志ID：${log.id };内容：${log.content }</h1>
</c:forEach>
<c:forEach items="${list }" var="log" varStatus="vs">
<h1>findByUid~~~~日志ID：${log.id };内容：${log.content }</h1>
</c:forEach>
<h1>findById~~~~日志ID：${logs.id };内容：${logs.content }</h1>
<h1>add~~~~日志ID：${log.id };内容：${log.content }</h1>
<form action="add.action">
<input type="text" name="uid">
<input type="text" name="content">
<input type="submit">
</form>
</body>
</html>