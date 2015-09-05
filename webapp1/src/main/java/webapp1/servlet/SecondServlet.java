/**
 * 
 */
package webapp1.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp1.dao.LivroRespository;
import webapp1.data.Livro;

/**
 * @author leticiapc
 *
 */
public class SecondServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("formulario.jsp");
		dispatcher.forward(req, resp);;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LivroRespository respository = LivroRespository.getInstance();
		
		Livro lv = new Livro();
		lv.setTitulo(req.getParameter("titulo"));
		lv.setAutor(req.getParameter("autor"));
		lv.setLocal(req.getParameter("local"));
		//req.setAttribute("novoNome", nome.toUpperCase());
		// adicionar livro
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("confirmacao.jsp");
		dispatcher.forward(req, resp);;
	}
	
}
