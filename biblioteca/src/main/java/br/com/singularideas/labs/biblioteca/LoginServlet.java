package br.com.singularideas.labs.biblioteca;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if (request.getParameter("invalidate") != null) {
			request.getSession().invalidate();
		}
			
		RequestDispatcher dispatcher = request.getRequestDispatcher("/app/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destination = "/app/login.jsp";

		String pass = request.getParameter("password");
		String user = request.getParameter("user");

		if ((user != null) && (!user.trim().equals("")) && (pass != null) && (!pass.trim().equals(""))) {
			if (user.equals("adm") && pass.equals("adm")) {
				destination = "/app/menu.jsp";
				request.getSession().setAttribute("user", user);
				//response.sendRedirect(destination);
			} else {
				request.setAttribute("message", "Usuario/Senha Invalidos!");
			}
		} else {
			request.setAttribute("message", "Usuario/Senha sao obrigatorios!");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(destination);
		dispatcher.forward(request, response);
	}
}
