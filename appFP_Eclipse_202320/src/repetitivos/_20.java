package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class _20 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtCant, txtMax, txtMin, txtNumeros;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_20 frame = new _20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 250);
		setLocationRelativeTo( null );
		setLayout(null);
		
		JLabel lblN1 = new JLabel("N1 :");
		lblN1.setBounds(30, 30, 60, 25);
		getContentPane().add(lblN1);
		
		JLabel lblN2 = new JLabel("N2 :");
		lblN2.setBounds(30, 60, 60, 25);
		getContentPane().add(lblN2);
		
		JLabel lblProducto = new JLabel("Maximo :");
		lblProducto.setBounds(30, 90, 80, 25);
		getContentPane().add(lblProducto);
		
		txtCant = new JTextField();
		txtCant.setBounds(100, 30, 50, 25);
		txtCant.setMargin( new Insets( 2, 5, 2, 5 ));
		txtCant.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtCant);
		
		txtNumeros = new JTextField();
		txtNumeros.setBounds(100, 60, 50, 25);
		txtNumeros.setMargin( new Insets( 2, 5, 2, 5 ));
		txtNumeros.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtNumeros);
		
		txtMax = new JTextField();
		txtMax.setBounds(100, 90, 50, 25);
		txtMax.setMargin( new Insets( 2, 5, 2, 5 ));
		txtMax.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtMax);
		
		txtMin = new JTextField();
		txtMin.setBounds(100, 130, 50, 25);
		txtMin.setMargin( new Insets( 2, 5, 2, 5 ));
		txtMin.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMin.setFocusable(false);
		getContentPane().add(txtMin);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(40, 160, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed(); } });
	}

	private void btnCalcular_actionPerformed() {
		int cant = Integer.parseInt( txtCant.getText() );
		
		ArrayList<Integer> lista = new ArrayList<>();
		int i = 1;

        while (i <= cant) {
            System.out.print(i + " Enter a number: ");
            int n = Integer.parseInt(txtNumeros.getText());
            lista.add(n);
            i++;
        }

		
	
		
	}

}