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

public class Cidade_Karachi extends JFrame {

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
					Cidade_Karachi frame = new Cidade_Karachi();
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
	public Cidade_Karachi() {
		
		setTitle("Karachi - Paquist\u00E3o ");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				
				URI link = new URI("https://binged.it/2q7IvCB");
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
		textArea.setText("Karachi ou tamb\u00E9m conhecida como Carachi e uma cidade de n\u00FAmeros expressivos,  \u00E9 a capital da prov\u00EDncia de Sinde, fica no sul do pa\u00EDs, e \u00E9 o centro financeiro, comercial e portu\u00E1rio do Paquist\u00E3o al\u00E9m disso em termos de popula\u00E7\u00E3o urbana \u00E9 uma das maiores cidades do mundo na, esta na 13\u00AA  posi\u00E7\u00E3o em maior aglomera\u00E7\u00E3o urbana e em 20\u00AA maior \u00E1rea metropolitana no mundo. Carachi \u00E9 o lugar onde reside as principais corpora\u00E7\u00F5es do Paquist\u00E3o em quanto a ind\u00FAstria t\u00EAxtil, buques, Ind\u00FAstria de autom\u00F3veis, entretenimento, arte, moda, publicidade, desenvolvimentos inform\u00E1ticos e investiga\u00E7\u00E3o m\u00E9dica. \u00C9 tamb\u00E9m um dos centros educativos mais importantes da \u00C1sia meridional e do Mundo Isl\u00E2mico. \r\nA popula\u00E7\u00E3o esta em cerca de 15,5 milh\u00F5es de habitantes, concentrados em 3 530 km\u00B2 e essa quantidade de pessoas j\u00E1 e nossa porta de entrada para os problemas da cidade.\r\nEntre pobreza, escassez de recursos, confrontos \u00E9tnicos e religiosos , ainda temos uma das taxas mais elevadas de polui\u00E7\u00E3o do ar encontrada no planeta,  isso se deve a grande parte pelo movimento industrial que \u00E9 muito forte na cidade, com sider\u00FArgicas, montadoras automotivas, e fabricas t\u00EAxtis, que despejam grande parte dos res\u00EDduos gerados de forma descuidada ou inconsequente no ar, na terra, ou rios da cidade.  \r\nAcredita-se que o ar de Karachi seja mais polu\u00EDdo do que o de Nova Deli e o de Pequim, por causa de uma alta concentra\u00E7\u00E3o de metais pesados como chumbo e c\u00E1dmio, que s\u00E3o altamente t\u00F3xicos e podem levar um ser humano a morte por intoxica\u00E7\u00E3o se inalados diretamente por per\u00EDodos prolongadpos.\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
