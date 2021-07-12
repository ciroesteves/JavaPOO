package projeto4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AW_faixa_etaria extends JFrame {

	private JPanel contentPane;
	private JTextField txtCri;
	private JTextField txtJov;
	private JTextField txtAdu;
	private JTextField txtIdo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_faixa_etaria frame = new AW_faixa_etaria();
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
	public AW_faixa_etaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FAIXA ET\u00C1RIA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(12, 13, 125, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idades");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 66, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Crian\u00E7as (0 - 14)");
		lblNewLabel_2.setBounds(192, 98, 105, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Jovens (15 - 25)");
		lblNewLabel_3.setBounds(192, 145, 105, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Adultos (26 - 59)");
		lblNewLabel_4.setBounds(192, 189, 105, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Idosos (60 ou mais)");
		lblNewLabel_5.setBounds(192, 245, 116, 16);
		contentPane.add(lblNewLabel_5);
		
		txtCri = new JTextField();
		txtCri.setHorizontalAlignment(SwingConstants.CENTER);
		txtCri.setEditable(false);
		txtCri.setBounds(315, 95, 105, 22);
		contentPane.add(txtCri);
		txtCri.setColumns(10);
		
		txtJov = new JTextField();
		txtJov.setHorizontalAlignment(SwingConstants.CENTER);
		txtJov.setEditable(false);
		txtJov.setBounds(314, 142, 106, 22);
		contentPane.add(txtJov);
		txtJov.setColumns(10);
		
		txtAdu = new JTextField();
		txtAdu.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdu.setEditable(false);
		txtAdu.setBounds(314, 186, 106, 22);
		contentPane.add(txtAdu);
		txtAdu.setColumns(10);
		
		txtIdo = new JTextField();
		txtIdo.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdo.setEditable(false);
		txtIdo.setBounds(315, 242, 105, 22);
		contentPane.add(txtIdo);
		txtIdo.setColumns(10);
		
		JTextArea areaIdades = new JTextArea();
		areaIdades.setFont(new Font("Monospaced", Font.PLAIN, 15));
		areaIdades.setEditable(false);
		areaIdades.setBounds(12, 95, 168, 429);
		contentPane.add(areaIdades);
		
		JButton btnNewButton = new JButton("Gerar Estat\u00EDstica");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faixa_etaria f = new faixa_etaria();
				int i, cri = 0, jov = 0, adu = 0, ido = 0;
				String lista;
				for(i=1;i<=20;i++) {
					f.GerarIdade();
					lista = f.idade + "\n";
					areaIdades.append(lista);
					if(f.idade <= 14) {
						cri++;
					}else if(f.idade > 14 && f.idade <= 25){
						jov++;
					}else if(f.idade > 25 && f.idade <= 59) {
						adu++;
					}else {
						ido++;
					}
				}
				txtCri.setText(String.valueOf(cri));
				txtJov.setText(String.valueOf(jov));
				txtAdu.setText(String.valueOf(adu));
				txtIdo.setText(String.valueOf(ido));
			}
		});
		btnNewButton.setBounds(235, 423, 144, 25);
		contentPane.add(btnNewButton);
	}

}
