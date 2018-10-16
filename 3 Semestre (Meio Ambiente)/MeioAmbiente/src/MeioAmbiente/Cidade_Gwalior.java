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

public class Cidade_Gwalior extends JFrame {

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
					Cidade_Gwalior frame = new Cidade_Gwalior();
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
	public Cidade_Gwalior() {
		
		setTitle("Gwalior - India ");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://binged.it/2r6jK7f");
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
		textArea.setText("Gwalior \u00E9 uma cidade do estado de Madhya Pradesh, na \u00CDndia. Localiza-se no centro do pa\u00EDs. Tem cerca de 917 mil habitantes residindo em suas fronteiras de 780 Km\u00B2 .\r\nAlem de ser a 10\u00AA cidade mais polu\u00EDda do mundo , Gwalior tamb\u00E9m \u00E9 a mais polu\u00EDda da \u00EDndia \r\n A contagem de material particulado no ar da cidade chega a 329mg por metro c\u00FAbico, muito al\u00E9m da recomenda\u00E7\u00E3o da Organiza\u00E7\u00E3o Mundial da Sa\u00FAde (OMS) de 60mg. A grande quantidade de ve\u00EDculos com emiss\u00F5es descontroladas e a alta densidade populacional est\u00E3o entre as causas do aumento da polui\u00E7\u00E3o segundo relat\u00F3rios. \r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
