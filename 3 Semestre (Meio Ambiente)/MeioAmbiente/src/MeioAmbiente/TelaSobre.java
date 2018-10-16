package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextArea;
import javax.swing.ImageIcon;
import java.awt.Font;

public class TelaSobre extends JFrame {

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
					TelaSobre frame = new TelaSobre();
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
	public TelaSobre() {
		
		setTitle("Sobre");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblImagemmundo = new JLabel("Imagem_mundo");
		lblImagemmundo.setIcon(new ImageIcon(TelaSobre.class.getResource("/MeioAmbiente/resTelas/Mundo-meioAmbiente.png")));
		lblImagemmundo.setBounds(0, 0, 213, 261);
		contentPane.add(lblImagemmundo);
		
		TextArea textArea = new TextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea.setText("\r\nDesenvolvedores\r\n___\r\n\r\nArnon D. Neves\r\n\r\nVinicius Diniz Carlos Prudencio\r\n_________________________________\r\n\r\nPesquisadores\r\n___\r\n\r\nRanyelle Lisboa\r\n\r\nRodrigo Zago");
		textArea.setBounds(214, 0, 295, 261);
		contentPane.add(textArea);
		setLocationRelativeTo(null);
	}
}
