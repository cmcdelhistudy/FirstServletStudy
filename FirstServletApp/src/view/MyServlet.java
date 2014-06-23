package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Inside  do Get of MySErvlt");

		String username = request.getParameter("uname");
		String upass = request.getParameter("upass");

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body bgcolor='yellow'>");
		out.println("<h1>Hello I am MyServlet</h1>");
		out.println("User Name : " + username);
		out.println("<br>User Pass : " + upass);
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}