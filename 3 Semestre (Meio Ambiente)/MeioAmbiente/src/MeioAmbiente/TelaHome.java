package MeioAmbiente;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaHome extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFotoSuppryreproduo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHome frame = new TelaHome();
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
	public TelaHome() {
		setTitle("Cincientiza\u00E7\u00E3o");
	
		setClosable(true);
		setRootPaneCheckingEnabled(false);
		setSize(1008, 560);
		getContentPane().setLayout(null);
		
		JDesktopPane desktop4 = new JDesktopPane();
		desktop4.setBackground(new Color(154, 205, 50));
		desktop4.setLocation(0, 0);
		desktop4.setSize(987, 560);
		getContentPane().add(desktop4);
		
		JTextArea InformacoesDoMeioAmbiente = new JTextArea("     Existem lugares e estes s\u00E3o muitos em que nosso meio ambiente n\u00E3o est\u00E1 nada legal, pra ser melhor, quase em todo o mundo tem acontecido alguns desastres, na maioria das vezes criado pelo ser humano que tem devastado belezas naturais com varias a\u00E7oes que s\u00F3 perderemos o que encanta nossos olhos a cada dia, e rapidamente; e como bons cidad\u00E3os, podemos reverter esse processo de destrui\u00E7\u00E3o em que temos causado para o meio ambiente e ao inves de vermos nossas arvores, rios e varios outros fatores da natureza entrando num processo degressivo, se tornar um processo produtivo e vermos cada dia mais arvores e nossa cidade cada vez mais linda, mais verde, um respirar e viver melhor !");
		InformacoesDoMeioAmbiente.setLineWrap(true);
		InformacoesDoMeioAmbiente.setEditable(false);
				
	
		InformacoesDoMeioAmbiente.setBackground(new Color(255, 255, 255));
		InformacoesDoMeioAmbiente.setForeground(new Color(85, 107, 47));
	
		InformacoesDoMeioAmbiente.setBounds(38, 82, 655, 277);
		desktop4.add(InformacoesDoMeioAmbiente);
		
		JLabel lblMelhorandoNossoMeio = new JLabel(" Melhorando Nosso Meio Ambiente");
		lblMelhorandoNossoMeio.setBackground(new Color(192, 192, 192));
		lblMelhorandoNossoMeio.setForeground(new Color(255, 255, 255));
		lblMelhorandoNossoMeio.setFont(new Font("Monospaced", Font.PLAIN, 25));
		lblMelhorandoNossoMeio.setBounds(30, 19, 530, 34);
		desktop4.add(lblMelhorandoNossoMeio);
		
		JLabel ArvoreArtistica = new JLabel("Arvore");
		ArvoreArtistica.setIcon(new ImageIcon(TelaHome.class.getResource("/MeioAmbiente/resTelas/ArvoreArtistica.png")));
		ArvoreArtistica.setBounds(720, 69, 246, 290);
		desktop4.add(ArvoreArtistica);
		
		JButton MelhorandoMeioAmbiente = new JButton("Melhorando o Meio Ambiente!");
		MelhorandoMeioAmbiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaMeioAmbiente tma = new TelaMeioAmbiente();
				desktop4.add(tma);
				
				tma.setVisible(true);
				
			}
		});
		MelhorandoMeioAmbiente.setBounds(38, 370, 230, 59);
		desktop4.add(MelhorandoMeioAmbiente);
		
		txtFotoSuppryreproduo = new JTextField();
		txtFotoSuppryreproduo.setHorizontalAlignment(SwingConstants.CENTER);
		txtFotoSuppryreproduo.setEnabled(false);
		txtFotoSuppryreproduo.setEditable(false);
		txtFotoSuppryreproduo.setText("Foto: Suppry/Reprodu\u00E7\u00E3o");
		txtFotoSuppryreproduo.setBounds(822, 486, 155, 26);
		desktop4.add(txtFotoSuppryreproduo);
		txtFotoSuppryreproduo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaHome.class.getResource("/MeioAmbiente/resTelas/ambiente-2.jpeg")));
		lblNewLabel.setBounds(-179, 0, 1176, 512);
		desktop4.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu MenuHomePage = new JMenu("Menu Home Page");
		menuBar.add(MenuHomePage);
		
		JMenuItem AmbienteMundial = new JMenuItem("Ambiente Mundial");
		MenuHomePage.add(AmbienteMundial);
		
		JMenuItem Sair = new JMenuItem("Sair");
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaOpcoes().setVisible(true);
				
			}
		});
		MenuHomePage.add(Sair);
		
		JMenu Informacoes = new JMenu("Informacões");
		menuBar.add(Informacoes);
		
		JMenuItem Sobre = new JMenuItem("Sobre");
		Informacoes.add(Sobre);


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
