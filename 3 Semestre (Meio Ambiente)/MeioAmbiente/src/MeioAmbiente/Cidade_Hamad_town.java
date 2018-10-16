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

public class Cidade_Hamad_town extends JFrame {

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
					Cidade_Hamad_town frame = new Cidade_Hamad_town();
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
	public Cidade_Hamad_town() {
		
		setTitle("Hamad town - Bahrain ");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://binged.it/2r61UB6");
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
		textArea.setText("Hamad town tamb\u00E9m conhecida como Madinat Hamad, e uma cidade no norte do munic\u00EDpio de Bahrein que fica no pais de mesmo nome, com apenas  665 km\u00B2 e 133.55 (2012) mil habitantes.\r\nGrande parte da polui\u00E7\u00E3o da cidade se deve as industrias que s\u00E3o numerosas nesse pequeno pais, e despejam de forma descuidada res\u00EDduos tanto na atmosfera quanto nos mares,  prejudicando tanto a popula\u00E7\u00E3o quanto a vida marinha.\r\nNo ultimo relat\u00F3rio liberado pelo pa\u00EDs, a cidade de Hamad tinha uma contagem de material particulado de 318mg por metro c\u00FAbico. \r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
