package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



public class Pais_China extends JFrame {

	private JPanel contentPane;
    private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pais_China frame = new Pais_China();
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
	public Pais_China() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pais_China.class.getResource("/MeioAmbiente/resTelas/China.png")));
		setTitle("China");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(pane, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setText(" Al\u00E9m de ser o maior pais da \u00C1sia oriental com  9.536.499 km\u00B2. A china, denominada tamb\u00E9m como \u201CRepublica popular da china\u201D, e o pais mais populoso do mundo, estimasse a incr\u00EDvel marca de 1,42 bilh\u00E3o de habitantes em 2016 (quase um quinto da popula\u00E7\u00E3o da Terra)\r\n... \u00C9 o terceiro (ou quarto) maior pa\u00EDs do mundo em \u00E1rea total e o terceiro maior em \u00E1rea terrestre.\r\n Essa incerteza sobre o tamanho do pa\u00EDs est\u00E1 relacionada com a posse de certos territ\u00F3rios reivindicados pela China, como Aksai Chin e Vale de Shaksgam que tamb\u00E9m s\u00E3o reivindicados pela \u00EDndia...\r\n Numero esse que vem aumentando, porem, n\u00E3o no ritmo da \u00EDndia, especialistas esperam que antes do ano de 2050, ela tome o titulo de pais mais populoso do planeta. \r\n Com um PIB de US$ 10,46 trilh\u00F5es a china e uma republica socialista, comandada pelo \u201CPartido comunista da china \u201Dque tem sobre seu poder: \r\nCinco regi\u00F5es aut\u00F4nomas (Xinjiang, Mong\u00F3lia Interior, Tibete, Ningxia e Guangxi).\r\nQuatro munic\u00EDpios (Pequim, Tianjin, Xangai e Chongqing).\r\nDuas Regi\u00F5es Administrativas Especiais com grande autonomia (Hong Kong e Macau).\r\nE a capital do pais Pequim.\r\nA china tem florestas de estepes e desertos no norte seco e frio, que ficam pr\u00F3ximos da Mong\u00F3lia e da Sib\u00E9ria (R\u00FAssia), mais florestas agora subtropicais no sul \u00FAmido e quente, pr\u00F3ximo ao Vietn\u00E3, Laos e Mianmar, a oeste possui o Himalaia e as montanhas Tian Shan que foram fronteiras, e defesas naturais entre a China, a \u00CDndia e a \u00C1sia Central. No entanto o litoral leste da China continental \u00E9 de baixa altitude e tem uma longa faixa costeira de aproximados 14 500 quil\u00F4metros, delimitada a sudeste pelo Mar da China Meridional e a leste pelo Mar da China Oriental, onde al\u00E9m dele est\u00E3o Taiwan, Coreia (Norte e Sul) e Jap\u00E3o.\r\n\r\n Nas ultimas d\u00E9cadas a china sofreu com problemas de polui\u00E7\u00E3o e degrada\u00E7\u00E3o ambiental do seu territ\u00F3rio, mesmo que algumas leis e legisla\u00E7\u00F5es (Ex: Lei de Prote\u00E7\u00E3o Ambiental de 1979) sejam bem r\u00EDgidas, as mesmas s\u00E3o ineficazmente aplicadas, e frequentemente colocadas em segundo plano em nome do desenvolvimento e crescimento e econ\u00F4mico, resultando em protestos p\u00FAblicos e dist\u00FArbios por quest\u00F5es ambientais tornando-se cada vez mais comum no pa\u00EDs.\r\n Segundo o Minist\u00E9rio chin\u00EAs de Recursos H\u00EDdricos, estimasse que 300 milh\u00F5es de chineses n\u00E3o tenham acesso \u00E0 \u00E1gua pot\u00E1vel, e 40% dos rios do pa\u00EDs estavam polu\u00EDdos por res\u00EDduos industriais e agr\u00EDcolas de alguma esp\u00E9cie.\r\n Al\u00E9m disto, a s\u00E9rios problemas com escassez de \u00E1gua no pais, cerca de 400 das 600 cidades chinesas pesquisadas apresentavam poucos recursos de \u00E1gua pot\u00E1vel\r\n E ainda n\u00E3o terminamos, v\u00E1rias grandes cidades costeiras do pa\u00EDs, incluindo Xangai, s\u00E3o consideradas altamente vulner\u00E1veis a inunda\u00E7\u00F5es de larga escala\r\nApesar disso tudo a china tamb\u00E9m tem seu lado bom. \r\nO pais e investidor mundial em energias renov\u00E1veis e tamb\u00E9m l\u00EDder dessas tecnologias,  tendo ate 52 bilh\u00F5es de d\u00F3lares investidos nesta \u00E1rea apenas 2011, O pa\u00EDs produz mais turbinas e\u00F3licas, pain\u00E9is solares e projetos de energia renov\u00E1vel, do que qualquer outro do mundo;\r\n");
		pane.addTab("Sobre", null, textArea, null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Posi\u00E7\u00E3o", "Cidade", "Provincia / Estado", "Popula\u00E7\u00E3o"},
				{null, null, null, null},
				{"1", "Xangai", "Xangai", "20 217 700"},
				{"2", "Pequim", "Pequim", "16 446 900"},
				{"3", "Chongqing", "Chongqing", "11 871 200"},
				{"4", "Cant\u00E3o", "Guangdong", "10 641 400"},
				{"5", "Shenzhen", "Guangdong", "10 358 400"},
				{"6", "Tianjin", "Tianjin", "9 562 300"},
				{"7", "Wuhan", "Hubei", "7 541 500"},
				{"8", "Dongguan", "Guangdong", "7 271 300"},
				{"9", "Hong Kong ", "RAE", "7 055 071"},
				{"10", "Foshan ", "Guangdong", "6 771 900"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		) {
			
			
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(2).setPreferredWidth(101);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		pane.addTab("Principais cidades", null, table, null);
		
		JPanel panel = new JPanel();
		pane.addTab("Sobre as cidades ", null, panel, null);
		
		
		
		
		JButton btnShijiazhuang = new JButton("Shijiazhuang");
		btnShijiazhuang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			new Cidade_Shijiazhuang().setVisible(true);
				
			}
		});
		
		panel.add(btnShijiazhuang);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnShijiazhuang, popupMenu);
		
		
		
		JTextPane txtpnACidadeDe = new JTextPane();
		txtpnACidadeDe.setText("A cidade de shijiazhuang esta na 13\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe.setEditable(false);
		popupMenu.add(txtpnACidadeDe);
	}

	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

}
