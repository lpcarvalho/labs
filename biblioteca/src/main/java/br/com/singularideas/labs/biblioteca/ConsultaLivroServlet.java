package br.com.singularideas.labs.biblioteca;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.singularideas.com.biblioteca.dao.LivroRepository;

/**
 * Servlet implementation class ConsultaLivro
 */
public class ConsultaLivroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaLivroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/app/consultalivro.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("titulo", request.getParameter("titulo").toString());
		request.setAttribute("autor", request.getParameter("autor").toString());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/app/consultalivro.jsp");
		dispatcher.forward(request, response);
	}

}
