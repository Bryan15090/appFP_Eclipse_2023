package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _11 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtIntercambio, txtNumero2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_11 frame = new _11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("1er Numero de 3 cifras: ");
		lblNumero.setBounds(50,50,150,30);
		getContentPane().add(lblNumero);
		
		JLabel lblNumero2 = new JLabel("2do Numero de 3 cifras: ");
		lblNumero2.setBounds(50,90,150,30);
		getContentPane().add(lblNumero2);
		
		
		JLabel lblIntercambio = new JLabel("Numeros intercambiados: ");
		lblIntercambio.setBounds(50,130,150,30);
		getContentPane().add(lblIntercambio);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(200, 50, 100, 30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(200, 90, 100, 30);
		txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero2);
		
		txtIntercambio = new JTextField();
		txtIntercambio.setBounds(200, 130, 100, 30);
		txtIntercambio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIntercambio.setFocusable(false);
		txtIntercambio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtIntercambio);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 170, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
			
				int numero = Integer.parseInt(txtNumero.getText());
				int numero2 = Integer.parseInt(txtNumero2.getText());
				
				int n3 = numero % 10;
				int n2 = ( numero % 100 ) /10;
				int n1 = ( numero - ( numero % 100 ) ) / 100;
				
				int nu3 = numero2 % 10 ;
				int nu2 = ( numero2 % 100 ) / 10 ;
				int nu1 = ( numero2 - ( numero % 100 ) ) / 100;
				
				String intercambio =  String.valueOf(nu3) + String.valueOf(n2) + String.valueOf(nu1) +" "+ "y"+" " + String.valueOf(n3) + String.valueOf(nu2) + String.valueOf(n1);
				
				txtIntercambio.setText(intercambio );
	
					
			}
		});
	}

}
