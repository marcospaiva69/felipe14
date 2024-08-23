package DezesseisDeJulho;

import java.util.ArrayList;
import java.util.List;

public class Animais {

	public static void main(String[] ars) {
		List<String> list = new ArrayList<>();
		list.add("Cachorro");
		list.add("Gato");
		list.add("Macaco");
		list.add("Leão");
		list.add("Girafa");
		
		List<String> subList = list.subList(1,  5);
		System.out.println(subList);
		boolean contains = list.contains("Cachorro");
		System.out.println("Contains " + contains);
		
	}	
}
