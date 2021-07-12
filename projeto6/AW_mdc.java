package projeto6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AW_mdc extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaior;
	private JTextField txtMenor;
	private JTextField txtMDC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_mdc frame = new AW_mdc();
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
	public AW_mdc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MDC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(178, 13, 132, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1o N\u00FAmero (maior)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(33, 72, 187, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2o N\u00FAmero (menor)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(33, 121, 187, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MDC");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(33, 180, 187, 36);
		contentPane.add(lblNewLabel_3);
		
		txtMaior = new JTextField();
		txtMaior.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaior.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMaior.setBounds(232, 80, 145, 28);
		contentPane.add(txtMaior);
		txtMaior.setColumns(10);
		
		txtMenor = new JTextField();
		txtMenor.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMenor.setBounds(232, 129, 145, 28);
		contentPane.add(txtMenor);
		txtMenor.setColumns(10);
		
		txtMDC = new JTextField();
		txtMDC.setHorizontalAlignment(SwingConstants.CENTER);
		txtMDC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMDC.setEnabled(false);
		txtMDC.setEditable(false);
		txtMDC.setBounds(232, 185, 145, 28);
		contentPane.add(txtMDC);
		txtMDC.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mdc m = new mdc();
				int maior = Integer.parseInt(txtMaior.getText());
				int menor = Integer.parseInt(txtMenor.getText());
				int mdc = m.CalcularMDC(maior, menor);
				String result = String.valueOf(mdc);
				txtMDC.setText(result);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCalcular.setBounds(207, 248, 97, 25);
		contentPane.add(btnCalcular);
	}

}
