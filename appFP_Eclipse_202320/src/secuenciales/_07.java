package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class _07 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtBase, txtAltura, txtArea, txtPerimetro;
	
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
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblBase = new JLabel("Base: ");
		lblBase.setBounds(50,50,80,30);
		getContentPane().add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura: ");
		lblAltura.setBounds(50,90,80,30);
		getContentPane().add(lblAltura);
		
		JLabel lblArea = new JLabel("Area: ");
		lblArea.setBounds(50,130,80,30);
		getContentPane().add(lblArea);
		
		JLabel lblPerimetro = new JLabel("Perimetro: ");
		lblPerimetro.setBounds(50,170,80,30);
		getContentPane().add(lblPerimetro);
		
		txtBase = new JTextField();
		txtBase.setBounds(140, 50, 100, 30);
		txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBase);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(140, 90, 100, 30);
		txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAltura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAltura);
		
		txtArea = new JTextField();
		txtArea.setBounds(140, 130, 100, 30);
		txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
		txtArea.setFocusable(false);
		txtArea.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtArea);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(140, 170, 100, 30);
		txtPerimetro.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPerimetro.setFocusable(false);
		txtPerimetro.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPerimetro);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 210, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
			
				int base = Integer.parseInt ( txtBase.getText() );
				int altura = Integer.parseInt ( txtAltura.getText() );
				
				int area = base * altura;
				int perimetro = 2 * (base + altura);
			
				DecimalFormat df = new DecimalFormat("##");
				txtArea.setText(df.format(area) );
				txtPerimetro.setText(df.format(perimetro));
					
			}
		});
	}

}
