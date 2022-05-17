package xadres.peças;

import tabuleiro.Tabuleiro;
import xadres.Cor;
import xadres.PeçaDeXadres;

public class Rei extends PeçaDeXadres{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "R";
	}
}
