import java.util.Scanner;

public class Calculadora {

	public static void imprimirAteMil(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("numero: " + i);
		}
	}

	public static void somarInteratividade() {
		Scanner input = new Scanner(System.in);
		double soma = 0;
		double valor = 1;

		while (valor != 0) {
			System.out.println("Insira o valor: ");
			valor = input.nextDouble();
			soma = soma + valor;
		}
		input.close();
		System.out.println("O valor da soma é:  " + soma);
	}

	public static void multiplicarInterativa() {
		double mult = 0;
		double valor = 1;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Digite o valor: ");
			valor = input.nextDouble();
			mult = mult * valor;
			
		} while (valor != 0);

		input.close();

	}

	public static void somarNumeros(int n) {
		int i = 0;
		int soma = 0;
		while (i < 100) {
			soma = soma + i + 1;
			i++;
		}
		System.out.println("O valor da soma é:  " + soma);

	}

	public static void apresentarFres(int n) {
		int i = 0;
		while (i != 0) {
			System.out.println("Hello world");
			i--;
		}
	}

	public void apresentarFrase(int n) {
		int i = 0;
		while (i < n) {
			System.out.println("Hello world");
			i++;
		}
	}

	public void mostrarValorPar(int n) {
		for (int i = n; i > 0; i--) {
			if (i % 2 == 0) {
				System.out.println("Numero par: " + i);

			}
		}
	}

	public void mostrarValorImpar(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.println("Numero impar:  " + i);
			}
		}
	}

	public  void mostrarNomeQ1() {
		String nome = "Marcos Leão";
		System.out.println(nome);
	}

	public  double somarNumerosQ2(double num1, double num2) {
		double soma = num1 + num2;
		return soma;
	}

	public  double subtrairNumerosQ3(double num1, double num2) {
		double subtrair = num1 - num2;
		return subtrair;
	}

	public double multiplicarNumerosQ3(double num1, double num2) {
		double multiplicar = num1 * num2;
		return multiplicar;
	}

	public double dividirNumerosQ4(double num1, double num2) {
		double dividir = num1 / num2;
		return dividir;
	}

	public  double fazerCalculoQ5(int opc, double num1, double num2) {
		switch (opc) {
		case 1: {
			return somarNumerosQ2(num1, num2);
		}
		case 2: {
			return subtrairNumerosQ3(num1, num2);
		}
		case 3: {
			return multiplicarNumerosQ3(num1, num2);
		}
		case 4: {
			return dividirNumerosQ4(num1, num2);
		}
		default: {
			System.out.println("Opção inválida");
			return 0;
		}
		}
	}

	public static String retornarSaudacao() {
		String saudacao = "Hello Word";
		return saudacao;

	}

	public double retornaDobrodoNumeros(double numero1) {
		double numero2 = numero1 * 2;
		return numero2;
	}

	public static double somarNumero(double numer1, double numer2) {
		double soma = numer1 + numer2;
		return soma;
	}

	public static double subtrairNumero(double numer1, double numer2) {
		double subtrair = numer1 + numer2;
		return subtrair;

	}

}
