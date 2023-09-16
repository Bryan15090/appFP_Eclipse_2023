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

public class _36 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtCuadernos, txtLapiceros;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_36 frame = new _36();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _36() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCuardenos = new JLabel("Cuadernos: ");
		lblCuardenos.setBounds(50,50,80,30);
		getContentPane().add(lblCuardenos);
		
		JLabel lblLapiceros = new JLabel("Lapiceros: ");
		lblLapiceros.setBounds(50,100,80,30);
		getContentPane().add(lblLapiceros);
		
		
		txtCuadernos = new JTextField();
		txtCuadernos.setBounds(140,50,80,30);
		txtCuadernos.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCuadernos.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCuadernos);
		
		txtLapiceros = new JTextField();
		txtLapiceros.setBounds(140,100,80,30);
		txtLapiceros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtLapiceros.setFocusable(false);
		txtLapiceros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtLapiceros);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,150,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int cuadernos = Integer.parseInt(txtCuadernos.getText());
				int lapiceros;
				
				if ( cuadernos <=12) lapiceros = 0;
				else if (cuadernos >12 && cuadernos <=24) lapiceros = ( cuadernos/4)*1;
				else if (cuadernos >24 && cuadernos <=36) lapiceros = ( cuadernos/4)*2;
				else  lapiceros = ( cuadernos/4)*2 + ( cuadernos /6) + (cuadernos /12);
				
				DecimalFormat df = new DecimalFormat("##");
				txtLapiceros.setText(df.format(lapiceros));
							
				
			}
		}); 
		
	}

}
