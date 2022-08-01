<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Sample JSP Page</h1>
<%--comment tags --%>
<%! int x=100; %>
<%= x++ %>
<h2>X value is <%=x %></h2>
<%=x+=5 %>

</body>
</html>