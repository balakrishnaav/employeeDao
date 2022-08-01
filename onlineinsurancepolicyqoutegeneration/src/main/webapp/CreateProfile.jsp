<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="CreateProfile" method="post">
UserName <input type="text" name="username" required><br/><br/>
Password <input type="password" name="pwd" required>
Role  <select name="role">
<option>admin</option>
<option>user</option>
<option>Agent</option>
</select><br/><br/>
<input type="submit"/>
</form>

</body>
</html>