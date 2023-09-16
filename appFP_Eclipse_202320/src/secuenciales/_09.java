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

public class _09 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtSuma;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_09 frame = new _09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(50,50,80,30);
		getContentPane().add(lblNumero);
		
		JLabel lblSuma = new JLabel("Suma: ");
		lblSuma.setBounds(50,90,80,30);
		getContentPane().add(lblSuma);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(140, 50, 100, 30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);
		
		txtSuma = new JTextField();
		txtSuma.setBounds(140, 90, 100, 30);
		txtSuma.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSuma.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSuma);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 130, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
			
				int numero = Integer.parseInt(txtNumero.getText());
				int suma = 0;
				
				while (numero > 0) {
					suma = suma + (numero % 10);
					numero = numero / 10;
				}
			
				DecimalFormat df = new DecimalFormat("##");
				txtSuma.setText(df.format(suma) );

					
			}
		});
	}

}
