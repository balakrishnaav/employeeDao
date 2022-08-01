<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="role" value="${role}"/>
	<c:choose>
		<c:when test="${role.equals('admin')}">
			<h1>Welcome Administrator</h1>
		</c:when>
		<c:otherwise>
			<h1>Welcome ${role}</h1>
		</c:otherwise>
	</c:choose>
	<c:if test="${role.equals('admin')}">
			<div><a href="CreateProfile.jsp">Creation Profile</a></div>
			<div><a href="CreateAccount.jsp">Create Account</a></div>
			<div><a href="CreatePolicy.jsp">Policy Creation</a></div>
			<div><a href="ViewUserRoles">View Profiles</a></div>
		</c:if>
		<c:if test="${role.equals('Agent')}">
			<div><a href="">Policy Creation</a></div>
		</c:if>
		<div><a href="">View Policy</a></div>
		<div><a href="Login.jsp">Logout</a></div>
</body>
</html>