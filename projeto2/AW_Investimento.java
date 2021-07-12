package projeto2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class AW_Investimento extends JFrame {

	private JPanel contentPane;
	private JTextField txtVp;
	private JTextField txtTaxa;
	private JTextField txtPrazo;
	private JTextField txtVf;
	private JTextField txtTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_Investimento frame = new AW_Investimento();
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
	public AW_Investimento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INVESTIMENTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 21, 189, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor Presente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(32, 65, 99, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Taxa");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(32, 105, 99, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Prazo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(32, 141, 99, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Valor Futuro");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(32, 177, 99, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo Investimento");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(32, 213, 132, 23);
		contentPane.add(lblNewLabel_5);
		
		txtVp = new JTextField();
		txtVp.setBounds(284, 65, 116, 22);
		contentPane.add(txtVp);
		txtVp.setColumns(10);
		
		txtTaxa = new JTextField();
		txtTaxa.setBounds(284, 106, 116, 22);
		contentPane.add(txtTaxa);
		txtTaxa.setColumns(10);
		
		txtPrazo = new JTextField();
		txtPrazo.setBounds(284, 142, 116, 22);
		contentPane.add(txtPrazo);
		txtPrazo.setColumns(10);
		
		txtVf = new JTextField();
		txtVf.setEditable(false);
		txtVf.setBounds(284, 178, 116, 22);
		contentPane.add(txtVf);
		txtVf.setColumns(10);
		
		txtTipo = new JTextField();
		txtTipo.setEditable(false);
		txtTipo.setBounds(161, 214, 239, 22);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Investimento var_investimento = new Investimento();
				
				var_investimento.vp=Float.parseFloat(txtVp.getText());
				var_investimento.taxa=Float.parseFloat(txtTaxa.getText());
				var_investimento.prazo=Integer.parseInt(txtPrazo.getText());
				var_investimento.calcularVfuturo();
				txtVf.setText(NumberFormat.getCurrencyInstance().format(var_investimento.vf));
				var_investimento.mostrarTipo();
				txtTipo.setText(var_investimento.tipo);
			}
		});
		btnCalcular.setBounds(150, 284, 97, 25);
		contentPane.add(btnCalcular);
	}

}
