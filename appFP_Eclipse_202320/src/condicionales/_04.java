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

public class _04 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNota1, txtNota2, txtNota3, txtPromedio;
	
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
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNota1 = new JLabel("Nota Nº1: ");
		lblNota1.setBounds(50,50,80,30);
		getContentPane().add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota Nº2: ");
		lblNota2.setBounds(50,100,80,30);
		getContentPane().add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota Nº3: ");
		lblNota3.setBounds(50,150,80,30);
		getContentPane().add(lblNota3);
		
		JLabel lblPromedio = new JLabel("Promedio: ");
		lblPromedio.setBounds(50,200,80,30);
		getContentPane().add(lblPromedio);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(140,50,80,30);
		txtNota1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNota1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota1);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(140,100,80,30);
		txtNota2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNota2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(140,150,80,30);
		txtNota3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNota3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNota3);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(140,200,80,30);
		txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPromedio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPromedio);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int nota1 = Integer.parseInt(txtNota1.getText());
				int nota2 = Integer.parseInt(txtNota2.getText());
				int nota3 = Integer.parseInt(txtNota3.getText());
				
				double promedio = (nota1 +nota2 + nota3) /3;
				
				if (nota3>10) {
					nota3 +=2;
				}
				DecimalFormat df = new DecimalFormat("##");
				txtPromedio.setText(df.format (promedio));
	
			}
		}); 
		
	}

}
