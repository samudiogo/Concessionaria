package br.edu.infnet.entities;

import java.util.ArrayList;

public class Loja {
	private int id;
	private String nome;
	private String endereco;
	private ArrayList<Carro> listarCarros = new ArrayList<>();
	private ArrayList<Motocicleta> listarMotos = new ArrayList<>();

	public Loja() {
		super();

	}

	public Loja(int id, String nome, String endereco,
			ArrayList<Carro> listarCarros,
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

	public ArrayList<Carro> getListarCarros() {
		return listarCarros;
	}

	public void setListarCarros(ArrayList<Carro> listarCarros) {
		this.listarCarros = listarCarros;
	}

	public ArrayList<Motocicleta> getListarMotos() {
		return listarMotos;
	}

	public void setListarMotos(ArrayList<Motocicleta> listarMotos) {
		this.listarMotos = listarMotos;
	}
}
