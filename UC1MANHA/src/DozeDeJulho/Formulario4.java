package DozeDeJulho;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

import DozeDeJulho.Formulario4.SubmitButtonListener;

public class Formulario4 {

	public class Formulario4 extends JFrame{

		private JTextField timeField;
		private JTextField estadoField;
		private JTextField cidadeField;
		private JTextField enderecoField;
		private JTextField anodefundacaoField;
		private JTextField emailField;
		private JTextField telefoneField;
		private JTextField serieField;
		private JTextField presidenteField;
		private JTextField torcedorField;
		private JToggleButton contactPrefToggle;
		private JRadioButton adplenteRadio;
		private JRadioButton inadiplenteRadio;
		private JCheckBox newsletterCheckBox;

		private JButton submitButton;

		public Formulario4(){

		// informacoes iniciais 

		
				setTitle("Formulário de informacoes do time de futebol");
				setSize(500, 450);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setLocationRelativeTo(null);

				JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
				mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

				JPanel formPanel = new JPanel(new GridLayout(10, 2, 10, 10));

				JLabel timeLabel = new JLabel("Time:");
				timeField = new JTextField();
				JLabel estadoLabel = new JLabel("Estado:");
				estadolField = new JTextField();
				JLabel cidadeLabel = new JLabel("Cidade:");
				cidadeField = new JTextField();
				JLabel enderecoLabel = new JLabel("Endereco:");
				enderecoField = new JTextField();
				JLabel anodefundacaoLabel = new JLabel("Ano de Fundação:");
				anodefundacaoField = new JTextField();
				JLabel emailLabel = new JLabel("Email:");
				emailField = new JTextField();
				JLabel telefoneLabel = new JLabel("Telefone:");
				telefoneField = new JTextField();
				JLabel serieLabel = new JLabel("Serie:");
				serieField = new JTextField();
				JLabel presidenteLabel = new JLabel("Presidente:");
				presidenteField = new JTextField();
				JLabeltorcedorLabel = new JLabel("Torcedor:");
				torcedorField = new JTextField();
				

				// Adicionando campos e textos de entrada de dados ao painel do formulários de
				// dados

				JLabel contactPrefLabel = new JLabel("Preferência de Contato:");
				contactPrefToggle = new JToggleButton("Email");
				contactPrefToggle.addItemListener(e -> {
					if (contactPrefToggle.isSelected()) {
						contactPrefToggle.setText("Telefone");
					} else {
						contactPrefToggle.setText("Email");
					}
				});

				JLabel genderLabel = new JLabel("Opção:");
				violentoRadio = new JRadioButton("Violento");
				naoviolentoRadio = new JRadioButton("Não Violento");
				ButtonGroup genderGroup = new ButtonGroup();
				genderGroup.add(violentoRadio);
				genderGroup.add(naoviolentoRadio);

				JLabel newsletterLabel = new JLabel("Assinar Newsletter:");
				newsletterCheckBox = new JCheckBox();
				
				formPanel.add(nameLabel);
				formPanel.add(nameField);
				formPanel.add(emailLabel);
				formPanel.add(emailField);
				formPanel.add(phoneLabel);
				formPanel.add(phoneField);
				formPanel.add(addressLabel);
				formPanel.add(addressField);
				formPanel.add(neighborhoodLabel);
				formPanel.add(neighborhoodField);
				formPanel.add(delegateLabel);
				formPanel.add(delegateField);
				formPanel.add(clerkLabel);
				formPanel.add(clerkField);
				formPanel.add(contactPrefLabel);
				formPanel.add(contactPrefToggle);
				formPanel.add(genderLabel);
				JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
				genderPanel.add(violentoRadio);
				genderPanel.add(naoviolentoRadio);
				formPanel.add(genderPanel);
				formPanel.add(newsletterLabel);
				formPanel.add(newsletterCheckBox);
				
				
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
				String address = addressField.getText();
				String neighborhood = neighborhoodField.getText();
				String delegate = delegateField.getText();
				String clerk = clerkField.getText();
				String contactPref = contactPrefToggle.isSelected() ? "Telefone" : "Email";
				String gender = violentoRadio.isSelected() ? "Violento"
						: naoviolentoRadio.isSelected() ? "Não Violento" : "Não especificado";
				String newsletter = newsletterCheckBox.isSelected() ? "Sim" : "Não";

				String message = String.format(
						"Nome: %s\nEmail: %s\nTelefone: %s\nEndereço: %s\nRegional: %s\nPreferência de Contato: %s\nOpção: %s\nAssinar Newsletter: %s",
						name, email, phone, address, neighborhood, delegate, clerk, contactPref, gender, newsletter);

				JOptionPane.showMessageDialog(Formulario4.this, message, "Informações do Formulário",
						JOptionPane.INFORMATION_MESSAGE);

			}
		}

		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {

				@Override
				public void run() {
					new Formulario4();

				}
			});

		}

	}

}
