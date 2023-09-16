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

public class _26 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtcompra, txtpago;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_26 frame = new _26();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _26() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblcompra = new JLabel("Monto compra: ");
		lblcompra.setBounds(50,50,100,30);
		getContentPane().add(lblcompra);
		
		JLabel lblpago = new JLabel("Pago empresa: ");
		lblpago.setBounds(50,100,100,30);
		getContentPane().add(lblpago);
		
		txtcompra = new JTextField();
		txtcompra.setBounds(140,50,80,30);
		txtcompra.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcompra.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcompra);
		
		txtpago = new JTextField();
		txtpago.setBounds(140,100,80,30);
		txtpago.setHorizontalAlignment(SwingConstants.RIGHT);
		txtpago.setFocusable(false);
		txtpago.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtpago);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,150,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int montoCompra = Integer.parseInt(txtcompra.getText());
				
				 double prestamo;
			        double propioDinero;
			        
			        if (montoCompra > 5000) {
			            prestamo = montoCompra * 0.3;
			        } else {
			            prestamo = montoCompra * 0.2;
			        }
			       
			        
			        double interes = prestamo * 0.1;
			        propioDinero = montoCompra - prestamo - interes;
			        
			        DecimalFormat df = new DecimalFormat("##.00");
			        txtpago.setText(df.format(propioDinero));

			}
		}); 
		
	}

}
