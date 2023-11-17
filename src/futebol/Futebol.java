package futebol;

import java.util.ArrayList;
import java.time.*;

public class Futebol {

	public static void main(String[] args) {
		// time 1
		Jogador j1 = new Jogador("Neymar", 30, 10, "Atacante", 0);
		Jogador j2 = new Jogador("Cristiano Reinaldo", 32, 11, "Goleiro", 0);
		Treinador t1 = new Treinador("Tite", 25, 5, 12);	
		
		ArrayList<Jogador> jogadores1 = new ArrayList<>();
		jogadores1.add(j1);
		jogadores1.add(j2);
		Escalacao e1 = new Escalacao(jogadores1);
		Time time1 = new Time("Vasco", t1, e1);
		
		// time 2
		Jogador j3 = new Jogador("Diego", 30, 10, "Atacante", 0);
		Jogador j4 = new Jogador("Gustavo", 32, 11, "Goleiro", 0);
		Treinador t2 = new Treinador("Roberto", 25, 5, 12);	

		ArrayList<Jogador> jogadores2 = new ArrayList<>();
		jogadores2.add(j3);
		jogadores2.add(j4);
		Escalacao e2 = new Escalacao(jogadores2);
		Time time2 = new Time("Flamengo", t2, e2);
		
		// campeonato
		ArrayList<Time> times = new ArrayList<>();
		times.add(time1);
		times.add(time2);
		Campeonato campeonato = new Campeonato("Brasileirão Série A", 5, times);
		
		// partida
		LocalDate dataPartida1 = LocalDate.of(2023, 11, 1);
		Partida partida1 = new Partida(1, dataPartida1, time1, time2);

		time1.detalhes();
		time2.detalhes();
		
		// GAMEEEEEEEEEE
		campeonato.apresentar();
		partida1.iniciarPartida();
		
		time1.detalhes();
		time2.detalhes();
	}
}