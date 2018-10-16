package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaSustentabilidade extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSustentabilidade frame = new TelaSustentabilidade();
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
	public TelaSustentabilidade() {
		
		setTitle("Sustentabilidade");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("Sustentabilidade.\r\n\r\n\r\nSegundo a Wikip\u00E9dia: \u201Csustentabilidade \u00E9 um conceito sist\u00EAmico; relacionado \r\ncom a continuidade dos aspectos econ\u00F4micos, sociais, culturais e ambientais da sociedade humana\u201D. \r\nPodemos dizer \u201Cna pr\u00E1tica\u201D, que esse conceito de sustentabilidade representa promover a explora\u00E7\u00E3o \r\nde \u00E1reas ou o uso de recursos planet\u00E1rios (naturais ou n\u00E3o) de forma a prejudicar o menos poss\u00EDvel  \r\no equil\u00EDbrio entre o meio ambiente e as comunidades humanas e toda a biosfera que dele dependem para \r\nexistir. Pode parecer um conceito dif\u00EDcil de ser implementado e, em muitos casos, economicamente \r\ninvi\u00E1vel. No entanto, n\u00E3o \u00E9 bem assim. Mesmo nas atividades humanas altamente impactantes no meio \r\nambiente como a minera\u00E7\u00E3o; a extra\u00E7\u00E3o vegetal, a agricultura em larga escala; a fabrica\u00E7\u00E3o de papel \r\ne celulose e todas as outras; a aplica\u00E7\u00E3o de pr\u00E1ticas sustent\u00E1veis nesses empreendimentos; revelou-se \r\neconomicamente vi\u00E1vel e em muitos deles trouxe um f\u00F4lego financeiro extra.\r\n\r\nDe uma forma simples, podemos afirmar que garantir a sustentabilidade de um projeto ou de uma regi\u00E3o \r\ndeterminada; \u00E9 dar garantias de que mesmo explorada essa \u00E1rea continuar\u00E1 a prover recursos e bem estar \r\necon\u00F4mico e social para as comunidades que nela vivem por muitas e muitas gera\u00E7\u00F5es. Mantendo a for\u00E7a \r\nvital e a capacidade de regenerar-se mesmo diante da a\u00E7\u00E3o cont\u00EDnua e da presen\u00E7a atuante da m\u00E3o humana.\r\n");
		getContentPane().add(textArea, BorderLayout.CENTER);
		
		JLabel link = new JLabel("Clique aqui para acessar o site que contém essas informações.");
		link.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				URI link = null;
				try {
					link = new URI("http://www.atitudessustentaveis.com.br/sustentabilidade/sustentabilidade/");
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    try {
					Desktop.getDesktop().browse(link);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(link, BorderLayout.SOUTH);
	
		
	
		
		
		
		
	}
}
