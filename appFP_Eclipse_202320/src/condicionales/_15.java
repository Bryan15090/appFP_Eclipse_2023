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

public class _15 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtVendido, txtbruto, txtcomision,txtneto,txtdescuento;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_15 frame = new _15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblVendido = new JLabel("Monto vendido: ");
		lblVendido.setBounds(50,50,100,30);
		getContentPane().add(lblVendido);
		
		JLabel lblbruto = new JLabel("Sueldo Bruto: ");
		lblbruto.setBounds(50,100,100,30);
		getContentPane().add(lblbruto);
		
		JLabel lblneto = new JLabel("Sueldo Neto: ");
		lblneto.setBounds(50,150,100,30);
		getContentPane().add(lblneto);
		
		JLabel lbldescuento = new JLabel("Descuento: ");
		lbldescuento.setBounds(50,200,100,30);
		getContentPane().add(lbldescuento);
		
		JLabel lblcomision = new JLabel("Comision: ");
		lblcomision.setBounds(50,250,80,30);
		getContentPane().add(lblcomision);
		
		txtVendido = new JTextField();
		txtVendido.setBounds(140,50,130,30);
		txtVendido.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVendido.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVendido);
		
		txtbruto = new JTextField();
		txtbruto.setBounds(140,100,130,30);
		txtbruto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtbruto.setFocusable(false);
		txtbruto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtbruto);
		
		txtneto= new JTextField();
		txtneto.setBounds(140,150,130,30);
		txtneto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtneto.setFocusable(false);
		txtneto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtneto);
		
		txtdescuento = new JTextField();
		txtdescuento.setBounds(140,200,130,30);
		txtdescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdescuento.setFocusable(false);
		txtdescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtdescuento);
		
		txtcomision = new JTextField();
		txtcomision.setBounds(140,250,130,30);
		txtcomision.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdescuento.setFocusable(false);
		txtcomision.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcomision);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,300,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int vendido = Integer.parseInt(txtVendido.getText());
				
				int sueldo = 250;
				double comision;
				double descuento ;
				
				if (vendido <= 500) {
					comision = vendido * 0.05;
				}
				else if ( vendido >= 5000 && vendido <= 10000) {
					comision = vendido * 0.08;
				}
				else if ( vendido > 10000 && vendido <= 20000) {
					comision = vendido * 0.10;
				}
				else {
					 comision = vendido * 0.15;
				}
				
				double sueldo_bruto= sueldo + comision;
				
				if (sueldo_bruto >=3500) {
					descuento =  sueldo_bruto * 0.15;
				}else{
					descuento = sueldo_bruto *0.08;
				}
				
				double sueldo_neto = sueldo_bruto - descuento;
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtbruto.setText(df.format(sueldo_bruto));
				txtneto.setText(df.format(sueldo_neto));
				txtdescuento.setText(df.format(descuento));
				txtcomision.setText(df.format(comision));
				
			}
		}); 
		
	}

}
