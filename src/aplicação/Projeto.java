package aplicação;

import tabuleiro.Posição;
import tabuleiro.Tabuleiro;

public class Projeto {

	public static void main(String[] args) {

		Posição pos = new Posição();
		
		System.out.println(pos);
		
		Tabuleiro tab = new Tabuleiro(0, 0);
		
		System.out.println(tab);
	}

}
