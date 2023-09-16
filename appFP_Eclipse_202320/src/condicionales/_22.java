package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _22 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtCantidadA, txtCantidadB;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_22 frame = new _22();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 330, 500);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCantidadA= new JLabel("Cantidad de unidades A:");
		lblCantidadA.setBounds(50,50,150,30);
		getContentPane().add(lblCantidadA);
		
		JLabel lblCantidadB = new JLabel("Cantidad de unidades B:");
		lblCantidadB.setBounds(50,100,150,30);
		getContentPane().add(lblCantidadB);
		
		txtCantidadA = new JTextField();
		txtCantidadA.setBounds(200,50,80,30);
		txtCantidadA.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCantidadA.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidadA);
		
		txtCantidadB = new JTextField();
		txtCantidadB.setBounds(200,100,80,30);
		txtCantidadB.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCantidadB.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCantidadB);
		
		txaRpta = new JTextArea();
		txaRpta.setBounds(50,150,230,150);
		txaRpta.setFocusable(false);
		getContentPane().add(txaRpta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,320,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int cantidadA = Integer.parseInt(txtCantidadA.getText());
				int cantidadB = Integer.parseInt(txtCantidadB.getText());
				
				int unidadA = 25;
				int unidadB = 30;
				
				int ImportebrutoA = unidadA * cantidadA;
				int ImportebrutoB = unidadB * cantidadB;
				
				double descuentoA = 0 ;
				double descuentoB = 0 ;
				
				if (cantidadA >=50 ) {
					descuentoA = ImportebrutoA * 0.15;
				}else {
					descuentoA = 0;
				}
				if (cantidadB>= 60) {
					descuentoB = ImportebrutoB * 0.10;
				}
				
				double total_pagar =ImportebrutoA - descuentoA+ ImportebrutoB - descuentoB;
				
				txaRpta.setText("");
				txaRpta.append("Importe bruto A: " + ImportebrutoA + "\n");
				txaRpta.append("Importe bruto B: " + ImportebrutoB + "\n");
				txaRpta.append("Descuento A: " + descuentoA + "\n");
				txaRpta.append("Descuento B: " + descuentoB + "\n");
				txaRpta.append("Total a pagar: " + total_pagar + "\n");
				 
			}
		}); 
		
	}

}
