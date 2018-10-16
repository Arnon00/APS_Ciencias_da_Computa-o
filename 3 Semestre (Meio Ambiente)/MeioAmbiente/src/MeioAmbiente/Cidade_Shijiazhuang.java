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

public class Cidade_Shijiazhuang extends JFrame {

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
					Cidade_Shijiazhuang frame = new Cidade_Shijiazhuang();
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
	public Cidade_Shijiazhuang() {
		
		setTitle("Shijiazhuang - China");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					URI link = new URI("https://binged.it/2q7qeFG");
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
		textArea.setText("Shijiazhuang \u00E9 uma das 34 cidade da China, tamb\u00E9m e a capital e maior cidade da prov\u00EDncia de Hebei no norte da china. Tem cerca de 10,7 milh\u00F5es de habitantes vivendo em seus 15.849 km\u00B2.\r\nApos 1949, a industrializa\u00E7\u00E3o da cidade de inicio. Sua popula\u00E7\u00E3o mais do que triplicou na d\u00E9cada de 1948-58.Na d\u00E9cada de 1950, a cidade experimentou uma grande expans\u00E3o na ind\u00FAstria t\u00EAxtil\r\nApesar de nos \u00FAltimos anos termos muitas noticias e coment\u00E1rios de que Pequim era a cidade mais polu\u00EDda da china, isso n\u00E3o e do todo verdade, essa \u201Cfama\u201D s\u00F3 servia para tirar os holofotes de Hebei, e nessa prov\u00EDncia que esta Shijiazhuang e onde se localizam numerosas ind\u00FAstrias pesadas de a\u00E7o e cimento que ainda usam carv\u00E3o para alimentar fornalhas industriais, prov\u00EDncia essa que atualmente vem sendo acusada de causar a polui\u00E7\u00E3o que atinge Pequim, situada a cerca de 300 km de distancia. \r\nEm dezembro de 2016 os registros de polui\u00E7\u00E3o dispararam violentamente em 48 horas. E a concentra\u00E7\u00E3o de part\u00EDculas de 10 micr\u00F4metros de di\u00E2metro (MP10) superou 1.000 microgramas por metro c\u00FAbico. O \u00EDndice foi t\u00E3o alto que fez com que os captores ficassem bloqueados na cifra m\u00E1xima que s\u00E3o capazes de registrar, 999.\r\nE as part\u00EDculas de 2,5 micr\u00F4metros de di\u00E2metro (MP2,5), que s\u00E3o ainda mais nocivas ao ser humano, j\u00E1 que podem ser absorvidas na corrente sangu\u00EDnea e causam doen\u00E7as respirat\u00F3rias e cardiovasculares, e no pior dos casos c\u00E2ncer, chegou a incr\u00EDveis 733 microgramas/m3, mais de 29 vezes o n\u00EDvel m\u00E1ximo recomendado pela Organiza\u00E7\u00E3o Mundial da Sa\u00FAde (OMS), de 25.\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
