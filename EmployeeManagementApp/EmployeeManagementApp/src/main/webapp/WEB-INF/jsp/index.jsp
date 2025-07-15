<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>
	<h1>Hello world</h1>
	
	
	<c:if test="${flag}">
		Flag True
	</c:if>
	
	<c:if test="${!flag}">
		Flag False
	</c:if>
</body>
</html>