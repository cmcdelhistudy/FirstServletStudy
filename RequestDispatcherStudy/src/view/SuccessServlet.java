package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// getting info from request Object

		String obtainedMsg = (String) request.getAttribute("MSG");
		Double obtainedPi = (Double) request.getAttribute("PI");
		Integer obtainedAge = (Integer) request.getAttribute("AGE");
		String obtainedName = (String) request.getAttribute("NAME");

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Valid User </h1>");
		out.println("<h1>Hi , " + obtainedName + "</h1>");
		out.println("<br> Your age : " + obtainedAge);
		out.println("<br> Pi Value : " + obtainedPi);
		out.println("<br>Message : " + obtainedMsg);

		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
