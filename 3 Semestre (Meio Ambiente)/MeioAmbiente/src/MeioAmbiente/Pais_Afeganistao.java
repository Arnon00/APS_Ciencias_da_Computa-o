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
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import java.awt.Dialog.ModalExclusionType;



public class Pais_Afeganistao extends JFrame {

	private JPanel contentPane;
    private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pais_Afeganistao frame = new Pais_Afeganistao();
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
	public Pais_Afeganistao() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pais_Afeganistao.class.getResource("/MeioAmbiente/resTelas/Afeganistao.png")));
		
		
	
		setTitle("Afeganist\u00E3o");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		pane.setBounds(5, 5, 424, 252);
		contentPane.add(pane);
		
		TextArea textArea = new TextArea();
		textArea.setText("Com 652.090 km\u00B2 o Afeganist\u00E3o, tamb\u00E9m conhecido como \u201CRep\u00FAblica Isl\u00E2mica do Afeganist\u00E3o\u201D, \u00E9 um estado sem litoral, situado no centro da \u00C1sia e o 40\u00BA pais do mundo com maior extens\u00E3o de \u00E1rea. Faz fronteira com o Paquist\u00E3o ao sul e ao leste, com o Ir\u00E3 ao oeste, com o Turcomenist\u00E3o, Uzbequist\u00E3o e Tajiquist\u00E3o ao norte e com China no nordeste. O pais e muito importante pela localiza\u00E7\u00E3o, o mesmo faz a liga\u00E7\u00E3o entre o Oriente M\u00E9dio e a \u00C1sia Central e tamb\u00E9m o subcontinente indiano.\r\nApesar de ter v\u00E1rios rios e reservat\u00F3rios, boa parte do pa\u00EDs est\u00E1 seca. A bacia endorreica de Sistan \u00E9 uma das regi\u00F5es mais secas do mundo.\r\nO pais \u00E9 tamb\u00E9m considerado o mais perigoso do mundo, isso se deve a d\u00E9cadas de guerra, oque faz a ele ser atribu\u00EDdo o t\u00EDtulo de maior produtor de refugiados e requerentes de asilo do planeta, o pais ainda carrega o titulo de um dos pobres e in\u00F3spitos. A instabilidade pol\u00EDtica e os conflitos internos arruinaram a sua j\u00E1 d\u00E9bil economia e infra-estruturas a tal ponto que um ter\u00E7o da popula\u00E7\u00E3o afeg\u00E3 abandonou o pa\u00EDs. Mas, mesmo assim, ainda a cerca de 32,5 milh\u00F5es de habitantes vivendo l\u00E1, oque o coloca na 40\u00BA posi\u00E7\u00E3o da lista de pa\u00EDses mais populosos do mundo;\r\n Segundo estimativas, a popula\u00E7\u00E3o cresce algo em torno de 2,67% por ano. E o \u00EDndice de natalidade \u00E9 de 46,6 a cada 1000 habitantes, enquanto o de mortalidade \u00E9 20,34 a cada 1000 habitantes. A taxa de mortalidade infantil \u00E9 de 160,23 mortes a cada 1000 nascimentos. A expectativa de vida \u00E9 de somente 43.34 anos\r\nOutra coisa grave neste pa\u00EDs, e que ele \u00E9 o maior produtor mundial de \u00F3pio. De 80 a 90% da hero\u00EDna consumida na Europa prov\u00EAm de \u00F3pio produzido na regi\u00E3o. \r\nO Afeganist\u00E3o por ser um pais extremamente pobre, tem um PIB de apenas PIB (Produto Interno Bruto): US$ 65,3 bilh\u00F5es (estimativa 2016), muito dos seus habitantes dependente diretamente da agricultura (principalmente da papoula -, mat\u00E9ria-prima do \u00F3pio) e da cria\u00E7\u00E3o de gado, \r\n");
		pane.addTab("Sobre", null, textArea, null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Posi\u00E7\u00E3o", "Cidade", "Provincia / estado", "Popula\u00E7\u00E3o"},
				{null, null, null, null},
				{"1", "Kabul", "Prov\u00EDncia de Kabul", "3 289 000"},
				{"2", "Candaar", "Prov\u00EDncia de Kandahar", "491 500"},
				{"3", "Herat", "Herat", "436 300"},
				{"4", "Mazar e Sharif ", "Prov\u00EDncia de Balkh", "368 100"},
				{"5", "Jalalabad", "prov\u00EDncia de Kunduz", "304 600"},
				{"6", "Lashkar Gah", "prov\u00EDncia de Takhar", "219 000"},
				{"7", "Talocan", "prov\u00EDncia de Nangarhar", "206 500"},
				{"8", "Khost", "prov\u00EDncia de Baghlan", "203 600"},
				{"9", "Sheberghan", "Parwan", "171 200"},
				{"10", "Ghazni", "\tjowzjan", "161 700"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(2).setPreferredWidth(102);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		pane.addTab("Principais cidades", null, table, null);
		
		JPanel panel = new JPanel();
		pane.addTab("Sobre as cidades ", null, panel, null);
		
		
		
		
		JButton btnMazar_e_sharif = new JButton("Mazar-e sharif");
		btnMazar_e_sharif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Mazar_e_sharif().setVisible(true);
				
			}
		});
		panel.add(btnMazar_e_sharif);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnMazar_e_sharif, popupMenu);
		
		
		
		JTextPane txtpnACidadeDe = new JTextPane();
		txtpnACidadeDe.setText("A cidade de Mazar'e Sharif esta na 9\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe.setEditable(false);
		popupMenu.add(txtpnACidadeDe);
		
		
		
		
		JButton btnCabul = new JButton("Cabul");
		btnCabul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Cabul().setVisible(true);
				
			}
		});
		panel.add(btnCabul);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(btnCabul, popupMenu_1);
		
		
		
		
		JTextPane txtpnACidadeDe_1 = new JTextPane();
		txtpnACidadeDe_1.setText("A cidade de Cabul esta na 18\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
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
