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
 * Servlet implementation class PurchaseServlet
 */
@WebServlet("/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {

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

			if (id.equals("1")) {
				Product car = new Product(1, "Car", 100, " fancy red car");
				obtainedTrolley.add(car);
			} else if (id.equals("2")) {
				Product shoe = new Product(2, "Shoe", 50, " Black Shoe");
				obtainedTrolley.add(shoe);
			} else if (id.equals("3")) {
				Product tshirt = new Product(3, "T shirt", 5, " Boring T Shirt");
				obtainedTrolley.add(tshirt);
			} else if (id.equals("4")) {
				Product veggies = new Product(4, "Vegetables", 20,
						" Fresh Veggies");
				obtainedTrolley.add(veggies);
			}

			request.getRequestDispatcher("shop.jsp").forward(request, response);

		}

		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
