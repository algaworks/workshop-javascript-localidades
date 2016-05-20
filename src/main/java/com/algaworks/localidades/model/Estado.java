package com.algaworks.localidades.model;

public class Estado {

	public Long codigo;
	private String uf;
	private String nome;

	public Estado(Long codigo, String uf, String nome) {
		this.codigo = codigo;
		this.uf = uf;
		this.nome = nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
