package br.edu.infnet.entities;

import java.util.ArrayList;

import br.edu.infnet.entities.collections.*;
import br.edu.infnet.model.collections.carro.Cambio;
import br.edu.infnet.model.collections.carro.Montadora;
import br.edu.infnet.model.collections.carro.Tipo;

public class Carro extends VeiculoBase {

	private Tipo tipoCarro;
	private Montadora montadoraCarro;
	private float motor;
	private Cambio cambio;

	public Carro() {
	}
	public Carro(Integer id, String chassi, String modelo, Cores cor, float preco, Tipo tipocarro, 
		   Montadora montadoraCarro, float motor, Cambio cambio){

		setId(id);
		setChassi(chassi);
		setModelo(modelo);
		setCor(cor);
		setPreco(preco);
		setTipoCarro(tipoCarro);
		setMontadora(montadoraCarro);
		setMotor(motor);
		setCambio(cambio);	
	}

	public Tipo getTipoCarro() {
		return tipoCarro;
	}
	public void setTipoCarro(Tipo tipoCarro) {
		this.tipoCarro = tipoCarro;
	}
	public Montadora getMontadoraCarro() {
		return montadoraCarro;
	}
	public void setMontadora(Montadora montadoraCarro) {
		this.montadoraCarro = montadoraCarro;
	}
	public float getMotor() {
		return motor;
	}
	public void setMotor(float motor) {
		this.motor = motor;
	}
	public Cambio getCambio() {
		return cambio;
	}
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cambio == null) ? 0 : cambio.hashCode());
		result = prime * result
				+ ((montadoraCarro == null) ? 0 : montadoraCarro.hashCode());
		result = prime * result + Float.floatToIntBits(motor);
		result = prime * result
				+ ((tipoCarro == null) ? 0 : tipoCarro.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (cambio != other.cambio)
			return false;
		if (montadoraCarro != other.montadoraCarro)
			return false;
		if (Float.floatToIntBits(motor) != Float.floatToIntBits(other.motor))
			return false;
		if (tipoCarro != other.tipoCarro)
			return false;
		return true;
	}
	@Override
	public ArrayList<Object> Pesquisar() 
	{
		return null;
	}
	
	public Carro PesquisarPorChassi(String chassi)
	{
		Carro c = new Carro();
		
		return c;
	}
	@Override
	public boolean Remover() {
		
		return false;
	}
	@Override
	public boolean Adcionar() {
		
		return false;
	}
	
	
}
