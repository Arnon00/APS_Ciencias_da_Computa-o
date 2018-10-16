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

public class TelaEnergia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEnergia frame = new TelaEnergia();
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
	public TelaEnergia() {
		
		setTitle("Desmatamento");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("Energia - A Ordem é Economizar !"
				+ "\n\nDepois da revolução industrial, no final do século XVIII, e especialmente durante o século XX, o impacto "
				+ "\nda atividade humana sobre o meio ambiente tornou-se muito significativo. O aumento da população"
				+ "\ne do consumo pessoal, principalmente nos países desenvolvidos, originou problemas ambientais cuja"
				+ "\nsolução é o grande desafio deste início de século para pesquisadores, ambientalistas, governos, organizações"
				+ "\nnão-governamentais e comunidades de todo o mundo."
				+ "\n\nGrande parte dos problemas está relacionada com a exploração e utilização de energia. Poluição,"
				+ "chuva ácida, destruição da camada de ozônio, aquecimento da Terra – por causa da intensificação do"
				+ "efeito estufa – e destruição da fauna e flora são alguns dos efeitos dos processos atualmente disponíveis"
				+ "para a geração de energia."
				+ "\n\nA geração de energia e o impacto ambiental"
				+ "\n\nExistem vários meios de produzir energia elétrica, cada qual com suas vantagens e desvantagens"
				+ "\neconômicas e ambientais. Pode-se produzir eletricidade a partir de fontes renováveis ou não renováveis."
				+ "\nAs fontes renováveis são aquelas que não se esgotam. Algumas delas são fontes permanentes e contínuas"
				+ "\n - como o Sol, o vento, a água e o calor da terra – outras podem se renovar – como a biomassa."
				+ "\n\nAo contrário, as fontes de energia não renováveis, como o petróleo, o carvão mineral, o gás natural"
				+ "\ne o urânio (usado nas usinas nucleares), tendem a se esgotar. São reservas formadas durante milhões"
				+ "\nde anos a partir da decomposição natural de matéria orgânica, não podendo ser repostas pela ação do homem."
				+ "\nAs formas mais limpas de produção de eletricidade estão associadas ao uso de fontes de energia renováveis."
				+ "\n\nA formação das bases energéticas dos países sempre resultou de considerações econômicas, como"
				+ "\na disponibilidade de recursos naturais e viabilidade de exploração. No caso do Brasil, por exemplo, a abundância"
				+ "\nde recursos hídricos foi fundamental para a formação de um sistema predominantemente hidráulico."
				+ "\n\nNos últimos anos, a questão ambiental vem ganhando relevância no planejamento energético dos"
				+ "\npaíses. Só para citar um exemplo, os riscos ambientais levaram a Alemanha a estabelecer um plano"
				+ "\nde desativação de todo o seu sistema energético nuclear. A seguir, você vai conhecer as principais fontes"
				+ "\nde energia e seus impactos sobre o meio ambiente."
				+ "\n\nO que o consumidor pode fazer"
				+ "\n\nNo seu dia-a-dia, o consumidor doméstico pode adotar uma série de medidas simples, mas que"
				+ "\nno final do mês podem se converter numa boa economia de energia. Veja a seguir algumas dicas"
				+ "\npara baixar o consumo:"
				+ "\n\nChuveiro"
				+ "\n\n• O chuveiro elétrico é um dos aparelhos que mais consomem energia. O ideal é evitar seu uso em"
				+ "\nhorários de maior consumo (entre 18 h e 20 h; no horário de verão, entre 19 h e 20h30)."
				+ "\n\n• Quando o tempo não estiver frio, procure usar o chuveiro com a chave na posição verão (morno)."
				+ "\nO consumo é 30% menor do que na posição inverno."
				+ "\n\n• Tente limitar seus banhos em aproximadamente cinco minutos.Feche o chuveiro enquanto se ensaboa."
				+ "\n\nMáquinas de lavar e ferro elétrico"
				+ "\n\n• Se usar máquinas de lavar louças e roupas, ligue-as somente com toda a sua capacidade preenchida."
				+ "\n\n• Habitue-se a juntar a maior quantidade possível de roupas para passá-las de uma só vez."
				+ "\n\n• Se o ferro for automático, regule sua temperatura. Passe primeiro as roupas delicadas, que precisam"
				+ "\nde menos calor. No final, depois de desligá-lo, você ainda pode aproveitar o calor para passar"
				+ "\nalgumas roupas leves."
				+ "\n\nGeladeira e freezer"
				+ "\n\n• De forma geral, esses equipamentos são responsáveis por cerca de 30% do consumo de uma"
				+ "\nresidência. Na hora de comprar, leve em conta a eficiência energética certificada pelo selo Procel"
				+ "\n(Programa Nacional de Conservação de Energia Elétrica) e dê preferência aos que utilizam gases"
				+ "\ninofensivos à camada de ozônio (livres de CFCs)."
				+ "\n\n• Evite a proximidade com o fogão, aquecedores ou áreas expostas ao sol; No caso de instalação entre"
				+ "\narmários e paredes, deixe um espaço mínimo de 15 cm dos lados, acima e no fundo do aparelho."
				+ "\n\n• Evite abrir a porta da geladeira em demasia ou por tempo prolongado."
				+ "\n\n• Deixe espaço entre os alimentos e guarde-os de forma que você possa encontrá-los rápida e facilmente."
				+ "\n\n• Não guarde alimentos e/ou líquidos quentes, nem recipientes sem tampa na geladeira."
				+ "\n\n• Não forre as prateleiras com vidros ou plásticos, pois isso dificulta a circulação interna de ar."
				+ "\n\n• Faça o descongelamento do freezer periodicamente, conforme as instruções do manual, para evitar"
				+ "\nque se forme uma camada com mais de meio centímetro de espessura."
				+ "\n\n• No inverno, a temperatura interna do refrigerador não precisa ser tão baixa como no verão."
				+ "\n\nRegule o termostato."
				+ "\n• Conserve limpas as serpentinas (as grades) que se encontram na parte de trás do aparelho e não"
				+ "\nas utilize para secar panos, roupas etc.."
				+ "\n• Quando você se ausentar de casa por tempo prolongado, esvazie o freezer e a geladeira"
				+ "\ne deixe-os desligados."
				+ "\n\nLâmpadas"
				+ "\n\n• Na hora de comprar, dê preferência a lâmpadas fluorescentes, compactas ou circulares, para"
				+ "\na cozinha, área de serviço, garagem e qualquer outro lugar da casa que fique com as luzes acesas por"
				+ "\nmais de quatro horas por dia. Além de consumir menos energia, essas lâmpadas duram mais que"
				+ "\nas comuns. Não se esqueça, porém, de que essas lâmpadas contêm substâncias químicas"
				+ "\nque podem ser prejudiciais à saúde se não forem descartadas adequadamente. O melhor é entregar"
				+ "\nnos locais de venda, quando possível.");
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
