package br.com.feandrade.springbootcomdockermysql.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.feandrade.springbootcomdockermysql.controller.dto.PessoaRs;
import br.com.feandrade.springbootcomdockermysql.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	
	private PessoaRepository pessoaRepository;
	
	public PessoaController(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
	@GetMapping("/")
	public List<PessoaRs> findAll() {
		var pessoas = pessoaRepository.findAll();
		return pessoas.stream()
				.map(PessoaRs::converter)
				.collect(Collectors.toList());
	}
}
