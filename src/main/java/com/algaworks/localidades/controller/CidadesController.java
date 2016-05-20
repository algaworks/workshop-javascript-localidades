package com.algaworks.localidades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.localidades.model.Cidade;
import com.algaworks.localidades.repository.Cidades;

@RestController
@RequestMapping("/cidades")
public class CidadesController {

	@Autowired
	private Cidades cidades;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Cidade> porUf(@RequestParam String uf) {
		return cidades.porUfEstado(uf);
	}
	
}
