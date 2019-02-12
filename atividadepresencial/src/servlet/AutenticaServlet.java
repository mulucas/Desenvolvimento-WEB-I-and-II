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
 * Servlet implementation class AutenticaServlet
 */
@WebServlet("/AutenticaServlet")
public class AutenticaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String USUARIO = "usuario";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutenticaServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter resposta = response.getWriter();
		resposta.write("<html><body>");
		String nomeUsuario = SenhaServlet.nomem;
		String senhaUsuario = request.getParameter("senha");
		System.out.println(nomeUsuario);
		if (autenticar( senhaUsuario)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, nomeUsuario);
			request.getRequestDispatcher("ServletMenu").forward(request, response);
		} else {
			resposta.write("Usuário e senha inválidos");
		}
		resposta.write("</body></html>");
	}

	private boolean autenticar( String senhaUsuario) {
		return !( "".equals(senhaUsuario)  || senhaUsuario == null);
	}

}
