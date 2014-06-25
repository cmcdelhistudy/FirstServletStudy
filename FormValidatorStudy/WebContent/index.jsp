<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<h1>Form Validator Study</h1>

		<form action="FormValidatorServlet">
			Enter Name <input type="text" name="username"><br> Enter
			Age <input type="text" name="userage"><br> <input
				type="submit">
		</form>

		<%
			ArrayList<String> obtainedErrorList = (ArrayList<String>) request
					.getAttribute("ERRORS_LIST");

			if (obtainedErrorList != null) {
				for (String er : obtainedErrorList) {
					out.println("<br>" + er);
				}
			}
		%>

	</center>
</body>
</html>