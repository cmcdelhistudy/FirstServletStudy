package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("uname");
		String userpass = request.getParameter("upass");

		if (userpass.equals("123")) {
			HttpSession session = request.getSession(true);

			session.setAttribute("S3CRET", "S3CRET");
			session.setAttribute("USERNAME", username);

			ArrayList<Product> trolley = new ArrayList<Product>();

			session.setAttribute("TROLLEY", trolley);

			request.getRequestDispatcher("mypage.jsp").forward(request,
					response);
		} else {
			request.getRequestDispatcher("fail.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
