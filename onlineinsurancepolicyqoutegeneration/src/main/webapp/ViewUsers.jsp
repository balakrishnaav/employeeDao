<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"
    prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" size="100" align="center">

   <caption><h1>List of Users</h1></caption>
   <tr>
   <th>User Name</th>
   <th>User Password</th>
   <th>Role</th>
   </tr>
   <c:forEach var="usr" items="${usrlst}">
   <tr>
   <td>${usr.userName}</td>
   <td>${usr.role}</td>
   <td>${usr.password}</td>
   </tr>
   </c:forEach>
</table>
<a href="CreateAccount.jsp">Add Account</a>

</body>
</html>