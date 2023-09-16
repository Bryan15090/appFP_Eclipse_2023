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

public class _09 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtCodigo, txtCantidad, txtImporte, txtDescuento, txtTotal;
	
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
		setBounds(0, 0, 330, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCodigo = new JLabel("codigo(101,102,103,104): ");
		lblCodigo.setBounds(50,50,150,30);
		getContentPane().add(lblCodigo);
		
		JLabel lblCantidad = new JLabel("Cantidad: ");
		lblCantidad.setBounds(50,100,150,30);
		getContentPane().add(lblCantidad);
		
		JLabel lblImporte = new JLabel("Importe de compra: ");
		lblImporte.setBounds(50,150,150,30);
		getContentPane().add(lblImporte);
		
		JLabel lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setBounds(50,200,150,30);
		getContentPane().add(lblDescuento);
		
		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setBounds(50,250,150,30);
		getContentPane().add(lblTotal);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(200,50,80,30);
		txtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCodigo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCodigo);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(200,100,80,30);
		txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCantidad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidad);
		
		txtImporte = new JTextField();
		txtImporte.setBounds(200,150,80,30);
		txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
		txtImporte.setFocusable(false);
		txtImporte.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtImporte);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(200,200,80,30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(200,250,80,30);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setFocusable(false);
		txtTotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,300,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int codigo = Integer.parseInt(txtCodigo.getText());
				int cantidad = Integer.parseInt(txtCantidad.getText());
		
				double precio_unitario = 0 ;
				double descuento = 0;
				
				if (codigo == 101){
					precio_unitario = 17;
				}else if (codigo == 102) {
					precio_unitario = 25;	
				}else if (codigo == 103) {
					precio_unitario =16;		
				}
				
				
				if (cantidad <= 10) {
					descuento = 0.05;
				}else if (cantidad > 10 && cantidad <= 20) {
					descuento = 0.08;
				}else if (cantidad > 20 && cantidad <= 30 ) {
					descuento = 0.10;
				}else {
					descuento = 0.13;
				}
				
				double importe= precio_unitario * cantidad;
				double descuento_total = importe * descuento;
				double total = importe - descuento_total;
				
				DecimalFormat df = new DecimalFormat("##");
				txtImporte.setText(df.format(importe));
				txtDescuento.setText(df.format(descuento_total));
				txtTotal.setText(df.format(total));
	
			}
		}); 
		
	}

}
