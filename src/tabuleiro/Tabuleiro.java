package tabuleiro;

public class Tabuleiro {
	
	private int colunas;
	private int linhas;
	private Pe�a[][] pe�as;
	public Tabuleiro(int colunas, int linhas) {
		this.colunas = colunas;
		this.linhas = linhas;
		pe�as = new Pe�a[linhas][colunas];
	}
	public int getColunas() {
		return colunas;
	}
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	public int getLinhas() {
		return linhas;
	}
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	
	}
