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

public class _29 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtHorasT, txtpagoH;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_29 frame = new _29();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _29() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 500);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblHoras = new JLabel("Horas trabajadas: ");
		lblHoras.setBounds(50,50,120,30);
		getContentPane().add(lblHoras);
		
		JLabel lblpagoH = new JLabel("Pago por hora: ");
		lblpagoH.setBounds(50,100,120,30);
		getContentPane().add(lblpagoH);
		
		
		txtHorasT = new JTextField();
		txtHorasT.setBounds(170,50,80,30);
		txtHorasT.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHorasT.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHorasT);
		
		txtpagoH = new JTextField();
		txtpagoH.setBounds(170,100,80,30);
		txtpagoH.setHorizontalAlignment(SwingConstants.RIGHT);
		txtpagoH.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtpagoH);
		
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
				int horasTrabajadas = Integer.parseInt(txtHorasT.getText());
				int pagoPorHora = Integer.parseInt(txtpagoH.getText());
			     
		        double sueldoBruto = 0;
		        double descuento = 0;
		        
		        if (horasTrabajadas <= 48) {
		            sueldoBruto = horasTrabajadas * pagoPorHora;
		        } else {
		            sueldoBruto = (48 * pagoPorHora) + ((horasTrabajadas - 48) * pagoPorHora * 1.2);
		        }
		        
		        if (sueldoBruto > 1500) {
		            descuento = sueldoBruto * 0.11;
		        }
		        
		        double totalPagar = sueldoBruto - descuento;
		        
		        txaRpta.setText("");
		        txaRpta.append("Horas trabajadas: " + horasTrabajadas + "\n");
		        txaRpta.append("Pago por hora: " + pagoPorHora + "\n");
		        txaRpta.append("Sueldo bruto: " + sueldoBruto + "\n");
		        txaRpta.append("Descuento: " + descuento + "\n");
		        txaRpta.append("Total a pagar: " + totalPagar + "\n");
		        
			}
		}); 
		
	}

}
