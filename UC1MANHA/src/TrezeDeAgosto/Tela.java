package TrezeDeAgosto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Tela {

	private JFrame frame;
	JFormattedTextField txtcep;
	JFormattedTextField txtCPF;
	JFormattedTextField txtDATADENASCIMENTO;
	JFormattedTextField txtTELEFONE;
	JFormattedTextField txtCNPJ;
	private JTextField txtNOME;
	private JTextField txtEMAIL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 473, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try {
			MaskFormatter mask,mask2,mask3,mask4,mask5;
			mask = new MaskFormatter("##.###-###");
			mask2 = new MaskFormatter("###.###.###-##");
			mask3 = new MaskFormatter("##/##/####");
			mask4 = new MaskFormatter("(##)#####-####");
			mask5 = new MaskFormatter("##.###.###/####-##");

			txtcep = new JFormattedTextField(mask);
			txtcep.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					txtCPF.requestFocus();
				}
				}
			});
			txtCPF = new JFormattedTextField(mask2);
			txtDATADENASCIMENTO = new JFormattedTextField(mask3);
			txtTELEFONE = new JFormattedTextField(mask4);
			txtCNPJ = new JFormattedTextField(mask5);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao formatar", "erro", JOptionPane.ERROR);
		}
		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(37, 40, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		//JFormattedTextField txtcep = new JFormattedTextField();
		txtcep.setBounds(196, 26, 138, 20);
		frame.getContentPane().add(txtcep);

		//JFormattedTextField txtCPF = new JFormattedTextField();
		txtCPF.setBounds(196, 57, 138, 20);
		frame.getContentPane().add(txtCPF);

		JLabel CPFLabel = new JLabel("CPF");
		CPFLabel.setBounds(37, 65, 46, 14);
		frame.getContentPane().add(CPFLabel);

		//JFormattedTextField txtDATADENASCIMENTO = new JFormattedTextField();
		txtDATADENASCIMENTO.setBounds(196, 93, 138, 20);
		frame.getContentPane().add(txtDATADENASCIMENTO);

		JLabel DATADENASCIMENTOLabel = new JLabel("DATA DE NASCIMENTO");
		DATADENASCIMENTOLabel.setBounds(37, 96, 138, 14);
		frame.getContentPane().add(DATADENASCIMENTOLabel);

		JLabel TELEFONE = new JLabel("TELEFONE");
		TELEFONE.setBounds(37, 121, 68, 14);
		frame.getContentPane().add(TELEFONE);

		//JFormattedTextField txtTELEFONE = new JFormattedTextField();
		txtTELEFONE.setBounds(196, 124, 138, 20);
		frame.getContentPane().add(txtTELEFONE);

		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(37, 146, 68, 14);
		frame.getContentPane().add(lblCnpj);

		//JFormattedTextField txtCNPJ = new JFormattedTextField();
		txtCNPJ.setBounds(196, 149, 138, 20);
		frame.getContentPane().add(txtCNPJ);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String nome = txtNOME.getText().trim().toLowerCase();
				String email = txtEMAIL.getText().trim().toLowerCase();
				if(nome.matches("[A-Za-z ]+")&& email.matches("[a-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-za-z]{2,}")){
				JOptionPane.showMessageDialog(null,  "Cadastrado com Sucesso", "Aviso", JOptionPane.WARNING_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,  "Dados inválidos", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
				}
		});
		btnNewButton.setBounds(168, 254, 112, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtNOME = new JTextField();
		txtNOME.setBounds(196, 182, 202, 20);
		frame.getContentPane().add(txtNOME);
		txtNOME.setColumns(10);
		
		txtEMAIL = new JTextField();
		txtEMAIL.setBounds(196, 207, 202, 20);
		frame.getContentPane().add(txtEMAIL);
		txtEMAIL.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setBounds(37, 188, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-MAIL");
		lblNewLabel_2.setBounds(37, 213, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
