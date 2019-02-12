package aula03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOlaPersonalizado
 */
@WebServlet("/ServletOlaPersonalizado")
public class ServletOlaPersonalizado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOlaPersonalizado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String nome = request.getParameter("nome");
		  String html = "<html><body><h1> hello "+ nome+ "</html></body></h1>"; 
		  response.getWriter().append(html);
		 
		/*
		 * PrintWriter resposta = response.getWriter(); resposta.write("<html><body>");
		 * resposta.write("Olá, os parâmetros recebidos por essa requisição são: <BR>");
		 * Enumeration<String> nomesParametros = request.getParameterNames(); while
		 * (nomesParametros.hasMoreElements()) {
		 * resposta.write(nomesParametros.nextElement().toString());
		 * resposta.write(", "); } resposta.write("</html></body>");
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
