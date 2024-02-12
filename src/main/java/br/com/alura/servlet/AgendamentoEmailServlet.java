package br.com.alura.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.service.AgendamentoEmailService;


@WebServlet("emails")
public class AgendamentoEmailServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AgendamentoEmailService servico;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = resp.getWriter();
		servico.listar().forEach(resultado -> pw.print("Os emails disponíveis são: " + resultado));
	}
}
