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

public class _19 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtVendido, txtComision, txtBruto, txtDescuento, txtNeto;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_19 frame = new _19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblVendido = new JLabel("Monto vendido: ");
		lblVendido.setBounds(50,50,130,30);
		getContentPane().add(lblVendido);
		
		JLabel lblComision = new JLabel("Comision: ");
		lblComision.setBounds(50,90,130,30);
		getContentPane().add(lblComision);
		
		JLabel lblBruto = new JLabel("Sueldo bruto: ");
		lblBruto.setBounds(50,130,130,30);
		getContentPane().add(lblBruto);
		
		JLabel lblDescuento = new JLabel("Descuento: ");
		lblDescuento.setBounds(50,170,130,30);
		getContentPane().add(lblDescuento);
		
		JLabel lblNeto = new JLabel("Sueldo neto: ");
		lblNeto.setBounds(50,210,130,30);
		getContentPane().add(lblNeto);
		
		txtVendido = new JTextField();
		txtVendido.setBounds(150, 50, 100, 30);
		txtVendido.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVendido.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVendido);
		
		txtComision = new JTextField();
		txtComision.setBounds(150, 90, 100, 30);
		txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
		txtComision.setFocusable(false);
		txtComision.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtComision);
		
		txtBruto = new JTextField();
		txtBruto.setBounds(150, 130, 100, 30);
		txtBruto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBruto.setFocusable(false);
		txtBruto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBruto);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(150, 170, 100, 30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
		
		txtNeto = new JTextField();
		txtNeto.setBounds(150, 210, 100, 30);
		txtNeto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNeto.setFocusable(false);
		txtNeto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNeto);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 270, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
				
				int sueldo = 500;
				double vendido = Double.parseDouble(txtVendido.getText());
				double comision = vendido * 0.09;
				double sueldo_bruto = sueldo + comision;
				double descuento = sueldo_bruto * 0.11;
				double sueldo_neto = sueldo_bruto - descuento;
				
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtComision.setText(df.format(comision));
				txtBruto.setText(df.format(sueldo_bruto));
				txtDescuento.setText(df.format(descuento));
				txtNeto.setText(df.format(sueldo_neto));
				
				
				
					
			}
		});
	}

}
