package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class _06 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtRadio, txtAltura, txtArea, txtVolumen;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_06 frame = new _06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblRadio = new JLabel("Radio: ");
		lblRadio.setBounds(50,50,80,30);
		getContentPane().add(lblRadio);
		
		JLabel lblAltura = new JLabel("Altura: ");
		lblAltura.setBounds(50,90,80,30);
		getContentPane().add(lblAltura);
		
		JLabel lblArea = new JLabel("Area: ");
		lblArea.setBounds(50,130,80,30);
		getContentPane().add(lblArea);
		
		JLabel lblVolumen = new JLabel("Altura: ");
		lblVolumen.setBounds(50,170,80,30);
		getContentPane().add(lblVolumen);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(140, 50, 100, 30);
		txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRadio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRadio);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(140, 90, 100, 30);
		txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAltura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAltura);
		
		txtArea = new JTextField();
		txtArea.setBounds(140, 130, 100, 30);
		txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
		txtArea.setFocusable(false);
		txtArea.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtArea);
		
		txtVolumen = new JTextField();
		txtVolumen.setBounds(140, 170, 100, 30);
		txtVolumen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVolumen.setFocusable(false);
		txtVolumen.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVolumen);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 210, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
			
				double radio = Double.parseDouble ( txtRadio.getText() );
				double altura = Double.parseDouble ( txtAltura.getText() );
				
				double area = 2 * Math.PI * radio * (radio + altura);
				double volumen = Math.PI * Math.pow(radio, 2)* altura;
			
				DecimalFormat df = new DecimalFormat("##.00");
				txtArea.setText(df.format(area) );
				txtVolumen.setText(df.format(volumen));
					
			}
		});
	}

}
