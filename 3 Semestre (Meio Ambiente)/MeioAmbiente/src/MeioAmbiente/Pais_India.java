package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
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


public class Pais_India extends JFrame {

	private JPanel contentPane;
    private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pais_India frame = new Pais_India();
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
	public Pais_India() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pais_India.class.getResource("/MeioAmbiente/resTelas/India.png")));
		
		setTitle("India");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(pane, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 11));
		textArea.setEditable(false);
		textArea.setText("A \u00EDndia, oficialmente denominada como \u201Crepublica da \u00EDndia\u201D \u00E9 um pais que impressiona pelos n\u00FAmeros, com cerca de 1,30 bilh\u00E3o (Segundo estat\u00EDsticas para 2016) de habitantes, e o segundo pais mais populosos do planeta oque faz com que tamb\u00E9m seja e a democracia mais populosa. \r\nA \u00CDndia \u00E9 a segunda entidade geogr\u00E1fica com maior diversidade cultural, lingu\u00EDstica e gen\u00E9tica do mundo, depois da \u00C1frica, e tamb\u00E9m e o s\u00E9timo em maior \u00E1rea demogr\u00E1fica, em riquezas pais tamb\u00E9m n\u00E3o fica muito atr\u00E1s ele e a s\u00E9tima maior economia do mundo com o PIB estimado em 7 965 trilh\u00F5es USD, o pais ainda ocupa a terceira posi\u00E7\u00E3o em  Paridade de Poder de Compra.\r\nInfelizmente, esses n\u00FAmeros impressionantes tamb\u00E9m s\u00E3o negativos, A \u00EDndia tem n\u00EDveis disparados de pobreza da popula\u00E7\u00E3o, boa parte dela em estado de mis\u00E9ria, \u00EDndices de analfabetismo que podem chegar a 37,1%, as taxas de doen\u00E7as e desnutri\u00E7\u00E3o tamb\u00E9m s\u00E3o elevadas.\r\nO pa\u00EDs encontra- se entre o oceano indico, que fica ao sul. O mar da Ar\u00E1bia, que fica a oeste. E a baia de bengala que fica a leste, essa combina\u00E7\u00E3o faz com que tenha uma costa com 7 517 km de extens\u00E3o, mas n\u00E3o ah s\u00F3 mar a sua volta, o pais tamb\u00E9m tem fronteiras com Paquist\u00E3o a oeste.  Rep\u00FAblica Popular da China, Nepal e But\u00E3o ao norte.  Bangladesh e Mianmar a leste. \r\nA \u00EDndia e um pais composto por 28 estados e 7 territ\u00F3rios da uni\u00E3o, e possui um sistema de democracia parlamentar\r\n");
		pane.addTab("Sobre", null, textArea, null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Posi\u00E7\u00E3o", "Cidade", "Provincia / Estado", "Popula\u00E7\u00E3o"},
				{null, null, null, null},
				{"1", "Bombaim", "Maharashtra", "12 478 447"},
				{"2", "Deli", "Deli", "11 007 835"},
				{"3", "Chennai", "Tamil Nadu ", "8 425 970"},
				{"4", "Hiderabade", "Telangana", "6 809 970"},
				{"5", "Bangalore", "Karnataka", "5 570 585"},
				{"6", "Ahmedabad", "Gujarat", "4 681 087"},
				{"7", "Calcut\u00E1", "Bengala Ocidental ", "4 486 679"},
				{"8", "Surate", "Gujarat", "4 462 002"},
				{"9", "Varanasi", "Uttar Pradesh ", "3 676 841"},
				{"10", "Pune", "Maharashtra ", "3 115 431"},
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
		table.getColumnModel().getColumn(2).setPreferredWidth(105);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		pane.addTab("Principais cidades", null, table, null);
		
		JPanel panel = new JPanel();
		pane.addTab("Sobre as cidades ", null, panel, null);
		
		
		
		JButton btnRaipur = new JButton("Raipur");
		btnRaipur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			   new Cidade_Raipur().setVisible(true);
				
			}
		});
		panel.add(btnRaipur);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnRaipur, popupMenu);
		
		
		
		
		JTextPane txtpnACidadeDe = new JTextPane();
		txtpnACidadeDe.setText("A cidade de raipur esta na 17\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe.setEditable(false);
		popupMenu.add(txtpnACidadeDe);
		
		
		
		
		JButton btnAllahabad = new JButton("Allahabad");
		btnAllahabad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				new Cidade_Allahabad().setVisible(true);
		
			}
		});
		panel.add(btnAllahabad);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(btnAllahabad, popupMenu_1);
		
		
		
		
		JTextPane txtpnACidadeDe_1 = new JTextPane();
		txtpnACidadeDe_1.setText("A cidade de allahabad esta na 12\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe_1.setEditable(false);
		popupMenu_1.add(txtpnACidadeDe_1);
		
		
		
		
		JButton btnGwalior = new JButton("Gwalior");
		btnGwalior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Gwalior().setVisible(true);
				
			}
		});
		panel.add(btnGwalior);
		
		JPopupMenu popupMenu_2 = new JPopupMenu();
		addPopup(btnGwalior, popupMenu_2);
		
		
		
		
		JTextPane txtpnACidadeDe_2 = new JTextPane();
		txtpnACidadeDe_2.setEditable(false);
		txtpnACidadeDe_2.setText("A cidade de Gwalior esta na 10\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		popupMenu_2.add(txtpnACidadeDe_2);
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
