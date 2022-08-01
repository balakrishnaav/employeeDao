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
<form method="post" action="AddEmployee">
  Enter employee code <input type="text" name="empcode" required/> <br>
   Enter employee name <input type="text" name="empname" required/> <br>
   Enter employee Job <input type="text" name="job" required/> <br>
   Enter Date of Joining <input type="date" name="doj" required/> <br>
   Enter employee Salary <input type="text" name="salary" required/> <br>
   <label for="deptName">Enter Department Name</label>
   <select name="deptname" id="deptname">
   <c:forEach var="deptName" items="${deptNames}">
   <option value="${deptName.deptno}" >${deptName.deptname}</option>
   </c:forEach>
   </select>
   <input type="submit"/>
</form>

</body>
</html>