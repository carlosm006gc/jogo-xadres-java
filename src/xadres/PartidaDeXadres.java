package xadres;

import tabuleiro.Tabuleiro;

public class PartidaDeXadres {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadres() {
	
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public PeçaDeXadres [][] getPeças(){
		
		PeçaDeXadres[][] mat = new PeçaDeXadres [tabuleiro.getColunas()] [tabuleiro.getLinhas()];
		for (int i = 0;i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat [i][j] = (PeçaDeXadres)tabuleiro.peça(i, j);
			}
		}
		return mat;
	}

}
