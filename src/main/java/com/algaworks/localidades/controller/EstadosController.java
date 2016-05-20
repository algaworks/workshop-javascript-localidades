package com.algaworks.localidades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.localidades.model.Estado;
import com.algaworks.localidades.repository.Estados;

@RestController
@RequestMapping("/estados")
public class EstadosController {
	
	@Autowired
	private Estados estados;
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Estado> todos() {
		return estados.todos();
	}
	
}
