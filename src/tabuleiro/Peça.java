package tabuleiro;

public class Pe�a {

	protected Posi��o posi�ao;
	private Tabuleiro tabuleiro;

	public Pe�a() {

	}

	public Pe�a(Posi��o posi�ao, Tabuleiro tabuleiro) {
		super();
		this.posi�ao = null;
		this.tabuleiro = tabuleiro;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

}
