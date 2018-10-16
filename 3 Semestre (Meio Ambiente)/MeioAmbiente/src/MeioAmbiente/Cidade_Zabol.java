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


public class Cidade_Zabol extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					Cidade_Zabol frame = new Cidade_Zabol();
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
	public Cidade_Zabol() {
		
		setTitle("Zabol - ir\u00E3");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://www.google.com.br/maps/place/Zabol,+Sist%C3%A3o-Baluchist%C3%A3o,+Ir%C3%A3o/@31.0402692,61.4283136,12z/data=!3m1!4b1!4m5!3m4!1s0x3edffa13f83defe7:0x58a1f11096d02148!8m2!3d31.0323677!4d61.4902483");
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
		textArea.setText("Zabol, \u00E9 uma cidade dentro da capital \u201CZabol County\u201D a cidade se encontra na fronteira com o Afeganist\u00E3o \r\ne \u00E9 uma prov\u00EDncia do a situada no leste do Ir\u00E3, al\u00E9m disso tamb\u00E9m fica perto do Lago Hamun e a regi\u00E3o \r\n\u00E9 irrigada pelo rio Hirmand oque as vezes pode gerar confus\u00E3o sobre sua localiza\u00E7\u00E3o.\r\n\r\nA cidade al\u00E9m de dominada pela pobreza e pela polui\u00E7\u00E3o. \u00C9 conhecida pelos \u201C120 dias de vento\u201D  \r\n(b\u0101d-e sad-o-bist-roz )uma tempestade de areia vinda do sul que perdura durante os ver\u00F5es, \r\no desaparecimento de regi\u00F5es h\u00FAmidas em Hamoun, tem contribu\u00EDdo para o agravamento do estado \r\n\u201Cempoeirado\u201D da cidade. \r\n\r\nE isso que levou a OMS em 2016 declarar zabol a cidade mais polu\u00EDda do \r\nmundo em termos de polui\u00E7\u00E3o do ar, medida pela quantidade de part\u00EDculas sob 2,5 microgramas \r\nem cada metro c\u00FAbico de ar, que era de 217 microgramas por metro c\u00FAbico.\r\n\r\nEsse tipo de polui\u00E7\u00E3o \u00E9 extremamente grave, com consequ\u00EAncias tanto para o sistema respirat\u00F3rio como \r\ncardiovascular\", explica Marcos Abdo Arbex, pesquisador do Laborat\u00F3rio de Polui\u00E7\u00E3o Atmosf\u00E9rica \r\nExperimental da USP. \"Essas part\u00EDculas, com menos de 2,5 micr\u00F4metros, s\u00E3o t\u00E3o pequenas que atingem \r\nas regi\u00F5es mais profundas do sistema respirat\u00F3rio, podendo provocar danos aos alv\u00E9olos. Part\u00EDculas \r\nainda menores ultrapassam a barreira do sistema respirat\u00F3rio para o circulat\u00F3rio, provocando inflama\u00E7\u00F5es sist\u00EAmicas\".\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
		
	}

}
