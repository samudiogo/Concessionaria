package br.edu.infnet.model.collections.carro;

public enum Montadora {
	
	FIAT("Fiat"), GM("General Motors"), VOLKSWAGEN("Volkswagen"), FORD("Ford"),
	RENAULT("Renault"), HYUNDAI("Hyundai"), TOYOTA("Toyota"), HONDA("Honda"),
	NISSAN("Nissan"), PEGEOUT("Pegeout"), KIA("Kia"), AUDI("Audi"), OUTROS("Outros");
	
	private final String montadora;
	
	private Montadora(String montadora){
		this.montadora = montadora;
	}

	public String nomeMontadora(){
		
		return montadora;
	}
}
