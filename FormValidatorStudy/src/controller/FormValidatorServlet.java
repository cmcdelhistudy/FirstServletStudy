package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormValidatorServlet")
public class FormValidatorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		ArrayList<String> errorsList = new ArrayList<String>();

		String uname = request.getParameter("username");
		String uage = request.getParameter("userage");

		if (uname.equals("")) {
			errorsList.add("User Name is empty");
		}

		if (uage.equals("")) {
			errorsList.add("User Age is empty");
		} else {
			try {
				int age = Integer.parseInt(uage);

				if (age < 0) {
					errorsList
							.add("Are you nuts ?? . .. . . how the age can be -ve ");
				}

				if (age>0 && age < 20) {
					errorsList.add("You are kid . .. . . go and watch pogo");
				}

				if (age > 60) {
					errorsList
							.add("Uncle you are too old for this stuff . .. . . go get some rest ! ");
				}

			} catch (NumberFormatException nfe) {
				errorsList.add("Age is Invalid " + nfe.getMessage());
			}
		}

		if (errorsList.isEmpty()) {
			// go to sucess
			RequestDispatcher rdSucess = request
					.getRequestDispatcher("success.jsp");
			rdSucess.forward(request, response);
		} else {
			// back to index page
			request.setAttribute("ERRORS_LIST", errorsList);
			RequestDispatcher rdfailure = request
					.getRequestDispatcher("index.jsp");
			rdfailure.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
