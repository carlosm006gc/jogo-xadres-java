package tabuleiroDeJogo;

public class Tabuleiro {

	private int colunas;
	private int linhas;
	private Peça[][] peças;

	public Tabuleiro(int colunas, int linhas) {
		if(linhas < 1 || colunas < 1){
			System.out.println("Erro ao criar tabuleiro: É necessário que haja pelo menos 1 linha e 1 coluna");
		}
		this.colunas = colunas;
		this.linhas = linhas;
		peças = new Peça[linhas][colunas];
	}

	public int getColunas() {
		return colunas;
	}

	public int getLinhas() {
		return linhas;
	}

	public Peça peça(int linha, int coluna) {
		if(!existePosição(linha, coluna)) {
			throw new ExcessõesDeTabuleiro("Posição não existe no tabuleiro!");
		}
		return peças[linha][coluna];
	}

	public Peça peça(Posição posiçao) {
		if(!existePosição(posiçao)) {
			throw new ExcessõesDeTabuleiro("Posição não existe no tabuleiro!");
		}
		return peças[posiçao.getLinha()][posiçao.getColuna()];
	}

	public void colocarPeça(Peça peça, Posição posiçao) {
		if(haUmaPeça(posiçao)) {
			throw new ExcessõesDeTabuleiro("Já existe uma peça na posição: " + posiçao);
		}
		peças[posiçao.getLinha()][posiçao.getColuna()] = peça;
		peça.posiçao = posiçao;
	}

	private boolean existePosição(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean existePosição(Posição posiçao) {
		return existePosição(posiçao.getLinha(), posiçao.getColuna());
	}

	public boolean haUmaPeça(Posição posiçao) {
		if(!existePosição(posiçao)) {
			throw new ExcessõesDeTabuleiro("Posição não existe no tabuleiro!");
		}
		return peça(posiçao) != null;
	}

}
