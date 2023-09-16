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

public class _23 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNotam, txtNotaF, txtPropina, txtRegalo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_23 frame = new _23();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNotam = new JLabel("nota matematica: ");
		lblNotam.setBounds(50,50,130,30);
		getContentPane().add(lblNotam);
		
		JLabel lblNotaF = new JLabel("nota fisica: ");
		lblNotaF.setBounds(50,100,130,30);
		getContentPane().add(lblNotaF);
		
		JLabel lblPropina = new JLabel("Propina: ");
		lblPropina.setBounds(50,200,130,30);
		getContentPane().add(lblPropina);
		
		JLabel lblRegalo = new JLabel("Regalo: ");
		lblRegalo.setBounds(50,150,80,30);
		getContentPane().add(lblRegalo);
		
		txtNotam = new JTextField();
		txtNotam.setBounds(170,50,130,30);
		txtNotam.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNotam.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNotam);
		
		txtNotaF = new JTextField();
		txtNotaF.setBounds(170,100,130,30);
		txtNotaF.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNotaF.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNotaF);
		
		txtRegalo= new JTextField();
		txtRegalo.setBounds(170,150,130,30);
		txtRegalo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRegalo.setFocusable(false);
		txtRegalo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRegalo);
		
		txtPropina = new JTextField();
		txtPropina.setBounds(170,200,130,30);
		txtPropina.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPropina.setFocusable(false);
		txtPropina.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPropina);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int notam = Integer.parseInt(txtNotam.getText());
				int notaf = Integer.parseInt(txtNotaF.getText());
				
				int regalo = (notam + notaf) /2;
				int propinam = 0;
				double propinaf = 0;
				String regalo1 = ("");
				
				if(notam >=17) {
					propinam= 3;
				}else {
					propinam = 1;		
				}
				if ( notaf >= 15) {
					propinaf = 2;
				}else {
					propinaf =0.05;
				}
				double propinaT = propinam+ propinaf ;
				
				if (regalo >= 16) {
					regalo1 = "obsequio reloj";
				}else {
					regalo1 = "sin obsequio";
				}
				DecimalFormat df = new DecimalFormat("##");
				txtPropina.setText(df.format(propinaT));
				txtRegalo.setText(regalo1);

			}
		}); 
		
	}

}
