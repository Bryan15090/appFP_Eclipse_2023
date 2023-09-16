package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class _13 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtN1, txtN2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_13 frame = new _13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 250);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblN1 = new JLabel("Numero :");
		lblN1.setBounds(30, 30, 60, 25);
		getContentPane().add(lblN1);
		
		JLabel lblN2 = new JLabel("Rpta :");
		lblN2.setBounds(30, 60, 60, 25);
		getContentPane().add(lblN2);
		
		txtN1 = new JTextField();
		txtN1.setBounds(100, 30, 100, 25);
		txtN1.setMargin( new Insets( 2, 5, 2, 5 ));
		txtN1.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtN1);
		
		txtN2 = new JTextField();
		txtN2.setBounds(100, 60, 100, 25);
		txtN2.setMargin( new Insets( 2, 5, 2, 5 ));
		txtN2.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtN2);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(40, 130, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int n = Integer.parseInt( txtN1.getText() );
		
		 int sum = 0;
	        
	        for (int i = 1; i <= n; i++) {
	            if (i % 3 == 0 && i % 5 != 0) {
	                sum += i;
	            }
	        }
	        
	        txtN2.setText("Suma: " + sum);
		
	
	}

}