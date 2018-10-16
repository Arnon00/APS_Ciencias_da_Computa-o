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

public class TelaDesmatamento extends JFrame {

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
					TelaDesmatamento frame = new TelaDesmatamento();
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
	public TelaDesmatamento() {
	
		setTitle("Desmatamento");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("Desmatamento.\r\n\r\n\r\nA organiza\u00E7\u00E3o ambientalista WWF lan\u00E7ou, na Fran\u00E7a, uma nova campanha publicit\u00E1ria \r\nque destaca a rela\u00E7\u00E3o entre o desmatamento e o sumi\u00E7o de algumas esp\u00E9cies animais. \r\n\r\nA imagem \u00E9 uma floresta verde em que os galhos e as plantas escondem as formas dos \r\nbichos amea\u00E7ados de extin\u00E7\u00E3o. Os ativistas pretendem, dessa forma, lembrar que o \r\ndesmatamento florestal \u00E9 uma das causas do desaparecimento de esp\u00E9cies. O espectador \r\ndeve encontrar os animais escondidos em meio \u00E0s folhagens, como em um jogo de sete \r\nerros. Os contornos camuflados, nos troncos e folhas, representam algumas esp\u00E9cies \r\namea\u00E7adas que s\u00E3o: um elefante, uma pregui\u00E7a, um coala, uma pantera, um orangotango, um tigre, um tucano, \r\num crocodilo, um iguana, um chimpanz\u00E9, um papagaio, um javali e uma jiboia. \r\n\r\nOs cartazes fazem parte de uma campanha da WWF que alerta para os \r\ndanos causados pelo desmatamento e visa conduzir o p\u00FAblico para a reflex\u00E3o do tema. \r\nMarine Garcia, uma das criadoras da campanha na ag\u00EAncia Marcel, afirmou \r\nque quatro artistas trabalharam meticulosamente no cartaz para tentar \r\nesconder os animais sem fazer com que seus contornos se perdessem totalmente e, \r\ntamb\u00E9m, para n\u00E3o deixar t\u00E3o f\u00E1cil ao espectador destacar os animais da \r\nfigura. As imagens foram espalhadas no sistema de metr\u00F4 de Paris. \r\n\r\nConsumo consciente\r\n\r\nDesmatamento \u00E9 uma medida irrespons\u00E1vel que interfere no consumo consciente. No momento da compra de produtos de papel, verifique se eles s\u00E3o certificados por institui\u00E7\u00F5es que controlam a extra\u00E7\u00E3o vegetal.\r\n\r\n**Veja abaixo a\u00E7\u00F5es de como evitar o desmatamento:\r\n\r\n*Exigir o selo FSC (Conselho de Manejo Florestal) ao adquirir produtos como madeira ou papel; esse selo \u00E9 fornecido somente \u00E0s empresas que fazem o corte consciente de \u00E1rvores, sua mat\u00E9ria prima \u00E9 derivada somente de florestas manejadas;Reduzir o consumo de carne vermelha.\r\n\r\n*N\u00E3o consumir produtos feitos com couro animal, dando prefer\u00EAncia ao couro ecol\u00F3gico;\r\n\r\n*Reduzir o consumo de papel; sendo seu uso inevit\u00E1vel, opte por papel reciclado;\r\n\r\n*N\u00E3o adquira madeira ilegal, s\u00F3 h\u00E1 oferta onde h\u00E1 procura;\r\n\r\n*N\u00E3o compre im\u00F3veis em \u00E1reas protegidas ecologicamente;\r\n\r\n*\u00C9 de responsabilidade do governo fiscalizar as \u00E1reas com ocupa\u00E7\u00E3o ilegal de terras, evitando seu desmatamento clandestino;\r\n\r\n*Abolir o avan\u00E7o de novos pastos sobre florestas;\r\n\r\n*Proteger e garantir os direitos e as terras dos \u00EDndios.\r\n");
		contentPane.add(textArea, BorderLayout.CENTER);
		
		JLabel link = new JLabel("Clique aqui para acessar o site que contém essas informações.");
		link.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				URI link = null;
				try {
					link = new URI("http://www.ecycle.com.br/component/content/article/35-atitude/760--campanha-contra-o-desmatamento-.html");
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
