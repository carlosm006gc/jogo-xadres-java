package xadres.peças;

import tabuleiro.Tabuleiro;
import xadres.Cor;
import xadres.PeçaDeXadres;

public class Torre extends PeçaDeXadres{

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
