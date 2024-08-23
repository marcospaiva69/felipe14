package DezesseisDeJulho;

import java.util.ArrayList;
import java.util.List;

public class Cores {

	public static void main(String[] ars) {
		List<String> list = new ArrayList<>();
		list.add("Cor Branca");
		list.add("Cor Azul");
		list.add("Cor Vermelha");
		list.add("Cor Amarela");
		list.add("Cor Cinza");
				
		for (String cores : list) {
			System.out.println("Cor: " + cores);}
		
		String corVermelha =list.get(2);
		System.out.println(corVermelha);
}
}