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

public class _14 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtN1, txtN2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_14 frame = new _14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 250);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblN1 = new JLabel("N1 :");
		lblN1.setBounds(30, 30, 60, 25);
		getContentPane().add(lblN1);
		
		JLabel lblN2 = new JLabel("N2 :");
		lblN2.setBounds(30, 60, 60, 25);
		getContentPane().add(lblN2);
		
		txtN1 = new JTextField();
		txtN1.setBounds(100, 30, 100, 25);
		txtN1.setMargin( new Insets( 2, 5, 2, 5 ));
		txtN1.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtN1);
		
		txtN2 = new JTextField();
		txtN2.setBounds(100, 60, 100, 25);
		txtN2.setFocusable(false);
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
		int num = Integer.parseInt( txtN1.getText() );
		
		if ( num > 1) {
			for (int i=2;i< num;i++) {
				if (num% i == 0) {
					txtN2.setText("Es primo");
					break;
				}else {
					txtN2.setText("No primo");
				}
			}
		}else {
			txtN2.setText("No primo");
		}
	

	}

}