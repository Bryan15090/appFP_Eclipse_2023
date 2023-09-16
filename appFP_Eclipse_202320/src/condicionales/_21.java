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

public class _21 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtnum, txtEstadoC, txtEdad, txtGenero;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_21 frame = new _21();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblnum = new JLabel("Numero: ");
		lblnum.setBounds(50,50,1300,30);
		getContentPane().add(lblnum);
		
		JLabel lblEstadoC = new JLabel("Estado civil: ");
		lblEstadoC.setBounds(50,100,130,30);
		getContentPane().add(lblEstadoC);
		
		JLabel lblEdad = new JLabel("Edad: ");
		lblEdad.setBounds(50,150,130,30);
		getContentPane().add(lblEdad);
		
		JLabel lblGenero = new JLabel("Genero: ");
		lblGenero.setBounds(50,200,130,30);
		getContentPane().add(lblGenero);
		
		
		txtnum = new JTextField();
		txtnum.setBounds(160,50,130,30);
		txtnum.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnum.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnum);
		
		txtEstadoC = new JTextField();
		txtEstadoC.setBounds(160,100,130,30);
		txtEstadoC.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEstadoC.setFocusable(false);
		txtEstadoC.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEstadoC);
		
		txtEdad= new JTextField();
		txtEdad.setBounds(160,150,130,30);
		txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEdad.setFocusable(false);
		txtEdad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEdad);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(160,200,130,30);
		txtGenero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGenero.setFocusable(false);
		txtGenero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtGenero);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int num = Integer.parseInt(txtnum.getText());
				double estadoc = num / 1000;
				double edad = (num %1000) / 10;
				double genero = num % 10;

				if ( estadoc == 1 ) txtEstadoC.setText("Soltero");
				else if (estadoc == 2) txtEstadoC.setText("Casado");
				else if (estadoc == 3) txtEstadoC.setText("Divorciado");
				else if (estadoc == 4) txtEstadoC.setText("Viudo");

				if ( genero == 1) txtGenero.setText("Masculino");
				else if ( genero == 2) txtGenero.setText("Femenino");
				
				DecimalFormat df = new DecimalFormat("##");
				txtEdad.setText(df.format(edad));

			}
		}); 
		
	}

}
