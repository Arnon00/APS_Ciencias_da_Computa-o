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

public class TelaTransportes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTransportes frame = new TelaTransportes();
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
	public TelaTransportes() {
		
		setTitle("Desmatamento");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("\nOs Trasportes."
				+ "\n\nOs meios de transporte têm um papel fundamental em nossa sociedade. Direta ou indiretamente,"
				+ "\ndependemos deles para a maioria de nossas atividades cotidianas. Sem os transportes, como chegaríamos ao"
				+ "\ntrabalho ou à escola? Como as hortaliças chegariam do campo à cidade? Como poderíamos transportar"
				+ "\nas mercadorias das fábricas?"
				+ "\n\nO problema é que boa parte dos transportes que utilizamos atualmente se move a partir da queima"
				+ "\nde combustíveis fósseis, como a gasolina e o óleo diesel, lançando grandes quantidades de gases tóxicos"
				+ "\nna atmosfera. Automóveis, ônibus, caminhões e outros veículos motorizados são hoje a principal causa"
				+ "\nde poluição do ar na maioria das cidades do mundo."
				+ "\n\nA situação é preocupante. Embora vários países tenham adotado medidas para baixar os índices"
				+ "\nde poluição, como a regulagem de motores, redução de substâncias tóxicas nos combustíveis e até rodízios"
				+ "\nde automóveis, a contaminação do ar ainda representa uma séria ameaça. Além dos danos ambientais"
				+ "\nglobais, como aumento do efeito estufa, diariamente muitas pessoas em todo o planeta estão adoecendo"
				+ "\ne até morrendo por causa da poluição do ar. Isso sem falar nos efeitos para os animais e até para as plantas."
				+ "\n\nReverter esse quadro é um desafio que deve envolver toda a sociedade: se não podemos abrir"
				+ "\nmão de algo tão necessário como os meios de transporte resta-nos tratar de encontrar formas"
				+ "\nde usá-los sem que prejudiquem nem a nós mesmos nem às gerações futuras. Isto é o que chamamos"
				+ "\nde um transporte sustentável."
				+ "\n\nPoluição veicular: um problema global e local"
				+ "\n\nEm todo o mundo, as megacidades com mais de 10 milhões de habitantes enfrentam sérios problemas"
				+ "\ncausados pela poluição veicular. Ao contrário do que se poderia supor, a poluição não é mais grave"
				+ "\nnos países mais ricos e desenvolvidos. Atualmente, grandes metrópoles como Paris, Nova York, Londres"
				+ "\ne Tóquio são menos poluídas do que muitas cidades de países em desenvolvimento, como a Cidade"
				+ "\ndo México, Buenos Aires e São Paulo. Nesse ranking, os países pobres levam desvantagem, pois carecem"
				+ "\nde investimentos em transporte coletivo e outras medidas capazes de melhorar a qualidade do ar."
				+ "\n\nNo Brasil, os paulistanos são os que mais sofrem com a poluição do ar. São Paulo tem sido apontada"
				+ "\ncomo a quinta cidade mais poluída do planeta. Em 2003, segundo dados da Companhia de Tecnologia de"
				+ "\nSaneamento Ambiental (Cetesb), órgão responsável pelo monitoramento da qualidade do ar no Estado,"
				+ "\na região metropolitana possuía uma frota de 7,5 milhões de veículos e cerca de 2 mil indústrias. Estima-se"
				+ "\nque essas fontes de poluição são responsáveis pelas emissões para a atmosfera de: 1,8 milhões de t/ano"
				+ "\nde CO, 415mil t/ano de HC, 409 mil t/ano de NOx, 67 mil t/ano de MP e 37 mil t/ano de SOx. Desses totais,"
				+ "\nos veículos são responsáveis por 98% das emissões de CO, 97% de HC, 97% de NOx, 52% de MP e 55%"
				+ "\nde SOx. Da frota que circula na região metropolitana de São Paulo, 5,8% dos veículos são movidos a óleo"
				+ "\ndiesel (cerca de 400 mil veículos, entre ônibus, caminhões e caminhonetes) e despejam anualmente 12,4 mil"
				+ "\ntoneladas de fumaça preta na atmosfera, colocando em risco o meio ambiente e a saúde da população.");
		contentPane.add(textArea, BorderLayout.CENTER);
		
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
