package futebol;

public class Treinador extends Pessoa {
	private int titulos;
	private int tempExp;
	
	public Treinador(String nome, int idade, int titulos, int tempExp) {
		super(nome, idade);
		this.titulos = titulos;
		this.tempExp = tempExp;
	}
	
	@Override
	public String toString() {
		return "Treinador [nome="+ super.getNome() + ", idade= " + super.getIdade() + "titulos=" + titulos + ", tempExp=" + tempExp + "]";
	}

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	public int getTempExp() {
		return tempExp;
	}

	public void setTempExp(int tempExp) {
		this.tempExp = tempExp;
	}
}
