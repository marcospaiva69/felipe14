package DezesseisDeJulho;

public class Pessoa {

	String nome;
	int idade;
	double altura;
	
	public Pessoa (Sytiring nome, int idade, double altura) {
			this.nome = nome;
			this.idade = idade;
			this.altura = altura;
			
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getAltura()=" + getAltura() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
