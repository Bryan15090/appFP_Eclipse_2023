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

public class _19 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtN1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_19 frame = new _19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 150);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblN1 = new JLabel("Numero :");
		lblN1.setBounds(30, 30, 80, 25);
		getContentPane().add(lblN1);
		
		txtN1 = new JTextField();
		txtN1.setBounds(100, 30, 100, 25);
		txtN1.setMargin( new Insets( 2, 5, 2, 5 ));
		txtN1.setFocusable(false);
		txtN1.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtN1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(40, 80, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int aleatorio = 0;
		aleatorio = (int) (Math.random()* 1000 );
		txtN1.setText(""+aleatorio);
	
	}

}