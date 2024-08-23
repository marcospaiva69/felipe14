package VinteeDois;

public class Exercicios {

	public int retornarTamanhoString(String Marcos) {
		int tamanho = Marcos.length();
		System.out.println("O tamanho da String é " + tamanho);
		return tamanho;
	}

	public char retornarCaracterNaPosicao(String Marcos, int i) {
		char letra = Marcos.charAt(i);
		System.out.println("A letra na posição " + (i + 1) + "é  " + letra);
		return letra;
	}

	public String retornarStringApartirDoIndice(String nome, int indice) {
		String novaString = nome.substring(indice);
		System.out.println("A nova String é " + novaString);
		return novaString;
	}

	public int retornarPrimeiroIndice(String Marcos, String letra) {
		int posicao = Marcos.indexOf(letra);
		System.out.println("A posição encontrada é " + (posicao + 1));
		return posicao;
	}

	public int retornarUltimoIndice(String Marcos, String letra) {
		int posicao = Marcos.lastIndexOf(letra);
		System.out.println("A última posição encontrada é " + (posicao + 1));
		return posicao;
	}

	public boolean isContem(String nome1, String nome2) {
		boolean contem = nome1.contains(nome2);
		System.out.println("O " + nome1 + " contém " + nome2 + " ? " + contem);
		return contem;

	}

	public boolean isIgual(String Carlos, String Marcos) {
		if (Carlos.equals(Marcos)) {
			System.out.println("Os nomes são iguais");
			return true;
		}
		System.out.println("Os nomes são diferentes");

		return false;
	}

	public boolean ignoreCase(String Marcos, String MARCOS) {
		if (Marcos.equals(MARCOS)) {
			System.out.println("Os nomes são iguais");
			return true;
		}
		return false;
	}

	public String maiusculaParaMinuscula(String palavra) {
		String palavraFinal = palavra.toLowerCase();
		System.out.println(palavraFinal);
		return palavraFinal;
	}	
		public String minusculaParaMaiuscula(String palavra) {
			String palavraFinal = palavra.toUpperCase();
			System.out.println(palavraFinal);
			return palavraFinal;

	}
}