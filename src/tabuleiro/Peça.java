package tabuleiro;

public class Peça {

	protected Posição posiçao;
	private Tabuleiro tabuleiro;

	public Peça(Tabuleiro tabuleiro) {
		this.posiçao = null;
		this.tabuleiro = tabuleiro;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	

}
