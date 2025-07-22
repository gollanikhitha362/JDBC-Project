<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to result page</h1>
	
	<%
		out.println("Math: "+request.getParameter("thMath"));
		out.println("<br>");
		out.println("Phy: "+request.getParameter("thPhy"));
		out.println("<br>");
		out.println("Chem: "+request.getParameter("thChem"));
		out.println("<br>");
		
		out.println("Percentage Result:");
		out.println("<br>");
		out.println("Grade Result:");
		out.println("<br>");
		
		out.println(request.getAttribute("Percentage"));
		out.println("<br>");
		out.println(request.getAttribute("Grade"));
		
	%>
</body>
</html>