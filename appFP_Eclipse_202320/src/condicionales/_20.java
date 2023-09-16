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

public class _20 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtnumero1, txtnumero2, txtnumero3, txtrpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_20 frame = new _20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblnumero1 = new JLabel("1º numero: ");
		lblnumero1.setBounds(50,50,1300,30);
		getContentPane().add(lblnumero1);
		
		JLabel lblnumero2 = new JLabel("2º numero: ");
		lblnumero2.setBounds(50,100,130,30);
		getContentPane().add(lblnumero2);
		
		JLabel lblnumero3 = new JLabel("3º numero: ");
		lblnumero3.setBounds(50,150,130,30);
		getContentPane().add(lblnumero3);
		
		JLabel lblrpta = new JLabel("Respuesta: ");
		lblrpta.setBounds(50,200,130,30);
		getContentPane().add(lblrpta);
		
		
		txtnumero1 = new JTextField();
		txtnumero1.setBounds(160,50,130,30);
		txtnumero1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnumero1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnumero1);
		
		txtnumero2 = new JTextField();
		txtnumero2.setBounds(160,100,130,30);
		txtnumero2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnumero2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnumero2);
		
		txtnumero3= new JTextField();
		txtnumero3.setBounds(160,150,130,30);
		txtnumero3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnumero3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnumero3);
		
		txtrpta = new JTextField();
		txtrpta.setBounds(160,200,130,30);
		txtrpta.setHorizontalAlignment(SwingConstants.RIGHT);
		txtrpta.setFocusable(false);
		txtrpta.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtrpta);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int num1 = Integer.parseInt(txtnumero1.getText());
				int num2 = Integer.parseInt(txtnumero2.getText());
				int num3 = Integer.parseInt(txtnumero3.getText());
				
				if ( num1 < num2  && num2 < num3 ) txtrpta.setText("Ascendente");
				else if ( num1 > num2 && num2 > num3) txtrpta.setText("Descendente");
				else txtrpta.setText("Desorden");

			}
		}); 
		
	}

}
