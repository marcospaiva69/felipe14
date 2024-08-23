package Dezenove;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
	
	//Criando um objeto do tipo do tipo LinkedList
	LinkedList<String> nomeCachorro = new LinkedList<String>();
	
	//Adicionando elemento a minha LinkedList
		nomeCachorro.addFirst("Rudá");
		nomeCachorro.addLast("Charlie");
		nomeCachorro.add(1, "Uhura");

		//Aoresebtando a minha LinkedList
		System.out.println(nomeCachorro);

		//Acessabdi valores especificos da minha LinkedList
		System.out.println("Primeiro nome " + nomeCachorro.getFirst());
		System.out.println("último nome " + nomeCachorro.getLast());
		System.out.println("Cachorro 2" + nomeCachorro.get(1));
		
		// remover o primeiro valor da LinkedList
		// para remover o ultimo usa-se remove.Last();
		// para remover o específico usa-se linkedList.get(posição);
		
		nomeCachorro.removeFirst();
		System.out.println();
		System.out.println(nomeCachorro);
		
		//Pegar o tamanho do LinkedList
		System.out.println("Tamanho do LinkedList " + nomeCachorro.size());
		
		//Limpar o LinkedList
		nomeCachorro.clear();
		
	}
}
