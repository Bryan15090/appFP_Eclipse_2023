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

public class _33 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtPuntualidad, txtRendimiento, txtPtotal, txtBonficacion;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_33 frame = new _33();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _33() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblPuntualidad = new JLabel("Puntualidad: ");
		lblPuntualidad.setBounds(50,50,80,30);
		getContentPane().add(lblPuntualidad);
		
		JLabel lblRendimiento = new JLabel("Rendimiento");
		lblRendimiento.setBounds(50,100,80,30);
		getContentPane().add(lblRendimiento);
		
		JLabel lblPtotal = new JLabel("Puntaje total");
		lblPtotal.setBounds(50,150,80,30);
		getContentPane().add(lblPtotal);
		
		JLabel lblBonficacion = new JLabel("Bonficacion");
		lblBonficacion.setBounds(50,200,80,30);
		getContentPane().add(lblBonficacion);
		
		txtPuntualidad = new JTextField();
		txtPuntualidad.setBounds(140,50,80,30);
		txtPuntualidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPuntualidad.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPuntualidad);
		
		txtRendimiento = new JTextField();
		txtRendimiento.setBounds(140,100,80,30);
		txtRendimiento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRendimiento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRendimiento);
		
		txtPtotal = new JTextField();
		txtPtotal.setBounds(140,150,80,30);
		txtPtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPtotal.setFocusable(false);
		txtPtotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPtotal);
		
		txtBonficacion = new JTextField();
		txtBonficacion.setBounds(140,200,80,30);
		txtBonficacion.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBonficacion.setFocusable(false);
		txtBonficacion.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBonficacion);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,250,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int puntualidad = Integer.parseInt(txtPuntualidad.getText());
				int rendimiento = Integer.parseInt(txtRendimiento.getText());
				
				int puntaje_total =  puntualidad + rendimiento;
				double bonificacion;
				
				if (puntaje_total <= 11) bonificacion =puntaje_total *0.25;
				else if (puntaje_total > 11 && puntaje_total <= 13 ) bonificacion =puntaje_total *5.0;
				else if (puntaje_total > 14 && puntaje_total <= 16 ) bonificacion =puntaje_total *7.5;
				else if (puntaje_total > 17 && puntaje_total <= 19 ) bonificacion =puntaje_total *10.0;
				else bonificacion = puntaje_total *12.5;
				
				DecimalFormat df = new DecimalFormat("##");
				txtPtotal.setText(df.format(puntaje_total));
				txtBonficacion.setText(df.format(bonificacion));
				
			}
		}); 
		
	}

}
