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

public class Cidade_Peshawar extends JFrame {

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
					Cidade_Peshawar frame = new Cidade_Peshawar();
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
	public Cidade_Peshawar() {
		
		setTitle("Peshawar - Paquistao ");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://binged.it/2q7v4mg");
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
		textArea.setText("Peshawar e a 8\u00AA maior cidade do Paquist\u00E3o, com 1.257 km\u00B2, e tamb\u00E9m a 2\u00AA cidade mais populosa do mundo com cerca de 1,755 milh\u00E3o (2014) habitantes, estimasse que 51,32% da popula\u00E7\u00E3o vive na \u00E1rea urbana e 48,68% vive na \u00E1rea rural. A cidade tamb\u00E9m \u00E9 a capital da prov\u00EDncia Khyber Pakhtunkhwa e o centro administrativo do Territ\u00F3rio federal das \u00C1reas Tribais. \r\nAqui o principal problema \u00E9 a polui\u00E7\u00E3o do ar, os setores industriais acompanharam o r\u00E1pido crescimento da popula\u00E7\u00E3o e da cidade, mas esse crescimento custou caro ao meio ambiente com a emiss\u00E3o de di\u00F3xido de carbono chegando a alarmantes 23 partes por milh\u00E3o, contra o valor de 10 que e considerado o ideal pela OMS.\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
