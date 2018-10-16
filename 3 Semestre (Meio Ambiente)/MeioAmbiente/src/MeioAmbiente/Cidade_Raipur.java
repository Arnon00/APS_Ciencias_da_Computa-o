package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.Toolkit;
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

public class Cidade_Raipur extends JFrame {

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
					Cidade_Raipur frame = new Cidade_Raipur();
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
	public Cidade_Raipur() {
		
		setTitle("Raipur - India ");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://binged.it/2r5ZvGI");
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
		textArea.setText("Raipur \u00E9 uma das tr\u00EAs cidades da \u00EDndia na lista das 20 mais polu\u00EDdas do planeta , a cidade e a capital do estado de Chhattisgarh, e esta localizada na \u00EDndia central, com pouco apenas 226 km\u00B2 abriga cerca de 1.125 milh\u00F5es de habitantes  e acumula problemas.\r\nO maior deles, a polui\u00E7\u00E3o do ar Gra\u00E7as a sua orienta\u00E7\u00E3o industrial, que se baseia em min\u00E9rio, combust\u00EDvel, carv\u00E3o e a\u00E7o, isso faz da cidade uma das lideres mundiais no comercio de ferro, mas isso acaba saindo caro para a popula\u00E7\u00E3o .\r\nEm 2013, a universidade de Ravi fez uma pesquisa com alguns apontamentos preocupantes sobre as origens da deteriora\u00E7\u00E3o do ar. \r\nSegundo ela:\r\n- As ind\u00FAstrias da cidade s\u00E3o respons\u00E1veis por gerarem de 27% a 30% das emiss\u00F5es poluentes.\r\n - O trafico pesado da cidade, t\u00EDpico das cidades da \u00EDndia, e diretamente respons\u00E1vel  pela produ\u00E7\u00E3o de 40% a 45%  de poluente.\r\n- J\u00E1 a constru\u00E7\u00E3o civil fica com cerca de 5% das emiss\u00F5es.\r\n- E tamb\u00E9m e atribu\u00EDdo ao solo cerca de 8%, pode parecer estranho, mas temos que lembrar que como boa parte da popula\u00E7\u00E3o e pobre e acaba n\u00E3o tendo acesso ao saneamento, esgotos a c\u00E9u aberto s\u00E3o encontrados, e os dejetos secos, podem ser carregados pelos ventos.\r\n");
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
