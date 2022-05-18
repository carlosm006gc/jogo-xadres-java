package tabuleiroDeJogo;

public class Tabuleiro {

	private int colunas;
	private int linhas;
	private Pe�a[][] pe�as;

	public Tabuleiro(int colunas, int linhas) {
		if(linhas < 1 || colunas < 1){
			System.out.println("Erro ao criar tabuleiro: � necess�rio que haja pelo menos 1 linha e 1 coluna");
		}
		this.colunas = colunas;
		this.linhas = linhas;
		pe�as = new Pe�a[linhas][colunas];
	}

	public int getColunas() {
		return colunas;
	}

	public int getLinhas() {
		return linhas;
	}

	public Pe�a pe�a(int linha, int coluna) {
		if(!existePosi��o(linha, coluna)) {
			throw new Excess�esDeTabuleiro("Posi��o n�o existe no tabuleiro!");
		}
		return pe�as[linha][coluna];
	}

	public Pe�a pe�a(Posi��o posi�ao) {
		if(!existePosi��o(posi�ao)) {
			throw new Excess�esDeTabuleiro("Posi��o n�o existe no tabuleiro!");
		}
		return pe�as[posi�ao.getLinha()][posi�ao.getColuna()];
	}

	public void colocarPe�a(Pe�a pe�a, Posi��o posi�ao) {
		if(haUmaPe�a(posi�ao)) {
			throw new Excess�esDeTabuleiro("J� existe uma pe�a na posi��o: " + posi�ao);
		}
		pe�as[posi�ao.getLinha()][posi�ao.getColuna()] = pe�a;
		pe�a.posi�ao = posi�ao;
	}

	private boolean existePosi��o(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean existePosi��o(Posi��o posi�ao) {
		return existePosi��o(posi�ao.getLinha(), posi�ao.getColuna());
	}

	public boolean haUmaPe�a(Posi��o posi�ao) {
		if(!existePosi��o(posi�ao)) {
			throw new Excess�esDeTabuleiro("Posi��o n�o existe no tabuleiro!");
		}
		return pe�a(posi�ao) != null;
	}

}
