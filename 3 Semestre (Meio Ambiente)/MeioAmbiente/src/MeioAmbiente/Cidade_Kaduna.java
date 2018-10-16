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

public class Cidade_Kaduna extends JFrame {

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
					Cidade_Kaduna frame = new Cidade_Kaduna();
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
	public Cidade_Kaduna() {
		
		setTitle("Kaduna - Nigeria ");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				
				URI link = new URI("https://binged.it/2q7IU85");
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
		textArea.setText("Mais uma das 36 cidades da Nig\u00E9ria, \u00E9 a capital do de Kaduna no noroeste do pais e margeia o rio de mesmo nome, tem 131 km\u00B2, al\u00E9m disso se encontra na lista das 20 cidades mais polu\u00EDdas do mundo (Lista essa que conta com 4 cidades nigerianas), na 5\u00AA posi\u00E7\u00E3o.\r\nDe acordo com um relat\u00F3rio do Banco Mundial divulgado em 2015 cerca de 94% da popula\u00E7\u00E3o nigeriana est\u00E1 exposta \u00E0 polui\u00E7\u00E3o do ar, e grande parte s\u00E3o os aproximados 760 mil habitantes de Kaduna \r\nGlobalmente, no oeste da \u00C1frica, a polui\u00E7\u00E3o se d\u00E1 principalmente pelo transporte e o uso dom\u00E9stico (cozinha). As centrais el\u00E9tricas e as ind\u00FAstrias do sul da \u00C1frica tamb\u00E9m s\u00E3o consideradas. No norte do continente, o transporte \u00E9 a principal causa da polui\u00E7\u00E3o.\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
