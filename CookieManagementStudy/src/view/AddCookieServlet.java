package view;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
@WebServlet("/AddCookieServlet")
public class AddCookieServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Cookie c = new Cookie("APP_NAME", "Online Toy Shop");

		Cookie date = new Cookie("DATE_VISITED", new Date().toString());
		date.setMaxAge(120);

		response.addCookie(c);
		response.addCookie(date);

		response.getWriter().println("Cookie Added");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
