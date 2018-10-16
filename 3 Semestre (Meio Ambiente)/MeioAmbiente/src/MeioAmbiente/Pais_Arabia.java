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


public class Pais_Arabia extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pais_Arabia frame = new Pais_Arabia();
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
	public Pais_Arabia() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pais_Arabia.class.getResource("/MeioAmbiente/resTelas/Arabia.png")));
		setTitle("Arabia Saudita");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(pane, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setText("Com 2.149,690 km\u00B2 Arabia saudita, tamb\u00E9m conhecida como \u201CReino da Ar\u00E1bia Saudita\u201D e por vezes \u00E9 chamada de \"Terra das Duas Mesquitas Sagradas\", uma refer\u00EAncia \u00E0s mesquitas al-Masjid al-Haram (em Meca) e al-Masjid an-Nabawi (em Medina) \u00E9, por tamanho de territ\u00F3rio, o maior pa\u00EDs \u00E1rabe na \u00C1sia, assim constituindo a maior parte da Pen\u00EDnsula Ar\u00E1bica (80%), assim chegando na posi\u00E7\u00E3o de 13\u00BA maior pa\u00EDs do mundo. E o segundo maior pais \u00E1rabe (o primeiro e a Arg\u00E9lia). \r\nE conta com cerca de 29,8 milh\u00F5es de habitantes, esses divididos entre uma estimativa de mais de 9 milh\u00F5es de expatriados estrangeiros e  estimados 2 milh\u00F5es de imigrantes ilegais registrados.\r\nEncontrasse entre: a Jord\u00E2nia e o Iraque ao norte. O Kuwait ao nordeste. Catar, Bar\u00E9m e Emirados \u00C1rabes Unidos a leste. Om\u00E3 ao sudeste. L\u00EAmen ao sul. O mar Vermelho ao oeste e tamb\u00E9m com o golfo P\u00E9rsico a leste.  Suas principais cidades s\u00E3o: Riade, a capital do pa\u00EDs. Gid\u00E1, principal porto e antiga capital, e tamb\u00E9m Meca e Medina.\r\nO pa\u00EDs possui a segunda maior reserva de petr\u00F3leo do mundo, e \u00E9 l\u00EDder mundial em exporta\u00E7\u00F5es, oque o garantiu como um dos mais poderosos do mundo, e o titulo de potencia regional. Ele tamb\u00E9m possui a sexta maior reserva de g\u00E1s natural do mundo, e esta classificada como uma economia de alta renda com um PIB de US$ 653,2 bilh\u00F5es (ano de 2015) figurando no 19\u00BA maior do mundo.\r\nPor se situar na regi\u00E3o do  Deserto da Ar\u00E1bia, \ta disponibilidade de agua se torna baixa, e o pa\u00EDs sofre com a escassez, e para suprir essa necessidade realiza a dessaliniza\u00E7\u00E3o da \u00E1gua. A capital Riad \u00E9 abastecida com \u00E1gua transportada por 370 km do Golfo da Ar\u00E1bia para ent\u00E3o ser dessalinizada e distribu\u00EDda.\r\n");
		pane.addTab("Sobre", null, textArea, null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Posi\u00E7\u00E3o", "Cidede", "Provincia / Estado", "Popula\u00E7\u00E3o"},
				{null, "", null, null},
				{"1", "Riade", "Ar Riyad", "5 328 228"},
				{"2", "Jeddah", "Meca", "3 456 259"},
				{"3", "Meca", "Meca", "1 675 368"},
				{"4", "Medina", "Al Madinah", "1 180 770"},
				{"5", "Al Hufuf ", "Ash Sharqiyah", "1 063 112"},
				{"6", "Ta'if", "Meca", "987 914"},
				{"7", "Dammam", "Ash Sharqiyah", "903 597"},
				{"8", "Khamis Mushait ", "'Asir", "630 000"},
				{"9", "Buraydah", "Al Qasim", "614 093"},
				{"10", "Khobar", "Ash Sharqiyah", "578 500"},
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
		table.getColumnModel().getColumn(1).setPreferredWidth(87);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		pane.addTab("Principais cidades", null, table, null);
		
		JPanel panel = new JPanel();
		pane.addTab("Sobre as cidades ", null, panel, null);
		
		
		
		
		JButton btnDammam = new JButton("Dammam");
		btnDammam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Dammam().setVisible(true);
			
			}
		});
		
		
		panel.add(btnDammam);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnDammam, popupMenu);
		
		
		
		JTextPane txtpnACidadeDe = new JTextPane();
		txtpnACidadeDe.setText("A cidade de dammam esta na 15\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe.setEditable(false);
		popupMenu.add(txtpnACidadeDe);
		
		
		
		
		JButton btnAl_Jubail = new JButton("Al jubail");
		btnAl_Jubail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Al_Jubail().setVisible(true);
			
			}
		});
		panel.add(btnAl_Jubail);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(btnAl_Jubail, popupMenu_1);
		
		
		
		JTextPane txtpnACidadeDe_1 = new JTextPane();
		txtpnACidadeDe_1.setText("A cidade de Al jubailesta na 8\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe_1.setEditable(false);
		popupMenu_1.add(txtpnACidadeDe_1);
		
		
		
		
		JButton btnRiad = new JButton("Riad");
		btnRiad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Riad().setVisible(true);
			
			}
		});
		panel.add(btnRiad);
		
		JPopupMenu popupMenu_2 = new JPopupMenu();
		addPopup(btnRiad, popupMenu_2);
		
		
		
		JTextPane txtpnACidadeDe_2 = new JTextPane();
		txtpnACidadeDe_2.setText("A cidade de Raid esta na 7\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe_2.setEditable(false);
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
