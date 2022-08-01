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
<form action="PolicyCreation" method="post">
<h2>Create Policy</h2>
<c:forEach var="pq" items="${listOfPQ}">
<input type="radio" id="" name="${pq.polQuesId}" value="${pq.polQuesAnsWeightage}">
<label>${pq.polQuesAns1}</label><br/>
<input type="radio" id="" name="${pq.polQuesId}" value="${pq.polQuesAnsWeightage}">
<label>${pq.polQuesAns2}</label><br/>
<input type="radio" id="" name="${pq.polQuesId}" value="${pq.polQuesAnsWeightage}">
<label>${pq.polQuesAns3}</label><br/>
</c:forEach>
</form>
</body>
</html>