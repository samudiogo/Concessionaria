package br.edu.infnet.entity;

import br.edu.infnet.entity.collections.TipoCarro;

public class Carros {

	private int id;
	private String chassi;
	private String montadora;
	private String modelo;
	private TipoCarro tipoCar;
	private String cor;
	private String motor;
	private String cambio;
	private float preco;

	public Carros() {
		super();
	}


	public Carros(int id, String chassi, String montadora, String modelo,
			TipoCarro tipoCar, String cor, String motor, String cambio,
			float preco) {
		super();
		this.id = id;
		this.chassi = chassi;
		this.montadora = montadora;
		this.modelo = modelo;
		this.tipoCar = tipoCar;
		this.cor = cor;
		this.motor = motor;
		this.cambio = cambio;
		this.preco = preco;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public TipoCarro getTipoCar() {
		return tipoCar;
	}

	public void setTipoCar(TipoCarro tipoCar) {
		this.tipoCar = tipoCar;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
}
