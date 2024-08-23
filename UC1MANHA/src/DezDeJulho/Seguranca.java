//package DezDeJulho;
//
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.BorderFactory;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import javax.swing.SwingUtilities;
//
//public class Seguranca extends JFrame {
//
//	private JTextField secretarioField;
//	private JTextField delegaciaField;
//	private JTextField telefoneField;
//	private JTextField regiaoField;
//	private JTextField enderecoField;
//	private JButton submitButton;
//
//	public Seguranca() {
//
//		setTitle("Formulário de informação");
//		setSize(400, 300);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLocationRelativeTo(null);
//
//		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
//		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//
//		JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
//
//		JLabel secretarioJLabel = new JLabel("Nome do secretario ");
//		secretarioField = new JTextField();
//
//		JLabel delegaciaJLabel = new JLabel("Delegacia ");
//		delegaciaField = new JTextField();
//
//		JLabel telefoneJLabel = new JLabel("Telefone ");
//		telefoneField = new JTextField();
//
//		JLabel regiaoJLabel = new JLabel("Região ");
//		regiaoField = new JTextField();
//
//		JLabel enderecoJLabel = new JLabel("Endereço ");
//		enderecoField = new JTextField();
//
//		formPanel.add(secretarioJLabel);
//		formPanel.add(secretarioField);
//		formPanel.add(delegaciaJLabel);
//		formPanel.add(delegaciaField);
//		formPanel.add(telefoneJLabel);
//		formPanel.add(telefoneField);
//		formPanel.add(regiaoJLabel);
//		formPanel.add(regiaoField);
//		formPanel.add(enderecoJLabel);
//		formPanel.add(enderecoField);
//
//		submitButton = new JButton("Enviar");
//		submitButton.addActionListener(new SubmitButtonListener());
//
//		mainPanel.add(formPanel, BorderLayout.CENTER);
//		mainPanel.add(submitButton, BorderLayout.SOUTH);
//
//		add(mainPanel);
//
//		setVisible(true);
//	}
//
//	private class SubmitButtonListener implements ActionListener {
//
//		public void actionPerformed(ActionEvent e) {
//			String secretario = secretarioField.getText();
//			String delegacia = delegaciaField.getText();
//			String telefone = telefoneField.getText();
//			String regiao = regiaoField.getText();
//			String endereco = enderecoField.getText();
//
//			String message = String.format(
//					"Nome: %s\nSecretario: %s\nDelegacia: %s\nTelefone:  %s\\nRegiao:  %s\\nEndereco:%", secretario,
//					delegacia, telefone, regiao, endereco
//			);
//			
//			
//			JOptionPane.showConfirmDialog(
//					Seguranca.this,
//					message,
//					"Informações",
//					JOptionPane.INFORMATION_MESSAGE
//			);
//		}
//	}
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			
//			@Override
//			public void run() {
//				new Seguranca();
//			}
//		});
//	}
//				
//}