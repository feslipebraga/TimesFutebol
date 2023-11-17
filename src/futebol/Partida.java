package futebol;

import java.time.LocalDate;
import java.util.Random;

public class Partida {
	private int rodada;
	private LocalDate data;
	private Time timeA;
	private Time timeB;
	
	public Partida(int rodada, LocalDate data, Time timeA, Time timeB) {
		super();
		this.rodada = rodada;
		this.data = data;
		this.timeA = timeA;
		this.timeB = timeB;
	}
	
	public void iniciarPartida() {
		System.out.println("ROUND " + this.rodada);
		System.out.println(this.timeA.getNome() + " vs " + this.timeB.getNome());
		
		Random numero = new Random();
		int golsA = numero.nextInt(6);
		int golsB = numero.nextInt(6);
		
		System.out.println("RESULTADO DO JOGO: " + golsA + " x " + golsB);
		
		if (golsA == golsB) {
			System.out.println("EMPATE");
			this.timeA.empatarJogo();
			this.timeB.empatarJogo();
		} else if (golsA > golsB) {
			System.out.println(this.timeA.getNome() + " GANHOU");
			this.timeA.ganharJogo();
			this.timeB.perderJogo();
		} else {
			System.out.println(this.timeB.getNome() + " GANHOU");
			this.timeA.perderJogo();
			this.timeB.ganharJogo();
		}
	}
	
	@Override
	public String toString() {
		return "Partida [rodada=" + rodada + ", data=" + data + ", timeA=" + timeA.getNome() + ", timeB=" + timeB.getNome() + "]";
	}
}
