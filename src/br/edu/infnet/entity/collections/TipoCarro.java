package br.edu.infnet.entity.collections;

import java.util.ArrayList;

public enum TipoCarro {

	HATCH_COMPACTO(1), HATCH_ESPORTIVO(2), SEDAN_COMPACTO(3), SEDAN_MEDIO(4), SEDAN_GRANDE(5), 
	MINIVAN(6), PERUA(7), PICAPE(8), SUV(9), ESPORTIVO(10), UTILITARIO_COMERCIAL(11), OUTROS(12);

	private int opcoes;

	private TipoCarro(int opcoes){

		this.opcoes = opcoes;
	}	

	public int getOpcoes(){

		return opcoes;
	}
	
	public static ArrayList<String> getNomesCarros(){
		
		ArrayList<String> tipoCarros = new ArrayList<>();
		
		for(TipoCarro car : TipoCarro.values()){
			
			tipoCarros.add(car.toString());
		}
		
		return tipoCarros;
	}

}