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

public class _03 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtAngulo, txtRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_03 frame = new _03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblAngulo = new JLabel("Angulo : ");
		lblAngulo.setBounds(50,50,80,30);
		getContentPane().add(lblAngulo);
		
		JLabel lblRpta = new JLabel("Respuesta: ");
		lblRpta.setBounds(50,100,80,30);
		getContentPane().add(lblRpta);
		
		txtAngulo = new JTextField();
		txtAngulo.setBounds(140,50,100,30);
		txtAngulo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAngulo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAngulo);
		
		txtRpta = new JTextField();
		txtRpta.setBounds(140,100,100,30);
		txtRpta.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRpta.setFocusable(false);
		txtRpta.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRpta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,160,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int angulo = Integer.parseInt(txtAngulo.getText());
				
				if (angulo == 0) {
		            txtRpta.setText("Angulo nulo");
		        } else if (angulo > 0 && angulo < 90) {
		        	txtRpta.setText("Angulo agudo");
		        } else if (angulo == 90) {
		        	txtRpta.setText("Angulo recto");
		        } else if (angulo > 90 && angulo < 180) {
		        	txtRpta.setText("Angulo obtuso");
		        } else if (angulo == 180) {
		        	txtRpta.setText("Angulo llano");
		        } else if (angulo > 180 && angulo < 360) {
		        	txtRpta.setText("Angulo concavo");
		        } else if (angulo == 360) {
		        	txtRpta.setText("Angulo llano");
		        } else {
		            txtRpta.setText("Angulo invalido");
		        }
				
			}
		}); 
		
	}

}
