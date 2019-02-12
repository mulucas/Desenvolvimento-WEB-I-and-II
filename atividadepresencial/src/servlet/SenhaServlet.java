package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SenhaServlet
 */
@WebServlet("/SenhaServlet")
public class SenhaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String nomem;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SenhaServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		nomem = nome;
		System.out.println(nome +":"+nomem);
		String email = request.getParameter("email");
		String html = "<html><body>" + "<h1> Dados do usuario </h1> <br>" + "<form action=\"AutenticaServlet\">"
				+ " Nome: " + nome + "<Br>" + "Email: " + email + "<br><hr>"
				+ "Cadastrar Senha: <input type=\"password\" name=\"senha\">"
				+ "<input type=\"submit\" value=\"Cadastrar Senha\"> </form>" + "</html></body>";
		response.getWriter().append(html);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
