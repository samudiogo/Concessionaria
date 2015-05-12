package br.edu.infnet.entities.collections;

public enum Cores {

	AMARELO("Amarelo"), AZUL("Azul"), BRANCO("Branco"), PRATA("Prata"),
	PRETO("Preto"), VERDE("Verde"), VERMELHO("Vermelho");
	
	private final String cor;
	
	private Cores(String cor){
		
		this.cor = cor;	
	}

	public String nomeCor(){
		
		return cor;
	}
}
