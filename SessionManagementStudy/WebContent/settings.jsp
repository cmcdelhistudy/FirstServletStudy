<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink"  >
	<center>
	
	
	<%
			HttpSession ses = request.getSession(false);

			if (ses.getAttribute("S3CRET") == null) {
				//invalid session
				out.println("You are not within the session.Please Login");
			} else {
				//valid session
				String username=(String)ses.getAttribute("USERNAME");
				%>
				<div align="right">Logged in as : <%=username%></div>
					<h1>Set up your Details !</h1>

					<a href="mypage.jsp">Profile Page</a>  <br>
					<a href="shop.jsp">Start Shopping</a>
					<hr>
						<br>Session ID : <%=ses.getId() %>
						<br>Creation Time : <%=ses.getCreationTime() %>
						<br>Last Accessed Time :  <%=ses.getLastAccessedTime() %>
						<br>IS New : <%=ses.isNew()%>
						<br>Sesison Time Out : <%=ses.getMaxInactiveInterval() %>
					<hr>
					
					<br> <a href="LogoutServlet">Logout</a>
			<% 
									
			}
		%>

		
	
	
		
	</center>
</body>
</html>