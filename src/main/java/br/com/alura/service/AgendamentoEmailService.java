package br.com.alura.service;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alura.dao.AgendamentoEmailDAO;
import br.com.alura.entity.AgendamentoEmail;

@Stateless
public class AgendamentoEmailService {
	
	public List<AgendamentoEmail> listar(){
		AgendamentoEmailDAO dao = new AgendamentoEmailDAO();
		return dao.listar();
	}

}
