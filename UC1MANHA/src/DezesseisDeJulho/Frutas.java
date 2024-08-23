package DezesseisDeJulho;

import java.util.ArrayList;
import java.util.List;

public class Frutas {
	public static void main(String[] ars) {
		List<String> list = new ArrayList<>();
		list.add("Pera");
		list.add("Maça");
		list.add("Laranja");
		list.add("Banana");
		list.add("Melão");
		
		list.remove("Pera");
		System.out.println(list);
}
}