package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _34 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtPeso, txtEstatura, txtIMC;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_34 frame = new _34();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _34() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblPeso = new JLabel("Peso: ");
		lblPeso.setBounds(50,50,130,30);
		getContentPane().add(lblPeso);
		
		JLabel lblEstatura = new JLabel("Estatura: ");
		lblEstatura.setBounds(50,100,130,30);
		getContentPane().add(lblEstatura);
		
		JLabel lblIMC = new JLabel("IMC: ");
		lblIMC.setBounds(50,150,130,30);
		getContentPane().add(lblIMC);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(170,50,80,30);
		txtPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPeso.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPeso);
		
		txtEstatura = new JTextField();
		txtEstatura.setBounds(170,100,80,30);
		txtEstatura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEstatura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEstatura);
		
		txtIMC = new JTextField();
		txtIMC.setBounds(170,150,80,30);
		txtIMC.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIMC.setFocusable(false);
		txtIMC.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtIMC);
				
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,200,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int peso = Integer.parseInt(txtPeso.getText());
				double estatura = Double.parseDouble(txtEstatura.getText());
				
				double imc2 = peso/ (Math.pow(estatura,2));
				
				if (imc2 < 20 ) txtIMC.setText("Delgado");
				else if (imc2 > 20 && imc2 < 25) txtIMC.setText("Normal"); 
				else if (imc2 > 25 && imc2 < 27) txtIMC.setText("Sobrepeso");
				else txtIMC.setText("Obesidad");
	
			}
		}); 
		
	}

}
