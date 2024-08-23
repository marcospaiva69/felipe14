package Oitodejulho;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String nomeCachorro = JOptionPane.showInputDialog(null, "Digite seu nome", "Entrada de dados",
				JOptionPane.QUESTION_MESSAGE);

		String alturadoCachorro = JOptionPane.showInputDialog(null, "Digite altura do cachorro", "Entrada de dados",
				JOptionPane.QUESTION_MESSAGE);

		double alturafinal = Double.parseDouble(alturadoCachorro);

		String idadedoCachorro = JOptionPane.showInputDialog(null, "Digite a idade do cachorro", "Entrada de dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int idadeFinal = Integer.parseInt(idadedoCachorro);
		
		int resposta = JOptionPane.showConfirmDialog(null, JOptionPane.YES_NO_CANCEL_OPTION);
		if (resposta == 0) {

			Mamifero cachorro = new Mamifero(nomeCachorro, alturafinal, idadeFinal);
			JOptionPane.showMessageDialog(null, "Cuidado com " + cachorro.getNome(), "Cuidado com o cão",
					JOptionPane.WARNING_MESSAGE);
			
			String porte = cachorro.classificarAnimal(0);
			JOptionPane.showMessageDialog(null, porte, "Cão de " + porte,
					JOptionPane.WARNING_MESSAGE);
			
		}
		

		
	}
}
