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





public class Pais_Iran extends JFrame {

	private JPanel contentPane;
    private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pais_Iran frame = new Pais_Iran();
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
	public Pais_Iran() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pais_Iran.class.getResource("/MeioAmbiente/resTelas/Iran.png")));
		setTitle("Ir\u00E3");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(pane, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setText("Com 1.648.196 km\u00B2 o ir\u00E3, tamb\u00E9m conhecido como \u201CRep\u00FAblica Isl\u00E2mica do Ir\u00E3o\u201D j\u00E1 foi conhecido \r\ntamb\u00E9m como a p\u00E9rsia e esta localizado na \u00C1sia Ocidental \u00E9 a segunda maior na\u00E7\u00E3o do Oriente M\u00E9dio\r\n o que equivale aproximadamente \u00E0 \u00E1rea do estado do Amazonas, no Brasil, ou um pouco maior \r\ndo que as \u00E1reas de Angola e Portugal somadas. E \u00E9 tamb\u00E9m a 18\u00AA maior do mundo.\r\n O pais se encontra entre: Arm\u00E9nia, Azerbaij\u00E3o no norte; Turquemenist\u00E3o e com o Cazaquist\u00E3o \r\ne a R\u00FAssia atrav\u00E9s do Mar C\u00E1spio; Afeganist\u00E3o e Paquist\u00E3o a leste; Golfo P\u00E9rsico e o Golfo de Om\u00E3 ao sul;\r\n Iraque a oeste e Turquia a noroeste, pa\u00EDs este geograficamente diverso, mas principalmente montanhoso, \r\no Ir\u00E3 sempre teve uma import\u00E2ncia geopol\u00EDtica significativa devido \u00E0 sua localiza\u00E7\u00E3o, no cruzamento entre o Sul,\r\n o Centro e o Ocidente da \u00C1sia. Teer\u00E3o \u00E9 a sua capital e a maior cidade, servindo como o centro cultural,\r\n financeiro e industrial da na\u00E7\u00E3o. O Ir\u00E3o \u00E9 uma pot\u00EAncia m\u00E9dia e regional.\r\n Entre suas fronteiras est\u00E3o cerca de 78,5 milh\u00F5es de habitantes, oque faz desse pa\u00EDs, \r\no  17\u00BA mais populoso do mundo com um  PIB de US$ 369 bilh\u00F5es (estimativa 2013).\r\nO Ir\u00E3 \u00E9 o lar da cidade mais polu\u00EDda do mundo - Ahvaz, que tem tr\u00EAs vezes a quantidade m\u00E9dia de polui\u00E7\u00E3o no pa\u00EDs,\r\n conhecida por seus campos de petr\u00F3leo, \u00E9 uma cidade altamente industrializada de 1,3 milh\u00F5es de habitantes.\r\n\r\nO Ir\u00E3 tem a terceira maior reserva mundial de petr\u00F3leo e a segunda maior reserva de g\u00E1s natural. \r\nA gasolina de baixa qualidade produzida localmente tem sido responsabilizada pela polui\u00E7\u00E3o do pa\u00EDs. \r\nO combust\u00EDvel de alta octanagem - muito elogiado por l\u00EDderes do pa\u00EDs - \u00E9 fabricado em plantas petroqu\u00EDmicas, \r\nem vez de refinarias.\r\n\r\nA capital do Ir\u00E3 Teer\u00E3 virou not\u00EDcia em dezembro de 2011, quando foi coberta por fuma\u00E7a, \r\nfor\u00E7ando o governo a declarar \"f\u00E9rias de polui\u00E7\u00E3o\" por v\u00E1rios dias, fechando escrit\u00F3rios, empresas e escolas.\r\n Teer\u00E3 registrou quase um m\u00EAs de n\u00EDveis continuamente altos de polui\u00E7\u00E3o com os hospitais relatando aumento \r\nnos pacientes com problemas respirat\u00F3rios. O canal de televis\u00E3o iraniano Press TV disse que mais de 80% da\r\n polui\u00E7\u00E3o do ar da cidade foi atribu\u00EDdo aos 3,5 milh\u00F5es de ve\u00EDculos nas estradas.\r\nE ainda tem a situa\u00E7\u00E3o grave que vive os direitos humanos neste pais o desrespeito aos  mesmos no Ir\u00E3 tem \r\nsido criticado tanto pelos pr\u00F3prios iranianos, quanto por ativistas internacionais de direitos humanos, escritores e ONGs.\r\n A Assembleia Geral da ONU e da Comiss\u00E3o de Direitos Humanos denunciaram abusos anteriores e atuais no pa\u00EDs, \r\nem cr\u00EDticas e em v\u00E1rias resolu\u00E7\u00F5es publicadas\r\n");
		pane.addTab("Sobre", null, textArea, null);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Posi\u00E7\u00E3o", "Cidade", "Provincia / Estado", "Popula\u00E7\u00E3o"},
				{null, null, null, null},
				{"1", "Teer\u00E3o/Teer\u00E3", "Teer\u00E3o/Teer\u00E3", "8 154 051"},
				{"2", "Meshed", "Razavi Khorasan", "2 749 374"},
				{"3", "Isfahan", "Isfahan", "1 756 126"},
				{"4", "Karaj", "Alborz", "1 614 626"},
				{"5", "Tabriz", "Azerbaij\u00E3o Oriental", "1 494 988"},
				{"6", "Xiraz", "Fars", "1 460 665"},
				{"7", "Ahvaz", "Cuzist\u00E3o", "1 112 021"},
				{"8", "Qom", "Qom", "1 074 036"},
				{"9", "Kermanshah", "Kermanshah", "851 405"},
				{"10", "\u00DArmia", "Azerbaij\u00E3o Ocidental", "667 499"},
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
		table.getColumnModel().getColumn(2).setPreferredWidth(106);
		pane.addTab("Principais cidades", null, table, null);
		
		JPanel panel = new JPanel();
		pane.addTab("Sobre as cidades ", null, panel, null);
		
		
		
		
		JButton btnBushehr = new JButton("Bushehr");
		btnBushehr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Bushehr().setVisible(true);
				
			}
		});
		panel.add(btnBushehr);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnBushehr, popupMenu);
		
		JTextPane txtpnACidadeDe = new JTextPane();
		txtpnACidadeDe.setEditable(false);
		txtpnACidadeDe.setText("A cidade de Bushehr esta na 20\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo. ");
		popupMenu.add(txtpnACidadeDe);
		
		
		
		
		JButton btnZabol = new JButton("Zabol");
		btnZabol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Zabol().setVisible(true);
				
			}
		});
		panel.add(btnZabol);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(btnZabol, popupMenu_1);
		
		
		
		JTextPane txtpnACidadeDe_1 = new JTextPane();
		txtpnACidadeDe_1.setText("A cidade de Zabol esta na 3\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe_1.setEditable(false);
		popupMenu_1.add(txtpnACidadeDe_1);
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
