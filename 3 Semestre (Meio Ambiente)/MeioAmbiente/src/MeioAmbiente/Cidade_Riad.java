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

public class Cidade_Riad extends JFrame {

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
					Cidade_Riad frame = new Cidade_Riad();
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
	public Cidade_Riad() {
		
		setTitle("Riad - Arabia saudita ");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://binged.it/2q7lvUf");
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
		textArea.setText("Riad \u00E9 uma das 33 cidades da Ar\u00E1bia Saudita \u00E9, a capital e tamb\u00E9m a cidade mais populosa da mesma com 1.554 Km\u00B2, tem cerca de 6,506 milh\u00F5es de habitantes (estimativa 2016) \r\n\r\nalto n\u00EDvel de material particulado t\u00F3xico no ar e observ\u00E1vel Segundo os estudos da OMS, 98% das cidades com mais de 100 mil habitantes em pa\u00EDses de renda baixa ou m\u00E9dia n\u00E3o respeitam as diretrizes da OMS sobre a qualidade do ar. Nos pa\u00EDses de renda alta, este percentual cai para 56%.\r\nA contamina\u00E7\u00E3o do ar, devido a concentra\u00E7\u00F5es elevadas de pequenas part\u00EDculas (MP10) e de part\u00EDculas finas (MP2,5), que cont\u00EAm sulfato, nitratos e carbono negro, representa o principal risco ambiental para a sa\u00FAde.\r\nA polui\u00E7\u00E3o aumenta o risco de acidente vascular cerebral, de cardiopatia, de c\u00E2ncer de pulm\u00E3o e de doen\u00E7as respirat\u00F3rias agudas, especialmente asma, e provoca mais de tr\u00EAs milh\u00F5es de mortes prematuras ao ano no mundo, destacou a OMS.\r\nO trafico intenso de ve\u00EDculos ajuda a agravar a situa\u00E7\u00E3o de degrada\u00E7\u00E3o do ar respir\u00E1vel, juntamente com o descarte incorreto de lixo, e restos industrias \r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
