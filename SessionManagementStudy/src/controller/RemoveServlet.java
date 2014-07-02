package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;

/**
 * Servlet implementation class RemoveServlet
 */
@WebServlet("/RemoveServlet")
public class RemoveServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<html>");

		out.println("<body>");

		HttpSession ses = request.getSession(false);

		if (ses.getAttribute("S3CRET") == null) {
			// invalid session
			out.println("You are not within the session.Please Login");
		} else {
			// valid session
			ArrayList<Product> obtainedTrolley = (ArrayList<Product>) ses
					.getAttribute("TROLLEY");
			String id = request.getParameter("id");
			int pid = Integer.parseInt(id);

			for (int i = 0; i < obtainedTrolley.size(); i++) {
				Product p = obtainedTrolley.get(i);

				if (pid == p.id) {
					obtainedTrolley.remove(i);

				}

			}
			request.getRequestDispatcher("shop.jsp").forward(request, response);

		}

		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
