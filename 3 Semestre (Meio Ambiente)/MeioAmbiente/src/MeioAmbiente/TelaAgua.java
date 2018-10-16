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

public class TelaAgua extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAgua frame = new TelaAgua();
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
	public TelaAgua() {
		
		setTitle("Água");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("Agua. Um recurso cada vez mais ameaçado !"
				+ "\n\nA água é um recurso natural essencial para a sobrevivência de todas as espécies que habitam a Terra."
				+ "\nNo organismo humano a água atua, entre outras funções, como veículo para a troca de substâncias e para"
				+ "\na manutenção da temperatura, representando cerca de 70% de sua massa corporal. Além disso, é considerada"
				+ "\nsolvente universal e é uma das poucas substâncias que encontramos nos três estados físicos: gasoso,"
				+ "\nlíquido e sólido. É impossível imaginar como seria o nosso dia-a-dia sem ela."
				+ "\n\nOs alimentos que ingerimos dependem diretamente da água para a sua produção. Necessitamos"
				+ "\nda água também para a higiene pessoal, para lavar roupas e utensílios e para a manutenção da limpeza"
				+ "\nde nossas habitações. Ela é essencial na produção de energia elétrica, na limpeza das cidades, na construção"
				+ "\nde obras, no combate a incêndios e na irrigação de jardins, entre outros. As indústrias utilizam grandes"
				+ "\nquantidades de água, seja como matéria-prima, seja na remoção de impurezas, na geração de vapor"
				+ "\ne na refrigeração. Dentre todas as nossas atividades, porém, é a agricultura aquela que mais consome água –"
				+ "\ncerca de 70% de toda a água consumida no planeta é utilizada pela irrigação (veja o quadro)."
				+ "\n\nA ameaça da falta de água, em níveis que podem até mesmo inviabilizar a nossa existência, pode"
				+ "\nparecer exagero, mas não é. Os efeitos na qualidade e na quantidade da água disponível, relacionados"
				+ "\ncom o rápido crescimento da população mundial e com a concentração dessa população em megalópoles,"
				+ "\njá são evidentes em várias partes do mundo. Dados do Fundo das Nações Unidas para a Infância (Unicef )"
				+ "\ne da Organização Mundial da Saúde (OMS) revelam que quase metade da população mundial (2,6 bilhões"
				+ "\nde pessoas) não conta com serviço de saneamento básico e que uma em cada seis pessoas (cerca de1,1 bilhão"
				+ "\nde pessoas) ainda não possui sistema de abastecimento de água adequado. As projeções da Organização das Nações "
				+ "\nUnidas indicam que, se a tendência continuar, em 2050 mais de 45% da população"
				+ "\nmundial estará vivendo em países que não poderão garantir a cota diária mínima de 50 litros de"
				+ "\nágua por pessoa. Com base nestes dados, em 2000, os 189 países membros da ONU assumiram como uma"
				+ "\ndas metas de desenvolvimento do milênio reduzir à metade a quantidade de pessoas que não têm acesso"
				+ "\nà água potável e saneamento básico até 2015."
				+ "\n\nMesmo países que dispõem de recursos hídricos abundantes, como o Brasil, não estão livres da"
				+ "\nameaça de uma crise. A disponibilidade varia muito de uma região para outra. Além disso, nossas reservas"
				+ "\nde água potável estão diminuindo. Entre as principais causas da diminuição da água potável estão"
				+ "\no crescente aumento do consumo, o desperdício e a poluição das águas superficiais e subterrâneas por"
				+ "\nesgotos domésticos e resíduos tóxicos provenientes da indústria e da agricultura."
				+ "\nNeste capítulo do Manual de Educação para o Consumo Sustentável se discute porque é tão importante"
				+ "\ne inadiável a conservação dos recursos hídricos do planeta e quais as ações necessárias para garantir o seu"
				+ "\nconsumo sustentável. A partir das informações contidas neste manual, você vai poder mostrar aos seus"
				+ "\nalunos que, com pequenas mudanças de hábitos, todos podemos contribuir para conservar nossas águas,"
				+ "\naprendendo a controlar a poluição e a consumir sem desperdício."
				+ "\n\nO que pode ser feito"
				+ "\n\nAções voltadas para a redução do desperdício e para o controle da poluição da água."
				+ "\n\n1. Para reduzir o desperdício de água:"
				+ "\n\n• Diminuir o desperdício de água na produção agrícola e industrial, a partir do controle dos volumes"
				+ "\nde água utilizados nos processos industriais, da introdução de técnicas de reuso de água e da utilização"
				+ "\nde equipamentos e métodos de irrigação poupadores de água;"
				+ "\n\n• Reduzir o consumo doméstico de água a partir da incorporação do conceito de consumo sustentável"
				+ "\nde água no nosso dia-a dia. Para tanto, é necessário que cada um de nós promova mudanças"
				+ "\nde hábitos (bastante arraigados e bastante conhecidos por todos), envolvendo, por exemplo, o tempo"
				+ "\nnecessário para tomar banho, o costume de escovar os dentes com a torneira aberta, o uso de"
				+ "\nmangueira para lavar casas e carros etc.."
				+ "\n\n• Reduzir o desperdício de água tratada nos sistemas de abastecimento de água, recuperando"
				+ "\nos sistemas antigos e introduzindo medidas de manejo que tornem os sistemas mais eficientes;"
				+ "\n\n2. Para reduzir a poluição decorrente das atividades agrícolas:"
				+ "\n\n• reduzir o uso de agrotóxicos e fertilizantes na agricultura;"
				+ "\n\n• Implantar medidas de controle de erosão de solos e de redução dos processos de assoreamento"
				+ "\nde corpos de água, tanto em nível urbano como rural."
				+ "\n\n3. Para reduzir a poluição das águas:"
				+ "\n\n• Apoiar iniciativas que visem a implantação de sistemas de tratamento de esgotos, como forma"
				+ "\nde reduzir a contaminação da água;"
				+ "\n\n• Exigir que o município faça o tratamento adequado dos resíduos. Propor, por exemplo, a instalação"
				+ "\nde sistemas de coleta seletiva e reciclagem de resíduos sólidos; aterros sanitários, estações de"
				+ "\nrecebimento de produtos tóxicos agrícolas e domiciliares, tais como restos de tinta, solventes,"
				+ "\npetróleo, embalagem de agrotóxicos, entre outros;"
				+ "\n\n• Organizar-se. Os consumidores organizados podem pressionar as empresas para que produzam"
				+ "\ndetergentes, produtos de limpeza, embalagens etc. que causem menores impactos ambientais."
				+ "\n\nFonte da informação: Clique no botão direito do mouse para acessar o site");
		getContentPane().add(textArea, BorderLayout.CENTER);
		
		JLabel link = new JLabel("Clique para acessar o site que contém essas informações.");
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
