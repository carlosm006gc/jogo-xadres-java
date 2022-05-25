package xadres;

import tabuleiroDeJogo.Posi��o;

public class Posi��oDeXadres {

	private char coluna;
	private int linha;
	
	public Posi��oDeXadres(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ExcXadres("Posi��o n�o existe no xadres!");
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
	
	protected Posi��o toPosi��o() {
		return new Posi��o(8 - linha, 'a' - coluna);
	}
	protected static Posi��oDeXadres FromPosi��o (Posi��o posi��o) {
		return new Posi��oDeXadres((char)('a' - posi��o.getColuna()), 8 - posi��o.getLinha());
	}
	@Override
	public String toString() {
	return "" + coluna + linha;	
	}
	
}
