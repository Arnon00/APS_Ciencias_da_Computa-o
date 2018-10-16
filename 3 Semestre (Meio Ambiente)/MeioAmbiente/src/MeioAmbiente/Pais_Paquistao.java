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
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



public class Pais_Paquistao extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pais_Paquistao frame = new Pais_Paquistao();
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
	public Pais_Paquistao() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pais_Paquistao.class.getResource("/MeioAmbiente/resTelas/Paquistao.png")));
		setTitle("Paquist\u00E3o");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(pane, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setText("Com 796.095 km\u00B2, equivalente \u00E0 soma das superf\u00EDcies de Minas Gerais e Rio Grande do Sul, no Brasil (ou da Fran\u00E7a e do Reino Unido). O Paquist\u00E3o, tamb\u00E9m conhecido como \u201CRep\u00FAblica Isl\u00E2mica do Paquist\u00E3o\u201D, \u00E9 um pa\u00EDs soberano do Sul da \u00C1sia e tamb\u00E9m a 36\u00AA maior na\u00E7\u00E3o do planeta em \u00E1rea territorial. O Paquist\u00E3o tem um litoral com 1046 km de extens\u00E3o ao longo do Mar da Ar\u00E1bia e do Golfo de Om\u00E3, e tamb\u00E9m faz divisas com a \u00CDndia a leste, com o Afeganist\u00E3o a oeste e norte, com o Ir\u00E3 a sudoeste e com a Rep\u00FAblica Popular da China no extremo nordeste. \r\nO Paquist\u00E3o s\u00F3 n\u00E3o faz fronteira com o Tajiquist\u00E3o porque est\u00E3o separados pelo Corredor de Wakhan, que pertence ao Afeganist\u00E3o, no norte. Tamb\u00E9m compartilha uma fronteira mar\u00EDtima com Om\u00E3.\r\nO Paquist\u00E3o consiste em quatro prov\u00EDncias e quatro territ\u00F3rios federais, juntos formam uma republica parlamentar federal  com estimados 199,2 milh\u00F5es de habitantes, oque o torna o 6\u00BA pa\u00EDs mais populoso do mundo\r\nO Paquist\u00E3o al\u00E9m de ser um pais em desenvolvimento, esta em r\u00E1pido crescimento econ\u00F4mico, 7% por ano, durante 4 anos seguidos, apesar de ter sido considerado um pais muito pobre em  1947 hoje conta com um PIB de US$ 984,2 bilh\u00F5es.\r\nApesar disso, estimasse tamb\u00E9m que a pobreza no pa\u00EDs esteja entre23% e 28% .\r\n");
		pane.addTab("Sobre", null, textArea, null);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Posi\u00E7\u00E3o ", "Cidade", "Provincia / Estado", "Popula\u00E7\u00E3o"},
				{null, null, null, null},
				{"1", "Karachi", "Sind", "13 205 339"},
				{"2", "Lahore", "Punjab", "7 129 609"},
				{"3", "Faisalabad", "Punjab", "2 880 675"},
				{"4", "Rawalpindi", "Punjab", "1 991 656"},
				{"5", "Multan", "Punjab", "1 606 481"},
				{"6", "Hyderabad", "Sind", "1 578 367"},
				{"7", "Gujranwala", "Punjab", "1 569 090"},
				{"8", "Peshawar", "Khyber Pakhtunkhwa", "1 439 205"},
				{"9", "Quetta", "Baluchist\u00E3o ", "896 090"},
				{"10", "Islamabad", "Territ\u00F3rio da Capital", "689 249"},
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
		
		table.getColumnModel().getColumn(2).setPreferredWidth(113);
		pane.addTab("Principais Cidades", null, table, null);
		
		
		
	   
	
		
		JPanel panel = new JPanel();
		pane.addTab("Sobre as cidades ", null, panel, null);
		
		
		
		
		JButton btnkarachi = new JButton("karachi");
		btnkarachi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Karachi().setVisible(true);
				
			}
		});
		panel.add(btnkarachi);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnkarachi, popupMenu);
		
		
		
		JTextPane txtpnACidadeDe = new JTextPane();
		txtpnACidadeDe.setEditable(false);
		txtpnACidadeDe.setText("A cidade de karachi esta na 14\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		popupMenu.add(txtpnACidadeDe);
		
		
		
		
		JButton btnRawalpindi = new JButton("Rawalpindi");
		btnRawalpindi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Rawalpindi().setVisible(true);
				
			}
		});
		panel.add(btnRawalpindi);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(btnRawalpindi, popupMenu_1);
		
		
		
		JTextPane txtpnACidadeDe_1 = new JTextPane();
		txtpnACidadeDe_1.setText("A cidade de Rawalpindi esta na 4\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe_1.setEditable(false);
		popupMenu_1.add(txtpnACidadeDe_1);
		
		
		
		
		JButton btnPeshawar = new JButton("Peshawar");
		btnPeshawar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Peshawar().setVisible(true);
				
			}
		});
		
		
		panel.add(btnPeshawar);
		
		JPopupMenu popupMenu_2 = new JPopupMenu();
		addPopup(btnPeshawar, popupMenu_2);
		
		
		
		JTextPane txtpnACidadeDe_2 = new JTextPane();
		txtpnACidadeDe_2.setText("A cidade de peshawar esta na 2\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe_2.setToolTipText("");
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


