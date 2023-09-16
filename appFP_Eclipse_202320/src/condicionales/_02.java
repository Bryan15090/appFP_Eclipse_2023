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

public class _02 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtUnidades, txtCompra, txtDescuento, txtTotal, txtCaramelos;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_02 frame = new _02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUnidades = new JLabel("Unidades: ");
		lblUnidades.setBounds(50,50,80,30);
		getContentPane().add(lblUnidades);
		
		JLabel lblCompra = new JLabel("Compra: ");
		lblCompra.setBounds(50,100,80,30);
		getContentPane().add(lblCompra);
		
		JLabel lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setBounds(50,150,80,30);
		getContentPane().add(lblDescuento);
		
		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setBounds(50,200,80,30);
		getContentPane().add(lblTotal);
		
		JLabel lblCaramelos = new JLabel("Caramelos: ");
		lblCaramelos.setBounds(50,250,80,30);
		getContentPane().add(lblCaramelos);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(140,50,80,30);
		txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
		txtUnidades.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtUnidades);
		
		txtCompra = new JTextField();
		txtCompra.setBounds(140,100,80,30);
		txtCompra.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCompra.setFocusable(false);
		txtCompra.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCompra);
		
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
		
		txtCaramelos= new JTextField();
		txtCaramelos.setBounds(140,250,80,30);
		txtCaramelos.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCaramelos.setFocusable(false);
		txtCaramelos.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCaramelos);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,300,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int unidades = Integer.parseInt(txtUnidades.getText());
				
				int compra = unidades * 20;
				double descuento = ( compra <= 500  ? 0.12:  compra >= 700 ? 0.16 : 0.14) * compra ;
				double obsequio = unidades <= 50 ? 5 : unidades > 100 ? 15 : 10;
				
				DecimalFormat df = new DecimalFormat("##.00");
				
				txtCompra.setText(df.format(compra));
				txtDescuento.setText(df.format(descuento));
				txtTotal.setText(df.format(compra - descuento));
				txtCaramelos.setText(df.format(obsequio));			
				
			}
		}); 
		
	}

}
