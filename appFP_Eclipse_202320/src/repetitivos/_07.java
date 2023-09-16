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

public class _07 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNum, txtFactorial;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_07 frame = new _07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblnum = new JLabel("Numero: ");
		lblnum.setBounds(50,50,80,30);
		getContentPane().add(lblnum);
		
		JLabel lblFactorial = new JLabel("Factorial: ");
		lblFactorial.setBounds(50,100,80,30);
		getContentPane().add(lblFactorial);

		
		txtNum = new JTextField();
		txtNum.setBounds(140,50,80,30);
		txtNum.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNum);
		
		txtFactorial = new JTextField();
		txtFactorial.setBounds(140,100,80,30);
		txtFactorial.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFactorial.setFocusable(false);
		txtFactorial.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtFactorial);
		
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
				
				int factorial = 1;

				for (int i = 1; i <= numero; i++) {
					factorial = factorial * i;
				}
				txtFactorial.setText(""+factorial);
				
			}
		}); 
		
	}

}
