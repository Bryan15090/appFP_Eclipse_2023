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

public class _12 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtDia;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_12 frame = new _12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(50,50,80,30);
		getContentPane().add(lblNumero);
		
		JLabel lblDias = new JLabel("Dias");
		lblDias.setBounds(50,100,80,30);
		getContentPane().add(lblDias);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(140,50,80,30);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNumero);
		
		txtDia = new JTextField();
		txtDia.setBounds(140,100,80,30);
		txtDia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDia.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDia);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,160,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int numero = Integer.parseInt(txtNumero.getText());
				
				/*
				if (numero == 1) txtDia.setText("Lunes");
				else if (numero == 2) txtDia.setText("Martes");
				else if (numero == 3) txtDia.setText("Miercoles");  
				else if (numero == 4) txtDia.setText("Jueves");
				else if (numero == 5) txtDia.setText("Viernes");
				else if (numero == 6) txtDia.setText("Sabado");
				else if (numero == 7) txtDia.setText("Domingo");
				else txtDia.setText("Error");
				*/
				
				/*
				switch	(numero) {
				case 1: txtDia.setText("lunes")	; break;
				case 2: txtDia.setText("Martes"); break;
				case 3: txtDia.setText("Miercoles"); break;
				case 4: txtDia.setText("Jueves"); break;
				case 5: txtDia.setText("Viernes"); break;
				case 6: txtDia.setText("Sabado"); break;
				case 7: txtDia.setText("Domingo"); break;
				default: txtDia.setText("Error");
				}
				*/
				
				String[] aDias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
				
				//if (numero >= 1 && numero <=7) txtDia.setText(aDias[numero-1]);
				//else txtDia.setText("Error");
				
				txtDia.setText(numero >=1 && numero <=7 ? aDias[numero-1]:"Error");
			}
		}); 
		
	}

}
