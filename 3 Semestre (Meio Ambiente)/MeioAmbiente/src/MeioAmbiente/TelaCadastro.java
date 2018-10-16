package MeioAmbiente;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;

public class TelaCadastro extends JInternalFrame {
	private JTextField textFieldNome;
	private JTextField textFieldEmail;
	private JPasswordField passwordCriar;
	private JPasswordField passwordNovamente;
	private JTextField textFieldApelido;
	private JTextField textFieldRG;
	private JTextField textFieldCPF;
	private JTextField textFieldEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	public boolean checkLogin(String NomeCompleto, String email, String CriarSenha, String SenhaNovamente, 
			String Apelido, String Nascimento, String RG, String CPF, String Endereco ){
		
		return NomeCompleto.equals("Usuario") && email.equals("grupoAPS@gmail.com") && CriarSenha.equals("2017") 
				&& SenhaNovamente.equals("2017") && Apelido.equals("APS") && Nascimento.equals("29/05/2017") 
				&& RG.equals("05.2017.2017.5") && CPF.equals("05.2017.2017.05") && Endereco.equals("Av_Vergueiro, Paraíso.");
	}
	
	
	
	    public TelaCadastro(){
		
		getContentPane().setLayout(null);
		setClosable(true);
		setRootPaneCheckingEnabled(false);
		setTitle("Cadastro do Usuario");
		setSize(995, 504);
		setResizable(true);
		
		
		JDesktopPane desktop3 = new JDesktopPane();
		desktop3.setBackground(new Color(154, 205, 50));
		desktop3.setSize(996, 464);
		getContentPane().add(desktop3);
		
		
		JLabel NomeCompleto = new JLabel("Nome Completo");
		NomeCompleto.setForeground(new Color(0, 128, 0));
		NomeCompleto.setBounds(17, 83, 140, 15);
		desktop3.add(NomeCompleto);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(17, 109, 255, 30);
		desktop3.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel Email = new JLabel("Email");
		Email.setForeground(new Color(0, 128, 0));
		Email.setBounds(368, 262, 73, 15);
		desktop3.add(Email);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(368, 288, 253, 30);
		desktop3.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel CrieUmaSenha = new JLabel("Crie uma senha");
		CrieUmaSenha.setForeground(new Color(0, 128, 0));
		CrieUmaSenha.setBounds(368, 83, 100, 15);
		desktop3.add(CrieUmaSenha);
		
		passwordCriar = new JPasswordField();
		passwordCriar.setBounds(368, 109, 180, 30);
		desktop3.add(passwordCriar);
		
		JLabel DigiteSuaSenha = new JLabel("Digite sua senha novamente ");
		DigiteSuaSenha.setForeground(new Color(0, 128, 0));
		DigiteSuaSenha.setBounds(368, 143, 180, 15);
		desktop3.add(DigiteSuaSenha);
		
		passwordNovamente = new JPasswordField();
		passwordNovamente.setBounds(368, 169, 180, 30);
		desktop3.add(passwordNovamente);
		
		JComboBox Sexo = new JComboBox();
		Sexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		Sexo.setBounds(17, 169, 110, 20);
		desktop3.add(Sexo);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setForeground(new Color(0, 128, 0));
		lblSexo.setBounds(17, 143, 46, 15);
		desktop3.add(lblSexo);
		
		JLabel ApelidoDaConta = new JLabel("Apelido da conta");
		ApelidoDaConta.setForeground(new Color(0, 128, 0));
		ApelidoDaConta.setBounds(368, 205, 110, 15);
		desktop3.add(ApelidoDaConta);
		
		textFieldApelido = new JTextField();
		textFieldApelido.setBounds(368, 231, 140, 30);
		desktop3.add(textFieldApelido);
		textFieldApelido.setColumns(10);
		
		JLabel DataDeNascimento = new JLabel("Data de Nascimento");
		DataDeNascimento.setForeground(new Color(0, 128, 0));
		DataDeNascimento.setBounds(17, 204, 140, 15);
		desktop3.add(DataDeNascimento);
		
		JTextArea Nascimento = new JTextArea();
		Nascimento.setText("   /  /    ");
		Nascimento.setBounds(17, 230, 86, 27);
		desktop3.add(Nascimento);
		
		JLabel RG = new JLabel("RG");
		RG.setForeground(new Color(0, 128, 0));
		RG.setBounds(17, 263, 46, 14);
		desktop3.add(RG);
		
		textFieldRG = new JTextField();
		textFieldRG.setBounds(17, 288, 150, 30);
		desktop3.add(textFieldRG);
		textFieldRG.setColumns(10);
		
		JLabel CPF = new JLabel("CPF");
		CPF.setForeground(new Color(0, 128, 0));
		CPF.setBounds(17, 319, 46, 14);
		desktop3.add(CPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(17, 344, 150, 30);
		desktop3.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JLabel Endereco = new JLabel("Endere\u00E7o");
		Endereco.setForeground(new Color(0, 128, 0));
		Endereco.setBounds(17, 375, 57, 15);
		desktop3.add(Endereco);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setBounds(17, 398, 290, 30);
		desktop3.add(textFieldEndereco);
		textFieldEndereco.setColumns(10);
		
		JButton btnPlay = new JButton("CADASTRAR  ---  HOME PAGE");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if(checkLogin(textFieldNome.getText(), textFieldEmail.getText(), new String(passwordCriar.getPassword()), 
						 new String(passwordNovamente.getPassword()), textFieldApelido.getText(), textFieldRG.getText(),
						 textFieldCPF.getText(), textFieldEndereco.getText(), null )){
			 
				 JOptionPane.showMessageDialog(null, "Bem Vindo !");
				
				TelaHome th = new TelaHome();
				desktop3.add(th);
				
				th.setVisible(true);
				
				 }
				
				 else {
			    	   
			    	   JOptionPane.showMessageDialog(null, "Dados Invalidos !");
	
				 }
			}
		});
		btnPlay.setBounds(369, 382, 293, 46);
		desktop3.add(btnPlay);
		
		JLabel CadastroUsuario = new JLabel("Cadastro do Usuario");
		CadastroUsuario.setBackground(new Color(0, 128, 0));
		CadastroUsuario.setFont(new Font("Monospaced", Font.PLAIN, 25));
		CadastroUsuario.setForeground(new Color(0, 0, 0));
		CadastroUsuario.setBounds(337, 11, 339, 45);
		desktop3.add(CadastroUsuario);
		
		JLabel ArvoreEsteticaPrograma = new JLabel("ArvoreEcologica");
		ArvoreEsteticaPrograma.setIcon(new ImageIcon(TelaCadastro.class.getResource("/MeioAmbiente/resTelas/ArvoreEcologica.png")));
		ArvoreEsteticaPrograma.setBackground(new Color(154, 205, 50));
		ArvoreEsteticaPrograma.setBounds(695, 72, 270, 300);
		desktop3.add(ArvoreEsteticaPrograma);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Menu");
		menuBar.add(Menu);
		
		JMenu Inicio = new JMenu("Inicio");
		Inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaPrincipal tp = new TelaPrincipal();
				desktop3.add(tp);
				
				tp.setVisible(true);
				
			}
		});
		Menu.add(Inicio);
		
		JMenu Login = new JMenu("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaLogin tl = new TelaLogin();
				
				desktop3.add(tl);
				
				tl.setVisible(true);
				
			}
		});
		Menu.add(Login);
		
		JMenuItem Sair = new JMenuItem("Sair");
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaOpcoes().setVisible(true);
				
			}
		});
		Menu.add(Sair);
		
		JMenu Informacoes = new JMenu("Informa\u00E7\u00F5es");
		menuBar.add(Informacoes);
		
		JMenuItem Sobre = new JMenuItem("Sobre");
		Informacoes.add(Sobre);


	}

		
}
