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

public class _18 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtDAnual, txtCSalud, txtCNiños, txtInvertir;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_18 frame = new _18();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblDAnual = new JLabel("Donacion anual: ");
		lblDAnual.setBounds(50,50,1300,30);
		getContentPane().add(lblDAnual);
		
		JLabel lblCSalud = new JLabel("Centro de salud: ");
		lblCSalud.setBounds(50,100,130,30);
		getContentPane().add(lblCSalud);
		
		JLabel lblCNiños = new JLabel("Comedor niños: ");
		lblCNiños.setBounds(50,150,130,30);
		getContentPane().add(lblCNiños);
		
		JLabel lblInvertir = new JLabel("Invertir: ");
		lblInvertir.setBounds(50,200,130,30);
		getContentPane().add(lblInvertir);
		
		
		txtDAnual = new JTextField();
		txtDAnual.setBounds(160,50,130,30);
		txtDAnual.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDAnual.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDAnual);
		
		txtCSalud = new JTextField();
		txtCSalud.setBounds(160,100,130,30);
		txtCSalud.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCSalud.setFocusable(false);
		txtCSalud.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCSalud);
		
		txtCNiños= new JTextField();
		txtCNiños.setBounds(160,150,130,30);
		txtCNiños.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCNiños.setFocusable(false);
		txtCNiños.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCNiños);
		
		txtInvertir = new JTextField();
		txtInvertir.setBounds(160,200,130,30);
		txtInvertir.setHorizontalAlignment(SwingConstants.RIGHT);
		txtInvertir.setFocusable(false);
		txtInvertir.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtInvertir);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int Donacion_anual = Integer.parseInt(txtDAnual.getText());
				
				double csalud;
				double cniños;
				double invertir;
				
				if (Donacion_anual >= 10000) {
					csalud = Donacion_anual * 0.30;
					cniños = Donacion_anual * 0.50;
					invertir = Donacion_anual - csalud - cniños;
				}else {
					csalud = Donacion_anual * 0.25;
					cniños = Donacion_anual * 0.60;
					invertir = Donacion_anual - csalud - cniños;
				}

				DecimalFormat df = new DecimalFormat("##.00");
				txtCSalud.setText(df.format(csalud));
				txtCNiños.setText(df.format(cniños));
				txtInvertir.setText(df.format(invertir));
				
			}
		}); 
		
	}

}
