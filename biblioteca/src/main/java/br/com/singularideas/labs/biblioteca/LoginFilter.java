package br.com.singularideas.labs.biblioteca;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.singularideas.com.biblioteca.dao.LivroRepository;
import br.com.singularideas.com.biblioteca.data.Livro;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		//System.out.println(System.currentTimeMillis() + " - " + httpRequest.getRequestURI().toString() + " - " + httpRequest.getSession().getAttribute("user"));

		if (httpRequest.getSession().getAttribute("user") == null
				 && httpRequest.getRequestURI().equals("/biblioteca-web/login") == false) {			
			System.out.println ("Acesso indevido: sem sessao logada ");
			httpResponse.sendRedirect( "/biblioteca-web/login");
		} else if (httpRequest.getSession().getAttribute("user") != null
				&& httpRequest.getRequestURI().equals("/biblioteca-web/login") == true
				&& httpRequest.getParameter("invalidate") == null ) {
			
				System.out.println("Acesso indevido de '" + httpRequest.getSession().getAttribute("user") + "' [" + httpRequest.getRequestURI() + "]");
				httpResponse.sendRedirect("/biblioteca-web/app/menu.jsp");
			
		} else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		LivroRepository repository = LivroRepository.getInstance();
		for (int i=1; i<5; i++)
			repository.add(new Livro("titulo"+i, "autor"+i, "local-"+i));
	}

}
