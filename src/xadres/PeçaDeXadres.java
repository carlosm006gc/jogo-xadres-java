package xadres;

import tabuleiro.Peça;
import tabuleiro.Tabuleiro;

public class PeçaDeXadres extends Peça {

	private Cor cor;

	public PeçaDeXadres(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	

	
}
