package xadres;

import tabuleiro.Posição;
import tabuleiro.Tabuleiro;
import xadres.peças.Rei;
import xadres.peças.Torre;

public class PartidaDeXadres {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadres() {
	
		tabuleiro = new Tabuleiro(8, 8);
		ConfigInicial();
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
	private void ConfigInicial() {
		tabuleiro.colocarPeça(new Rei(tabuleiro, Cor.WHITE), new Posição(2, 1));
		tabuleiro.colocarPeça(new Torre(tabuleiro, Cor.BLACK), new Posição(0, 4));
		
	}

}
