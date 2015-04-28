package br.edu.infnet.entity;

import br.edu.infnet.entity.collections.TipoMotocicleta;

public class Motocicleta {

	private Integer id;
	private String chassi;
	private String fabricante;
	private String modelo;
	private TipoMotocicleta tipoMoto;
	private String cor;
	private Integer cilindrada;
	private Integer capacidadeTanque;
	private Float preco;

	public Motocicleta() {
		super();
	}

	public Motocicleta(Integer id, String chassi, String fabricante,
			String modelo, TipoMotocicleta tipoMoto, String cor,
			Integer cilindrada, Integer capacidadeTanque, Float preco) {
		super();
		this.id = id;
		this.chassi = chassi;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tipoMoto = tipoMoto;
		this.cor = cor;
		this.cilindrada = cilindrada;
		this.capacidadeTanque = capacidadeTanque;
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

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public TipoMotocicleta getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(TipoMotocicleta tipoMoto) {
		this.tipoMoto = tipoMoto;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Integer getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(Integer capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}
}
