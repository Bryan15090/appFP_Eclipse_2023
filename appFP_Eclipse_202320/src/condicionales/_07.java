package condicionales;

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
	JTextField txtnum1, txtnum2, txtnum3, txtRpta ;
	
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
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNum1 = new JLabel("1º numero : ");
		lblNum1.setBounds(50,50,80,30);
		getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("2º numero: ");
		lblNum2.setBounds(50,100,80,30);
		getContentPane().add(lblNum2);
		
		JLabel lblNum3 = new JLabel("3º numero: ");
		lblNum3.setBounds(50,150,80,30);
		getContentPane().add(lblNum3);
		
		JLabel lblRpta = new JLabel("Intermedio: ");
		lblRpta.setBounds(50,200,80,30);
		getContentPane().add(lblRpta);
		
		txtnum1 = new JTextField();
		txtnum1.setBounds(140,50,80,30);
		txtnum1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnum1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnum1);
		
		txtnum2 = new JTextField();
		txtnum2.setBounds(140,100,80,30);
		txtnum2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnum2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnum2);
		
		txtnum3 = new JTextField();
		txtnum3.setBounds(140,150,80,30);
		txtnum3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnum3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnum3);
		
		txtRpta= new JTextField();
		txtRpta.setBounds(140,200,80,30);
		txtRpta.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRpta.setFocusable(false);
		txtRpta.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRpta);

		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int num1 = Integer.parseInt(txtnum1.getText());
				int num2 = Integer.parseInt(txtnum2.getText());
				int num3 = Integer.parseInt(txtnum3.getText());
				
				int intermedio ; 
		
				if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)) {
					intermedio = num2;
					} else if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)) {
						intermedio = num1;
					} else {
						intermedio = num3;
					}

				
				DecimalFormat df = new DecimalFormat("##");
				
				txtRpta.setText(df.format(intermedio));

			}
		}); 
		
	}

}
