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

public class _17 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtDonacion, txtSalud, txtComedor, txtEscuela, txtAsilo ;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_17 frame = new _17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblDonacion = new JLabel("Donacion: ");
		lblDonacion.setBounds(50,50,130,30);
		getContentPane().add(lblDonacion);
		
		JLabel lblSalud = new JLabel("Centro de salud: ");
		lblSalud.setBounds(50,90,130,30);
		getContentPane().add(lblSalud);
		
		JLabel lblComedor = new JLabel("Comedor infantil: ");
		lblComedor.setBounds(50,130,130,30);
		getContentPane().add(lblComedor);
		
		JLabel lblEscuela = new JLabel("Escuela infantil: ");
		lblEscuela.setBounds(50,170,130,30);
		getContentPane().add(lblEscuela);
		
		JLabel lblAsilo = new JLabel("Asilo de ancianos: ");
		lblAsilo.setBounds(50,210,130,30);
		getContentPane().add(lblAsilo);
		
		txtDonacion = new JTextField();
		txtDonacion.setBounds(160, 50, 100, 30);
		txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDonacion.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDonacion);
		
		txtSalud = new JTextField();
		txtSalud.setBounds(160, 90, 100, 30);
		txtSalud.setFocusable(false);
		txtSalud.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSalud.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSalud);
		
		txtComedor = new JTextField();
		txtComedor.setBounds(160, 130, 100, 30);
		txtComedor.setFocusable(false);
		txtComedor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtComedor.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtComedor);
		
		txtEscuela = new JTextField();
		txtEscuela.setBounds(160, 170, 100, 30);
		txtEscuela.setFocusable(false);
		txtEscuela.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEscuela.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEscuela);
		
		txtAsilo = new JTextField();
		txtAsilo.setBounds(160, 210, 100, 30);
		txtAsilo.setFocusable(false);
		txtAsilo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAsilo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAsilo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 250, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
			
				double donacion= Double.parseDouble(txtDonacion.getText());

				double salud = donacion * 0.25;
				double comedor = donacion * 0.35;
				double escuela = donacion * 0.25;
				double asilo = donacion - salud - comedor - escuela;
				
				DecimalFormat df = new DecimalFormat("##");
				txtSalud.setText(df.format(salud));
				txtComedor.setText(df.format(comedor));
				txtEscuela.setText(df.format(escuela));
				txtAsilo.setText(df.format(asilo));		
			}
		});
	}

}
