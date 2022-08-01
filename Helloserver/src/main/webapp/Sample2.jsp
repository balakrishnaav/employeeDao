<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int x=0; %>
<% if(x>0) {%>
<h2>x is positive</h2>
<%}else if(x<0){ %>
<h2>x is negative</h2>
<%}else {%>
<h2>x is zero</h2>
<%}%>
<%switch(x){ case 10:  %>
<h3>Ten</h3>
<%break; case 20:{ %>
<h3>Twenty</h3>
<%}break;default:{ %>
<h3><%= x %></h3>
<%}} %>
</body>
</html>