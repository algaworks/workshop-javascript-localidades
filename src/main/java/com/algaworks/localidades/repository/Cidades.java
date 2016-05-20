package com.algaworks.localidades.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.algaworks.localidades.model.Cidade;

@Component
public class Cidades {

	public List<Cidade> porUfEstado(String uf) {
		List<Cidade> cidadesFiltradasPorEstado = null;
		switch (uf) {
		case "MG":
			cidadesFiltradasPorEstado = Arrays.asList(
					new Cidade(1L, "Uberlândia"),
					new Cidade(2L, "Belo Horizonte"),
					new Cidade(3L, "Ouro Preto"));
			break;
		case "SP":
			cidadesFiltradasPorEstado = Arrays.asList(
					new Cidade(4L, "Santos"),
					new Cidade(5L, "Ribeirão Preto"));
			break;
		case "GO":
			cidadesFiltradasPorEstado = Arrays.asList(
					new Cidade(6L, "Goiânia"),
					new Cidade(7L, "Rio Verde"));
			break;
		default: 
			throw new IllegalArgumentException("UF não existente ou não mapeada, use apenas MG, SP ou GO");
		}
		
		return cidadesFiltradasPorEstado;
	}
	
}
