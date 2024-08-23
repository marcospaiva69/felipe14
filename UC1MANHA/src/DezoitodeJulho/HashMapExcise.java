package DezoitodeJulho;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExcise {
	
	public void inserirInforcaoesValidas(int limite) {
		HashMap<String, Double> hashMap = new HashMap<>();
		double preco = 0;
		Scanner entradaProduto = new Scanner(System.in);
		Scanner entradaPreco = new Scanner(System.in);
		while(preco < limite) {
			System.out.println("Insira o nome do produto");
			String produto = entradaProduto.nextLine();
			System.out.println("insira o preço do produto");
			preco = entradaPreco.nextFloat();
			if(preco < limite) {
			hashMap.put(produto, preco);
			System.out.print(hashMap);
		}else {
			System.out.print("Valor informado inválido");
		}
		}
		
		entradaPreco.close();
		entradaProduto.close();
	}
}