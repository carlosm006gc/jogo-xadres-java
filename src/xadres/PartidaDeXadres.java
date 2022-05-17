package xadres;

import tabuleiro.Posi��o;
import tabuleiro.Tabuleiro;
import xadres.pe�as.Rei;
import xadres.pe�as.Torre;

public class PartidaDeXadres {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadres() {
	
		tabuleiro = new Tabuleiro(8, 8);
		ConfigInicial();
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
	private void ConfigInicial() {
		tabuleiro.colocarPe�a(new Rei(tabuleiro, Cor.WHITE), new Posi��o(2, 1));
		tabuleiro.colocarPe�a(new Torre(tabuleiro, Cor.BLACK), new Posi��o(0, 4));
		
	}

}
