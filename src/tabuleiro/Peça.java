package tabuleiro;

public class Pe�a {

	protected Posi��o posi�ao;
	private Tabuleiro tabuleiro;

	public Pe�a(Tabuleiro tabuleiro) {
		this.posi�ao = null;
		this.tabuleiro = tabuleiro;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	

}
