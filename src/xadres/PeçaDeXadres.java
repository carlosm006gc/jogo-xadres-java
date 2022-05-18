package xadres;

import tabuleiroDeJogo.Peça;
import tabuleiroDeJogo.Tabuleiro;

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
