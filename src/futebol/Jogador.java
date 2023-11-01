package futebol;

public class Jogador extends Pessoa {
	private int camisa;
	private String posicao;
	private int gols;
	
	public Jogador(String nome, int idade, int camisa, String posicao, int gols) {
		super(nome, idade);
		this.camisa = camisa;
		this.posicao = posicao;
		this.gols = gols;
	}

	@Override
	public String toString() {
		return "Jogador [nome="+ super.getNome() + ", idade= " + super.getIdade() + ", camisa=" + camisa + ", posicao=" + posicao + ", gols=" + gols + "]";
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		this.gols = gols;
	}
}
