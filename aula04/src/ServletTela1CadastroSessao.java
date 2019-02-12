
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTela1CadastroSessao
 */
@WebServlet("/ServletTela1CadastroSessao")
public class ServletTela1CadastroSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletTela1CadastroSessao() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		resposta.write("<html>");
		resposta.write("<head>");
		resposta.write("<title>Dados Profissionais</title>");
		resposta.write("</head>");
		resposta.write("<body>");
		HttpSession sessao = request.getSession(false);
		if (sessao == null || sessao.getAttribute(ServletLogin.USUARIO) == null) {
			resposta.write("<a href=\"login.html\">Faça primeiro o seu login</a><BR>");
		} else {
			DadosPessoais dados = new DadosPessoais();
			dados.setNome(request.getParameter("nome"));
			dados.setSobrenome(request.getParameter("sobrenome"));
			dados.setRua(request.getParameter("rua"));
			dados.setComplemento(request.getParameter("complemento"));
			dados.setCidade(request.getParameter("cidade"));
			dados.setCep(request.getParameter("cep"));
			dados.setEstado(request.getParameter("estado"));
			sessao.setAttribute("dadosPessoais", dados);
			
			resposta.write("Preencha seus dados profissionais:");
			resposta.write("<form action=\"ServletTela2CadastroSessao\">");
			resposta.write("<input type=\"hidden\" name=\"nome\" value=\"");
			resposta.write(request.getParameter("nome") + "\">");
			resposta.write("<input type=\"hidden\" name=\"sobrenome\" value=\"");
			resposta.write(request.getParameter("sobrenome") + "\">");
			resposta.write("<input type=\"hidden\" name=\"rua\" value=\"");
			resposta.write(request.getParameter("rua") + "\">");
			resposta.write("<input type=\"hidden\" name=\"complemento\" value=\"");
			resposta.write(request.getParameter("complemento") + "\">");
			resposta.write("<input type=\"hidden\" name=\"cidade\" value=\"");
			resposta.write(request.getParameter("cidade") + "\">");
			resposta.write("<input type=\"hidden\" name=\"cep\" value=\"");
			resposta.write(request.getParameter("cep") + "\">");
			resposta.write("<input type=\"hidden\" name=\"estado\" value=\"");
			resposta.write(request.getParameter("estado") + "\">");
			resposta.write("Empresa:<input type=\"text\" name=\"empresa\"> <BR>");
			resposta.write("Endereço profissional:<BR>");
			resposta.write("Rua: <input type=\"text\" name=\"ruaEmpresa\">");
			resposta.write("Complemento:<input type=\"text\" name=\"complementoEmpresa\"><BR>");
			resposta.write("Cidade:<input type=\"text\" name=\"cidadeEmpresa\">");
			resposta.write("CEP:<input type=\"text\" name=\"cepEmpresa\">");
			resposta.write("Estado:<input type=\"text\" name=\"estadoEmpresa\"><BR>");
			resposta.write("<input type=\"submit\" value=\"Confirmar\"><BR>");
			resposta.write("</form>");
			resposta.write("</body></html>");
		}
	}

}
