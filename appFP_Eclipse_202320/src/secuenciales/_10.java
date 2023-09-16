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

public class _10 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtReversa;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_10 frame = new _10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Numero 4 cifras: ");
		lblNumero.setBounds(50,50,100,30);
		getContentPane().add(lblNumero);
		
		JLabel lblReversa = new JLabel("Numero al reves: ");
		lblReversa.setBounds(50,90,100,30);
		getContentPane().add(lblReversa);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(160, 50, 100, 30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);
		
		txtReversa = new JTextField();
		txtReversa.setBounds(160, 90, 100, 30);
		txtReversa.setHorizontalAlignment(SwingConstants.RIGHT);
		txtReversa.setFocusable(false);
		txtReversa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtReversa);
		
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
				
				int n4 = numero % 10;
				int n3 = (numero % 100) /10;
				int n2 = (numero % 1000) /100;
				int n1 = ( numero - ( numero % 1000)) / 1000;
				
				String numReversa = String.valueOf(n4) + String.valueOf(n3) + String.valueOf(n2) + String.valueOf(n1);
				
				txtReversa.setText(numReversa );
	
					
			}
		});
	}

}
