package xadres.pe�as;

import tabuleiro.Tabuleiro;
import xadres.Cor;
import xadres.Pe�aDeXadres;

public class Torre extends Pe�aDeXadres{

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
