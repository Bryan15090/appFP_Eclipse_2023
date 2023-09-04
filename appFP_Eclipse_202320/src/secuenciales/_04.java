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

public class _04 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtPies, txtMetros;
	
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
		setBounds(0, 0, 300, 250);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblPies = new JLabel("Pies :");
		lblPies.setBounds(50, 50, 80, 30);
		getContentPane().add(lblPies);
		
		JLabel lblMetros = new JLabel("Metros :");
		lblMetros.setBounds(50, 90, 80, 30);
		getContentPane().add(lblMetros);
		
		txtPies = new JTextField();
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPies.setMargin( new Insets(5,5,5,5));
		txtPies.setBounds(140, 50, 60, 30);
		getContentPane().add(txtPies);
		
		txtMetros = new JTextField();
		txtMetros.setBounds(140, 90, 60, 30);
		txtMetros.setFocusable(false);
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMetros.setMargin( new Insets(5,5,5,5));
		getContentPane().add(txtMetros);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});
	}	
	protected void btnCalcular_actionPerformed() {
		double pies = Double.parseDouble( txtPies.getText() );
		double metros = pies / 3.2808;
		DecimalFormat df = new DecimalFormat("##.00");
		txtPies.setText( df.format(pies));
		txtMetros.setText( df.format(metros));
	}
	
}