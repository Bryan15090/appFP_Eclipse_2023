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

public class _13 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtCOpuesto, txtCAdyacente, txtHipotenusa;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_13 frame = new _13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCOpuesto = new JLabel("Cateto opuesto: ");
		lblCOpuesto.setBounds(50,50,130,30);
		getContentPane().add(lblCOpuesto);
		
		JLabel lblCAdyacente = new JLabel("Cateto adyacente: ");
		lblCAdyacente.setBounds(50,90,130,30);
		getContentPane().add(lblCAdyacente);
		
		JLabel lblHipotenusa = new JLabel("Hipotenusa: ");
		lblHipotenusa.setBounds(50,130,130,30);
		getContentPane().add(lblHipotenusa);
		
		txtCOpuesto = new JTextField();
		txtCOpuesto.setBounds(160, 50, 100, 30);
		txtCOpuesto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCOpuesto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCOpuesto);
		
		txtCAdyacente = new JTextField();
		txtCAdyacente.setBounds(160, 90, 100, 30);
		txtCAdyacente.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCAdyacente.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCAdyacente);
		
		txtHipotenusa = new JTextField();
		txtHipotenusa.setBounds(160, 130, 100, 30);
		txtHipotenusa.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHipotenusa.setFocusable(false);
		txtHipotenusa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHipotenusa);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 170, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
			
				double copuesto = Double.parseDouble(txtCOpuesto.getText());
				double cadyacente = Double.parseDouble(txtCAdyacente.getText());
				
				double hipotenusa = Math.sqrt(Math.pow(copuesto, 2) + Math.pow(cadyacente, 2));
			
				DecimalFormat df = new DecimalFormat("##");
				txtHipotenusa.setText(df.format(hipotenusa));
					
			}
		});
	}

}
