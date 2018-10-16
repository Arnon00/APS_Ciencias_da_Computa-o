package MeioAmbiente;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UmPoucoDeCadaPais extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private JPanel contentPane;
	//private JTextField txtParaVisualizarA;
	private JTextField textFieldVisualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UmPoucoDeCadaPais login = new UmPoucoDeCadaPais();
					login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UmPoucoDeCadaPais() {
		
		setClosable(true);
		setTitle("Cidades mais poluidas");
		setSize(1006, 639);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JDesktopPane desktop6 = new JDesktopPane();
		desktop6.setBackground(Color.GRAY);
		desktop6.setBounds(0, 0, 990, 610);
		getContentPane().add(desktop6);
		desktop6.setLayout(null);
		

		JButton btnAfeganistao = new JButton("Afeganistao");
		btnAfeganistao.setBackground(new Color(153, 153, 153));
		btnAfeganistao.setToolTipText("Clique para obter informa\u00E7\u00F5es sobre a situa\u00E7\u00E3o do pais e alguns de seus estados.\r\n\r\n");
		btnAfeganistao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Pais_Afeganistao().setVisible(true);
				
			}
		});
	    btnAfeganistao.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Afeganistao.png")));
		btnAfeganistao.setBounds(41, 304, 215, 105);
		desktop6.add(btnAfeganistao);
		
		JPopupMenu popup1 = new JPopupMenu();
		addPopup(btnAfeganistao, popup1);
		
		JLabel lblAfeganistao = new JLabel("");
		lblAfeganistao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
              try {
					
					URI link = new URI("https://binged.it/2r7ZzG0");
					Desktop.getDesktop().browse(link); 
					
				}catch(Exception erro){
					System.out.println("Deu ruim isis!");

				}
			}
		});
		lblAfeganistao.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Afghanistan.globo.png")));
		popup1.add(lblAfeganistao);
		
		
		
		
		JButton btnArabia = new JButton("Arabia");
		btnArabia.setBackground(new Color(153, 153, 153));
		btnArabia.setToolTipText("Clique para obter informa\u00E7\u00F5es sobre a situa\u00E7\u00E3o do pais e alguns de seus estados.");
		btnArabia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Pais_Arabia().setVisible(true);
				
			}
		});
		btnArabia.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Arabia.png")));
		btnArabia.setBounds(656, 45, 215, 105);
		desktop6.add(btnArabia);
		
		JPopupMenu popup2 = new JPopupMenu();
		addPopup(btnArabia, popup2);
		
		JLabel lblArabia = new JLabel("");
		lblArabia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
                try {
					
					URI link = new URI("https://binged.it/2r7SSnb");
					Desktop.getDesktop().browse(link); 
					
				}catch(Exception erro){
					System.out.println("Deu ruim zé, AlakAgbar!");
					
				}
				
			}
		});
		lblArabia.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Saudi_Arabia.globo.png")));
		popup2.add(lblArabia);
		
		
		
		
		JButton btnBahrein = new JButton("Bahrein");
		btnBahrein.setBackground(new Color(153, 153, 153));
		btnBahrein.setToolTipText("Clique para obter informa\u00E7\u00F5es sobre a situa\u00E7\u00E3o do pais e alguns de seus estados.");
		btnBahrein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Pais_Bahrein().setVisible(true);
				
			}
		});
		btnBahrein.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Behien.png")));
		btnBahrein.setBounds(354, 45, 215, 105);
		desktop6.add(btnBahrein);
		
		JPopupMenu popup3 = new JPopupMenu();
		addPopup(btnBahrein, popup3);
		
		JLabel lblBahrein = new JLabel("");
		lblBahrein.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
                try {
					
					URI link = new URI("https://binged.it/2r7PVDc");
					Desktop.getDesktop().browse(link); 
					
				}catch(Exception erro){
					System.out.println("Deu ruim, com o país com nome de cerveja");
					
				}
				
			}
		});
		lblBahrein.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Bahrain.globo.png")));
		popup3.add(lblBahrein);
		
		
		
		
		JButton btnBrasil = new JButton("Brasil");
		btnBrasil.setBackground(new Color(153, 153, 153));
		btnBrasil.setToolTipText("Clique para obter informa\u00E7\u00F5es sobre a situa\u00E7\u00E3o do pais e alguns de seus estados.");
		btnBrasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Pais_Brasil().setVisible(true);
				
			}
		});
		btnBrasil.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Brazil.png")));
		btnBrasil.setBounds(656, 304, 215, 105);
		desktop6.add(btnBrasil);
		
		JPopupMenu popup4 = new JPopupMenu();
		addPopup(btnBrasil, popup4);
		
		JLabel lblBrasil = new JLabel("");
		lblBrasil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
                try {
					
					URI link = new URI("https://binged.it/2r7L598");
					Desktop.getDesktop().browse(link); 
					
				}catch(Exception erro){
					System.out.println("ta ligado, algo de certo esta errado!");
					
				}
				
			}
		});
		lblBrasil.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Brasil.globo.png")));
		popup4.add(lblBrasil);
		
		
		
		
		JButton btnChina = new JButton("China");
		btnChina.setBackground(new Color(153, 153, 153));
		btnChina.setToolTipText("Clique para obter informa\u00E7\u00F5es sobre a situa\u00E7\u00E3o do pais e alguns de seus estados.");
		btnChina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Pais_China().setVisible(true);
				
			}
		});
		btnChina.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/China.png")));
		btnChina.setBounds(656, 174, 215, 105);
		desktop6.add(btnChina);
		
		JPopupMenu popup5 = new JPopupMenu();
		addPopup(btnChina, popup5);
		
		JLabel lblChina = new JLabel("");
		lblChina.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
                 try {
					
					URI link = new URI("https://binged.it/2r7NEYu");
					Desktop.getDesktop().browse(link); 
					
				}catch(Exception erro){
					System.out.println("Deu ruim zé-chan!");
					
				}
				
			}
		});
		lblChina.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/China.globo.png")));
		popup5.add(lblChina);
		
		
		
		
		JButton btnIndia = new JButton("India");
		btnIndia.setForeground(new Color(0, 0, 0));
		btnIndia.setBackground(new Color(153, 153, 153));
		btnIndia.setToolTipText("Clique para obter informa\u00E7\u00F5es sobre a situa\u00E7\u00E3o do pais e alguns de seus estados.");
		btnIndia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Pais_India().setVisible(true);
			
			}
		});
		btnIndia.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/India.png")));
		btnIndia.setBounds(41, 45, 215, 105);
		desktop6.add(btnIndia);
		
		JPopupMenu popup6 = new JPopupMenu();
		addPopup(btnIndia, popup6);
		
		JLabel lblIndia = new JLabel("A parte em verde claro representa o territ\u00F3rio disputado da Caxemira (que inclui reivindica\u00E7\u00F5es de Paquist\u00E3o e China)");
		lblIndia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
                try {
					
					URI link = new URI("https://binged.it/2r7ALxO");
					Desktop.getDesktop().browse(link); 
					
				}catch(Exception erro){
					System.out.println("Deu ruim, Esquece a India!");
					
				}
				
			}
		});
		lblIndia.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/India.globo.png")));
		popup6.add(lblIndia);
		
		
		
		
		JButton btnIran = new JButton("Iran");
		btnIran.setBackground(new Color(153, 153, 153));
		btnIran.setToolTipText("Clique para obter informa\u00E7\u00F5es sobre a situa\u00E7\u00E3o do pais e alguns de seus estados.\r\n");
		btnIran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Pais_Iran().setVisible(true);
				
			}
		});
		btnIran.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Iran.png")));
		btnIran.setBounds(41, 174, 215, 105);
		desktop6.add(btnIran);
		
		JPopupMenu popup7 = new JPopupMenu();
		addPopup(btnIran, popup7);
		
		JLabel lblIran = new JLabel("");
		lblIran.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
                try {
					
					URI link = new URI("https://binged.it/2q8V2Wi");
					Desktop.getDesktop().browse(link); 
					
				}catch(Exception erro){
					System.out.println("Deu ruim zézinho sheik, !");
					
				}
				
			}
		});
		lblIran.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Iran.globo.png")));
		popup7.add(lblIran);
		
		
		
		
		JButton btnNigeria = new JButton("Nigeria");
		btnNigeria.setBackground(new Color(153, 153, 153));
		btnNigeria.setToolTipText("Clique para obter informa\u00E7\u00F5es sobre a situa\u00E7\u00E3o do pais e alguns de seus estados.");
		btnNigeria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Pais_Nigeria().setVisible(true);				
			
			}
		});
		btnNigeria.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Nigeria.png")));
		btnNigeria.setBounds(354, 304, 215, 105);
		desktop6.add(btnNigeria);
		
		JPopupMenu popup8 = new JPopupMenu();
		addPopup(btnNigeria, popup8);
		
		JLabel lblNigeria = new JLabel("");
		lblNigeria.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
                 try {
					
					URI link = new URI("https://binged.it/2q9fxCl");
					Desktop.getDesktop().browse(link); 
					
				}catch(Exception erro){
					System.out.println("Deu ruim... hum...!");
					
				}
				
			}
		});
		lblNigeria.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Nigeria.globo.png")));
		popup8.add(lblNigeria);
		
		
		
		
		JButton btnPaquistao = new JButton("Paquistão");
		btnPaquistao.setBackground(new Color(153, 153, 153));
		btnPaquistao.setToolTipText("Clique para obter informa\u00E7\u00F5es sobre a situa\u00E7\u00E3o do pais e alguns de seus estados.");
		btnPaquistao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Pais_Paquistao().setVisible(true);
				
			}
		});
		btnPaquistao.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Paquistao.png")));
		btnPaquistao.setBounds(354, 174, 215, 105);
		desktop6.add(btnPaquistao);
		
		JPopupMenu popup9 = new JPopupMenu();
		addPopup(btnPaquistao, popup9);
		
		JLabel lblPaquistao = new JLabel("");
		lblPaquistao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
                try {
					
					URI link = new URI("https://binged.it/2q9eNgp");
					Desktop.getDesktop().browse(link); 
					
				}catch(Exception erro){
					System.out.println("Deu ruim zé das areias!");
					
				}
				
			}
		});
		lblPaquistao.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/Paquistao.globo.png")));
		popup9.add(lblPaquistao);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 987, 21);
		desktop6.add(menuBar);
		
		JMenu MenuItem = new JMenu("Menu");
		menuBar.add(MenuItem);
		
		JMenuItem Sair = new JMenuItem("Sair");
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaOpcoes().setVisible(true);
				
			}
		});
		MenuItem.add(Sair);
		
		
		
		textFieldVisualizar = new JTextField("        Para visualizar a localidade de cada país no globo, clique com o botão direito sobre o bandeira.");
		textFieldVisualizar.setBounds(90, 523, 836, 37);
		desktop6.add(textFieldVisualizar);
		textFieldVisualizar.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textFieldVisualizar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UmPoucoDeCadaPais.class.getResource("/MeioAmbiente/resTelas/foglia-con-rugiada.jpg")));
		lblNewLabel.setBackground(new Color(204, 204, 204));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(0, 21, 987, 587);
		desktop6.add(lblNewLabel);
		
		
		
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
