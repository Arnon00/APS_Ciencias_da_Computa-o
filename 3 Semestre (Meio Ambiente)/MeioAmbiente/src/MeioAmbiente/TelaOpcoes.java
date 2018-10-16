package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaOpcoes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				 try{
						
						
					    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
					        if ("Nimbus".equals(info.getName())) {
					            UIManager.setLookAndFeel(info.getClassName());
					            break;
					        }
					    }
					} catch (Exception e) {
					    // If Nimbus is not available, you can set the GUI to another look and feel.
					}
				
				try {
					TelaOpcoes frame = new TelaOpcoes();
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
	public TelaOpcoes() {
		setTitle("Op\u00E7\u00F5es\r\n");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 290, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Obrigado pela sua visita! Esperamos"
				+ " que nossas informações o tenha ajudado para o melhorar do nosso meio ambiente ! Te esperamos novamente !");
				
				System.exit(0);
			}
		});
		btnSair.setBounds(20, 50, 100, 29);
		contentPane.add(btnSair);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		btnCancelar.setBounds(149, 50, 100, 29);
		contentPane.add(btnCancelar);
		
		JButton btnInformações = new JButton("Informações Sobre o Programa");
		btnInformações.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TelaInformacoes().setVisible(true);
				
			}
		});
		btnInformações.setBounds(20, 90, 229, 29);
		contentPane.add(btnInformações);
		
		
		JLabel lblOpcoes = new JLabel("Are you sure wish quit ?");
		lblOpcoes.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblOpcoes.setBounds(20, 11, 229, 23);
		contentPane.add(lblOpcoes);
	}
}
