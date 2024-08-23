package TrezeDeAgosto;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		List<String> estados = Arrays.asList("AC", "AL", "AM", "BA", "CE", "DF", "ES", "GO", "JP", "MA", "MT", "MS",
				"MG", "PA", "PB", "PE", "PI", "PR", "RN", "RJ", "RS", "SC", "SE", "SP");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um estado (UF) ");
		String uf = sc.nextLine();
		if (estados.contains(uf)) {
			System.out.println("É um estado brasileiro");
		} else {
			System.out.println("Não é um estado brasileiro");
		}
		System.out.println("Dige seu cpf:");
		String cpf = sc.nextLine();
		Validacpf val = new Validacpf();
		if (val.isCpf(cpf)) {
			System.out.println(cpf);
		} else {
			System.out.println("CPF inválido");
		}
	}
}
