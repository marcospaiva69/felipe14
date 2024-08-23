package DezDeJulho;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class formulario extends JFrame {

	private JTextField nameField;
	private JTextField emailField;
	private JTextField phoneField;
	private JTextField adressField;
	private JButton submitButton;

	public formulario() {

		// informacoes iniciais 

		setTitle("Formulário de cadastro");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));

		JLabel nameJLabel = new JLabel("Nome ");
		nameField = new JTextField();

		JLabel emailJLabel = new JLabel("E-maiel ");
		emailField = new JTextField();

		JLabel phoneJLabel = new JLabel("Telefone ");
		phoneField = new JTextField();

		JLabel adressJLabel = new JLabel("Endereço ");
		adressField = new JTextField();

		// Adicionando campos e textos de entrada de dados ao painel do formulários de
		// dados

		formPanel.add(nameJLabel);
		formPanel.add(nameField);
		formPanel.add(emailJLabel);
		formPanel.add(emailField);
		formPanel.add(phoneJLabel);
		formPanel.add(phoneField);
		formPanel.add(adressJLabel);
		formPanel.add(adressField);

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
			String name = nameField.getText();
			String email = emailField.getText();
			String phone = phoneField.getText();
			String address = adressField.getText();

			String message = String.format("Nome: %s\nEmail: %s\nTelefone: %s\nEndereço:%", name, email, phone,
					address);

			JOptionPane.showConfirmDialog(
					formulario.this, 
					message,
					"Informações",
					JOptionPane.INFORMATION_MESSAGE
			);

		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new formulario();
				
			}
		});
		
	}
		

}
