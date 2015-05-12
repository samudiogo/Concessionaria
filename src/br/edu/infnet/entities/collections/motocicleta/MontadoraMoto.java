package br.edu.infnet.entities.collections.motocicleta;

public enum MontadoraMoto {

	HONDA("Honda"), YAMAHA("Yamaha"), SUZUKI("Suzuki"), DAFRA("Dafra"),
	SHINERAY("Shineray"), KAWASAKI("Kawasaki"), KASINSKI("Kasinski"), HARLEY_DAVIDSON("Harley Davidson"),
	BMW("BMW"), TRAXX("Traxx"), FLASH("Flash"), SUNDOWN("Sundown"), OUTROS("Outros");
	
	private final String montadora;
	
	private MontadoraMoto(String montadora){
		
		this.montadora = montadora;
	}
	
	public String getMontadora(){
		
		return montadora;
	}
}
