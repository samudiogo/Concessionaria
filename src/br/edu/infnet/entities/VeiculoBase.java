package br.edu.infnet.entities;
import java.util.ArrayList;

import br.edu.infnet.entities.collections.*;
public abstract class VeiculoBase {

	protected Integer id;
	protected String chassi;
	protected String modelo;
	protected Cores cor;
	protected float preco;

	public VeiculoBase() {
	}
	
	protected VeiculoBase(Integer id, String chassi, String modelo, Cores cor,
			float preco) {
		super();
		this.id = id;
		this.chassi = chassi;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cores getCor() {
		return cor;
	}

	public void setCor(Cores cor) {
		this.cor = cor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public abstract ArrayList<Object> Pesquisar();
	
	public abstract boolean Remover();
	public abstract boolean Adcionar();

}