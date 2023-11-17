package futebol;

import java.util.ArrayList;

public class Campeonato {
	private String nome;
	private int rodadas;
	private ArrayList<Time> times;
	
	public Campeonato(String nome, int rodadas, ArrayList<Time> times) {
		super();
		this.nome = nome;
		this.rodadas = rodadas;
		this.times = times;
	}
	
	public String tabelaTimes() {
	    StringBuilder nomeTime = new StringBuilder();

	    for (Time t : times) {
	    	nomeTime.append(t.getNome() + ", ");
	    }

	    // Remove a última vírgula e espaço desnecessários
	    if (nomeTime.length() > 2) {
	    	nomeTime.setLength(nomeTime.length() - 2);
	    }

	    return nomeTime.toString();
	}
	
	public void apresentar() {
		System.out.println(this.nome);
		System.out.println("Número de rodadas: " + this.rodadas);
		System.out.println("Times competidores: " + this.tabelaTimes());
		System.out.println();
	}

	@Override
	public String toString() {
		return "Campeonato [nome=" + nome + ", rodadas=" + rodadas + ", times=" + tabelaTimes() + "]";
	}
}
