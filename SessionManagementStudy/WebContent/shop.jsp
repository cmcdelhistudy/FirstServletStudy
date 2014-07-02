<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  import="java.util.ArrayList,model.Product"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#bucket{
border-color: lime;
border-style: dashed;
border-width: 5xp;
width: 220px;
background-color: yellow;
float: right;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="teal">

<%
			HttpSession ses = request.getSession(false);

			if (ses.getAttribute("S3CRET") == null) {
				//invalid session
				out.println("You are not within the session.Please Login");
			} else {
				//valid session
				String username=(String)ses.getAttribute("USERNAME");
				%>
				
			
				<div align="center">Logged in as : <%=username%></div>
				
					<div id="bucket">
					     	<h3>Items Purchased</h3>
							<ol>
								
								<%
								ArrayList<Product> obtainedTrolley = (ArrayList<Product>) ses
							           	.getAttribute("TROLLEY");
								
								double totalPrice=0;
								
									for( Product p  :  obtainedTrolley){								
									
										out.println("<li>"+p.name+" &nbsp  Rs. "+p.price+"<a href='RemoveServlet?id="+p.id+"'><img  src='delete.png' height='20px' width='20px' /></a></li> ");
								
										totalPrice=totalPrice+p.price;
									}
									
								%>
							</ol>
							
							<h4>Total Price : Rs.<%=totalPrice%></h4>
					</div>
				
				
					<h1>Shopping Page</h1>
					
					<a href="mypage.jsp"  >User Profile</a><br>
					
					<a href="settings.jsp"> Settings</a><br>
					
					<center>
					<img  src="images/car.jpg" height="100" width="100" />
					<br>
					<a href="PurchaseServlet?id=1">Buy</a>
					<br>
					<img  src="images/shoes.jpg" height="100" width="100" />
					<br>
					<a href="PurchaseServlet?id=2">Buy</a>
					<br>
					<img  src="images/t shirt.jpg" height="100" width="100" />
					<br>
					<a href="PurchaseServlet?id=3">Buy</a>
					<br>
					<img  src="images/veg.jpg" height="100" width="100"/>
					<br>
					<a href="PurchaseServlet?id=4">Buy</a>
					<br>
					
					
					</center>
					
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


	
</body>
</html>