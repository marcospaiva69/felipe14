package DezesseisDeJulho;

import java.util.ArrayList;
import java.util.List;

public class inteiro {

	public static void main(String[] ars) {
		List<String> list = new ArrayList<>();
		list.add("Número 1");
		list.add("Número 2");
		list.add("Número 3");
		list.add("Numero 4");
		list.add("Número 5");
		
		System.out.println(list.get(0));
		
		for (String numero : list) {
			System.out.println("Numero: " + numero);}
}
}