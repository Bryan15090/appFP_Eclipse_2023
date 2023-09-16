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

public class _04 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNumeros, txtMultiplos, txtMultiplosd;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_04 frame = new _04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumeros = new JLabel("Numero: ");
		lblNumeros.setBounds(50,50,80,30);
		getContentPane().add(lblNumeros);
		
		JLabel lblMultiplos = new JLabel("Multiplo: ");
		lblMultiplos.setBounds(50,100,80,30);
		getContentPane().add(lblMultiplos);
		
		JLabel lblMultiplosd = new JLabel("Multiplos : ");
		lblMultiplosd.setBounds(50,150,80,30);
		getContentPane().add(lblMultiplosd);
		
		txtNumeros = new JTextField();
		txtNumeros.setBounds(140,50,80,30);
		txtNumeros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumeros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumeros);
		
		txtMultiplos = new JTextField();
		txtMultiplos.setBounds(140,100,80,30);
		txtMultiplos.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMultiplos.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMultiplos);
		
		txtMultiplosd = new JTextField();
		txtMultiplosd.setBounds(140,150,80,30);
		txtMultiplosd.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMultiplosd.setFocusable(false);
		txtMultiplosd.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMultiplosd);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,200,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int numero = Integer.parseInt(txtNumeros.getText());
				int multiplos = Integer.parseInt(txtMultiplos.getText());
			
				for (int i = 1; i <= multiplos; i++) {
					  int multiple = numero * i;
					  
				        txtMultiplosd.setText(""+multiple);
				}

			}
		}); 
		
	}

}
