package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import javax.swing.DropMode;

public class AW_IMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtIMC;
	private JTextField txtClassific;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_IMC frame = new AW_IMC();
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
	public AW_IMC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPeso = new JTextField();
		txtPeso.setHorizontalAlignment(SwingConstants.CENTER);
		txtPeso.setBounds(152, 101, 116, 22);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setHorizontalAlignment(SwingConstants.CENTER);
		txtAltura.setBounds(152, 152, 116, 22);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtIMC = new JTextField();
		txtIMC.setHorizontalAlignment(SwingConstants.CENTER);
		txtIMC.setEditable(false);
		txtIMC.setBounds(152, 197, 116, 22);
		contentPane.add(txtIMC);
		txtIMC.setColumns(10);
		
		txtClassific = new JTextField();
		txtClassific.setHorizontalAlignment(SwingConstants.CENTER);
		txtClassific.setEditable(false);
		txtClassific.setBounds(152, 244, 116, 22);
		contentPane.add(txtClassific);
		txtClassific.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IMC var_imc = new IMC();
				var_imc.peso = Float.parseFloat(txtPeso.getText());
				var_imc.altura = Float.parseFloat(txtAltura.getText());
				var_imc.calcularIMC();
				DecimalFormat df = new DecimalFormat("#0.0");
				txtIMC.setText(df.format(var_imc.imc));
				var_imc.mostrarClassificacao();
				txtClassific.setText(var_imc.classific);
			}
		});
		btnCalcular.setBounds(159, 320, 97, 25);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel = new JLabel("Peso");
		lblNewLabel.setBounds(40, 104, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("IMC");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(180, 31, 56, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setBounds(40, 155, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("IMC");
		lblNewLabel_3.setBounds(40, 200, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Classifica\u00E7\u00E3o");
		lblNewLabel_4.setBounds(40, 247, 97, 16);
		contentPane.add(lblNewLabel_4);
	}
}
