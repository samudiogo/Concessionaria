package br.edu.infnet.entities.collections.carro;

public enum Cambio {
	
	AUTOMATICO("Automático"), SEMI_AUTOMATICO("Semi-Automático"), MANUAL("Manual");
	
	private final String cambio;
	
	private Cambio(String cambio){
		
		this.cambio = cambio;
	}
	public String tipoCambio(){
		
		return cambio;
	}
}
