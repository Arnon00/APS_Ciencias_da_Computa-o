package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;


public class Pais_Brasil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pais_Brasil frame = new Pais_Brasil();
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
	public Pais_Brasil() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pais_Brasil.class.getResource("/MeioAmbiente/resTelas/Brazil.png")));
		setTitle("Brasil");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("Apesar de n\u00E3o possir nenhuma cidade pelo menos nos top 100\r\ndas mais poluidas no mundo, "
				+ "o brasil n\u00E3o esta em uma situa\u00E7\u00E3o onde possa \r\nse orgulhar, pois consta com 40 cidades "
				+ "na lista das mais poluidas do mundo.\t\r\nEm S\u00E3o paulo por exemplo, segundo a pesquisas da OMS, \r\na "
				+ "qualidade do ar \u00E9 duas vezes pior que o recomendado para a sa\u00FAde dos habitantes.\r\n\r\nO rio de "
				+ ", pela segunda vez seguida consegue ficar na frente da capital paulista \r\nem niveis de palui\u00E7ao do ar "
				+ "elevados O primeiro levantamento, de 2011, \r\nchegou a ser contestado por autoridades ambientais brasileiras, "
				+ "e do estado, \r\nmas com a nova an\u00E1lise, a tend\u00EAncia de piora acabou por se confirmar.\r\n\r\nMas "
				+ "isso n\u00E3o e motivo para se sentir de alguma forma aliviado por morar em s\u00E3o paulo, \r\nporque \u00E9 "
				+ "daqui que a cidade mais poluida do brasil esta.\r\n\r\nEstamos falando de Santa Gertrudes, que com pouco mais "
				+ "de 24.272 habitantes, e 98,291 Km\u00B2 \r\nocupa a posi\u00E7\u00E3o de numero 175\u00AA das mais polu\u00EDda "
				+ "do mundo - culpa de um polo industrial de \r\nprodu\u00E7\u00E3o de cer\u00E2mica, o principal emissor de "
				+ "poluentes da regi\u00E3o. \r\nOutras quatro cidades brasileiras apresentam mais polui\u00E7\u00E3o do que o "
				+ "recomendado pela OMS s\u00E3o.\r\n\r\n\r\n262\u00BA Rio de Janeiro-RJ\r\n388\u00BA Belo Horizonte-MG\r\n408\u00BA "
				+ "Rio Claro-SP\r\n455\u00BA Limeira-SP\r\n464\u00BA Colombo-PR\r\n\r\nOutras posi\u00E7oes da lista s\u00E3o:\r\n\r\n651\u00BA S\u00E3o "
				+ "Paulo\r\n741\u00BA Curitiba \r\n794\u00BA Vit\u00F3ria\r\n1247\u00BA Salvador\r\n\r\nUma coisa a se atentar no entanto, \u00E9 que "
				+ "pouquisimas cidades brasileiras tem esta\u00E7oes de \r\nmonitoramento da qualidade do ar - apenas 40 entre as mais de 5 mil cidades "
				+ "no pa\u00EDs. ");
		getContentPane().add(textArea, BorderLayout.CENTER);
	
		
	


	}

}
