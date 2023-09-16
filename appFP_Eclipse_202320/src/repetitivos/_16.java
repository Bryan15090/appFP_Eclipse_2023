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

public class _16 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtTexto, txtRpta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_16 frame = new _16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 250);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblN1 = new JLabel("Texto :");
		lblN1.setBounds(30, 30, 80, 25);
		getContentPane().add(lblN1);
		
		JLabel lblN2 = new JLabel("Respuesta :");
		lblN2.setBounds(30, 60, 80, 25);
		getContentPane().add(lblN2);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(100, 30, 100, 25);
		txtTexto.setMargin( new Insets( 2, 5, 2, 5 ));
		txtTexto.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtTexto);
		
		txtRpta = new JTextField();
		txtRpta.setBounds(100, 60, 100, 25);
		txtRpta.setMargin( new Insets( 2, 5, 2, 5 ));
		txtRpta.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtRpta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(40, 90, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		String texto = txtTexto.getText() ;
		String invertida = "";
		
		for ( int indice = texto.length()-1; indice >= 0; indice --) {
			invertida += texto.charAt(indice);
		}
		
		txtRpta.setText(""+invertida);
	}

}