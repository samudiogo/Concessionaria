package br.edu.infnet.entity;

import br.edu.infnet.entity.collections.*;
import br.edu.infnet.entity.collections.carro.Cambio;
import br.edu.infnet.entity.collections.carro.MontadoraCarro;

public class Carro extends VeiculoBase {

	private TipoCarro tipoCarro;
	private MontadoraCarro montadoraCarro;
	private float motor;
	private Cambio cambio;

	public Carro() {
	}
	public Carro(Integer id, String chassi, String modelo, Cores cor, float preco, TipoCarro tipocarro, 
		   MontadoraCarro montadoraCarro, float motor, Cambio cambio){

		setId(id);
		setChassi(chassi);
		setModelo(modelo);
		setCor(cor);
		setPreco(preco);
		setTipoCarro(tipoCarro);
		setMontadoraCarro(montadoraCarro);
		setMotor(motor);
		setCambio(cambio);	
	}

	public TipoCarro getTipoCarro() {
		return tipoCarro;
	}
	public void setTipoCarro(TipoCarro tipoCarro) {
		this.tipoCarro = tipoCarro;
	}
	public MontadoraCarro getMontadoraCarro() {
		return montadoraCarro;
	}
	public void setMontadoraCarro(MontadoraCarro montadoraCarro) {
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
	
	
}
