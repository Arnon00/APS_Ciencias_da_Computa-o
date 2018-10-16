package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TelaConsumo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsumo frame = new TelaConsumo();
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
	public TelaConsumo() {
		
		setTitle("Consumo Verde");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("\nConsumo verde"
				+ "\n\nConsumo verde é aquele em que o consumidor, além de buscar melhor qualidade e preço, inclui em"
				+ "\nseu poder de escolha, a variável ambiental, dando preferência a produtos e serviços que não agridam"
				+ "\no meio ambiente, tanto na produção, quanto na distribuição, no consumo e no descarte final."
				+ "\n\nEsta estratégia tem alguns benefícios importantes, como o fato de os cidadãos comuns sentirem,"
				+ "\nna prática, que podem ajudar a reduzir os problemas ambientais. Além disso, os consumidores verdes"
				+ "\nsentem-se parte de um grupo crescente de pessoas preocupadas com o impacto ambiental de suas escolhas."
				+ "\nMas a estratégia de consumo verde tem algumas limitações. Os consumidores são estimulados"
				+ "\na trocar uma marca X por uma marca Y, para que os produtores percebam que suas escolhas mudaram."
				+ "\n\nA possibilidade de escolha, portanto, acabou se resumindo a diferentes marcas e não entre consumismo"
				+ "\ne não-consumismo. Muitas empresas passaram a se interessar em mapear o poder de compra de"
				+ "\npessoas com alto poder aquisitivo interessadas em um estilo de vida de baixo impacto ambiental,"
				+ "\npercebendo-as como um novo nicho de mercado. Assim, a necessidade de redução e modificação"
				+ "\ndos padrões de consumo foi substituída pelo simples “esverdeamento” dos produtos e serviços."
				+ "\nAlém disso, o consumo verde atacaria somente uma parte do problema – a tecnologia – enfatizando"
				+ "\no desenvolvimento de produtos verdes para uma parcela da sociedade, enquanto os pobres ficam"
				+ "\ncom produtos inferiores e com um nível de consumo abaixo da satisfação de suas necessidades"
				+ "\nbásicas. O tema da desigualdade no acesso aos bens ambientais desapareceu completamente dos"
				+ "\ndebates e propostas de consumo verde . ");
		getContentPane().add(textArea, BorderLayout.CENTER);
		
	    JLabel link = new JLabel("Clique aqui para acessar o site que contém essas informações.");
		link.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
					URI link = null;
					try {
						link = new URI("http://portal.mec.gov.br/dmdocuments/publicacao8.pdf");
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
