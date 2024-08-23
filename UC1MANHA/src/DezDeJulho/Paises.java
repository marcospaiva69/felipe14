package DezDeJulho;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Paises extends JFrame {

	private JTextField paisField;
	private JTextField capitalField;
	private JTextField populacaoField;
	private JTextField espectativadevidaField;
	private JTextField territorioField;
	private JTextField presidenteField;
	private JButton submitButton;

	public Paises() {
		setTitle("Informações sobre paises");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));

		JLabel paisJLabel = new JLabel("Nome do País ");
		paisField = new JTextField();

		JLabel capitalJLabel = new JLabel("Capital ");
		capitalField = new JTextField();

		JLabel populacaoJLabel = new JLabel("Populacao ");
		populacaoField = new JTextField();
		
		JLabel espectativadevidaJLabel = new JLabel("Espectativa de vida ");
		espectativadevidaField = new JTextField();

		JLabel territorioJLabel = new JLabel("Territorio ");
		territorioField = new JTextField();

		JLabel presidenteJLabel = new JLabel("Presidente ");
		presidenteField = new JTextField();

		formPanel.add(paisJLabel);
		formPanel.add(paisField);
		formPanel.add(capitalJLabel);
		formPanel.add(capitalField);
		formPanel.add(populacaoJLabel);
		formPanel.add(populacaoField);
		formPanel.add(espectativadevidaJLabel);
		formPanel.add(espectativadevidaField);
		formPanel.add(territorioJLabel);
		formPanel.add(territorioField);
		formPanel.add(presidenteJLabel);
		formPanel.add(presidenteField);
		
		submitButton = new JButton("Enviar");
		submitButton.addActionListener(new SubmitButtonListener());

		mainPanel.add(formPanel, BorderLayout.CENTER);
		mainPanel.add(submitButton, BorderLayout.SOUTH);

		add(mainPanel);

		setVisible(true);
	}

	private class SubmitButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
			String pais = paisField.getText();
			String capital = capitalField.getText();
			String populacao = populacaoField.getText();
			String espectativadevida = espectativadevidaField.getText();
			String territorio = territorioField.getText();
			String presidente = presidenteField.getText();
		
			String message = String.format("Nome: %s\npais: %s\ncapital: %s\npopulacao: %s\nespectativadevida:%s\nterritorio:%s\npresidente:%", pais, capital, populacao,
					espectativadevida,territorio,presidente
					);
		
			JOptionPane.showConfirmDialog(
			Paises.this,
			message,
			"Informações",
			JOptionPane.INFORMATION_MESSAGE
			);
			
			public static void main(String[] args) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						new Paises();
}
