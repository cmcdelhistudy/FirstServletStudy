package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body >");
		out.println("<h1>Servlet 2</h1>");

		Enumeration enm = request.getParameterNames();

		while (enm.hasMoreElements()) {
			String paramName = (String) enm.nextElement();
			String paramValue = request.getParameter(paramName);
			out.println("<br>" + paramName + " : " + paramValue);
		}

		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
