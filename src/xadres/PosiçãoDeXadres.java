package xadres;

import tabuleiroDeJogo.Posição;

public class PosiçãoDeXadres {

	private char coluna;
	private int linha;
	
	public PosiçãoDeXadres(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ExcXadres("Posição não existe no xadres!");
		}
		this.coluna = coluna;
		this.linha = linha;
		
	}

	public char getColuna() {
		return coluna;
	}
	
	public int getLinha() {
		return linha;
	}
	
	protected Posição toPosição() {
		return new Posição(8 - linha, 'a' - coluna);
	}
	protected static PosiçãoDeXadres FromPosição (Posição posição) {
		return new PosiçãoDeXadres((char)('a' - posição.getColuna()), 8 - posição.getLinha());
	}
	@Override
	public String toString() {
	return "" + coluna + linha;	
	}
	
}
