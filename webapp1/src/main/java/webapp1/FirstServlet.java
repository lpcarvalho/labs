/**
 * 
 */
package webapp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author leticiapc
 *
 */
public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hollas Mundo!");

		PrintWriter pw = resp.getWriter();
		pw.write("Eu sou o primeiro!");
		
	}

	
	
}