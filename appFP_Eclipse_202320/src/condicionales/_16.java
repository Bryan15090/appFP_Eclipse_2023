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

public class _16 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtImensual, txtCosto, txtCuota, txtMensualidad;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_16 frame = new _16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblImensual = new JLabel("Ingreso mensual: ");
		lblImensual.setBounds(50,50,1300,30);
		getContentPane().add(lblImensual);
		
		JLabel lblCosto = new JLabel("Costo casa: ");
		lblCosto.setBounds(50,100,130,30);
		getContentPane().add(lblCosto);
		
		JLabel lblCuota = new JLabel("Cuota inicial: ");
		lblCuota.setBounds(50,150,130,30);
		getContentPane().add(lblCuota);
		
		JLabel lblMensualidad = new JLabel("Mensualidad: ");
		lblMensualidad.setBounds(50,200,130,30);
		getContentPane().add(lblMensualidad);
		
		
		txtImensual = new JTextField();
		txtImensual.setBounds(160,50,130,30);
		txtImensual.setHorizontalAlignment(SwingConstants.RIGHT);
		txtImensual.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtImensual);
		
		txtCosto = new JTextField();
		txtCosto.setBounds(160,100,130,30);
		txtCosto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCosto.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCosto);
		
		txtCuota= new JTextField();
		txtCuota.setBounds(160,150,130,30);
		txtCuota.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCuota.setFocusable(false);
		txtCuota.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCuota);
		
		txtMensualidad = new JTextField();
		txtMensualidad.setBounds(160,200,130,30);
		txtMensualidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMensualidad.setFocusable(false);
		txtMensualidad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMensualidad);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int ingreso_mensual = Integer.parseInt(txtImensual.getText());
				int costo = Integer.parseInt(txtCosto.getText());
				
				double cuota_inicial;
				double mensualidad;
				
				if (ingreso_mensual < 1250) {
					cuota_inicial = costo * 0.15 ;
					mensualidad = (costo - cuota_inicial ) /120;
				}else {
					cuota_inicial = costo * 0.30 ;
					mensualidad = (costo - cuota_inicial ) /75;
				}

				DecimalFormat df = new DecimalFormat("##.00");
				txtCuota.setText(df.format(cuota_inicial));
				txtMensualidad.setText(df.format(mensualidad));
				
			}
		}); 
		
	}

}
