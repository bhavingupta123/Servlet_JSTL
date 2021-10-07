<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<!-- <c:out value="${label.rollno}" /> <br/>
	<c:out value="${label.name}" />
	-->
	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/seva_sample" user="root" password=""/>
	
	<sql:query var="rs" dataSource="${db}" >select * from data</sql:query>
	
	<c:forEach items="${rs.rows}" var="row"> 
		<c:out value="${row.id}"></c:out>
		<c:out value="${row.fname}"></c:out>
		
		<br/>
	</c:forEach>
	
</body>
</html>