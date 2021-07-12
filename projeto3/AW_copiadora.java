package projeto3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AW_copiadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtPreco;
	private JTextField txtCopias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_copiadora frame = new AW_copiadora();
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
	public AW_copiadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Copiadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(90, 13, 106, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lista de Preços");
		lblNewLabel_1.setBounds(94, 42, 91, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Preço Unitário");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(12, 67, 100, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cópias");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(12, 97, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JTextArea areaPrecos = new JTextArea();
		areaPrecos.setBounds(12, 140, 281, 373);
		contentPane.add(areaPrecos);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(177, 64, 116, 22);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		txtCopias = new JTextField();
		txtCopias.setBounds(177, 94, 116, 22);
		contentPane.add(txtCopias);
		txtCopias.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				copiadora c = new copiadora();
				c.preco_unit = Float.parseFloat(txtPreco.getText());
				int copias;
				copias = Integer.parseInt(txtCopias.getText());
				int i;
				String lista;
				for(i=1; i<=copias; i++) { 
					lista = i + " = " + c.CalcularPreco(i) + "\n";
					areaPrecos.append(lista);
				}
			}
		});
		btnCalcular.setBounds(106, 526, 97, 25);
		contentPane.add(btnCalcular);
	}
}
