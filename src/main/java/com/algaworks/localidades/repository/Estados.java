package com.algaworks.localidades.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.algaworks.localidades.model.Estado;

@Component
public class Estados {
	
	public List<Estado> todos() {
		return Arrays.asList(
				new Estado(1L, "MG", "Minas Gerais"),
				new Estado(2L, "SP", "São Paulo"),
				new Estado(3L, "GO", "Goiás"));
	}
	
}
