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

public class Cidade_Al_Jubail extends JFrame {

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
					Cidade_Al_Jubail frame = new Cidade_Al_Jubail();
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
	public Cidade_Al_Jubail() {
		
		setTitle("Al Jubail - Arabia saudita");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				
				URI link = new URI("https://binged.it/2q7z0mZ");
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
		textArea.setText("\u00E9 uma cidade na prov\u00EDncia oriental na costa do Golfo P\u00E9rsico da Ar\u00E1bia Saudita, com 1 960 582 km \u00B2 e cerca de  25.731 Milh\u00F5es de pessoas \r\nAl jubail e a maior cidade industrial do oriente m\u00E9dio, e tamb\u00E9m, o \u201Clar\u201D da maior petroqu\u00EDmica do mundo e a quarta maior do Oriente M\u00E9dio.\r\nA causa da polui\u00E7\u00E3o na cidade saudita de Jubail \u00E9 a enorme quantidade de lixo industrial e dom\u00E9stico gerados na cidade de forma indiscriminada, e como todas as cidades dessa regi\u00E3o, ela ainda sofre com grande quantidades de acumulo de areia e poeira,  principalmente ap\u00F3s as tempestades no deserto.\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
