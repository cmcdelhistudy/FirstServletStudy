package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("uname");
		String up = request.getParameter("upass");

		if (up.equals("123")) {
			// good
			
			request.setAttribute("MSG","Welcome");
			request.setAttribute("PI",3.14454);
			request.setAttribute("AGE",12);
			request.setAttribute("NAME",un);
			
			RequestDispatcher rdGood = request
					.getRequestDispatcher("SuccessServlet");
			rdGood.forward(request, response);
		} else {
			// bad
			RequestDispatcher rdBad = request
					.getRequestDispatcher("FailureServlet");
			rdBad.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
