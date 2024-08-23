package QuinzedeJUlho;

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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class cachorro {

	public class Cachorro extends JFrame {
		
			private JTextField nomedocachorroField;
			private JTextField racaField;
			private JTextField tamanhoField;
			private JTextField proprietarioField;
			private JTextField enderecoField;
			private JTextField telefoneField;
			private JToggleButton contactPrefToggle;
			private JRadioButton masculino;
			private JRadioButton feminino;
			private JCheckBox newsletterCheckBox;
			private JButton submitButton;

			private DefaultTableModel tableModel;

			public Computador() {

				// informacoes iniciais 

				setTitle("Formulário de cadastro");
				setSize(600, 300);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setLocationRelativeTo(null);

				JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
				mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

				JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));

				JLabel nomedocachorroLabel = new JLabel("Nome do Cachorro:");
				nomedocachorroField = new JTextField();
				JLabel racalLabel = new JLabel("Raça:");
				racaField = new JTextField();
				JLabel tamanhoLabel = new JLabel("Tamanho");
				tamanhoField = new JTextField();
				JLabel proprietarioLabel = new JLabel("Proprietario:");
				proprietarioField = new JTextField();
				JLabel enderecoLabel = new JLabel("Endereço:");
				enderecoField = new JTextField();
				JLabel telefoneLabel = new JLabel("Telefone");
				telefoneField = new JTextField();


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

				JLabel computadoresLabel = new JLabel("Gênero:");
				masculino = new JRadioButton("Masculino");
				feminino = new JRadioButton("Feminino");
				ButtonGroup genderGroup = new ButtonGroup();
				genderGroup.add(masculino);
				genderGroup.add(feminino);

				JLabel newsletterLabel = new JLabel("Assinar Newsletter:");
				newsletterCheckBox = new JCheckBox();
				
				formPanel.add(nomedocachorroLabel);
				formPanel.add(nomedocachorroField);
				formPanel.add(racalLabel);
				formPanel.add(racaField);
				formPanel.add(tamanhoLabel);
				formPanel.add(tamanhoField);
				formPanel.add(proprietarioLabel);
				formPanel.add(proprietarioField);
				formPanel.add(enderecoLabel);
				formPanel.add(enderecoField);
				formPanel.add(telefoneLabel);
				formPanel.add(telefoneField);
				formPanel.add(contactPrefLabel);
				formPanel.add(contactPrefToggle);
				formPanel.add(computadoresLabel);
				JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
				genderPanel.add(masculino);
				genderPanel.add(feminino);
				formPanel.add(genderPanel);
				formPanel.add(newsletterLabel);
				formPanel.add(newsletterCheckBox);
				
				

				submitButton = new JButton("Enviar");
				submitButton.addActionListener(new SubmitButtonListener());

				mainPanel.add(formPanel, BorderLayout.CENTER);
				mainPanel.add(submitButton, BorderLayout.SOUTH);

				add(mainPanel);

				setVisible(true);
				
				tableModel = new DefaultTableModel(new String [] {
						"Nom", "Email", "Telefone", "Endereço", "Data de Nascimento", "Preferência de Contato", "Gênero", "Newsletter"
				}, 0);

				}

			private class SubmitButtonListener implements ActionListener {

				@Override
				public void actionPerformed(ActionEvent e) {
					String nomedocachorro = nomedocachorroField.getText();
					String email = tamanhoField.getText();
					String phone = proprietarioField.getText();
					String address = enderecoField.getText();
					String dob = telefoneField.getText();
					String contactPref = contactPrefToggle.isSelected() ? "Telefone" : "Email";
					String gender = masculino.isSelected() ? "Masculino"
							: feminino.isSelected() ? "Feminino" : "Não especificado";
					String newsletter = newsletterCheckBox.isSelected() ? "Sim" : "Não";

					String message = String.format(
							"Nomedocachorro: %s\nTamanho: %s\nProprietario: %s\nEndereço: %s\nTelefone: %s\nPreferência de Contato: %s\nGênero: %s\nAssinar Newsletter: %s",
							nomedocachorro, email, phone, address, dob, contactPref, gender, newsletter);

//					JOptionPane.showMessageDialog(Formulario.this, message, "Informações do Formulário",
//							JOptionPane.INFORMATION_MESSAGE);

					tableModel.addRow(new Object[] { nomedocachorro, email, phone, address, dob, contactPref, gender, newsletter });

					new InfoFrame(tableModel);
				}

			}

			public static void main(String[] args) {
				SwingUtilities.invokeLater(new Runnable() {

					@Override
					public void run() {
						new Computador();

					}
				});

			}

		}

		class InfoFrame extends JFrame {
			public InfoFrame(DefaultTableModel tableModel) {
				setTitle("Informacoes do Formulário");
				setSize(600, 300);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				setLocationRelativeTo(null);

				setExtendedState(JFrame.MAXIMIZED_BOTH);
				JTable table = new JTable(tableModel);
				JScrollPane scrollPane = new JScrollPane(table);
				add(scrollPane, BorderLayout.CENTER);
				setVisible(true);

				// TODO Auto-generated constructor stub
			}


	}
	
	}
}
