package futebol;

public class Time {
	private String nome;
	private Treinador tecnico;
	private int vitorias, derrotas, empates;
	private Escalacao jogadoresEscalados;
	
	public Time(String nome, Treinador tecnico, Escalacao jogadoresEscalados) {
		super();
		this.nome = nome;
		this.tecnico = tecnico;
		this.jogadoresEscalados = jogadoresEscalados;
		this.vitorias = 0;
		this.derrotas = 0;
		this.empates = 0;
	}
	
	@Override
	public String toString() {
		return "Time [nome=" + nome + ", tecnico=" + tecnico.getNome() + ", vitorias=" + vitorias + ", derrotas=" + derrotas
				+ ", empates=" + empates + ", escalacao=" + jogadoresEscalados.mostrarNomes() + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Treinador getTecnico() {
		return tecnico;
	}

	public void setTecnico(Treinador tecnico) {
		this.tecnico = tecnico;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public Escalacao getJogadoresEscalados() {
		return jogadoresEscalados;
	}

	public void setJogadoresEscalados(Escalacao jogadoresEscalados) {
		this.jogadoresEscalados = jogadoresEscalados;
	}
}
