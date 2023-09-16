package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _13 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_13 frame = new _13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(50,50,80,30);
		getContentPane().add(lblNumero);
		
		JLabel lblDias = new JLabel("Respuesta: ");
		lblDias.setBounds(50,100,80,30);
		getContentPane().add(lblDias);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(140,50,130,30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);
		
		txtRpta = new JTextField();
		txtRpta.setBounds(140,100,130,30);
		txtRpta.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRpta.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRpta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,160,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int numero = Integer.parseInt(txtNumero.getText());
				
				double  n3 = numero % 10;
				double n2 = (numero /10) % 10;
				double  n1 = numero / 100;
				
				if ((n1 == n2 - 1 && n2 == n3 - 1) || (n1 == n2 + 1 && n2 == n3 + 1)) {
					txtRpta.setText("Consecutivo");
					
				}else {
					txtRpta.setText("No consecutivo");
				}
				
			}
		}); 
		
	}

}
