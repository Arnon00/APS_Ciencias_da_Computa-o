package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;

public class Cidade_Aba extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
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
				
				try {
					Cidade_Aba frame = new Cidade_Aba();
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
	public Cidade_Aba() {
		
		setTitle("Aba - Nigeria");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				
				URI link = new URI("https://binged.it/2r6xf6y");
				Desktop.getDesktop().browse(link); 
				
			}catch(Exception erro){
				System.out.println("Algo deu errado no carregamento da pagina, tente de novo mais tarde");
				
			}
			}
		});
		Menu.add(MenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		TextArea textArea = new TextArea();
		textArea.setText("Aba, cidade localizada no sudoeste da Nigeria, tem  uma \u00C1rea de 72 km\u00B2, a popula\u00E7\u00E3o pode chegar aos  944 mil habitantes.\r\nAba \u00E9 cercada por po\u00E7os de petr\u00F3leo que a separam da cidade de Port Harcourt , um encanamento de 30 quil\u00F4metros\r\nAba \u00E9 o centro comercial do leste da Nig\u00E9ria; H\u00E1 mercados bem conhecidos na regi\u00E3o tais como o mercado internacional de Ariaria, Ahia Ohuru (mercado novo) e o mercado da estrada de Eziukwu (mercado do cemit\u00E9rio) porem, a cidade tamb\u00E9m possui um sistema de gerenciamento de lixo inadequado, e ineficiente que levou \u00E0 contamina\u00E7\u00E3o de sua \u00E1gua, solo e ar.\r\nAcredita-se que em 2030, o oeste da \u00C1frica representar\u00E1 45% das emiss\u00F5es de gases poluentes no mundo, com uma participa\u00E7\u00E3o muito elevada da Nig\u00E9ria. O leste do continente contabilizar\u00E1 24% das emiss\u00F5es - encabe\u00E7ado por Eti\u00F3pia e Qu\u00EAnia - e 26% estar\u00E1 no sul africano. O norte ser\u00E1 respons\u00E1vel por apenas 5% das emiss\u00F5es.\r\nE as principais fontes dessa polui\u00E7\u00E3o ser\u00E3o gasolina, diesel, ve\u00EDculos de duas rodas, lenha para aquecimento, carv\u00E3o vegetal ou ainda a combust\u00E3o de compostos org\u00E2nicos.\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
