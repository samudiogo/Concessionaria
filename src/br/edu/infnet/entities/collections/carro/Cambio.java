package br.edu.infnet.entities.collections.carro;

public enum Cambio {
	
	AUTOMATICO("Autom�tico"), SEMI_AUTOMATICO("Semi-Autom�tico"), MANUAL("Manual");
	
	private final String cambio;
	
	private Cambio(String cambio){
		
		this.cambio = cambio;
	}
	public String tipoCambio(){
		
		return cambio;
	}
}
