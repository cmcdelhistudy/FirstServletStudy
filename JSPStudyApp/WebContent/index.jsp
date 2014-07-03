<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
	<%@page isELIgnored="tr" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome JSP Page Study App</h1>
	<br>
	<a href="info.jsp">Go to Info JSP </a>
	<br>
	<a href="about.jsp">Go to About JSP </a>
	<br>
	<%-- This is JSP Comment --%>
	//JSP Comment //JSP Declaration
	<%!int m = 45;
	int n = 34;
	int add = 0;%>

	//JSP Scriptlet
	<%
		add = m + n;
	%>

	//JSP Out Expression Sum is
	<%=add%>

	<hr>























	<%
		int i = 45;
		int j = 12;
		int sum = i + j;
	%>

	Sum is
	<%
		out.println(sum);
	%>

	<br> Sum is ${45+12}
	<br> Sub is ${45-12}
	<br> Div is ${45/12} or ${45 div 12}
	<br> Mul is ${45*12}
	<br> Mod is ${45%12} or ${45 mod 12}

	<br> Sum is \${45+12}

	<hr>

	<form action="index.jsp">
		Enter Name <input type="text" name="username"><br> <input
			type="submit">
	</form>
	<br>
	<%
		String uname = request.getParameter("username");
		out.println("Name  : " + uname);
	%>

	<br> Using EL, Name is ${param.username}
	<br> Using EL, Value is ${ 3 ge 20}



</body>
</html>