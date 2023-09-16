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

public class _06 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtedad1, txtedad2, txtedad3, txtEmayor, txtEmenor ;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_06 frame = new _06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lbledad1 = new JLabel("Edad Nº1: ");
		lbledad1.setBounds(50,50,80,30);
		getContentPane().add(lbledad1);
		
		JLabel lblNum2 = new JLabel("Edad Nº2: ");
		lblNum2.setBounds(50,100,80,30);
		getContentPane().add(lblNum2);
		
		JLabel lblNum3 = new JLabel("Edad Nº3: ");
		lblNum3.setBounds(50,150,80,30);
		getContentPane().add(lblNum3);
		
		JLabel lblEmayor = new JLabel("Edad mayor: ");
		lblEmayor.setBounds(50,200,80,30);
		getContentPane().add(lblEmayor);
		
		JLabel lblEmenor = new JLabel("Edad menor: ");
		lblEmenor.setBounds(50,250,80,30);
		getContentPane().add(lblEmenor);
		
		
		txtedad1 = new JTextField();
		txtedad1.setBounds(140,50,80,30);
		txtedad1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtedad1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtedad1);
		
		txtedad2 = new JTextField();
		txtedad2.setBounds(140,100,80,30);
		txtedad2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtedad2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtedad2);
		
		txtedad3 = new JTextField();
		txtedad3.setBounds(140,150,80,30);
		txtedad3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtedad3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtedad3);
		
		txtEmayor= new JTextField();
		txtEmayor.setBounds(140,200,80,30);
		txtEmayor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEmayor.setFocusable(false);
		txtEmayor.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEmayor);
		
		txtEmenor= new JTextField();
		txtEmenor.setBounds(140,250,80,30);
		txtEmenor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEmenor.setFocusable(false);
		txtEmenor.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEmenor);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,300,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int edad1 = Integer.parseInt(txtedad1.getText());
				int edad2 = Integer.parseInt(txtedad2.getText());
				int edad3 = Integer.parseInt(txtedad3.getText());
				
				int minEdad= Math.min(edad1, Math.min(edad2, edad3));
				int maxEdad= Math.max(edad1, Math.max(edad2, edad3));
				
				DecimalFormat df = new DecimalFormat("##");
				txtEmayor.setText(df.format(maxEdad));
				txtEmenor.setText(df.format(minEdad));

			}
		}); 
		
	}

}
