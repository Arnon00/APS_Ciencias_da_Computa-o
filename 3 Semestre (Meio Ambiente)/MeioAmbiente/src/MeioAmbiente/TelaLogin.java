package MeioAmbiente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JDesktopPane desktop2 = new JDesktopPane();
	private JPasswordField PasswordSenha;
	private JTextField textFieldUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				 
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 public boolean checkLogin(String login, String senha){
			
			return login.equals("Usuario") && senha.equals("2017");
		}
	
	 
	 
	public TelaLogin(){
		setFrameIcon(new ImageIcon(TelaLogin.class.getResource("/MeioAmbiente/resTelas/planeta terra.jpg")));
		desktop2.setLocation(0, 0);
		
		
		getContentPane().add(desktop2);
		getContentPane().setLayout(null);
		setClosable(true);
		setTitle("Login do Usuario\r\n");
		setSize(995, 504);
		desktop2.setBackground(new Color(0, 153, 204));
		desktop2.setSize(987, 474);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
		       if(checkLogin(textFieldUsuario.getText(), new String(PasswordSenha.getPassword()))){
		    	   
		    	   JOptionPane.showMessageDialog(null, "Bem Vindo !");
		    	   
		     
		    	   
		    	   TelaHome th = new TelaHome();
		    	   desktop2.add(th);
					
					th.setVisible(true);
					
		       }
		       
                  else {
		    	   
		    	   JOptionPane.showMessageDialog(null, "Dados Invalidos !");
					
						
					}
			}
		
		});
		btnEntrar.setBounds(34, 323, 110, 50);
		desktop2.add(btnEntrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
             
		         setVisible(false);

			}
		});

					
		btnCancelar.setBounds(169, 323, 110, 50);
		desktop2.add(btnCancelar);
		
		JLabel DigiteSuaSenha = new JLabel("Faça Login Para Acessar o Programa");
		DigiteSuaSenha.setFont(new Font("Arial Black", Font.PLAIN, 12));
		DigiteSuaSenha.setBounds(32, 49, 275, 35);
		desktop2.add(DigiteSuaSenha);
		
		PasswordSenha = new JPasswordField();
		PasswordSenha.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {	
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					
					  if(checkLogin(textFieldUsuario.getText(), new String(PasswordSenha.getPassword()))){
				    	   
				    	   JOptionPane.showMessageDialog(null, "Bem Vindo !");
				    	   
				    	   TelaHome th = new TelaHome();
				    	   desktop2.add(th);
							
							th.setVisible(true);
							
							
				    	  
				       }
					
				       else{
				    	   
				    	   JOptionPane.showMessageDialog(null, "Dados Invalidos !");

				       }
					
					}
				}
			
		});
		PasswordSenha.setBounds(32, 265, 254, 30);
		desktop2.add(PasswordSenha);
		PasswordSenha.setColumns(10);
		
		JLabel Usuario = new JLabel("Usuario");
		Usuario.setFont(new Font("Arial Black", Font.PLAIN, 12));
		Usuario.setBounds(32, 134, 70, 15);
		desktop2.add(Usuario);
		
		JLabel Senha = new JLabel("Senha");
		Senha.setFont(new Font("Arial Black", Font.PLAIN, 12));
		Senha.setBounds(32, 224, 70, 15);
		desktop2.add(Senha);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(31, 173, 255, 30);
		desktop2.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel Imagemambiente = new JLabel("ImagemAmbiente");
		Imagemambiente.setIcon(new ImageIcon(TelaLogin.class.getResource("/MeioAmbiente/resTelas/ImagemAmbiente.jpg")));
		Imagemambiente.setBounds(430, 35, 510, 395);
		desktop2.add(Imagemambiente);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Menu");
		menuBar.add(Menu);
		
		JMenuItem Sair = new JMenuItem("Sair");
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaOpcoes().setVisible(true);
				
			}
		});
		Menu.add(Sair);
		

	}
}


