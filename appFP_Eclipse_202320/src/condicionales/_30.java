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

public class _30 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtCuota, txtDia, txtPago;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_30 frame = new _30();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _30() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCuota = new JLabel("cuota: ");
		lblCuota.setBounds(50,50,80,30);
		getContentPane().add(lblCuota);
		
		JLabel lblDias = new JLabel("Dias");
		lblDias.setBounds(50,100,80,30);
		getContentPane().add(lblDias);
		
		JLabel lblPago = new JLabel("Pago");
		lblPago.setBounds(50,150,80,30);
		getContentPane().add(lblPago);
		
		txtCuota = new JTextField();
		txtCuota.setBounds(140,50,80,30);
		txtCuota.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCuota.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCuota);
		
		txtDia = new JTextField();
		txtDia.setBounds(140,100,80,30);
		txtDia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDia.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDia);
		
		txtPago = new JTextField();
		txtPago.setBounds(140,150,80,30);
		txtPago.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPago.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPago);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,200,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int cuota = Integer.parseInt(txtCuota.getText());
				int dia = Integer.parseInt(txtDia.getText());
				
				double descuento = 0;
				if ( dia<=10) descuento = -Math.max(5, 0.02 * cuota);
				else if  ( dia >= 20 ) descuento = Math.max(10, 0.03 * cuota);
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtPago.setText(df.format( cuota + descuento ));
				
			
			}
		}); 
		
	}

}
