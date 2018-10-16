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

public class Cidade_Ma_ameer extends JFrame {

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
					Cidade_Ma_ameer frame = new Cidade_Ma_ameer();
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
	public Cidade_Ma_ameer() {
		
		setTitle("Ma'ameer - Bahrain");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://binged.it/2q7t0L5");
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
		textArea.setEditable(false);
		textArea.setText("A cidade de ma'ameer, \r\n\r\nA cidade de ma'aneer em bahrain sofre alguns problemas, mas o principal e a polui\u00E7\u00E3o do ar;\r\n\r\nA cidade alem de ser pequena, possou um grupo de industrias chamado de \"Petroleum Company\", \r\nque ocupam a maior parte da area industrial da cidade, \r\n\r\nOs moradores da cidade reclamam da fuma\u00E7a toxicaproveniente da regi\u00E3o que vem tornando insustentavel \r\na vida no local, alde\u00F5es alegam que fumos e gases com cheiros fortes, das f\u00E1bricas, levaram a um aumento \r\nno n\u00FAmero de doen\u00E7as de longo prazo emergentes na aldeia, e tamb\u00E9m tinha levado \u00E0 morte de v\u00E1rias pessoas \r\nna aldeia Nos \u00FAltimos anos. \r\n\r\nAlegam igualmente que a descarga de res\u00EDduos das f\u00E1bricas da ALBA e da GPIC para o mar, ao largo da \r\ncosta da aldeia, levou \u00E0 morte da vida aqu\u00E1tica na regi\u00E3o. \r\n\r\nOs moradores formaram um Comit\u00EA Ambientalista Ma'ameer (MEC), que faz campanhas ativamente, tanto no \r\nBahrein como no exterior, por maiores controles de polui\u00E7\u00E3o na vila e no pa\u00EDs. O mec faz convites regulares \r\npara a Comiss\u00E3o de Protec\u00E7\u00E3o dos Recursos Marinhos, Ambiente e Vida Selvagem, que \u00E9 respons\u00E1vel \r\npelo ambiente no pa\u00EDs, a tomar medidas sobre a polui\u00E7\u00E3o.\r\n\r\nem 2006 a camara baixa do parlamento do bahrein decidiu que BAPCO teria que pagar uma compensas\u00E3o \r\nao moradores que tenham alergias e doen\u00E7as provenientes da polui\u00E7\u00E3o, e tambem, que financie campanhas \r\nde concientiza\u00E7\u00E3o e sensibiliza\u00E7\u00E3o e estudos na aldeia. \r\n\r\nOs indices de polui\u00E7\u00E3o se tornaram t\u00E3o altos que muitos deles desenvolveram alergias na pele, \r\nc\u00E2ncer e sofreram abortos espont\u00E2neos.\r\n");
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
