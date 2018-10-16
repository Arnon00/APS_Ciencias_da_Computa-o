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

public class Cidade_Dammam extends JFrame {

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
					Cidade_Dammam frame = new Cidade_Dammam();
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
	public Cidade_Dammam() {
		
		setTitle("Dammam - Arabia saudita");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://binged.it/2q7oBrk");
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
		textArea.setText("Dammam \u00E9 a terceira cidade saudita nesta lista, com uma contagem de material particulado de 286mg por metro c\u00FAbico.\r\nH\u00E1 evid\u00EAncias de que v\u00E1rias funda\u00E7\u00F5es e infra-estruturas subterr\u00E2neas em Dammam foram estruturalmente enfraquecidas por um len\u00E7ol fre\u00E1tico crescente. V\u00E1rias fontes, incluindo precipita\u00E7\u00E3o, intrus\u00E3o de \u00E1gua do mar e vazamento de redes de \u00E1gua subterr\u00E2nea e tubula\u00E7\u00F5es de esgoto, foram anedotalmente suspeitas de serem contribuintes para o crescente problema de len\u00E7\u00F3is fre\u00E1ticos. Um estudo recente (TM Iwalewa et al., 2016) revelou que os vazamentos do abastecimento de \u00E1gua pot\u00E1vel e redes de tubula\u00E7\u00E3o de coleta de esgoto s\u00E3o os principais contribuintes para o aumento do len\u00E7ol fre\u00E1tico na cidade. O estudo mostrou que o crescente problema de len\u00E7\u00F3is fre\u00E1ticos representa uma s\u00E9ria amea\u00E7a ao desenvolvimento presente e futuro da cidade.\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
