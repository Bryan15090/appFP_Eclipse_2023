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

public class _02 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtMetros, txtCentimetros, txtPulgadas, txtPies, txtYardas;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_02 frame = new _02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblMetros = new JLabel("Metros :");
		lblMetros.setBounds(50, 50, 80, 30);
		getContentPane().add(lblMetros);
		
		JLabel lblCentimetros = new JLabel("Centímetros :");
		lblCentimetros.setBounds(50, 90, 80, 30);
		getContentPane().add(lblCentimetros);
		
		JLabel lblPulgadas = new JLabel("Pulgadas :");
		lblPulgadas.setBounds(50, 130, 80, 30);
		getContentPane().add(lblPulgadas);
		
		JLabel lblPies = new JLabel("Pies :");
		lblPies.setBounds(50, 170, 80, 30);
		getContentPane().add(lblPies);
		
		JLabel lblYardas = new JLabel("Yardas :");
		lblYardas.setBounds(50, 210, 80, 30);
		getContentPane().add(lblYardas);

		txtMetros = new JTextField();
		txtMetros.setBounds(140, 50, 60, 30);
		txtMetros.setHorizontalAlignment( SwingConstants.RIGHT );
		txtMetros.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtMetros);
		
		txtCentimetros = new JTextField();
		txtCentimetros.setBounds(140, 90, 60, 30);
		txtCentimetros.setFocusable(false);
		txtCentimetros.setHorizontalAlignment( SwingConstants.RIGHT );
		txtCentimetros.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtCentimetros);
		
		txtPulgadas = new JTextField();
		txtPulgadas.setBounds(140, 130, 60, 30);
		txtPulgadas.setFocusable(false);
		txtPulgadas.setHorizontalAlignment( SwingConstants.RIGHT );
		txtPulgadas.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtPulgadas);
		
		txtPies = new JTextField();
		txtPies.setBounds(140, 170, 60, 30);
		txtPies.setFocusable(false);
		txtPies.setHorizontalAlignment( SwingConstants.RIGHT );
		txtPies.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtPies);
		
		txtYardas = new JTextField();
		txtYardas.setBounds(140, 210, 60, 30);
		txtYardas.setFocusable(false);
		txtYardas.setHorizontalAlignment( SwingConstants.RIGHT );
		txtYardas.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtYardas);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 260, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int metros = Integer.parseInt( txtMetros.getText() );

		double centimeros = metros * 100.0;
		double pulgadas = centimeros / 2.54;
		double pies = pulgadas / 12;
		double yardas = pies / 3;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtCentimetros.setText( df.format( centimeros ) );
		txtPulgadas.setText( df.format( pulgadas ) );
		txtPies.setText( df.format( pies ) );
		txtYardas.setText( df.format( yardas ) );
	}

}