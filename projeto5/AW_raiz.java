package projeto5;

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

public class AW_raiz extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtRQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_raiz frame = new AW_raiz();
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
	public AW_raiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RAIZ QUADRADA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(66, 13, 229, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(28, 89, 116, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Raiz Quadrada");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(28, 138, 116, 22);
		contentPane.add(lblNewLabel_2);
		
		txtNum = new JTextField();
		txtNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNum.setBounds(179, 86, 116, 22);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtRQ = new JTextField();
		txtRQ.setHorizontalAlignment(SwingConstants.CENTER);
		txtRQ.setEnabled(false);
		txtRQ.setEditable(false);
		txtRQ.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtRQ.setBounds(179, 139, 172, 22);
		contentPane.add(txtRQ);
		txtRQ.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				raiz rq = new raiz();
				int num = Integer.parseInt(txtNum.getText());
				rq.CalcularRQ(num, 0);
				String result;
				if(rq.r != 0) {
					result = "Entre " + (rq.contador-1) + " e " + (rq.contador);
				} else {
					result = "É " + rq.contador;
				}
				txtRQ.setText(result);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalcular.setBounds(133, 201, 97, 25);
		contentPane.add(btnCalcular);
	}
}
