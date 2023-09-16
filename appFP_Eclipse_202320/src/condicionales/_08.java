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

public class _08 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtnota1, txtnota2, txtnota3, txtmensualidad ;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_08 frame = new _08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblnota1 = new JLabel("Nota Nº1 : ");
		lblnota1.setBounds(50,50,80,30);
		getContentPane().add(lblnota1);
		
		JLabel lblnota2 = new JLabel("Nota Nº2: ");
		lblnota2.setBounds(50,100,80,30);
		getContentPane().add(lblnota2);
		
		JLabel lblnota3 = new JLabel("Nota Nº3: ");
		lblnota3.setBounds(50,150,80,30);
		getContentPane().add(lblnota3);
		
		JLabel lblmensualidad = new JLabel("Mensualidad: ");
		lblmensualidad.setBounds(50,200,80,30);
		getContentPane().add(lblmensualidad);
		
		txtnota1 = new JTextField();
		txtnota1.setBounds(140,50,80,30);
		txtnota1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnota1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnota1);
		
		txtnota2 = new JTextField();
		txtnota2.setBounds(140,100,80,30);
		txtnota2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnota2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnota2);
		
		txtnota3 = new JTextField();
		txtnota3.setBounds(140,150,80,30);
		txtnota3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnota3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnota3);
		
		txtmensualidad= new JTextField();
		txtmensualidad.setBounds(140,200,80,30);
		txtmensualidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtmensualidad.setFocusable(false);
		txtmensualidad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtmensualidad);

		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int num1 = Integer.parseInt(txtnota1.getText());
				int num2 = Integer.parseInt(txtnota2.getText());
				int num3 = Integer.parseInt(txtnota3.getText());
				
				int mensualidad = 20;
				int m1,m2,m3;
				
				if ( num1 >= 13) {
					m1 = mensualidad + 5;
				}else {
					m1 = 0;
				}
				
				if (num2 >=13) {
					m2 = mensualidad +5 ;
				}else {
					m2 = 0;
				}
				
				if (num3 >=13) {
					m3 = mensualidad + 5;
				}else {
					m3 = 0;
				}
				DecimalFormat df = new DecimalFormat("##");
				
				txtmensualidad.setText(df.format(mensualidad+m1+m2+m3));
				
			}
		}); 
		
	}

}
