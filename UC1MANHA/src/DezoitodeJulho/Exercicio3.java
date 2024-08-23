package DezoitodeJulho;

import java.util.HashMap;

public class Exercicio3 {

	public static String removerElemento(HashMap<Integer, String> aluno, int matricula) {
		return aluno.remove(matricula);
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> aluno = new HashMap();
		aluno.put(1, "Maria");
		aluno.put(2, "Eduardo");
		aluno.put(3, "Marcos");
		aluno.put(4, "Luciano");
		aluno.put(5, "Eliel");
		aluno.put(6, "João Paulo");
		aluno.put(7, "Leonardo");
		
		aluno.remove(6);
		
		System.out.println(aluno);
	}
	

}
