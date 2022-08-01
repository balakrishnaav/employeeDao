<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="sampleweb.Employee"></jsp:useBean>
<jsp:setProperty property="code" name="emp" value="1223"/>
<jsp:setProperty property="empname" name="emp" value="medplus"/>
<br/>
<h1>Emp code = <jsp:getProperty property="code" name="emp"/> </h1>
<h1>Emp name = <jsp:getProperty property="empname" name="emp"/> </h1>
<a href="Login.jsp">Logout</a>
</body>
</html>