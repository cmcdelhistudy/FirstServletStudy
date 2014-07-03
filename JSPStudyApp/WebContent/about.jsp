<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" extends="study.HelloServlet" session="true"%>
<%@page import="java.util.Random" %>
<%@page  info="Yeh page user ki infoation ke liye hai" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>About JSP page</h1>

	<%
		if (session.getAttribute("S3CRET").equals("dfd")) {

		}
	%>

</body>
</html>