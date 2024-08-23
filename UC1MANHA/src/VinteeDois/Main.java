package VinteeDois;

public class Main {

	public static void main(String[] args) {

		FuncoesStrings funcoesStrings = new FuncoesStrings();
		
		funcoesStrings.InicarStringManeiraUm("Luciano Cavalcante");
		funcoesStrings.InicarStringManeiraDois("Marcos Leão");
		funcoesStrings.retornarTamanhoString("Fortaleza no G4");
		funcoesStrings.retornarCaracterNaPosicao("Ceará", 0);
		funcoesStrings.retornarStringApartirDoIndice("SENAC CEARÁ", 5);
		funcoesStrings.retornarStringApartirDoIndice("SENAC CEARÁ", 0, 5);
		funcoesStrings.retornarPrimeiroIndice("Eduardo", "d");
		funcoesStrings.retornarUltimoIndice("Eduardo", "d");
		funcoesStrings.isContem("Leonardo", "Leo");
		funcoesStrings.isIgual("Maria", "maria");
		funcoesStrings.retornarTamanhoString("Marcos");
		funcoesStrings.retornarCaracterNaPosicao("Marcos", 2);
		funcoesStrings.retornarStringApartirDoIndice("Marcos Paulino", 2);
		funcoesStrings.retornarPrimeiroIndice("Marcos", "c");
		funcoesStrings.retornarUltimoIndice("Marcos", "o");
		funcoesStrings.isContem("Marcos", "cos");
		
		Exercicios exercicios = new Exercicios();
		exercicios.ignoreCase("Marcos", "MARCOS");
		exercicios.maiusculaParaMinuscula("MARCOS");
		exercicios.minusculaParaMaiuscula("marcos");
		



	}

}
