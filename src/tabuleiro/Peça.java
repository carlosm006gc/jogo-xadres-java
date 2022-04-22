package tabuleiro;

public class Peça {

	protected Posição posiçao;
	private Tabuleiro tabuleiro;

	public Peça() {

	}

	public Peça(Posição posiçao, Tabuleiro tabuleiro) {
		super();
		this.posiçao = null;
		this.tabuleiro = tabuleiro;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

}
