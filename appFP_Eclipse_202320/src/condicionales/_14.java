package condicionales;

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

public class _14 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txttarjeta, txtcompra, txtdescuento;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_14 frame = new _14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lbltarjeta = new JLabel("Numero de tarjeta: ");
		lbltarjeta.setBounds(50,50,130,30);
		getContentPane().add(lbltarjeta);
		
		JLabel lblcompra = new JLabel("Monto de compra: ");
		lblcompra.setBounds(50,100,130,30);
		getContentPane().add(lblcompra);
		
		JLabel lbldescuento = new JLabel("Descuento: ");
		lbldescuento.setBounds(50,150,130,30);
		getContentPane().add(lbldescuento);
		
		txttarjeta = new JTextField();
		txttarjeta.setBounds(170,50,80,30);
		txttarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		txttarjeta.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txttarjeta);
		
		txtcompra = new JTextField();
		txtcompra.setBounds(170,100,80,30);
		txtcompra.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcompra.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcompra);
		
		txtdescuento = new JTextField();
		txtdescuento.setBounds(170,150,80,30);
		txtdescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdescuento.setFocusable(false);
		txtdescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtdescuento);
				
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,200,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int tarjeta = Integer.parseInt(txttarjeta.getText());
				int compra = Integer.parseInt(txtcompra.getText());
				
				double descuento ;
				if (tarjeta % 2 == 0 && tarjeta >= 100) {
					descuento = compra * 0.15;
				}else {
					descuento= compra * 0.05;
				}
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtdescuento.setText(df.format(descuento));
	
			}
		}); 
		
	}

}
