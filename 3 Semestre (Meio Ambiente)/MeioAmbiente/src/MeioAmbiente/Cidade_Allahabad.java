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

public class Cidade_Allahabad extends JFrame {

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
					Cidade_Allahabad frame = new Cidade_Allahabad();
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
	public Cidade_Allahabad() {
		
		setTitle("Allahabad - India");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				
				URI link = new URI("https://binged.it/2r690Wb");
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
		textArea.setText("Com 70,5 km\u00B2 Allahabad e mais uma das muitas cidades da \u00EDndia com uma lista consider\u00E1vel de problemas, se localiza no estado indiano de Uttar Pradesh e \u00E9 a sede administrativa do distrito de Allahabad aqui cerca de 1.117 milh\u00E3o de habitantes dividem o espa\u00E7o uns com os outros. A cidade ainda esta no encontro de dois rios muito importantes para pa\u00EDs o Ganga , Yamuna e o Sarasvati.\r\n Referente a uma quest\u00E3o de qualidade do ar, esta cidade n\u00E3o est\u00E1 muito atr\u00E1s de Gwalior com 317mg por metro c\u00FAbico. Como consequ\u00EAncia disso, os riscos para a sa\u00FAde da popula\u00E7\u00E3o t\u00EAm aumentado com uma maior incid\u00EAncia de alergias \u00E0 poeira, asma e c\u00E2ncer de pulm\u00E3o na cidade.\r\nApesar disso, esse n\u00E3o \u00E9 o principal problema, temos o rio Ganga, tamb\u00E9m conhecido como Ganges, o rio mais importante da \u00EDndia, e que atualmente, esta com n\u00EDveis extrapolados de polui\u00E7\u00E3o, nas aguas encontrasse de quase tudo, desde descartes industrias, materiais altamente t\u00F3xicos, e dejetos humanos.\r\nEm um r\u00E1pida viagem rio abaixo pelo Gangotri (a geleira de onde surge o Ganges), a pessoa precisa estar ciente que encontra algumas surpresas muito desagrad\u00E1veis, incluindo o completo desaparecimento do rio por v\u00E1rios quil\u00F4metros em alguns lugares. \r\nMais abaixo h\u00E1 barragens no rio em lugares como Chilla, Haridwar, Narora, Kanpur e Farakka. Mas ainda tem mais, cada um dos 17 principais afluentes do rio foi represado v\u00E1rias vezes. Cada um desses projetos de hidrel\u00E9tricas e barragens causou uma cadeia completa de adversidades significativas ao rio.\r\nEntretanto, na descri\u00E7\u00E3o da ANBHG sobre o problema, n\u00E3o h\u00E1 qualquer men\u00E7\u00E3o desses projetos. Seu \u00FAnico foco (e o nosso) \u00E9 a polui\u00E7\u00E3o: \u201CNa bacia do Ganges, cerca de 12 milh\u00F5es de litros por dia (mld) de esgoto s\u00E3o gerados, para os quais atualmente h\u00E1 capacidade de tratamento para apenas 4.000 mld. Aproximadamente 8.000 mld de esgoto s\u00E3o despejados no ramo principal do rio Ganges.\r\nA contribui\u00E7\u00E3o da polui\u00E7\u00E3o industrial \u00E9 de 20%, mas devido a sua natureza t\u00F3xica e n\u00E3o biodegrad\u00E1vel o impacto \u00E9 muito mais perigoso.\r\nE como j\u00E1 e de se imaginar, toda essa polu\u00E7\u00E3o na agua, acaba voltando de alguma forma para a popula\u00E7\u00E3o, j\u00E1 que o rio, al\u00E9m de ser fonte de agua, e tamb\u00E9m o rio sagrado dos indianos, eles, em certas \u00E9pocas do ano comemoram festas e rituais que podem envolver se \u201CLavar\u201D nas aguas polu\u00EDdas, como forma de se purificar dos seus pecados (E consequentemente, se purificaram da sua sa\u00FAde tamb\u00E9m).\r\n");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
