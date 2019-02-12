package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HTMLServlet
 */
@WebServlet("/HTMLServlet")
public class HTMLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HTMLServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Instituto Metr�pole Digital</h1>");
		out.print("<strong>Disciplina: Desenvolvimento WEB I</strong> <BR><BR>");
		out.write("<form action=\"SenhaServlet\">");
		out.write("Nome: <input type=\"text\" name=\"nome\">");
		out.write("E-mail: <input type=\"text\" name=\"email\">");
		out.write("<input type=\"submit\" value=\"Enviar\"><BR>");
		out.write("</form>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
