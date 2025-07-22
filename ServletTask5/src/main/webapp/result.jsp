<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Result page</h1>
	<br>
	
	<%
		out.println("Welcome to JSP Java");
	
		String name = request.getParameter("tbName");
		String number = request.getParameter("tbNumber");
		
		out.println(name);
		out.println();
		out.println(number);
		
	%>
</body>
</html>