package br.com.singularideas.labs.biblioteca;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.singularideas.com.biblioteca.dao.LivroRepository;
import br.com.singularideas.com.biblioteca.data.Livro;

/**
 * Servlet implementation class CadastroServlet
 */
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LivroRepository repository = LivroRepository.getInstance();
		RequestDispatcher dispatcher = null;
		if (request.getRequestURI().equals("/biblioteca-web/livros"))
			dispatcher = request.getRequestDispatcher("/app/cadastro.jsp");
		else {
			if (request.getParameter("excluir") != null) {
				repository.getAll().remove(request.getParameter("excluir"));
				dispatcher = request.getRequestDispatcher("/livros");
			}
			else {
				if (request.getParameter("alterar") != null) {
					Livro lv = repository.findByIndex(Integer.parseInt(request.getParameter("alterar")));
					request.setAttribute("tituloatual", lv.getTitulo());
					request.setAttribute("autoratual", lv.getAutor());
					request.setAttribute("localatual", lv.getLocal());
					request.setAttribute("alterar", request.getParameter("alterar"));
				} else {
					request.setAttribute("tituloatual", "");
					request.setAttribute("autoratual","");
					request.setAttribute("localatual", "");	
				}				
				dispatcher = request.getRequestDispatcher("/app/novolivro.jsp");
			}
		}
		dispatcher.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LivroRepository repository = LivroRepository.getInstance();
		
		System.out.println (request.getRequestURI());
		
		Livro lv = new Livro(request.getParameter("titulo"), request.getParameter("autor"),request.getParameter("local"));
		if (request.getParameter("alterar") != null) {
			repository.getAll().remove(0);
		}
		repository.add(lv);
		
		response.sendRedirect( "/biblioteca-web/livros");
	}

}
