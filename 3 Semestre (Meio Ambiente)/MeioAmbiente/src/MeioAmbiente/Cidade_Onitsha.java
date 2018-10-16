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

public class Cidade_Onitsha extends JFrame {

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
					Cidade_Onitsha frame = new Cidade_Onitsha();
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
	public Cidade_Onitsha() {
		
		setTitle("Onitsha - Nigeria");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://binged.it/2r6k1GZ");
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
		textArea.setText("Com apenas 52 km\u00B2 Onitsha e uma cidade do estado de anambra, e fica as margens do rio Niger, com mais de 1 milh\u00E3o de habitantes, especialistas dizem que esse e um exemplo dos perigos da r\u00E1pida urbaniza\u00E7\u00E3o sem planejamento;\r\nDe uma cidade portu\u00E1ria tropical, Onitsha mais que dobrou de tamanho nos \u00FAltimos anos, e com frequ\u00EAncia e assolada por uma nuvem negra de gases e polui\u00E7\u00E3o. \r\n Dentre todos os problemas que encontramos nesta cidade, dois de contamina\u00E7\u00F5es ambientais se destacam pela gravidade, ou amplitude.\r\nPela gravide, temos aqui a polui\u00E7\u00E3o do ar, que chegou a n\u00EDveis t\u00E3o alarmantes que Onitsha foi considerada para OMS como a cidade mais polu\u00EDda do mundo (Titulo que tamb\u00E9m pode ser reivindicado por uma cidade na \u00EDndia, depende da maneira como as medi\u00E7\u00F5es s\u00E3o realizadas)\r\n A maior parte dela vem de ve\u00EDculos velhos, como barcos, carros, caminh\u00F5es e \u00F4nibus, que em sua grande maioria queima diesel.  Outra parte da falta de um sistema apropriado de incinera\u00E7\u00E3o, la e muito comum incinerar o lixo, ou que se ateiem fogo aos aterros sanit\u00E1rios. \r\nEm um recente estudo sobre a polui\u00E7\u00E3o da \u00E1gua, foram encontrados mais de 100 postos de gasolina na cidade, A maior parte deles vendendo combust\u00EDvel de baixa qualidade, dezenas de lixeiras n\u00E3o regulamentadas, grandes derrames de combust\u00EDveis, e n\u00EDveis elevados de ars\u00EAnio, merc\u00FArio, chumbo, cobre e ferro em sua \u00E1gua. Muitas ind\u00FAstrias de metal, hospitais e oficinas particulares da cidade foram apontadas como argentes.\r\nOnitsha gera por metro c\u00FAbico, 600 microgramas de material particulado PM10s, 30 vezes acima do limite definido como seguro pela organiza\u00E7\u00E3o mundial de sa\u00FAde (OMS)\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
