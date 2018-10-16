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


public class Pais_Nigeria extends JFrame {

	private JPanel contentPane;
    private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pais_Nigeria frame = new Pais_Nigeria();
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
	
	public Pais_Nigeria() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pais_Nigeria.class.getResource("/MeioAmbiente/resTelas/Nigeria.png")));
		setTitle("Nigeria");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(pane, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setText("Com 923.768 km\u00B2 A Nig\u00E9ria, tamb\u00E9m conhecida como \u201CRep\u00FAblica Federal da Nig\u00E9ria\u201D esta localizada na \u00C1frica ocidental (oeste do continente africano), e esta entre Rep\u00FAblica do Benim a oeste; Chade e Camar\u00F5es a leste e com o N\u00EDger ao norte.  Sua costa encontra-se ao sul, no Golfo da Guin\u00E9, no Oceano Atl\u00E2ntico.\r\n O pa\u00EDs possui uma popula\u00E7\u00E3o estimada em 182,1 milh\u00F5es de habitantes divididos entre os 36 estados, l\u00E1 tamb\u00E9m se encontra o Territ\u00F3rio da Capital Federal  \u201CAbuja e\u201D , \u00E9 o pa\u00EDs mais populoso do continente e o s\u00E9timo mais populoso do mundo, por muitas vezes e chamada de \"o gigante da \u00C1frica\", devido \u00E0 sua grande popula\u00E7\u00E3o e economia, esta que soma um  PIB de  US$ 1,16 trilh\u00E3o.\r\nO pa\u00EDs vem sendo considerado tamb\u00E9m uma potencia regional no continente africano, com particular hegemonia sobre a \u00C1frica Ocidental. Em 2013, o seu PIB se tornou o maior da \u00C1frica  ultrapassando a economia da \u00C1frica do Sul e chegando ao posto de 26\u00AA maior economia do mundo. A Nig\u00E9ria \u00E9 considerada um mercado emergente pelo Banco Mundial e est\u00E1 listado entre as economias chamadas de \"Pr\u00F3ximos Onze\".\r\nApesar desse crescimento exponencial do pa\u00EDs, a maior parte da popula\u00E7\u00E3o nigeriana ainda vive na pobreza absoluta e (ou) na mis\u00E9ria, a maioria n\u00E3o tem nem acesso \u00E0 \u00E1gua pot\u00E1vel, a expectativa m\u00E9dia de vida das pessoas que vivem nas comunidades rurais gira em torno dos 40 anos. \r\nE os problemas n\u00E3o param por aqui, o pa\u00EDs tem a maior polui\u00E7\u00E3o petrol\u00EDfera do mundo, com o ponto mais critico sendo na regi\u00E3o do Delta do N\u00EDger, l\u00E1 a cerca de 606 campos petrol\u00EDferos que fornecem 40% do total das importa\u00E7\u00F5es americanas de petr\u00F3leo bruto. \r\nA popula\u00E7\u00E3o local amaldi\u00E7oa o petr\u00F3leo que polui suas terras, apontando as centenas de desastres ecol\u00F3gicos que ocorrem, anualmente, no Delta do N\u00EDger.\r\n");
		pane.addTab("Sobre", null, textArea, null);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Posi\u00E7\u00E3o", "Cidade ", "Provincia / Estado", "Popula\u00E7\u00E3o"},
				{null, null, null, null},
				{"1", "Lagos", "Lagos", "21 000 000"},
				{"2", "Kano", "Kano", "3 626 068"},
				{"3", "Abuja", "Territ\u00F3rio da Capital", "3 000 000"},
				{"4", "Ibadan", "Oyo", "3 565 108"},
				{"5", "Kaduna", "Kaduna", "1 582 102"},
				{"6", "Port Harcourt", "Rivers", "1 148 665"},
				{"7", "Benin City", "Edo", "1 125 058"},
				{"8", "Maiduguri", "Borno", "1 112 449"},
				{"9", "Zaria", "Kaduna", "975 153"},
				{"10", "Aba", "Abia", "897 560"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		) {
			
			//Serialização
			private static final long serialVersionUID = 1L;
			
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(2).setPreferredWidth(113);
	    pane.addTab("Principais cidades", null, table, null);
		
		JPanel panel = new JPanel();
		pane.addTab("Sobre as cidades ", null, panel, null);
		
		JButton btnAba = new JButton("Aba");
		btnAba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Aba().setVisible(true);
				
			}
		});
		
		panel.add(btnAba);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnAba, popupMenu);
		


		JTextPane txtpnACidadeDe = new JTextPane();
		txtpnACidadeDe.setText("A cidade de Aba esta na 8\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe.setEditable(false);
		popupMenu.add(txtpnACidadeDe);
		
		
		
		
		JButton btnOnitsha = new JButton("Onitsha");
		btnOnitsha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Onitsha().setVisible(true);
				
			}
		});
		
		panel.add(btnOnitsha);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(btnOnitsha, popupMenu_1);
		
		
		
		JTextPane txtpnACidadeDe_1 = new JTextPane();
		txtpnACidadeDe_1.setEditable(false);
		txtpnACidadeDe_1.setText("A cidade de Onitsha esta na 1\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		popupMenu_1.add(txtpnACidadeDe_1);
		
		
		
		
		JButton btnKaduna = new JButton("Kaduna");
		btnKaduna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Cidade_Kaduna().setVisible(true);				
			}
		});
		panel.add(btnKaduna);
		
		JPopupMenu popupMenu_2 = new JPopupMenu();
		addPopup(btnKaduna, popupMenu_2);
		
		
		
		JTextPane txtpnACidadeDe_2 = new JTextPane();
		txtpnACidadeDe_2.setText("A cidade de Kaduna esta na 5\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo.");
		txtpnACidadeDe_2.setEditable(false);
		popupMenu_2.add(txtpnACidadeDe_2);
		
		
		
		
		JButton btnUmuahia = new JButton("Umuahia");
		btnUmuahia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 new Cidade_Umuahia().setVisible(true);	
				
			}
		});
		panel.add(btnUmuahia);
		
		JPopupMenu popupMenu_3 = new JPopupMenu();
		addPopup(btnUmuahia, popupMenu_3);
		
		
		
		JTextPane txtpnACidadeDe_3 = new JTextPane();
		txtpnACidadeDe_3.setText("A cidade de umuahia esta na 16\u00AA posi\u00E7\u00E3o das cidades mais poluidas do mundo. ");
		txtpnACidadeDe_3.setEditable(false);
		popupMenu_3.add(txtpnACidadeDe_3);
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
