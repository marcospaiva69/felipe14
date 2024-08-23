package DezesseisDeJulho;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] ars) {
		List<String> list = new ArrayList<>();
		list.add("Marcos Paulino");
		list.add("João Paulo II");
		list.add("Eliel Sousa");
		list.add("Luciano Cavalcante");
		list.add("Edward Snowden");
		list.add("Maria de Jesus");

		// Recuperar ou apresentar o último elemento da lista.
		System.out.println(list.get(5));

//Apresentar o objeto da lista completo,
		System.out.println(list);

// for tradicional
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Elemento: " + list.get(i) + " Posição: " + i);
		}
		list.add(1, "Leo");

//for each
		for (String elemento : list) {
			System.out.println("Elemento: " + elemento);
		}

		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove("Leo");
		System.out.println(list);
		//Atualização de elementos da lista
		list.set(1, "Leonardo");
		System.out.println(list);
		//pega um elemento da lista
		String nomeLeo =list.get(1);
		System.out.println(nomeLeo);
		
		int indice = list.indexOf("Maria de Jesus");
		System.out.println("Índice"  + indice);
		
		int ultimoValorEncontrado = list.lastIndexOf("Maria de Jesus");
		System.out.println("Índice"  + ultimoValorEncontrado);
		
		int size = list.size();
		System.out.println("O tamanho da lista é : " + size);
		
		boolean isListEmpty = list.isEmpty();
		System.out.println("A lista está vazia " + isListEmpty);
		
		List<String> subList = list.subList(2,  4);
		System.out.println(subList);
		boolean contains = list.contains("Eliel Sousa");
		System.out.println("Contains " + contains);
		
		
	}
}