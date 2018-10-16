package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;


public class Cidade_Bushehr extends JFrame {

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
					Cidade_Bushehr frame = new Cidade_Bushehr();
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
	public Cidade_Bushehr() {
		
		
		setTitle("Bushehr - Ira ");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				
				URI link = new URI("https://www.google.com.br/maps/place/Bushehr,+Ir%C3%A3o/@28.784971,50.3856471,8z/data=!3m1!4b1!4m5!3m4!1s0x3fb65cce55bcfdc1:0xa02439a52939ce8b!8m2!3d28.7620739!4d51.5150077");
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
		textArea.setText("A provincia de Bushehr e umas das 31 do ir\u00E3 e fica licalizada ao sul do pais, \r\na area da provincia e de 22.742 km\u00B2 e possui cerca de 1 milh\u00E3o habitantes;\r\n\r\nAqui, os problemas v\u00E3o de contamina\u00E7\u00E3o das aguas, do ar, a um serio risco de uma catastrofe nuclear, da qual falaremos.\r\n\r\nO reator nuclear de Bushehr, carrega o mesmo nome da cidade, e foi construido em parceria do ir\u00E3 com a russia, mesmo com \r\na desaprova\u00E7\u00E3o de alguns paises da regiao, ficou pronto em 2010, apos varias decadas de atrasos e comtratempos.\r\nAtualmente \u00E9 monitorada pela Ag\u00EAncia Internacional de Energia At\u00F4mica (AIEA)\r\n\r\nNo mesmo ano de sua finaliza\u00E7\u00E3o, ja inicio as atividades mas n\u00E3o conseguiu chegar a sua plena capacidade, porque apenas \r\nalguns messes depois o reator teve de ser desligado por problemas no sistema de resfriamento, \r\nque foram atribu\u00EDdos aos componentes de fabrica\u00E7\u00E3o alem\u00E3.\r\n\r\nAlem disso Ir\u00E3 \u00E9 o \u00FAnico pa\u00EDs que opera uma usina nuclear que n\u00E3o assinou a Conven\u00E7\u00E3o de Seguran\u00E7a Nuclear de 1994.\r\n\r\nEm novembro 2013 um terremoto de Magnitude de 5,6 graus atingiu a central nuclear iraniana, com o mesmo nome da \r\ncidade. Pelo menos oito pessoas morreram e 59 ficaram feridas \r\n\r\nEm abril, do mesmo ano 37 pessoas morreram e 850 ficaram feridas em outro terremoto ocorrido na regi\u00E3o de Bushehr. \r\nNa \u00E9poca, tamb\u00E9m n\u00E3o foram registrados danos na usina.\r\n\r\nEssa regi\u00E3o do Ir\u00E3 est\u00E1 situada em uma zona s\u00EDsmica e sofre tremores de terra com frequ\u00EAncia. \r\nOutros paises daquela regiao ja questionaram o Ir\u00E3 diversas vezes sobre os riscos de uma catastrofe hambiental radioativa\r\ncaso a usina venha a ter algum acidente grave por decorrencia dos tremores.,\r\n\r\nNo pior dos casos, e uma catastrofe ocorrese na cidade, ela poderia ser comparada a Chernobyl e seria devastadora;\r\nesse evento desencadearia graves danos n\u00E3o somente ao sul do Ir\u00E3, como tamb\u00E9m pa\u00EDses ricos em petr\u00F3leo e g\u00E1s a sua volta; \r\nQue s\u00E3o Bahrein, Kuwait, Om\u00E3, Catar, Ar\u00E1bia Saudita e Emirados \u00C1rabes Unidos e compoem o Conselho de Coopera\u00E7\u00E3o do Golfo. \r\nAli\u00E1s, as capitais desses Estados est\u00E3o mais pr\u00F3ximas de Bushehr que Teer\u00E3. \r\nA radia\u00E7\u00E3o nuclear no ar e na \u00E1gua provocaria o colapso da navega\u00E7\u00E3o no Estreito de Ormuz, \r\no mais importante gargalo de passagem do petr\u00F3leo mundial. Os pre\u00E7os do petr\u00F3leo disparariam, e isso se refletiria no mundo interio. \r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

}
