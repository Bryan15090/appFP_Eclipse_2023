package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _28 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtHora, txtHora2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_28 frame = new _28();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _28() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblhora = new JLabel("Ingresar hora: ");
		lblhora.setBounds(50,50,100,30);
		getContentPane().add(lblhora);
		
		JLabel lblhora2 = new JLabel("Formato am/pm: ");
		lblhora2.setBounds(50,100,100,30);
		getContentPane().add(lblhora2);
		
		txtHora = new JTextField();
		txtHora.setBounds(170,50,80,30);
		txtHora.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHora.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHora);
		
		txtHora2 = new JTextField();
		txtHora2.setBounds(170,100,80,30);
		txtHora2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHora2.setFocusable(false);
		txtHora2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHora2);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,150,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int hora = Integer.parseInt(txtHora.getText());
				
				 if (hora >= 0 && hora <= 23) {
			            if (hora == 0) {
			                txtHora2.setText("12:00 am");
			            } else if (hora < 12) {
			            	txtHora2.setText(hora + ":00 am");
			            } else if (hora == 12) {
			            	txtHora2.setText("12:00 pm");
			            } else {
			            	txtHora2.setText((hora - 12) + ":00 pm");
			            }
			        } else {
			        	 txtHora2.setText("Hora inválida");
			        }
			}
		}); 
		
	}

}
