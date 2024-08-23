package QuatorzedeAgosto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Sistema {

	private JFrame frame;
	private JTextField nomeTF;
	private JLabel nomeLabel;
	private JTextField cpfTF;
	private JLabel cpfLabel;
	private JLabel lblNewLabel;
	private JLabel rgLabel;
	private JTextField rgTF;
	private JLabel datadenascimentoLabel;
	private JTextField datadenascimentoTF;
	private JLabel enderecoLabel;
	private JTextField enderecoTF;
	private JLabel numeroLabel;
	private JTextField numeroTF;
	private JLabel bairroLabel;
	private JTextField bairroTF;
	private JLabel cidadeLabel;
	private JTextField cidadeTF;
	private JLabel cepLabel;
	private JTextField cepTF;
	private JLabel estadoLabel;
	private JTextField estadoTF;
	private JLabel complementoLabel;
	private JTextField complementoTF;
	private JLabel nomedopaiLabel;
	private JTextField nomedopaiTF;
	private JLabel nomedamaeLabel;
	private JTextField nomedamaeTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					Sistema window = new Sistema();
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
	public Sistema() {
		initialize();
	}
public void visivel() {
	Sistema window = new Sistema();
	window.frame.setVisible(true);
}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 660, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try {
			MaskFormatter mask, mask2, mask3, mask4;
			mask = new MaskFormatter("##.###-###");
			mask2 = new MaskFormatter("###.###.###-##");
			mask3 = new MaskFormatter("##/##/####");
			mask4 = new MaskFormatter("UU");

			cepTF = new JFormattedTextField(mask);
			cepTF.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_ENTER){
						estadoTF.requestFocus();
					}
				}
			});
			cpfTF = new JFormattedTextField(mask2);
			cpfTF.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_ENTER){
						rgTF.requestFocus();
					}
				}
			});
			datadenascimentoTF = new JFormattedTextField(mask3);
			datadenascimentoTF.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_ENTER){
						enderecoTF.requestFocus();
					}
				}
			});
			estadoTF = new JFormattedTextField(mask4);
			estadoTF.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_ENTER){
						complementoTF.requestFocus();
					}
				}
			});
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao formatar", "erro", JOptionPane.ERROR);
		}
		nomeTF = new JTextField();
		nomeTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					cpfTF.requestFocus();
				}
			}
		});
		nomeTF.setBounds(224, 82, 212, 17);
		frame.getContentPane().add(nomeTF);
		nomeTF.setColumns(10);

		nomeLabel = new JLabel("NOME");
		nomeLabel.setBounds(64, 82, 46, 14);
		frame.getContentPane().add(nomeLabel);

		// cpfTF = new JTextField();
		cpfTF.setBounds(224, 108, 212, 17);
		frame.getContentPane().add(cpfTF);
		cpfTF.setColumns(10);

		cpfLabel = new JLabel("CPF");
		cpfLabel.setBounds(64, 108, 46, 14);
		frame.getContentPane().add(cpfLabel);

		lblNewLabel = new JLabel("SISTEMA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(245, 25, 65, 20);
		frame.getContentPane().add(lblNewLabel);

		rgLabel = new JLabel("RG");
		rgLabel.setBounds(64, 133, 46, 14);
		frame.getContentPane().add(rgLabel);

		rgTF = new JTextField();
		rgTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					datadenascimentoTF.requestFocus();
				}
			}
		});
		rgTF.setColumns(10);
		rgTF.setBounds(224, 133, 212, 17);
		frame.getContentPane().add(rgTF);

		datadenascimentoLabel = new JLabel("DATA DE NASCIMENTO");
		datadenascimentoLabel.setBounds(64, 161, 135, 14);
		frame.getContentPane().add(datadenascimentoLabel);

		// datadenascimentoTF = new JTextField();
		datadenascimentoTF.setColumns(10);
		datadenascimentoTF.setBounds(224, 161, 212, 17);
		frame.getContentPane().add(datadenascimentoTF);

		enderecoLabel = new JLabel("ENDEREÇO");
		enderecoLabel.setBounds(64, 194, 85, 14);
		frame.getContentPane().add(enderecoLabel);

		enderecoTF = new JTextField();
		enderecoTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					numeroTF.requestFocus();
				}
			}
		});
		enderecoTF.setColumns(10);
		enderecoTF.setBounds(224, 194, 212, 17);
		frame.getContentPane().add(enderecoTF);

		numeroLabel = new JLabel("NÚMERO");
		numeroLabel.setBounds(64, 219, 65, 14);
		frame.getContentPane().add(numeroLabel);

		numeroTF = new JTextField();
		numeroTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					bairroTF.requestFocus();
				}
			}
		});
		numeroTF.setColumns(10);
		numeroTF.setBounds(224, 219, 212, 17);
		frame.getContentPane().add(numeroTF);

		bairroLabel = new JLabel("BAIRRO");
		bairroLabel.setBounds(64, 244, 46, 14);
		frame.getContentPane().add(bairroLabel);

		bairroTF = new JTextField();
		bairroTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					cidadeTF.requestFocus();
				}
			}
		});
		bairroTF.setBounds(223, 247, 213, 15);
		frame.getContentPane().add(bairroTF);
		bairroTF.setColumns(10);

		cidadeLabel = new JLabel("CIDADE");
		cidadeLabel.setBounds(64, 269, 46, 14);
		frame.getContentPane().add(cidadeLabel);

		cidadeTF = new JTextField();
		cidadeTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					cepTF.requestFocus();
				}
			}
		});
		cidadeTF.setBounds(222, 269, 214, 17);
		frame.getContentPane().add(cidadeTF);
		cidadeTF.setColumns(10);

		cepLabel = new JLabel("CEP");
		cepLabel.setBounds(64, 294, 46, 14);
		frame.getContentPane().add(cepLabel);

		// cepTF = new JTextField();
		cepTF.setColumns(10);
		cepTF.setBounds(222, 294, 214, 17);
		frame.getContentPane().add(cepTF);

		estadoLabel = new JLabel("ESTADO");
		estadoLabel.setBounds(64, 319, 65, 14);
		frame.getContentPane().add(estadoLabel);

		// estadoTF = new JTextField();
		estadoTF.setColumns(10);
		estadoTF.setBounds(222, 319, 214, 17);
		frame.getContentPane().add(estadoTF);

		complementoLabel = new JLabel("COMPLEMENTO");
		complementoLabel.setBounds(64, 344, 97, 14);
		frame.getContentPane().add(complementoLabel);

		complementoTF = new JTextField();
		complementoTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					nomedopaiTF.requestFocus();
				}
			}
		});
		complementoTF.setColumns(10);
		complementoTF.setBounds(222, 344, 214, 17);
		frame.getContentPane().add(complementoTF);

		nomedopaiLabel = new JLabel("NOME DO PAI");
		nomedopaiLabel.setBounds(64, 369, 97, 14);
		frame.getContentPane().add(nomedopaiLabel);

		nomedopaiTF = new JTextField();
		nomedopaiTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					nomedamaeTF.requestFocus();
				}
			}
		});
		nomedopaiTF.setColumns(10);
		nomedopaiTF.setBounds(222, 369, 214, 17);
		frame.getContentPane().add(nomedopaiTF);

		nomedamaeLabel = new JLabel("NOME DA MÃE");
		nomedamaeLabel.setBounds(64, 394, 85, 14);
		frame.getContentPane().add(nomedamaeLabel);

		nomedamaeTF = new JTextField();
		nomedamaeTF.setColumns(10);
		nomedamaeTF.setBounds(222, 394, 214, 17);
		frame.getContentPane().add(nomedamaeTF);

		JButton btnNewButton = new JButton("FINALIZAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = nomeTF.getText().trim().toLowerCase();
				String cpf = cpfTF.getText().trim().toLowerCase();
				String rg = rgTF.getText().trim().toLowerCase();
				String datadenascimento = datadenascimentoTF.getText().trim().toLowerCase();
				String endereco = enderecoTF.getText().trim().toLowerCase();
				String numero = numeroTF.getText().trim().toLowerCase();
				String bairro = bairroTF.getText().trim().toLowerCase();
				String cidade = cidadeTF.getText().trim().toLowerCase();
				String cep = cepTF.getText().trim().toLowerCase();
				String estado = estadoTF.getText().trim().toUpperCase();
				String complemento = complementoTF.getText().trim().toLowerCase();
				String nomedopai = nomedopaiTF.getText().trim().toLowerCase();
				String nomedamae = nomedamaeTF.getText().trim().toLowerCase();
				if(nome.isEmpty()==false&&cpf.isEmpty()==false&&rg.isEmpty()==false&&datadenascimento.isEmpty()==false&&endereco.isEmpty()==false&&numero.isEmpty()==false&&bairro.isEmpty()==false&&cidade.isEmpty()==false&&cep.isEmpty()==false&&estado.isEmpty()==false&&complemento.isEmpty()==false&&nomedopai.isEmpty()==false&&nomedamae.isEmpty()==false) {
					if(nome.matches("[a-z ]+")) {
						if(rg.matches("[0-9]+")&&rg.length()>=3&&rg.length()<=13) {
							if(numero.length()>0&&numero.length()<=5) {
								List<String> estados = Arrays.asList("AC", "AL", "AM", "BA", "CE", "DF", "ES", "GO", "JP", "MA", "MT", "MS",
										"MG", "PA", "PB", "PE", "PI", "PR", "RN", "RJ", "RS", "SC", "SE", "SP");
								if(estados.contains(estado)) {
									 String cpfSemPontos = cpf.replace(".", "").replace("-", "");
									 Validacpf val = new Validacpf();
									 if(val.isCpf(cpfSemPontos)) {
										 if(nomedopai.matches("[a-z ]+")) {
											 if(nomedamae.matches("[a-z ]+")) {
												 JOptionPane.showMessageDialog(null,  "CADASTRO REALIZADO COM SUCESSO\n"+"nome: "+nome+"\n"+cpf+"\n"+rg+"\n"+datadenascimento+"\n"+endereco+"\n"+numero+"\n"+bairro+"\n"+cidade+"\n"+cep+"\n"+estado+"\n+"+complemento+"\n"+nomedopai+"\n"+nomedamae+"\n", "Aviso", JOptionPane.WARNING_MESSAGE);
											 }else {
												 JOptionPane.showMessageDialog(null,  "NOME DA MÃE inválido", "Aviso", JOptionPane.WARNING_MESSAGE);
											 }
										 }else {
											 JOptionPane.showMessageDialog(null,  "NOME DO PAI inválido", "Aviso", JOptionPane.WARNING_MESSAGE);
										 }
									 }else {
										 JOptionPane.showMessageDialog(null,  "CPF inválido", "Aviso", JOptionPane.WARNING_MESSAGE);
									 }
								}else {
									JOptionPane.showMessageDialog(null,  "Estado inválido", "Aviso", JOptionPane.WARNING_MESSAGE);
								}
								
							}else {
								JOptionPane.showMessageDialog(null,  "Número inválido", "Aviso", JOptionPane.WARNING_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null,  "rg inválido", "Aviso", JOptionPane.WARNING_MESSAGE);
						}
					}else {
						JOptionPane.showMessageDialog(null,  "Nome inválido", "Aviso", JOptionPane.WARNING_MESSAGE);
					}
				}else{
					JOptionPane.showMessageDialog(null,  "Existem campos vazios, por favor, corrija", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(224, 422, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VOLTAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela2 tel = new tela2 ();
				tel.visivel();
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(347, 422, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
