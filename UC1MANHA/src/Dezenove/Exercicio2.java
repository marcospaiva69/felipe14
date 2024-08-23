package Dezenove;

import java.util.LinkedList;

public class Exercicio2 {

	public static void main(String[] args) {
		
		LinkedList<String> nomedaPessoa = new LinkedList<String>();
		
			nomedaPessoa.addFirst("Marcos");
			nomedaPessoa.addLast("Felipe");
			nomedaPessoa.add(1, "Luis");
	
				System.out.println(nomedaPessoa);
				
				nomedaPessoa.remove(1);	
				System.out.println(nomedaPessoa);
	}
	
}
