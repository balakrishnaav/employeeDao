<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>
</head>
<body>
<form action="CreateAccount" method="post">
Insured Name  <input type="text" name="insuredname"/><br/><br/>
Insured Street  <input type="text" name="insuredstreet"/><br/><br/>
Insured City  <input type="text" name="insuredcity"/><br/><br/>
Insured State  <input type="text" name="insuredstate"/><br/><br/>
Insured Zip  <input type="text" name="insuredzip"/><br/><br/>
Business Segment  <select name="businesssegment">
<option>select</option>
			<option value="Business Auto">Auto</option>
			<option value="Resaturent">Restaurent</option>
			<option value="Apartment">Apartment</option>
			<option value="General Merchant">General Merchant</option>
		</select>
		<br>

Agent Name <input type="text" name="agentname"/><br/><br/>
UserName  <input type="text" name="username"/><br/><br/> 
<input type="submit"/>
</form>
</body>
</html>