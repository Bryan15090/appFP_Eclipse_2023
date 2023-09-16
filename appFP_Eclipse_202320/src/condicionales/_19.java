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

public class _19 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtSexo, txtEdad, txtCategoria;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_19 frame = new _19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblSexo = new JLabel("Sexo(F/M): ");
		lblSexo.setBounds(50,50,1300,30);
		getContentPane().add(lblSexo);
		
		JLabel lblEdad = new JLabel("Edad: ");
		lblEdad.setBounds(50,100,130,30);
		getContentPane().add(lblEdad);
		
		JLabel lblCategoria = new JLabel("Categoria: ");
		lblCategoria.setBounds(50,150,130,30);
		getContentPane().add(lblCategoria);
		
		txtSexo = new JTextField();
		txtSexo.setBounds(160,50,130,30);
		txtSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSexo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtSexo);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(160,100,130,30);
		txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEdad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEdad);
		
		txtCategoria= new JTextField();
		txtCategoria.setBounds(160,150,130,30);
		txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCategoria.setFocusable(false);
		txtCategoria.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCategoria);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,200,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				String sexo = txtSexo.getText();
				int edad =Integer.parseInt(txtEdad.getText());
				String categoria = ("");
				
				if (sexo.equals("F")) {
					 if  (edad  <=23) {
						 categoria = "FA";
					}else {
						categoria = "FB";
					} 
				}
				else if (sexo.equals("M")) {
					if (edad <=25) {
						categoria = "MA";
					}else {
						categoria = "MB";
					}
				}
				txtCategoria.setText(categoria);
				
			}
		}); 
		
	}

}
