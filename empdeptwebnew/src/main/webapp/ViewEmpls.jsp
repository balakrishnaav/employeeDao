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

   <caption><h1>List of Employees</h1></caption>
   <tr>
   <th>Empl Code</th>
   <th>Empl Name</th>
   <th>Job</th>
   <th>Joining Date</th>
   <th>Salary</th>
   </tr>
   <c:forEach var="emp" items="${empls}">
   <tr>
   <td>${emp.empcode}</td>
   <td>${emp.empname}</td>
   <td>${emp.job}</td>
   <td>${emp.doj}</td>
   <td>${emp.salary}</td>
   <td ><a href="DeleteEmployee?id=${emp.empcode}">Delete </a> </td>
    <td ><a href="UpdateEmployee?id=${emp.empcode}">Update </a> </td>
   </tr>
   </c:forEach>
</table>
<a href="AddEmployee.jsp">Add Employee</a>

</body>
</html>