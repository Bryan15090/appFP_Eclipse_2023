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

public class _17 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtTexto, txtIndexOf, txtProducto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_17 frame = new _17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 200);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblTexto = new JLabel("Texto :");
		lblTexto.setBounds(30, 30, 60, 25);
		getContentPane().add(lblTexto);
		
		JLabel lblIndexOF = new JLabel("IndexOF : ");
		lblIndexOF.setBounds(30, 60, 60, 25);
		getContentPane().add(lblIndexOF);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(100, 30, 200, 25);
		txtTexto.setMargin( new Insets( 2, 5, 2, 5 ));
		txtTexto.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtTexto);
		
		txtIndexOf = new JTextField();
		txtIndexOf.setBounds(100, 60, 200, 25);
		txtIndexOf.setMargin( new Insets( 2, 5, 2, 5 ));
		txtIndexOf.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtIndexOf);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(40, 100, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		String texto = txtTexto.getText();
		int pos = texto.indexOf( 'a');
		txtIndexOf.setText(""+pos);
		
	}

}