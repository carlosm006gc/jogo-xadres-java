package tabuleiro;

public class Tabuleiro {
	
	private int colunas;
	private int linhas;
	private Peça[][] peças;
	public Tabuleiro(int colunas, int linhas) {
		this.colunas = colunas;
		this.linhas = linhas;
		peças = new Peça[linhas][colunas];
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
	
	public Peça peça(int linha, int coluna) {
		return peças[linha][coluna];
	}
	
	public Peça peça(Posição posiçao) {
		return peças[posiçao.getLinha()][posiçao.getColuna()];
	}
	
	}
