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

public class _25 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtHijos, txtSueldo, txtBonificacion, txtSNeto;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_25 frame = new _25();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _25() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblhijos = new JLabel("Hijos: ");
		lblhijos.setBounds(50,50,80,30);
		getContentPane().add(lblhijos);
		
		JLabel lblsueldo = new JLabel("Sueldo: ");
		lblsueldo.setBounds(50,100,80,30);
		getContentPane().add(lblsueldo);
		
		JLabel lblbonificacion = new JLabel("Bonificacion: ");
		lblbonificacion.setBounds(50,150,80,30);
		getContentPane().add(lblbonificacion);
		
		JLabel lblSNeto = new JLabel("Sueldo neto: ");
		lblSNeto.setBounds(50,200,80,30);
		getContentPane().add(lblSNeto);
		
		txtHijos = new JTextField();
		txtHijos.setBounds(140,50,80,30);
		txtHijos.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHijos.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHijos);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(140,100,80,30);
		txtSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldo);
		
		txtBonificacion = new JTextField();
		txtBonificacion.setBounds(140,150,80,30);
		txtBonificacion.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBonificacion.setFocusable(false);
		txtBonificacion.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBonificacion);
		
		txtSNeto = new JTextField();
		txtSNeto.setBounds(140,200,80,30);
		txtSNeto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSNeto.setFocusable(false);
		txtSNeto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSNeto);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int hijos = Integer.parseInt(txtHijos.getText());
				int sueldo = Integer.parseInt(txtSueldo.getText());
				
				double bonificacion;
				
				if (hijos>=1) {
					bonificacion = (sueldo * 0.125) + (40 * hijos);
				}else {
					bonificacion = sueldo * 0.10;
				}
				
				double sueldo_neto = sueldo + bonificacion;
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtSNeto.setText(df.format(sueldo_neto));
				txtBonificacion.setText(df.format(bonificacion));
						
			}
		}); 
		
	}

}
