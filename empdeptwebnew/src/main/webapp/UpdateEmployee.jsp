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
<form method="post" action="UpdateEmployee">
   <table align=center>
   <caption> <h2>Employee Details</h2></caption>
   <c:set var="emp" value="${empl}"></c:set>
   <tr>
   <td><label for="empNo">Enter Employee Code</label></td>
    <td><input type="text" name="empNo" value="${emp.empcode}" readonly/></td>
   </tr>
   <tr>
   <td><label for="empName">Enter Employee Name</label></td>
    <td><input type="text" name="empName" value="${emp.empname}"/></td>
   </tr>
   <tr>
   <td><label for="job">Enter Employee Job</label></td>
    <td><input type="text" name="job" value="${emp.job}"/></td>
   </tr>
    <tr>
   <td><label for="doj">Enter Employee Doj</label></td>
    <td><input type="date" name="doj" value="${emp.doj}"/></td>
   </tr>
    <tr>
   <td><label for="salary">Enter Employee Salary</label></td>
    <td><input type="text" name="salary" value="${emp.salary}"/></td>
   </tr>
   <tr>
   
    <td><input type="submit" value="update"/></td>
   </tr>
   </table>

</form>
</body>
</html>