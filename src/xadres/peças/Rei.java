package xadres.pe�as;

import tabuleiro.Tabuleiro;
import xadres.Cor;
import xadres.Pe�aDeXadres;

public class Rei extends Pe�aDeXadres{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "R";
	}
}
