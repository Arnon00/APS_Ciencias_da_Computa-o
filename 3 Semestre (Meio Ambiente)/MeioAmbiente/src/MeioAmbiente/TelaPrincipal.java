package MeioAmbiente;

import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal extends JFrame {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run(){ 
				
                 try{
					
					
				    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				        if ("Nimbus".equals(info.getName())) {
				            UIManager.setLookAndFeel(info.getClassName());
				            break;
				        }
				    }
				} catch (Exception e) {
				    // If Nimbus is not available, you can set the GUI to another look and feel.
				}
			
				try{	
				 
				TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
			}
		});
	}
		
	
	

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/MeioAmbiente/resTelas/planeta terra.jpg")));
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		
        
		contentPane = new JPanel();
        setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Meio Ambiente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1010, 660);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setLocationRelativeTo(null);
		
		
	    JDesktopPane desktop1 = new JDesktopPane();
		desktop1.setLocation(0, 0);
		desktop1.setSize(1089, 660);
		contentPane.add(desktop1);
		desktop1.setLayout(null);
		
		JButton btnCadastro = new JButton("CADASTRO");
		btnCadastro.setToolTipText("Clique para se cadastrar, e ter acesso a comunidade!\r\n");
		btnCadastro.setBounds(588, 310, 181, 52);
		desktop1.add(btnCadastro);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setToolTipText("Clique para fazer login na comunidade!\r\n");
		btnLogin.setBounds(779, 310, 181, 52);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		
		
				TelaLogin tl = new TelaLogin();
				
				desktop1.add(tl);
				
				tl.setVisible(true);
			 
			  
			}
		});
		
            	
		desktop1.add(btnLogin);
		
		JLabel lblMainpage = new JLabel("MainPage");
		lblMainpage.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/MeioAmbiente/resTelas/TelaPrincipal (2).png")));
		lblMainpage.setBounds(0, 32, 999, 477);
		desktop1.add(lblMainpage);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1009, 34);
		desktop1.add(menuBar);
		
		JMenu Menu = new JMenu("Menu");
		Menu.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/MeioAmbiente/resTelas/Home.png")));
		menuBar.add(Menu);
		
		JMenuItem HomePage = new JMenuItem("Concientiza\u00E7\u00E3o");
		HomePage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(null, "Bem Vindo !");
				
				TelaHome hp = new TelaHome();
				desktop1.add(hp);
				
				hp.setVisible(true);
				
			}
		});
		Menu.add(HomePage);
		
		JMenuItem UmPoucoDe = new JMenuItem("Paises e seus problemas");
		UmPoucoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(null, "Bem Vindo !");
				
				UmPoucoDeCadaPais pais = new UmPoucoDeCadaPais();
				desktop1.add(pais);
				
				pais.setVisible(true);
				
			}
		});
		Menu.add(UmPoucoDe);
		
		JMenuItem Sair = new JMenuItem("Sair");
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				new TelaOpcoes().setVisible(true);
			}
		});
		Menu.add(Sair);
		
		JMenu Informacoes = new JMenu("Informa\u00E7\u00F5es");
		Informacoes.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/MeioAmbiente/resTelas/Sobre.jpg")));
		menuBar.add(Informacoes);
		
		JMenuItem Sobre = new JMenuItem("Sobre");
		Sobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaSobre().setVisible(true);
				
			}
		});
		Informacoes.add(Sobre);
		
		JMenuItem InformacoesDoPrograma = new JMenuItem("Informa\u00E7\u00F5es do Programa");
		InformacoesDoPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaInformacoes().setVisible(true);
				
			}
		});
		Informacoes.add(InformacoesDoPrograma);
		
		
		setVisible(true);
		
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 JOptionPane.showMessageDialog(null, "Bem Vindo !");
				
				TelaCadastro tc = new TelaCadastro();
				desktop1.add(tc);
				
				tc.setVisible(true);
				
			}
			
		
			
		});
		
	}	
}
			
		
	  
	
	

