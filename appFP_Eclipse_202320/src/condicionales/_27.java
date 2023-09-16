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

public class _27 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtvendido ;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_27 frame = new _27();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _27() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblvendido = new JLabel("Monto vendido: ");
		lblvendido.setBounds(50,50,100,30);
		getContentPane().add(lblvendido);
		
		txtvendido = new JTextField();
		txtvendido.setBounds(150,50,80,30);
		txtvendido.setHorizontalAlignment(SwingConstants.RIGHT);
		txtvendido.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtvendido);

		txaRpta = new JTextArea();
		txaRpta.setBounds(50,150,180,150);
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
				int montoVendido = Integer.parseInt(txtvendido.getText());
				
				double sueldoBasico = 600;
				double comision = 0.15;
				double sueldoBruto = sueldoBasico + (comision * montoVendido);
				double descuento;
				int numeroPolos;

				if (sueldoBruto > 1800) {
				  descuento = 0.1;
				} else {
				  descuento = 0.05;
				}

				double sueldoNeto = sueldoBruto - (descuento * sueldoBruto);

				if (montoVendido > 1000) {
				  numeroPolos = 3;
				} else {
				  numeroPolos = 1;
				}
				
				txaRpta.setText("");
				txaRpta.append("Sueldo bruto: " + sueldoBruto + "\n");
				txaRpta.append("Descuento: " + (descuento * 100) + "%\n");
				txaRpta.append("Sueldo neto: " + sueldoNeto + "\n");
				txaRpta.append("Polos obsequiados: " + numeroPolos + "\n");
				

			}
		}); 
		
	}

}
