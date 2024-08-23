package DezesseteDeJulho;

import java.util.Vector;

public class ArraysVector {

	// Preenchimento do array com valores
	public static void main(String[] args) {

		int[] numeros = new int[5];
		for (int i = 0; i < 5; i++) {
			numeros[i] = i + 1;
		}
		// Apresentando as informacoes do array com foreach

		for (int numero : numeros) {
			System.out.println(numero);
		}
		System.out.print("Solucao usando for");
		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
		}
		int[] valores = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < 5; i++) {
			System.out.println(valores[i]);

		}

		int tamanhoArrray = valores.length;

		int primeiraPosicao = valores[0];
		int ultimaPosicao = valores[tamanhoArrray - 1];

		System.out.println("Primeira posição " + primeiraPosicao + "última posição " + ultimaPosicao);

//		Vector<String> timeFutebol = new Vector<>();
		Vector<String> timeFutebol = new Vector<>();

		timeFutebol.add("Ferroviário");
		timeFutebol.add("Fortaleza");
		timeFutebol.add("Ceará");
		timeFutebol.add("Barcelona");
		timeFutebol.add("Novo Horizontino");
		
		for (String time : timeFutebol) {
		System.out.println(timeFutebol);
		}
		int tamanho = 5;
		Vector <Double> salarios = new Vector<>	(tamanho);
		salarios.add(1284.90);
		salarios.add(1456.89);
		salarios.add(3456.50);
		salarios.addElement(5000.7);
		salarios.add(0, 9000.4);
		salarios.add(1234.89);
		
		for (Double salario : salarios) {
			System.out.println(salario);
		}
		
		Double primeiroElemento = salarios.get(0);
		Double ultimoElemento = salarios.get(salarios.size() -1);
		
		String firstElemento = timeFutebol.firstElement();
		String lastElemento = timeFutebol.lastElement();
		
		timeFutebol.set(1,  "Leão");
		
		timeFutebol.remove(4);
		timeFutebol.removeElement("Barcelona");
		timeFutebol.removeAllElements();

		int tam = timeFutebol.size();
		System.out.println(tam);
		
		boolean estarContido = timeFutebol.contains("Ceará");
		System.out.println("Ceará esta na lista?  " + estarContido);
		
		for (String time : timeFutebol) {
			System.out.println(time);

		
		
	}

}}
