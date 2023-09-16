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

public class _24 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtVendido, txtSueldo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_24 frame = new _24();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _24() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUnidades = new JLabel("vendido: ");
		lblUnidades.setBounds(50,50,80,30);
		getContentPane().add(lblUnidades);
		
		JLabel lblPrecio = new JLabel("Sueldo: ");
		lblPrecio.setBounds(50,100,80,30);
		getContentPane().add(lblPrecio);
		
		txtVendido = new JTextField();
		txtVendido.setBounds(140,50,80,30);
		txtVendido.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVendido.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtVendido);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(140,100,80,30);
		txtSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSueldo.setFocusable(false);
		txtSueldo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSueldo);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,150,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int vendido = Integer.parseInt(txtVendido.getText());

				double sueldo ;
				if( vendido >= 5000) {
					sueldo = vendido *0.10;
				}else {
					sueldo = (5000 * 0.10) + ((vendido - 5000) / 500 * 25);
				}
				
				DecimalFormat df = new DecimalFormat("##");
				txtSueldo.setText(df.format(sueldo));
				
			}
		}); 
		
	}

}
