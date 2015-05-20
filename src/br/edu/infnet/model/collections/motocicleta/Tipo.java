package br.edu.infnet.model.collections.motocicleta;

import java.util.ArrayList;

public enum Tipo {

	CICLOMOTORES(1), MOTOCICLOS(2), SCOOTER(3), ESPORTIVAS(4), CUSTOM(5),
	ROADSTERS(6), CHOPPER(7), NAKED(8), OFFROAD(9), POCKETBIKES(10),
	STREET(11), UNDERBONE(12), BABY(13), OUTROS(14);

	private int opcoes ;

	private Tipo(int opcoes){
		this.opcoes = opcoes;
	}

	public int getOpcoes(){
		return opcoes;
	}

	public static ArrayList<String> getNomesMoto(){

		ArrayList<String> tipoMotos = new ArrayList<>();

		for (Tipo motos : Tipo.values()){
			tipoMotos.add(motos.toString());
		}

		return tipoMotos;
	}

}
