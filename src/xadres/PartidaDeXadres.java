package xadres;

import tabuleiro.Tabuleiro;

public class PartidaDeXadres {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadres() {
	
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public Pe�aDeXadres [][] getPe�as(){
		
		Pe�aDeXadres[][] mat = new Pe�aDeXadres [tabuleiro.getColunas()] [tabuleiro.getLinhas()];
		for (int i = 0;i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat [i][j] = (Pe�aDeXadres)tabuleiro.pe�a(i, j);
			}
		}
		return mat;
	}

}
