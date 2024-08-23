package OnzeDeJulho;

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

public class formulario2 extends JFrame {

	private JTextField nameField;
	private JTextField emailField;
	private JTextField phoneField;
	private JTextField addressField;
	private JTextField dobField;
	private JToggleButton contactPrefToggle;
	private JRadioButton maleRadio;
	private JRadioButton femaleRadio;
	private JCheckBox newsletterCheckBox;
	private JButton submitButton;

	private DefaultTableModel tableModel;

	public formulario2() {

		// informacoes iniciais 

		setTitle("Formulário de cadastro");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));

		JLabel nameLabel = new JLabel("Nome:");
		nameField = new JTextField();
		JLabel emailLabel = new JLabel("Email:");
		emailField = new JTextField();
		JLabel phoneLabel = new JLabel("Telefone:");
		phoneField = new JTextField();
		JLabel addressLabel = new JLabel("Endereço:");
		addressField = new JTextField();
		JLabel dobLabel = new JLabel("Data de Nascimento:");
		dobField = new JTextField();


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

		JLabel modelgenderLabel = new JLabel("Gênero:");
		maleRadio = new JRadioButton("Masculino");
		femaleRadio = new JRadioButton("Feminino");
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleRadio);
		genderGroup.add(femaleRadio);

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
		formPanel.add(dobLabel);
		formPanel.add(dobField);
		formPanel.add(contactPrefLabel);
		formPanel.add(contactPrefToggle);
		formPanel.add(genderLabel);
		JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		genderPanel.add(maleRadio);
		genderPanel.add(femaleRadio);
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
			String name = nameField.getText();
			String email = emailField.getText();
			String phone = phoneField.getText();
			String address = addressField.getText();
			String dob = dobField.getText();
			String contactPref = contactPrefToggle.isSelected() ? "Telefone" : "Email";
			String gender = maleRadio.isSelected() ? "Masculino"
					: femaleRadio.isSelected() ? "Feminino" : "Não especificado";
			String newsletter = newsletterCheckBox.isSelected() ? "Sim" : "Não";

			String message = String.format(
					"Nome: %s\nEmail: %s\nTelefone: %s\nEndereço: %s\nData de Nascimento: %s\nPreferência de Contato: %s\nGênero: %s\nAssinar Newsletter: %s",
					name, email, phone, address, dob, contactPref, gender, newsletter);

//			JOptionPane.showMessageDialog(Formulario.this, message, "Informações do Formulário",
//					JOptionPane.INFORMATION_MESSAGE);

			tableModel.addRow(new Object[] { name, email, phone, address, dob, contactPref, gender, newsletter });

			new InfoFrame(tableModel);
		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new formulario2();

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
