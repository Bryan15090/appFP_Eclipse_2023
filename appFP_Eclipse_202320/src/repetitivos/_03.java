package repetitivos;

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
	JTextField txtNum, txtDivisor;
	
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
		
		JLabel lblNum = new JLabel("Numero: ");
		lblNum.setBounds(50,50,80,30);
		getContentPane().add(lblNum);
		
		JLabel lblDivisor = new JLabel("Divisor: ");
		lblDivisor.setBounds(50,100,80,30);
		getContentPane().add(lblDivisor);
		
		txtNum = new JTextField();
		txtNum.setBounds(140,50,80,30);
		txtNum.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNum);
		
		txtDivisor = new JTextField();
		txtDivisor.setBounds(140,100,80,30);
		txtDivisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDivisor.setFocusable(false);
		txtDivisor.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDivisor);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,150,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int numero = Integer.parseInt(txtNum.getText());

				int divisor = 0;
				int i = 1;
				while (numero >= i) {
				    if (numero % i == 0) {
				        divisor += 1;
				    }
				    i += 1;
				}

				txtDivisor.setText(""+divisor);
				
			}
		}); 
		
	}

}
