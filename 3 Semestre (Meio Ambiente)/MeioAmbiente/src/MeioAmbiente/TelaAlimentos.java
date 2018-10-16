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

public class TelaAlimentos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlimentos frame = new TelaAlimentos();
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
	public TelaAlimentos() {
		
		setTitle("Alimentos");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("\nComer é um ato agrícola, disse um fazendeiro e economista americano, "
				+ "mas é também um ato ecológico e um ato político, por Jaqueline B. Ramos* \n\nQuando "
				+ "falamos em sustentabilidade, pensamos em ações como não poluir, preservar áreas naturais, "
				+ "\nreciclar lixo, economizar água, dar preferência às fontes alternativas de energia etc. "
				+ "\nMas raramente nos lembramos de relacionar uma de nossas atividades mais básicas com impactos "
				+ "\nnegativos no meio ambiente: o ato de se alimentar. Nos primórdios da humanidade, a alimentação "
				+ "\nera baseada em frutas, raízes, carnes de animais caçados e outras fontes que não modificavam "
				+ "\nsignificativamente a natureza (pelo contrário, tudo fazia parte de um ciclo natural). Com o "
				+ "\nadvento da agricultura e da domesticação de animais, há cerca de 12 mil anos, deu-se início à "
				+ "\nprodução de alimentos. \n\nA passagem do estado nômade para a fixação na terra marcou o início do "
				+ "\nque chamamos “desenvolvimento da humanidade”. Com o passar dos séculos, o homem foi criando "
				+ "\nnovas formas de manejo do solo e as populações concentradas nas cidades cresceram em ritmo "
				+ "\nprogressivo, aumentando a demanda por alimentos. Até que a chegada da Era Industrial, no final "
				+ "\ndo século XVIII, intensificou a aglomeração de pessoas no ambiente urbano, colocando fim, "
				+ "\ndefinitivamente, na ligação direta que o ser humano tinha com a natureza para a obtenção de "
				+ "\nalimentos. O resultado disso tudo é uma agricultura transformada em indústria que passou a "
				+ "\nutilizar métodos artificiais, como fertilizantes e pesticidas químicos, irrigação, manipulação "
				+ "\ngenética e uso de hormônios em animais, visando sempre o aumento da produção (e o lucro). "
				+ "\nSem contar a dependência por combustíveis fósseis, inclusive no transporte, por longas distâncias, "
				+ "\ndos alimentos. É a cadeia alimentar industrial. \n\nSe por um lado todo esse advento é considerado "
				+ "positivo, sendo denominado \ncomo desenvolvimento ou modernidade, por outro é fato que o modelo de "
				+ "\nalimentação industrializado é um forte candidato a causar sérios danos à conservação do meio "
				+ "\nambiente e também à saúde do homem. E por incrível que pareça, a maior parte das pessoas atualmente "
				+ "\nnão se dá conta disso. A origem dos alimentos que consome simplesmente não faz parte da sua lista "
				+ "\nde prioridades e a alimentação, o ato mais corriqueiro e básico do dia-a-dia, não é visto sob a "
				+ "\nperspectiva ambiental ou da sustentabilidade."
				+ "\n\nO que o consumidor pode fazer em prol de uma alimentação sustentável \n\n# Informar-se sobre a importância"
				+ " da agricultura sustentável e seus benefícios para a produção de alimentos, inclusive em relação à "
				+ "saúde dos indivíduos e ambientes. # Apoiar propostas de produção regional, especialmente a familiar "
				+ "e a associada, com o objetivo de fortalecer a segurança alimentar local e reduzir o desperdício de "
				+ "energia no transporte. \n\n# Exigir que os produtores respeitem as leis ambientais, assim como a legislação "
				+ "trabalhista, e que utilizem métodos menos impactantes ao meio ambiente, adquirindo produtos elaborados "
				+ "com este diferencial. \n\n# Demandar que os vendedores de alimentos estimulem a produção ecológica, inclusive "
				+ "solicitando a certificação dos produtores por um organismo independente, para que possa ter certeza de "
				+ "que os mesmos cumprem todas as exigências ambientais. \n\n# Organizar-se em cooperativas de consumo que "
				+ "estimulem a produção sustentável local e regional.   \n\nFontes: Cartilha Alimentos IDEC, livro “Dilema do "
				+ "Onívoro” (editora Intrínseca) e Sociedade Vegeteriana Brasileira (SVB); Cartilha Alimentos (IDEC); "
				+ "\n\nInformativo do Instituto Ecológico Aqualung n. 78 -março/abril 2008. (*) Jaqueline B. Ramos é jornalista "
				+ "e editora do blog Ambiente-se. Este artigo foi publicado originalmente na Agência Envolverde.");
		getContentPane().add(textArea, BorderLayout.CENTER);
		
		JLabel lblink = new JLabel("Clique aqui para acessar o site que contém essas infomrações.");
		lblink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				URI link = null;
				try {
					link = new URI("http://www.akatu.org.br/Temas/Alimentos/Posts/Os-impactos-da-alimentacao-para-o-meio-ambiente");
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
		contentPane.add(lblink, BorderLayout.SOUTH);
	}

}
