package DezesseisDeJulho;

import java.util.ArrayList;
import java.util.List;

public class Paises {
	public static void main(String[] ars) {
		List<String> list = new ArrayList<>();
		list.add("Brasil");
		list.add("Argentina");
		list.add("Paraguai");
		list.add("Uruguai");
		list.add("Colombia");
		
		int size = list.size();
		System.out.println("O tamanho da lista é : " + size);
	}
}
