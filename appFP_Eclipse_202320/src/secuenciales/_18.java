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

public class _18 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtCantidad, txtPrecio, txtImporte, txtDescuento, txtPagar;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_18 frame = new _18();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCantidad = new JLabel("Cantidad: ");
		lblCantidad.setBounds(50,50,130,30);
		getContentPane().add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio unitario: ");
		lblPrecio.setBounds(50,90,130,30);
		getContentPane().add(lblPrecio);
		
		JLabel lblImporte = new JLabel("Importe de compra: ");
		lblImporte.setBounds(50,130,130,30);
		getContentPane().add(lblImporte);
		
		JLabel lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setBounds(50,170,130,30);
		getContentPane().add(lblDescuento);
		
		
		JLabel lblPagar = new JLabel("Importe a pagar: ");
		lblPagar.setBounds(50,210,130,30);
		getContentPane().add(lblPagar);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(170, 50, 100, 30);
		txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCantidad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(170, 90, 100, 30);
		txtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrecio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPrecio);
		
		txtImporte = new JTextField();
		txtImporte.setBounds(170, 130, 100, 30);
		txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
		txtImporte.setFocusable(false);
		txtImporte.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtImporte);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(170, 170, 100, 30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtPagar = new JTextField();
		txtPagar.setBounds(170, 210, 100, 30);
		txtPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPagar.setFocusable(false);
		txtPagar.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPagar);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 270, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
			
				double cantidad = Double.parseDouble(txtCantidad.getText());
				double precio = Double.parseDouble(txtPrecio.getText());
				
				double importe= cantidad*precio;
				double descuento1 = importe * 0.15;
				double primer_descuento = importe - descuento1;
				double descuento2 = primer_descuento * 0.15;
				double pagar = primer_descuento - descuento2;
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtImporte.setText(df.format(importe));
				txtDescuento.setText(df.format(descuento1 - descuento2));
				txtPagar.setText(df.format(pagar));
				
				
				
					
			}
		});
	}

}
