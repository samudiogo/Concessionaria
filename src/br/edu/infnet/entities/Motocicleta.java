package br.edu.infnet.entities;

import java.util.ArrayList;

import br.edu.infnet.entities.collections.*;
import br.edu.infnet.model.collections.motocicleta.Montadora;
import br.edu.infnet.model.collections.motocicleta.Tipo;


public class Motocicleta extends VeiculoBase  {

	private Montadora montadoraMoto;
	private Tipo tipoMoto;
	private Integer cilindrada;
	private Integer capacidadeTanque;
	
	public Motocicleta(){
		
	}

	public Motocicleta(Integer id, String chassi, String modelo, Cores cor, float preco, Montadora montadoraMoto, Tipo tipoMoto,
			Integer cilindrada, Integer capacidadeTanque) {
		super(id, chassi, modelo, cor, preco);
		this.montadoraMoto = montadoraMoto;
		this.tipoMoto = tipoMoto;
		this.cilindrada = cilindrada;
		this.capacidadeTanque = capacidadeTanque;
	}

	public Montadora getMontadoraMoto() {
		return montadoraMoto;
	}

	public void setMontadoraMoto(Montadora montadoraMoto) {
		this.montadoraMoto = montadoraMoto;
	}

	public Tipo getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(Tipo tipoMoto) {
		this.tipoMoto = tipoMoto;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((capacidadeTanque == null) ? 0 : capacidadeTanque.hashCode());
		result = prime * result
				+ ((cilindrada == null) ? 0 : cilindrada.hashCode());
		result = prime * result
				+ ((montadoraMoto == null) ? 0 : montadoraMoto.hashCode());
		result = prime * result
				+ ((tipoMoto == null) ? 0 : tipoMoto.hashCode());
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
		Motocicleta other = (Motocicleta) obj;
		if (capacidadeTanque == null) {
			if (other.capacidadeTanque != null)
				return false;
		} else if (!capacidadeTanque.equals(other.capacidadeTanque))
			return false;
		if (cilindrada == null) {
			if (other.cilindrada != null)
				return false;
		} else if (!cilindrada.equals(other.cilindrada))
			return false;
		if (montadoraMoto != other.montadoraMoto)
			return false;
		if (tipoMoto != other.tipoMoto)
			return false;
		return true;
	}

	@Override
	public ArrayList<Object> Pesquisar()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Remover() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Adcionar() {
		// TODO Auto-generated method stub
		return false;
	}

}
