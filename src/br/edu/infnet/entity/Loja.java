package br.edu.infnet.entity;

import java.util.ArrayList;

public class Loja {
	private int id;
	private String nome;
	private String endereco;
	private ArrayList<Carros> listarCarros = new ArrayList<>();
	private ArrayList<Motocicleta> listarMotos = new ArrayList<>();

	public Loja() {
		super();

	}

	public Loja(int id, String nome, String endereco,
			ArrayList<Carros> listarCarros,
			ArrayList<Motocicleta> listarMotos) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.listarCarros = listarCarros;
		this.listarMotos = listarMotos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Carros> getListarCarros() {
		return listarCarros;
	}

	public void setListarCarros(ArrayList<Carros> listarCarros) {
		this.listarCarros = listarCarros;
	}

	public ArrayList<Motocicleta> getListarMotos() {
		return listarMotos;
	}

	public void setListarMotos(ArrayList<Motocicleta> listarMotos) {
		this.listarMotos = listarMotos;
	}
}
