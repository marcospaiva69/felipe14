package DezoitodeJulho;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio4 {

	public static String diadasemana(int numero) {
		HashMap<Integer, String> diadasemana = new HashMap<>();
		diadasemana.put(0, "Domingo");
		diadasemana.put(1, "Segunda-Feira");
		diadasemana.put(2, "Terça-Feira");
		diadasemana.put(3, "Quarta-feira");
		diadasemana.put(4, "Quinta-feira");
		diadasemana.put(5, "Sexta-feira");
		diadasemana.put(6, "Sábado");

		String exists = diadasemana.get(numero);

		System.out.println("O dia da semana é " + exists);

		return exists;
	}
	public static void main(String[] args) {
					
		int diaInformado = 2;
		diadasemana(diaInformado-1);
				
		Scanner diadasemana = new Scanner(System.in);
		System.out.println("Insira o numero do dia ");
		
		
		diadasemana.close();
	}

}
