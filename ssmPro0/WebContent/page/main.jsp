<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">SSM(Spring,SpringMVC,Mybatis)练习--main.jsp</h1><hr>
<h1><a href="<%=request.getContextPath() %>/index.jsp">首页</a></h1>
<c:forEach items="${list }" var="e">
<h3>empno:${e.empno }</h3>
<h3>ename:${e.ename }</h3>
<h3>sal:${e.sal }</h3>
<h3>deptno:${e.dept.deptno }</h3>
<h3>dname:${e.dept.dname }</h3>
<h3>loc:${e.dept.loc }</h3>
<hr>
</c:forEach>
</body>
</html>