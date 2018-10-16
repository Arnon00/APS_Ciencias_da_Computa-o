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

public class Cidade_Rawalpindi extends JFrame {

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
					Cidade_Rawalpindi frame = new Cidade_Rawalpindi();
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
	public Cidade_Rawalpindi() {
		
		setTitle("Rawalpindi - Paquist\u00E3o\t");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					URI link = new URI("https://binged.it/2r6nt4A");
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
		textArea.setText("Rawalpindi encontrada no estado de Punjab, tem 259 km\u00B2 e com 3,199 milh\u00F5es de moradores,  tem a 4\u00AA maior popula\u00E7\u00E3o do Paquist\u00E3o, e a \u00E9 a 3\u00AA maior em \u00E1rea.\r\nAqui a pior polui\u00E7\u00E3o encontrada e a do ar, como e comum nos pa\u00EDses emergentes que se encontram em clima semi-arido , grandes \u00E1reas industriais, tempestades de areia, combust\u00EDveis queimando em carros, e outros meios de transporte, e pronto.. Temos a 4 cidade mais polu\u00EDda do mundo;\r\nClaro que o problema n\u00E3o \u00E9 s\u00F3 esse, como em muitos pa\u00EDses do oriente m\u00E9dio, grande parte da popula\u00E7\u00E3o na pobreza, e um numero alarmante de habitantes tamb\u00E9m entram no computo final para o acrescimento de varias formas de polui\u00E7\u00E3o ambiental;\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
