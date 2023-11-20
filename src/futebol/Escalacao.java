package futebol;

import java.util.ArrayList;

public class Escalacao {
	private ArrayList<Jogador> jogadores;

	public Escalacao(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	public void adicionarJogador(Jogador j){
		jogadores.add(j);
	}
	
	public void removerJogador(Jogador j){
		jogadores.remove(j);
	}
	
	public ArrayList<Jogador> obterJogadores(){
		return jogadores;
	}
	
	public String mostrarNomes() {
	    StringBuilder nomes = new StringBuilder();

	    for (Jogador j : jogadores) {
	        nomes.append(j.getNome()).append(", ");
	    }

	    // Remove a última vírgula e espaço desnecessários
	    if (nomes.length() > 2) {
	        nomes.setLength(nomes.length() - 2);
	    }

	    return nomes.toString();
	}
	
	public void mostrarEscalacao(){
		for (Jogador j : jogadores) {
			System.out.println(j.getNome() + ", Camisa " + j.getCamisa() + ", " + j.getPosicao());
		}
	}
}
