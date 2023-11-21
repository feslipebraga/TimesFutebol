package futebol;

import java.time.LocalDate;

public class Partida {
	private int rodada;
	private LocalDate data;
	private Time timeA, timeB; 
	
	public Partida(int rodada, int year, int month, int dayOfMonth, Time timeA, Time timeB) {
		super();
		this.rodada = rodada;
		this.data = LocalDate.of(year, month, dayOfMonth);
		this.timeA = timeA;
		this.timeB = timeB;
	}
	
	public void iniciarPartida(int golsA, int golsB) {
		System.out.println("------------------------");
		System.out.println("ROUND " + this.rodada);
		System.out.println(this.timeA.getNome() + " vs " + this.timeB.getNome());
		
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
	
	public void mostrarDetalhesPartida() {
		/*	A data da partida de futebol
		O nome do treinador
		Os jogadores escalados para essa data */
		System.out.println("---------------------------------------------");
        System.out.println("Data da Partida: " + this.data);
		System.out.println(timeA.getNome() + " vs " + timeB.getNome());
        System.out.println("Treinador do " + timeA.getNome() + ": " + timeA.getTecnico().getNome());
        System.out.println("Jogadores escalados para o time:");
        timeA.getJogadoresEscalados().mostrarEscalacao();

        System.out.println("\nTreinador do " + timeB.getNome() + ": " + timeB.getTecnico().getNome());
        System.out.println("Jogadores escalados para o time:");
        timeB.getJogadoresEscalados().mostrarEscalacao();
        
        System.out.println();
    }
	
	@Override
	public String toString() {
		return "Partida [rodada=" + rodada + ", data=" + data + ", timeA=" + timeA.getNome() + ", timeB=" + timeB.getNome() + "]";
	}
}
