package xadres;

import tabuleiro.Pe�a;
import tabuleiro.Tabuleiro;

public class Pe�aDeXadres extends Pe�a {

	private Cor cor;

	public Pe�aDeXadres(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	

	
}
