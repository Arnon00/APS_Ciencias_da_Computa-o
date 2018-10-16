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


public class Pais_Bahrein extends JFrame {

	private JPanel contentPane;
    private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pais_Bahrein frame = new Pais_Bahrein();
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
	public Pais_Bahrein() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pais_Bahrein.class.getResource("/MeioAmbiente/resTelas/Behien.png")));
		setTitle("Bahrein");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(pane, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setText(" Bahrein, tambem conhecido como \u201CReino do Bahrein\u201D e um pequeno arquip\u00E9lago, insular que se encontra no golfo p\u00E9rsico, \u00E9 composta por trinta e cinco ilhas e ilhotas que ficam no Golfo P\u00E9rsico, a leste da Ar\u00E1bia Saudita e a noroeste do Qatar, e das trinta e cinco ilhas apenas, tr\u00EAs s\u00E3o habitadas: Barein, Umm Nassam e Al Muharraq. \r\npossui fronteiras mar\u00EDtimas com o Ir\u00E3o a nordeste, com o Catar a leste e com a Ar\u00E1bia Saudita a sudoeste, Manama e o nome da sua capital, o seu governo e uma monarquia constitucional, e tem sobre seu poder 12 regi\u00F5es.\r\n Os desertos, com sua esterilidade, cobrem mais de 30 ilhas componentes desse pa\u00EDs \u00E1rabe de apenas 720 km\u00B2 e 1,34 milh\u00E3o de habitantes. \r\nA produ\u00E7\u00E3o e o refinamento de petr\u00F3leo respondem a aproximadamente por 60% das exporta\u00E7\u00F5es, 60% dos rendimentos do governo local e 30% do PIB de US$ 34,9 bilh\u00F5es (estimativa 2014) do pais. Com uma rede desenvolvida de transportes e comunica\u00E7\u00F5es, Bahrein sedia diversas firmas multinacionais com neg\u00F3cios no Golfo.\r\n");
	    pane.addTab("Sobre", null, textArea, null);
		
	    table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Posi\u00E7\u00E3o", "Cidade", "Provincia / Estadoo", "Popula\u00E7\u00E3o", "Ano"},
				{null, null, null, null, null},
				{"1", "Al Manama", "Provincia da Capital", "225 000", "2015"},
				{"2", "Al Muharraq", "Muharraq", "176 583", "2012"},
				{"3", "Madinat Hamad", "Provincia do Norte", "133 550", "2012"},
				{"4", "Ar Rifa", "Provincia Central", "121 566", "2010"},
				{"5", "A'ali", "Provincia do Sul", "100 553", "2015"},
				{"6", "Sutrah", "Provincia Central", "81 000", "2016"},
				{"7", "Jidd Hafs", "Provincia da Capital/Norte", "11 000", "2013"},
				{"8", "Malkiya", "Provincia do Norte", "14 800", "2000"},
				{"9", "Madnat'Isa", "Provincia Central", "3 809", "2016"},
				{"10", "Al-Budaiya", "Provincia do Norte", "-----", "------"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		) {
			
			
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(39);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(136);
		table.getColumnModel().getColumn(3).setPreferredWidth(54);
		table.getColumnModel().getColumn(4).setPreferredWidth(44);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
	    pane.addTab("Principais cidades", null, table, null);
		
		JPanel panel = new JPanel();
		pane.addTab("Sobre as cidades ", null, panel, null);
		
		
		
		
		JButton btnHamad_town= new JButton("Hamad town ");
		btnHamad_town.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Hamad_town().setVisible(true);
		
			}
		});
		panel.add(btnHamad_town);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnHamad_town, popupMenu);
		
		JTextPane txtpnACidadeDe = new JTextPane();
		txtpnACidadeDe.setText("A cidade de Hamad town esta na 11\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe.setEditable(false);
		popupMenu.add(txtpnACidadeDe);
		
		
		
		
		JButton btnMa_ameer = new JButton("Ma'ameer");
		btnMa_ameer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Ma_ameer().setVisible(true);
				
			}
		});
		panel.add(btnMa_ameer);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(btnMa_ameer, popupMenu_1);
		
		JTextPane txtpnACidadeDe_1 = new JTextPane();
		txtpnACidadeDe_1.setText("A cidade de Ma'ameer esta na 19\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
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
