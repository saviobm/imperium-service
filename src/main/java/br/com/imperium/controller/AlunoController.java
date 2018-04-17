package br.com.imperium.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.imperium.aluno.ImperiumRepository;
import br.com.imperium.exception.ImperiumErrorException;
import br.com.imperium.modelo.Aluno;
import br.com.imperium.util.PropriedadesUtil;

@Controller
@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/aluno-controller")
public class AlunoController {
	
	@Autowired
	private ImperiumRepository<Aluno> repository;
	
	@RequestMapping(method = RequestMethod.POST, consumes= "application/json", path = "/salvar")
	public Aluno salvar(@RequestBody Aluno aluno) throws ImperiumErrorException {
		
		Aluno anoSalvo = null;
		
		if (aluno != null) {
			
			aluno = this.repository.save(aluno);
			
		} else {
			
			//throw new ImperiumErrorException(PropriedadesUtil.getInstance().getPropriedade("error.entidade.nula"));
			
		}
		
		return anoSalvo;
		
	}

}