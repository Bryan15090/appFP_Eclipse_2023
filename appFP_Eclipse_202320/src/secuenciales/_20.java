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

public class _20 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtCantidad, txtBillete200, txtBillete100, txtBillete50, txtBillete20, txtBillete10, txtMoneda5, txtMoneda2, txtMoneda1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_20 frame = new _20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 600);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCantidad = new JLabel("Dinero: ");
		lblCantidad.setBounds(50,50,130,30);
		getContentPane().add(lblCantidad);
		
		JLabel lblBillete200 = new JLabel("Billetes de 200: ");
		lblBillete200.setBounds(50,90,130,30);
		getContentPane().add(lblBillete200);
		
		JLabel lblBillete100 = new JLabel("Billetes de 100: ");
		lblBillete100.setBounds(50,130,130,30);
		getContentPane().add(lblBillete100);
		
		JLabel lblBillete50 = new JLabel("Billetes de 50: ");
		lblBillete50.setBounds(50,170,130,30);
		getContentPane().add(lblBillete50);
		
		JLabel lblBillete20 = new JLabel("Billetes de 20: ");
		lblBillete20.setBounds(50,210,130,30);
		getContentPane().add(lblBillete20);
		
		JLabel lblBillete10 = new JLabel("Billetes de 10: ");
		lblBillete10.setBounds(50,250,130,30);
		getContentPane().add(lblBillete10);
		
		JLabel lblMoneda5 = new JLabel("Monedas de 5: ");
		lblMoneda5.setBounds(50,290,130,30);
		getContentPane().add(lblMoneda5);
		
		JLabel lblMoneda2 = new JLabel("Monedas de 2: ");
		lblMoneda2.setBounds(50,330,130,30);
		getContentPane().add(lblMoneda2);
		
		JLabel lblMoneda1 = new JLabel("Monedas de 1: ");
		lblMoneda1.setBounds(50,370,130,30);
		getContentPane().add(lblMoneda1);
		
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(150, 50, 100, 30);
		txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCantidad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidad);
		
		txtBillete200 = new JTextField();
		txtBillete200.setBounds(150, 90, 100, 30);
		txtBillete200.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBillete200.setFocusable(false);
		txtBillete200.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBillete200);
		
		txtBillete100 = new JTextField();
		txtBillete100.setBounds(150, 130, 100, 30);
		txtBillete100.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBillete100.setFocusable(false);
		txtBillete100.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBillete100);
		
		txtBillete50 = new JTextField();
		txtBillete50.setBounds(150, 170, 100, 30);
		txtBillete50.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBillete50.setFocusable(false);
		txtBillete50.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBillete50);
		
		txtBillete20 = new JTextField();
		txtBillete20.setBounds(150, 210, 100, 30);
		txtBillete20.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBillete20.setFocusable(false);
		txtBillete20.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBillete20);
		
		txtBillete10 = new JTextField();
		txtBillete10.setBounds(150, 250, 100, 30);
		txtBillete10.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBillete10.setFocusable(false);
		txtBillete10.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBillete10);
		
		txtMoneda5 = new JTextField();
		txtMoneda5.setBounds(150, 290, 100, 30);
		txtMoneda5.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMoneda5.setFocusable(false);
		txtMoneda5.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMoneda5);
		
		txtMoneda2 = new JTextField();
		txtMoneda2.setBounds(150, 330, 100, 30);
		txtMoneda2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMoneda2.setFocusable(false);
		txtMoneda2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMoneda2);
		
		txtMoneda1 = new JTextField();
		txtMoneda1.setBounds(150, 370, 100, 30);
		txtMoneda1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMoneda1.setFocusable(false);
		txtMoneda1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMoneda1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 430, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
				
				int cantidad =  Integer.parseInt(txtCantidad.getText());
				
				int billetes_200 = cantidad / 200;
				cantidad = cantidad % 200;
				
				int billetes_100 = cantidad / 100;
				cantidad = cantidad % 100;
				
				int billetes_50 = cantidad / 50;
				cantidad = cantidad % 50;
				
				int billetes_20 = cantidad / 20;
				cantidad = cantidad % 20;
				
				int billetes_10 = cantidad / 10;
				cantidad = cantidad % 10;
				
				int monedas_5 = cantidad / 5;
				cantidad = cantidad % 5;
				
				int monedas_2 = cantidad / 2 ; 
				cantidad = cantidad % 2;
				
				int monedas_1 = cantidad ;
				
				DecimalFormat df = new DecimalFormat("##");
				txtBillete200.setText(df.format(billetes_200));
				txtBillete100.setText(df.format(billetes_100));
				txtBillete50.setText(df.format(billetes_50));
				txtBillete20.setText(df.format(billetes_20));
				txtBillete10.setText(df.format(billetes_10));
				txtMoneda5.setText(df.format(monedas_5));
				txtMoneda2.setText(df.format(monedas_2));
				txtMoneda1.setText(df.format(monedas_1));
				
					
			}
		});
	}

}
