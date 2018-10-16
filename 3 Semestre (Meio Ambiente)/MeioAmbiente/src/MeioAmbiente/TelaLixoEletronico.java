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

public class TelaLixoEletronico extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLixoEletronico frame = new TelaLixoEletronico();
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
	public TelaLixoEletronico() {
		
		setTitle("Lixo Eletronico");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("\nO lixo tecnológico ou eletrônico possui uma grande quantidade de substâncias "
				+ "\nprejudiciais ao ambiente e ao homem. Neste artigo procuro trazer o resultado de \nminhas "
				+ "pesquisas sobre o assunto, incluindo soluções e dicas do que podemos \nfazer para amenizar o problema."
				+ "\n\nAparentemente estas duas palavras (lixo e tecnologia) não tem muito a ver uma com a outra, ou quando "
				+ "tem é no melhor dos sentidos, ou seja, no sentido de algum tipo de tecnologia que trate ou dê destino "
				+ "adequado para o lixo. Porém estou querendo me referir ao sentido ruim que, juntas, podem formar. O sentido "
				+ "de que a tecnologia que utilizamos todos os dias vira lixo. Porque?"
				+ "\n\nVocê já percebeu com que velocidade as tecnologias são substituídas (veja o exemplo dos telefones "
				+ "celulares e computadores"
				+ "\n\nQuando se substitui uma tecnologia, para onde vão os equipamentos “obsoletos”? (difícil de responder "
				+ "\nesta...acho que a maioria para o lixo não é?)."
				+ "\nEstá ai o motivo porque estas palavras andam juntas em seu pior sentido. Em nosso dia a dia não pensamos "
				+ "\nnisto, não pensamos o quanto uma bateria de celular ou de notebook vão poluir o solo ou os lençóis freáticos "
				+ "\n(e muitas vezes nem sabemos que poluem), ou mesmo os demais componentes como plástico e metais pesados. Nossa "
				+ "\npreocupação está geralmente em nos manter dentro da “onda”, da tecnologia."
				+ "\n\n**Mas o que nós podemos fazer, afinal"
				+ "\n**Esta é a pergunta chave, o que podemos fazer?"
				+ "\n\nBom, ela envolve muitas iniciativas e vai além do listado abaixo, mas vou citar algumas que acredito serem relevantes:"
				+ "\n\nPare de se render ao apelo do mercado: Trocar de celular ou de computador todo ano (a não ser que seja estritamente necessário para o seu trabalho) não faz o menor sentido se ele estiver funcionando e servindo às suas necessidades! Você evita gastar dinheiro e evita poluir o meio ambiente;"
				+ "\n\nSeu computador está muito lento? Compre um novo mas doe o seu antigo para uma pessoa que precisa dele, um amigo, uma instituição etc;"
				+ "\n\nEstenda a vida útil de seus equipamentos. No caso dos computadores, por exemplo, muitas vezes a lentidão se deve aos arquivos perdidos e “lixo” deixado pelo sistema operacional. Os vírus também podem deixar seu computador lento. Uma solução seria fazer um backup de seus arquivos e depois formatar o computador, reinstalando novamente o sistema operacional. Passar um anti-vírus antes de formatar a máquina pode resolver o problema sem a necessidade da formatação;"
				+ "\n\nVocê também pode utilizar sites de troca para fazer aquele chamado “rolo”;"
				+ "\n\nVenda seu computador ou as peças separadamente (no caso de desktops pode-se vender separadamente a CPU, o monitor, teclado, mouse, caixas de som ou mesmo as peças individualmente, caso você tenha algum conhecimento em hardware), que seja por um preço mínimo, mas que alguém possa reaproveita-lo. Sites de leilão também pode ser uma boa;"
				+ "\n\nBateria: Nokia, Gradiente, Siemens e Motorola têm urnas em todas as lojas das operadoras e oficinas autorizadas para o descarte das baterias . O Banco Real também recebe pilas e baterias usadas em suas agências bancárias;"
				+ "\n\nMuitas empresas fabricantes de eletrônicos e operadoras de celular já recebem de volta os aparelhos usados. Ligue para a sua operadora e se informe ou mesmo na loja em que adquirir seu novo equipamento;"
				+ "\n\nUtilize como critério de compra, além do preço, a responsabilidade que a empresa assume com o meio ambiente.");
				
		contentPane.add(textArea, BorderLayout.CENTER);
		
		JLabel link = new JLabel("Clique aqui para acessar o site que contém essas informações.");
		link.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				URI link = null;
				try {
					link = new URI("http://www.sermelhor.com.br/ecologia/lixo-eletronico-problema-e-solucoes.html");
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
