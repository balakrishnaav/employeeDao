<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="LoginValidate" method="post">
	<table align="center" >
		<caption><h2>Login</h2></caption>
		<tr>
			<td><label for="userName">Enter UserName : </label></td>
			<td><input type="text" name="userName" id="userName"></td>
		</tr>
		<tr>
			<td><label for="pwd">Enter Password : </label></td>
			<td><input type="password" name="pwd" id="pwd"></td>
		</tr>
		<tr>
			<td><input type="submit"></td>
		</tr>
	</table>
	</form>
</body>
</html>