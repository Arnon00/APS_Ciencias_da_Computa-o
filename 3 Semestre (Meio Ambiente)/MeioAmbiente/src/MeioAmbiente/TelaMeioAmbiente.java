package MeioAmbiente;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaMeioAmbiente extends JInternalFrame {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFotoSuppryreproduo;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMeioAmbiente frame = new TelaMeioAmbiente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public TelaMeioAmbiente(){
		
		setTitle("Melhorar Nosso Meio Ambiente\r\n");
		setClosable(true);
		setSize(993, 516);
		getContentPane().setLayout(null);
		
	 
		JDesktopPane desktop5 = new JDesktopPane();
		desktop5.setBounds(0, 0, 979, 474);
		getContentPane().add(desktop5);
		desktop5.setBackground(new Color(0, 206, 209));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 979, 21);
		desktop5.add(menuBar);
		
		JMenu Menu = new JMenu("Menu");
		menuBar.add(Menu);
		
		JMenuItem Sair = new JMenuItem("Sair");
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaOpcoes().setVisible(true);
				
			}
		});
		Menu.add(Sair);
		
		JLabel lblDicasSobreComo = new JLabel("   Dicas Sobre Como Podemos Melhorar Nosso Meio Ambiente");
		lblDicasSobreComo.setForeground(new Color(255, 255, 255));
		lblDicasSobreComo.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblDicasSobreComo.setBounds(42, 40, 899, 55);
		desktop5.add(lblDicasSobreComo);
		

		JButton btnDesmatamento = new JButton("Desmatamento");
		btnDesmatamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaDesmatamento().setVisible(true);
				
			}
		});
		btnDesmatamento.setForeground(new Color(0, 128, 0));
		btnDesmatamento.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnDesmatamento.setBounds(10, 106, 200, 55);
		desktop5.add(btnDesmatamento);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnDesmatamento, popupMenu);
		
		JLabel lblDesmatamento = new JLabel("Desmatamento");
		popupMenu.add(lblDesmatamento);
		
		
		
		
		JButton btnSustentabilidade = new JButton("Sustentabilidade");
		btnSustentabilidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaSustentabilidade().setVisible(true);
						
				
			}
		});
		btnSustentabilidade.setForeground(new Color(0, 128, 0));
		btnSustentabilidade.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnSustentabilidade.setBounds(44, 394, 200, 55);
		desktop5.add(btnSustentabilidade);
		
		JPopupMenu popup2 = new JPopupMenu();
		addPopup(btnSustentabilidade, popup2);
		
		JLabel lblGarrafasdevidro = new JLabel("Sustentabilidade");
		popup2.add(lblGarrafasdevidro);
		
		
		
		
		JButton btnAlimentos = new JButton("Alimentos");
		btnAlimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaAlimentos().setVisible(true);
				
			}
		});
		btnAlimentos.setForeground(new Color(0, 128, 0));
		btnAlimentos.setFont(new Font("Arial Black", Font.PLAIN, 12));
		desktop5.add(btnAlimentos);
		btnAlimentos.setBounds(364, 106, 200, 55);
		
		JPopupMenu popup3 = new JPopupMenu();
		addPopup(btnAlimentos, popup3);
		
		JLabel lblAlimentos = new JLabel("Alimentos");
		popup3.add(lblAlimentos);
		
		
		
		
		JButton btnEnergia = new JButton("Energia");
		btnEnergia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaEnergia().setVisible(true);
				
			}
		});
		btnEnergia.setForeground(new Color(0, 128, 0));
		btnEnergia.setFont(new Font("Arial Black", Font.PLAIN, 11));
		desktop5.add(btnEnergia);
		btnEnergia.setBounds(403, 394, 200, 55);
		
		JPopupMenu popup4 = new JPopupMenu();
		addPopup(btnEnergia, popup4);
		
		JLabel lblEnergia = new JLabel("Energia");
		popup4.add(lblEnergia);
		
		
		
		
		JButton btnCarregadores = new JButton("Agua");
		btnCarregadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			new TelaAgua().setVisible(true);	
			
			}
		});
		btnCarregadores.setForeground(new Color(0, 128, 0));
		btnCarregadores.setFont(new Font("Arial Black", Font.PLAIN, 12));
		desktop5.add(btnCarregadores);
		btnCarregadores.setBounds(625, 304, 200, 55);
		
		JPopupMenu popup5 = new JPopupMenu();
		addPopup(btnCarregadores, popup5);
		
		JLabel lblCarregadores = new JLabel("Agua");
		popup5.add(lblCarregadores);
		
		
	    
		
		JButton btnRoupasEBrinquedosEOutros = new JButton("Consumo Verde");
		btnRoupasEBrinquedosEOutros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaConsumo().setVisible(true);
				
			}
		});
	    btnRoupasEBrinquedosEOutros.setForeground(new Color(0, 128, 0));
	    desktop5.add(btnRoupasEBrinquedosEOutros);
	    btnRoupasEBrinquedosEOutros.setFont(new Font("Arial Black", Font.PLAIN, 12));
	    btnRoupasEBrinquedosEOutros.setBounds(137, 306, 290, 50);
	    
	    JPopupMenu popup6 = new JPopupMenu();
	    addPopup(btnRoupasEBrinquedosEOutros, popup6);
	    
	    JLabel lblProdutosEOutros = new JLabel("Produtos");
	    popup6.add(lblProdutosEOutros);
	    
	   
	    
	    JButton btnTransportes = new JButton("Transportes");
	    btnTransportes.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		new TelaTransportes().setVisible(true);
	    		
	    	}
	    });
	    btnTransportes.setForeground(new Color(0, 128, 0));
	    desktop5.add(btnTransportes);
	    btnTransportes.setFont(new Font("Arial Black", Font.PLAIN, 12));
	    btnTransportes.setBounds(565, 206, 200, 55);
	    
	    JPopupMenu popup7 = new JPopupMenu();
	    addPopup(btnTransportes, popup7);
	    
	    JLabel lblLiquidos = new JLabel("Transporte");
	    popup7.add(lblLiquidos);
	    
	   
	    
	   
	    JButton btnEletronicos = new JButton("Lixo Eletronico");
	    btnEletronicos.setBackground(new Color(255, 255, 255));
	    btnEletronicos.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		new TelaLixoEletronico().setVisible(true);
	    		
	    	}
	    });
	    btnEletronicos.setForeground(new Color(0, 128, 0));
	    btnEletronicos.setFont(new Font("Arial Black", Font.PLAIN, 12));
	    btnEletronicos.setBounds(181, 206, 200, 55);
	    desktop5.add(btnEletronicos);
	    
	    JPopupMenu popup8 = new JPopupMenu();
	    addPopup(btnEletronicos, popup8);
	    
	   
	    JLabel lblAgua = new JLabel("Eletronicos");
	    popup8.add(lblAgua);
	    
	    txtFotoSuppryreproduo = new JTextField();
	    txtFotoSuppryreproduo.setEnabled(false);
	    txtFotoSuppryreproduo.setEditable(false);
	    txtFotoSuppryreproduo.setHorizontalAlignment(SwingConstants.CENTER);
	    txtFotoSuppryreproduo.setText("Foto: Suppry/Reprodu\u00E7\u00E3o");
	    txtFotoSuppryreproduo.setBounds(804, 442, 152, 32);
	    desktop5.add(txtFotoSuppryreproduo);
	    txtFotoSuppryreproduo.setColumns(10);
	    
	    JLabel lblNewLabel = new JLabel("New label");
	    lblNewLabel.setIcon(new ImageIcon(TelaMeioAmbiente.class.getResource("/MeioAmbiente/resTelas/ambiente-2.jpeg")));
	    lblNewLabel.setBounds(-95, 11, 1074, 487);
	    desktop5.add(lblNewLabel);
		
		
		
	

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
