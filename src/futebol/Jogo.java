package futebol;

import java.util.ArrayList;

public class Jogo {

	public static void main(String[] args) {
		Jogador j1 = new Jogador("Neymar", 30, 10, "Atacante", 0);
		
		Jogador j2 = new Jogador("Cristiano Reinaldo", 32, 11, "Goleiro", 0);
		
		Treinador t1 = new Treinador("Tite", 25, 5, 12);
		
		// Lista de jogadores
		ArrayList<Jogador> jogadores1 = new ArrayList<>();
		jogadores1.add(j1);
		jogadores1.add(j2);
		
		Escalacao e1 = new Escalacao(jogadores1);
		e1.mostrarEscalacao();
		
		Time time1 = new Time("Vasco", t1, e1);
		System.out.println(time1.toString());
	}
}
