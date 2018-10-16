package MeioAmbiente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.TextArea;
import java.awt.Font;
import java.awt.Color;

public class TelaInformacoes extends JFrame {

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
					TelaInformacoes frame = new TelaInformacoes();
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
	public TelaInformacoes() {
		setTitle("Informa\u00E7\u00F5es do Programa");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setBounds(100, 100, 910, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setForeground(Color.DARK_GRAY);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setText("\n\nHOME - PAGINA PRINCIPAL. (Essa permite acesso a todas as paginas).)"
				+ "\n\n\nPAGINA DO LOGIN. (Essa permite acesso a HOME PAGE (Pagina que contém o conteúdo do programa)."
				+ "\n\n\nPAGINA DE CADASTRO (Essa permite acesso a HOME PAGE (Pagina que contém o conteúdo do programa)."
				+ "\n\n\nHOME PAGE (Essa contém um conteúdo base sobre o meio ambiente (Essa permite acesso a pagina UM "
				+ "POUCO DE CADA PAÍS (Essa contém informações sobre o meio ambiente de cada pais e estado) e também permite "
				+ "acesso a pagina MELHORANDO NOSSO MEIO AMBIENTE (Essa contém dicas divididas por topicos como melhorar nosso meio ambiente)."
				+ "\n\n\nPAGINA MELHORANDO NOSSO MEIO AMBIENTE (Essa contém dicas divididas por topicos como melhorar nosso meio ambiente)."
				+ "\n\n\nPAGINA UM POUCO DE CADA PAÍS (Essa contém informações sobre o meio ambiente de cada pais e estado)."
				+ "\n\n\nOBS: CADA PAGINA CON´TEM UM MENU PARA ACESSO A OUTRAS E PARA MAIS INFORMAÇÕES.");
		textArea.setBounds(310, 0, 584, 391);
		contentPane.add(textArea);
		
		JLabel lblImageminformacoes = new JLabel("ImagemInformacoes");
		lblImageminformacoes.setIcon(new ImageIcon(TelaInformacoes.class.getResource("/MeioAmbiente/resTelas/MeioAmbiente.png")));
		lblImageminformacoes.setBounds(0, 0, 304, 391);
		contentPane.add(lblImageminformacoes);
		setLocationRelativeTo(null);
	}
}
