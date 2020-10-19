<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<%@ page import="ru.database.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world!</h1>
	<br/>
	<%
		for(String name : DatabaseExample.getBooks()) {
			out.println(name + "<br/>");
		}
	%>
</body>
</html>