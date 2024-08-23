package VinteeDois;

public class FuncoesStrings {

	public String InicarStringManeiraUm(String nome) {
		String nomeFinal = nome;
		System.out.println("Maneira 1: " + nomeFinal);
		return nomeFinal;
	}

	public String InicarStringManeiraDois(String nome) {
		String nomeFinal = new String(nome);
		System.out.println("Maneira 2: " + nomeFinal);
		return nomeFinal;

	}

	public int retornarTamanhoString(String nome) {
		int tamanho = nome.length();
		System.out.println("O tamanho da String é " + tamanho);
		return tamanho;
	}

	public char retornarCaracterNaPosicao(String nome, int i) {
		char letra = nome.charAt(i);
		System.out.println("A letra na posição " + (i + 1) + "é" + letra);
		return letra;
	}

	public String retornarStringApartirDoIndice(String nome, int indice) {
		String novaString = nome.substring(indice);
		System.out.println("A nova String é " + novaString);
		return novaString;
	}

	public String retornarStringApartirDoIndice(String nome, int i, int j) {
		String novaString = nome.substring(i, j);
		System.out.println("A nova String é " + novaString);
		return novaString;
	}

	public int retornarPrimeiroIndice(String nome, String letra) {
		int posicao = nome.indexOf(letra);
		System.out.println("A posição encontrada é " + (posicao + 1));
		return posicao;
	}

	public int retornarUltimoIndice(String nome, String letra) {
		int posicao = nome.lastIndexOf(letra);
		System.out.println("A última posição encontrada é " + (posicao + 1));
		return posicao;
	}

	public boolean isContem(String nome1, String nome2) {
		boolean contem = nome1.contains(nome2);
		System.out.println("O " + nome1 + " contém " + nome2 + " ? " + contem);
		return contem;
	}

	public boolean isIgual(String nome1, String nome2) {
		if (nome1.equals(nome2)) {
			System.out.println("Os nomes são iguais");
			return true;
		}
		System.out.println("Os nomes são diferentes");

		return false;
	}

}