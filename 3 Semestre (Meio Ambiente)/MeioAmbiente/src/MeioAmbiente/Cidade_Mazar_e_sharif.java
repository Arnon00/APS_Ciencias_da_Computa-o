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

public class Cidade_Mazar_e_sharif extends JFrame {

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
					Cidade_Mazar_e_sharif frame = new Cidade_Mazar_e_sharif();
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
	public Cidade_Mazar_e_sharif() {
		
		setTitle("Mazar'e sharif - Afeganist\u00E3o ");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("New menu item");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://binged.it/2q7Jxyu");
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
		textArea.setText("Mazar-e-Sharif que em uma tradu\u00E7\u00E3o direta seria \"O t\u00FAmulo do magn\u00EDfico\", \u00E9 a terceira maior cidade do Afeganist\u00E3o, com uma estimativa da popula\u00E7\u00E3o segundo a  ONU-Habitat de 2015 entre 577.500 e 693.000 habitantes. \u00E9 a terceira maior cidade do Afeganist\u00E3o e tem uma alta concentra\u00E7\u00E3o de material particulado e produtos qu\u00EDmicos que fazem com que o ar um dos piores da regi\u00E3o.\r\nA cidade com seus 647,500 Km\u00B2 t\u00EAm a maior porcentagem de terra constru\u00EDda (91%), e seus aredores tem sido historicamente parte do Maior Khorasan.\r\nDentre seus principais problemas, temos os anos de conflito, as tempestades de areia causadas pelo clima semi\u00E1rido, a pobreza, e a polui\u00E7\u00E3o das ind\u00FAstrias na cidade.\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
