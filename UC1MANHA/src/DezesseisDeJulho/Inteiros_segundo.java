package DezesseisDeJulho;

import java.util.ArrayList;
import java.util.List;

public class Inteiros_segundo {

	public static void main(String[] ars) {
		List<String> list = new ArrayList<>();
		list.add("Número 1");
		list.add("Número 2");
		list.add("Número 3");
		list.add("Numero 4");
		list.add("Número 5");
		
		list.set(3, "Número 10");
		System.out.println(list);
	}
}
