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

public class _03 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField  txtKilometros, txtMetros, txtMillas, txtPies, txtYardas;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_03 frame = new _03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 250, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblKilometros = new JLabel("Kilometros :");
		lblKilometros.setBounds(50, 50, 80, 30);
		getContentPane().add(lblKilometros);
		
		JLabel lblPies = new JLabel("Pies :");
		lblPies.setBounds(50, 90, 80, 30);
		getContentPane().add(lblPies);
		
		JLabel lblMillas = new JLabel("Millas :");
		lblMillas.setBounds(50, 130, 80, 30);
		getContentPane().add(lblMillas);
		
		JLabel lblMetros = new JLabel("Metros :");
		lblMetros.setBounds(50, 170, 80, 30);
		getContentPane().add(lblMetros);
		
		JLabel lblYardas = new JLabel("Yardas :");
		lblYardas.setBounds(50, 210, 80, 30);
		getContentPane().add(lblYardas);
		
		txtKilometros = new JTextField();
		txtKilometros.setBounds(140, 50, 60, 30);
		txtKilometros.setHorizontalAlignment( SwingConstants.RIGHT );
		txtKilometros.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtKilometros);
		
		txtPies = new JTextField();
		txtPies.setBounds(140, 90, 60, 30);
		txtPies.setHorizontalAlignment( SwingConstants.RIGHT );
		txtPies.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtPies);
		
		txtMillas = new JTextField();
		txtMillas.setBounds(140, 130, 60, 30);
		txtMillas.setHorizontalAlignment( SwingConstants.RIGHT );
		txtMillas.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtMillas);
		
		txtMetros = new JTextField();
		txtMetros.setBounds(140, 170, 60, 30);
		txtMetros.setFocusable(false);
		txtMetros.setHorizontalAlignment( SwingConstants.RIGHT );
		txtMetros.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtMetros);
		
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
		int kilometros = Integer.parseInt( txtKilometros.getText() );
		int pies = Integer.parseInt(txtPies.getText());
		int millas = Integer.parseInt(txtMillas.getText());

		double metros_kilometros = kilometros * 1000.0;
		double metros_pies = pies / 2.2808;
		double metros_millas = millas / 1609;
		double yardas_kilometros = kilometros * 1000.0;
		double yardas_pies = pies * 0.333333;
		double yardas_millas = millas * 1760;
		
		
		double total_metros = metros_kilometros + metros_pies + metros_millas;
		double total_yardas = yardas_kilometros + yardas_pies + yardas_millas;
		
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtKilometros.setText( df.format( kilometros ) );
		txtPies.setText( df.format( pies ) );
		txtMillas.setText( df.format( millas ) );
		txtMetros.setText( df.format(total_metros));
		txtYardas.setText( df.format( total_yardas ) );
	}

}