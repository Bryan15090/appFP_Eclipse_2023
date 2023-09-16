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

public class _01 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtUnidades, txtPrecio, txtDescuento, txtTotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_01 frame = new _01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUnidades = new JLabel("Unidades: ");
		lblUnidades.setBounds(50,50,80,30);
		getContentPane().add(lblUnidades);
		
		JLabel lblPrecio = new JLabel("Precio: ");
		lblPrecio.setBounds(50,100,80,30);
		getContentPane().add(lblPrecio);
		
		JLabel lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setBounds(50,150,80,30);
		getContentPane().add(lblDescuento);
		
		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setBounds(50,200,80,30);
		getContentPane().add(lblTotal);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(140,50,80,30);
		txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
		txtUnidades.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtUnidades);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(140,100,80,30);
		txtPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrecio.setFocusable(false);
		txtPrecio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPrecio);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(140,150,80,30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtTotal= new JTextField();
		txtTotal.setBounds(140,200,80,30);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setFocusable(false);
		txtTotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int unidades = Integer.parseInt(txtUnidades.getText());
				
				double precioUnitario;
		        if (unidades >= 1 && unidades <= 25) {
		            precioUnitario = 27;
		        } else if (unidades >= 26 && unidades <= 50) {
		            precioUnitario = 25;
		        } else {
		            precioUnitario = 23;
		        }
		        
				
				double importe = unidades  * precioUnitario;
				double descuento;
				
				if (unidades > 50) {
		            descuento = importe * 0.15;
		        } else {
		            descuento = importe * 0.05;
		        }
		        
				double total = importe  *0.05;
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtPrecio.setText(df.format(precioUnitario));
				txtDescuento.setText(df.format(descuento));
				txtTotal.setText(df.format(total));
				
			}
		}); 
		
	}

}
