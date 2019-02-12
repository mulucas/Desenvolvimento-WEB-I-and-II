package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletMenu
 */
@WebServlet("/ServletMenu")
public class ServletMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		//Usuario usuario = new Usuario();
		resposta.write("<html><body>");
		HttpSession sessao = request.getSession(false);
		if (sessao == null || sessao.getAttribute(AutenticaServlet.USUARIO) == null) {
			resposta.write("<a href=\"login.html\">Faça primeiro o seu login</a><BR>");
		} else {
			String nome = request.getParameter("nome");
			resposta.write("Bem vindo "+nome+"<BR>");
			resposta.write("<b>Operações disponíveis: </b><BR>");
			resposta.write("<a href=\"cadastro.html\">1. Cadastro</a><BR>");
			// Novas opções de funcionalidades entram aqui!
		}
		resposta.write("</body></html>");
	}

}
