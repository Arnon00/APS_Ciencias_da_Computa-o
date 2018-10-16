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

public class Cidade_Cabul extends JFrame {

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
					Cidade_Cabul frame = new Cidade_Cabul();
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
	public Cidade_Cabul() {
		
		setTitle("Cabul - Afeganist\u00E3o");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("Interatividade");
		menuBar.add(Menu);
		
		JMenuItem MenuItem = new JMenuItem("Mapa Online");
		MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				
				URI link = new URI("https://binged.it/2r6klWb");
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
		textArea.setText("Uma cidade com pouco mais de 275km\u00B2 e tantos problemas que nem algumas com 10x esse tamanho possui, \r\na cidade localizada regi\u00E3o leste do territ\u00F3rio do Afeganist\u00E3o possui 2,7 milh\u00F5es de habitantes (segundo estimativa)\r\n\r\nDe Tantos problemas que assolam essa codade a guerra e o pior deles, frequentemente a cidade e atacada ou esta \r\nno centro de algum comflito, porem nem de lonje, chega a crise que encontramos atualmente em Damasco.\r\n\r\nAlem disso, a cidade tem seria problemas habientais, tais como, polui\u00E7\u00E3o do solo, da agua e at\u00E9 do ar, que fazem \r\nboa parte da sua popola\u00E7\u00E3o desenvolver serias doen\u00E7as ligadas diretamente a qualidade da vida neste local,\r\nla, menos de 5% te acesso a saneamento basico, oque acaba gerando grandes esgotos a ceu aberto, muitas vezes, \r\nos detritos n\u00E3o v\u00E3o muito longe, assim, esgoto e outros tipos de sujeira acabam indo parar no Rio Cabul.\r\nDurante os dias quentes e secos tipicos do clima desertico, todo esse material seca e passa a fazer parte da poeira que toma conta da cidade.\r\n\r\nE como voc\u00EA ja pode ter percebido, grande parte da popula\u00E7\u00E3o e pobre, ou muito pobre, e isso causa um grande impacto\r\ndurante o inverno, porque o principal meio de aquecer as casas durante essa epoca do ano, \u00E9 com o \"bukhara\", uma vers\u00E3o afeg\u00E3 dos fornos de combust\u00EDvel m\u00FAltiplo\r\nde queima de combustiveis, que por muitas vezes s\u00E3o esterco de animais ou carv\u00E3o, mas pelo esterco ser o combustivel \r\nmais barato, e comunmente o mais usado. Inclusive esses combustives s\u00E3o usados tambem para o cozimento e preparo de alimentos.\r\n\r\nAssim sendo, o ar e poluido por praticamente todo o ano, com particulas fecais e outros residuos que fazem mal ao ser humano \r\n\r\nOutra coisa que agrava mais a situa\u00E7\u00E3o, e o numero de pessoas na cidade, originalmente, ela foi construida para apenas\r\n500mil, porem, ja chegou abrigar at\u00E9 5 milhoes durante os tempos de guerra     \r\n\r\nCuriosamente em 2008 uma equipe da ONU fez varios testes no ar da cidade, e encontrou diversas raz\u00F5es para se preocupar, \r\nmas todas elas eram o tipo de problema que se esperaria de uma cidade com tr\u00E2nsito ca\u00F3tico: muito di\u00F3xido de enxofre e \u00F3xidos nitrosos.\r\nAl\u00E9m de uma alta concentra\u00E7\u00E3o de part\u00EDculas conhecidas como PM10, n\u00E3o encontraram nenhum uma taxa alta de materia fecal no ar da cidade.\r\n");
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
