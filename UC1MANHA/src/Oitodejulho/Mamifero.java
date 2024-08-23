package Oitodejulho;

public class Mamifero {
	String nome;
	double altura;
	int idade;

	public Mamifero(String nome, double altura, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void apresentarNomeAnimal() {
		System.out.println(getNome());
	}
	public String classificarAnimal(int opc) {
		if (opc == 0) {
			return "Pequeno porte";
		} else if (opc == 1) {
			return "Médio porte";
		} else {
			return "Grande porte";
		}
	}
	public int classificarAnimalPorIdade(int idade) {
		if (idade <=20) {
			System.out.println("Animal novo");
			return 0;
		}else {
			System.out.println("Animal velho");
			return 1;
		}
	}

}
