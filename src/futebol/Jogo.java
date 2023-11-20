package futebol;

import java.util.ArrayList;

public class Jogo {
	public static void main(String[] args) {
		// VASCO
		Treinador vasco0 = new Treinador("Tite", 25, 5, 12);
		Jogador vasco1 = new Jogador("Neymar", 30, 10, "Atacante", 0);
		Jogador vasco2 = new Jogador("Cristiano Reinaldo", 32, 11, "Goleiro", 0);
		Jogador vasco3 = new Jogador("Mbappé", 23, 7, "Atacante", 0);
		Jogador vasco4 = new Jogador("Lewandowski", 33, 9, "Atacante", 0);
		Jogador vasco5 = new Jogador("De Bruyne", 30, 17, "Meio-Campista", 0);
		Jogador vasco6 = new Jogador("Sergio Ramos", 36, 4, "Defensor", 0);
		Jogador vasco7 = new Jogador("Mohamed Salah", 29, 11, "Atacante", 0);
		Jogador vasco8 = new Jogador("Manuel Neuer", 35, 1, "Goleiro", 0);
		Jogador vasco9 = new Jogador("Kevin Volland", 29, 31, "Atacante", 0);
		Jogador vasco10 = new Jogador("Marquinhos", 27, 5, "Defensor", 0);
		
		ArrayList<Jogador> jogadoresVasco = new ArrayList<>();
		jogadoresVasco.add(vasco1);
		jogadoresVasco.add(vasco2);
		jogadoresVasco.add(vasco3);
		jogadoresVasco.add(vasco4);
		jogadoresVasco.add(vasco5);
		jogadoresVasco.add(vasco6);
		jogadoresVasco.add(vasco7);
		jogadoresVasco.add(vasco8);
		jogadoresVasco.add(vasco9);
		jogadoresVasco.add(vasco10);
		
		Escalacao escalacaoVasco = new Escalacao(jogadoresVasco);
		
		Time timeVasco = new Time("Vasco", vasco0, escalacaoVasco);
		
		// FLAMENGO
		Treinador flamengo0 = new Treinador("Ronaldo", 30, 1, 3);
		Jogador flamengo1 = new Jogador("Gareth Bale", 32, 11, "Atacante", 0);
		Jogador flamengo2 = new Jogador("Paul Pogba", 28, 6, "Meio-Campista", 0);
		Jogador flamengo3 = new Jogador("Sergio Aguero", 33, 10, "Atacante", 0);
		Jogador flamengo4 = new Jogador("Toni Kroos", 32, 8, "Meio-Campista", 0);
		Jogador flamengo5 = new Jogador("Ruben Dias", 24, 3, "Defensor", 0);
		Jogador flamengo6 = new Jogador("Ederson", 28, 31, "Goleiro", 0);
		Jogador flamengo7 = new Jogador("Son Heung-min", 29, 7, "Atacante", 0);
		Jogador flamengo8 = new Jogador("Kalidou Koulibaly", 30, 26, "Defensor", 0);
		Jogador flamengo9 = new Jogador("Gianluigi Donnarumma", 22, 99, "Goleiro", 0);
		Jogador flamengo10 = new Jogador("Jadon Sancho", 21, 25, "Atacante", 0);
		
		ArrayList<Jogador> jogadoresFlamengo = new ArrayList<>();
		jogadoresFlamengo.add(flamengo1);
		jogadoresFlamengo.add(flamengo2);
		jogadoresFlamengo.add(flamengo3);
		jogadoresFlamengo.add(flamengo4);
		jogadoresFlamengo.add(flamengo5);
		jogadoresFlamengo.add(flamengo6);
		jogadoresFlamengo.add(flamengo7);
		jogadoresFlamengo.add(flamengo8);
		jogadoresFlamengo.add(flamengo9);
		jogadoresFlamengo.add(flamengo10);
		
		Escalacao escalacaoFlamengo = new Escalacao(jogadoresFlamengo);

		Time timeFlamengo = new Time("Flamengo", flamengo0, escalacaoFlamengo);
		
		// GREMIO
		Treinador gremio0 = new Treinador("Tite", 25, 5, 12);
		Jogador gremio1 = new Jogador("Antoine Griezmann", 30, 7, "Atacante", 0);
		Jogador gremio2 = new Jogador("Harry Kane", 28, 10, "Atacante", 0);
		Jogador gremio3 = new Jogador("Marco Verratti", 29, 6, "Meio-Campista", 0);
		Jogador gremio4 = new Jogador("Luka Modric", 36, 10, "Meio-Campista", 0);
		Jogador gremio5 = new Jogador("Andrew Robertson", 27, 26, "Defensor", 0);
		Jogador gremio6 = new Jogador("Thibaut Courtois", 29, 1, "Goleiro", 0);
		Jogador gremio7 = new Jogador("Lautaro Martínez", 24, 10, "Atacante", 0);
		Jogador gremio8 = new Jogador("Marcelo", 33, 12, "Defensor", 0);
		Jogador gremio9 = new Jogador("Eden Hazard", 31, 7, "Atacante", 0);
		Jogador gremio10 = new Jogador("Fabinho", 28, 3, "Meio-Campista", 0);
				
		ArrayList<Jogador> jogadoresGremio = new ArrayList<>();
		jogadoresGremio.add(gremio1);
		jogadoresGremio.add(gremio2);
		jogadoresGremio.add(gremio3);
		jogadoresGremio.add(gremio4);
		jogadoresGremio.add(gremio5);
		jogadoresGremio.add(gremio6);
		jogadoresGremio.add(gremio7);
		jogadoresGremio.add(gremio8);
		jogadoresGremio.add(gremio9);
		jogadoresGremio.add(gremio10);
		
		Escalacao escalacaoGremio = new Escalacao(jogadoresGremio);
		
		Time timeGremio = new Time("Gremio", gremio0, escalacaoGremio);
		
		// INTER
		Treinador inter0 = new Treinador("Ronaldo", 30, 1, 3);
		Jogador inter1 = new Jogador("Raheem Sterling", 27, 7, "Atacante", 0);
		Jogador inter2 = new Jogador("Aymeric Laporte", 27, 14, "Defensor", 0);
		Jogador inter3 = new Jogador("Kalvin Phillips", 26, 23, "Meio-Campista", 0);
		Jogador inter4 = new Jogador("Phil Foden", 21, 47, "Meio-Campista", 0);
		Jogador inter5 = new Jogador("John Stones", 27, 5, "Defensor", 0);
		Jogador inter6 = new Jogador("Giovanni Reyna", 19, 32, "Meio-Campista", 0);
		Jogador inter7 = new Jogador("Erling Braut Haaland", 21, 9, "Atacante", 0);
		Jogador inter8 = new Jogador("Jude Bellingham", 18, 22, "Meio-Campista", 0);
		Jogador inter9 = new Jogador("Manuel Akanji", 26, 16, "Defensor", 0);
		Jogador inter10 = new Jogador("Youssoufa Moukoko", 16, 18, "Atacante", 0);
				
		ArrayList<Jogador> jogadoresInter = new ArrayList<>();
		jogadoresInter.add(inter1);
		jogadoresInter.add(inter2);
		jogadoresInter.add(inter3);
		jogadoresInter.add(inter4);
		jogadoresInter.add(inter5);
		jogadoresInter.add(inter6);
		jogadoresInter.add(inter7);
		jogadoresInter.add(inter8);
		jogadoresInter.add(inter9);
		jogadoresInter.add(inter10);
				
		Escalacao escalacaoInter = new Escalacao(jogadoresInter);
		
		Time timeInter = new Time("Inter", inter0, escalacaoInter);		
		
		// CAMPEONATO
		ArrayList<Time> times = new ArrayList<>();
		times.add(timeVasco);
		times.add(timeFlamengo);
		times.add(timeGremio);
		times.add(timeInter);
		Campeonato campeonato = new Campeonato("Brasileirão Série A", 2, times);
		
		// PARTIDA
		Partida partida1 = new Partida(1, 2023, 11, 20, timeVasco, timeFlamengo);
		partida1.mostrarDetalhesPartida();
		
		Partida partida2 = new Partida(2, 2023, 11, 22, timeGremio, timeInter);
		partida2.mostrarDetalhesPartida();
						
		// GAMEEEEEEEEEE
		campeonato.apresentar();
		
		partida1.iniciarPartida();		
		timeVasco.detalhes();
		timeFlamengo.detalhes();
		
		partida2.iniciarPartida();			
		timeGremio.detalhes();
		timeInter.detalhes();
	}
}
