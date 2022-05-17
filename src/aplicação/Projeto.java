package aplicação;

import xadres.PartidaDeXadres;

public class Projeto {

	public static void main(String[] args) {

		PartidaDeXadres partida = new PartidaDeXadres();
		UI.printTabuleiro(partida.getPeças());
		
	}

}
