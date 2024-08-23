package DezDeJulho;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TimedeFutebol extends JFrame{

	private JTextField timeField;
	private JTextField fundacaoField;
	private JTextField estadoField;
	private JTextField serieField;
	private JTextField presidenteField;
	private JButton submitButton;

	public TimedeFutebol() {

		// informacoes iniciais

		setTitle("Formulário de Time de Futebol");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));

		JLabel timeJLabel = new JLabel("Nome do Time ");
		timeField = new JTextField();

		JLabel fundacaoJLabel = new JLabel("Fundacao ");
		fundacaoField = new JTextField();

		JLabel estadoJLabel = new JLabel("Estado ");
		estadoField = new JTextField();

		JLabel serieJLabel = new JLabel("Serie ");
		serieField = new JTextField();

		JLabel presidenteJLabel = new JLabel("Presidente ");
		presidenteField = new JTextField();

		formPanel.add(timeJLabel);
		formPanel.add(timeField);
		formPanel.add(fundacaoJLabel);
		formPanel.add(fundacaoField);
		formPanel.add(estadoJLabel);
		formPanel.add(estadoField);
		formPanel.add(serieJLabel);
		formPanel.add(serieField);
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
			String time = timeField.getText();
			String fundacao = fundacaoField.getText();
			String estado = estadoField.getText();
			String serie = serieField.getText();
			String presidente = presidenteField.getText();
		
			String message = String.format("Nome: %s\ntime: %s\nfundacao: %s\nestado: %s\nserie:%s\npresidente:%", time, fundacao, estado,
					serie,presidente
					);
			
			JOptionPane.showConfirmDialog(
					TimedeFutebol.this,
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
					new TimedeFutebol();
				}
			});
	}
}
