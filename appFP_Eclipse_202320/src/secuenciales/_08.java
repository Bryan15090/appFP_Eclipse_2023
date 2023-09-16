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

public class _08 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtRadio, txtAltura, txtAreaBase, txtAreaLateral, txtAreaTotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_08 frame = new _08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblRadio = new JLabel("Radio: ");
		lblRadio.setBounds(50,50,80,30);
		getContentPane().add(lblRadio);
		
		JLabel lblAltura = new JLabel("Altura: ");
		lblAltura.setBounds(50,90,80,30);
		getContentPane().add(lblAltura);
		
		JLabel lblAreaBase = new JLabel("Area Base: ");
		lblAreaBase.setBounds(50,130,80,30);
		getContentPane().add(lblAreaBase);
		
		JLabel lblAreaLateral = new JLabel("Area Lateral: ");
		lblAreaLateral.setBounds(50,170,80,30);
		getContentPane().add(lblAreaLateral);
		
		JLabel lblAreaTotal = new JLabel("Area Total: ");
		lblAreaTotal.setBounds(50,210,80,30);
		getContentPane().add(lblAreaTotal);
		
		
		txtRadio = new JTextField();
		txtRadio.setBounds(140, 50, 100, 30);
		txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRadio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRadio);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(140, 90, 100, 30);
		txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAltura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAltura);
		
		txtAreaBase = new JTextField();
		txtAreaBase.setBounds(140, 130, 100, 30);
		txtAreaBase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAreaBase.setFocusable(false);
		txtAreaBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAreaBase);
		
		txtAreaLateral = new JTextField();
		txtAreaLateral.setBounds(140, 170, 100, 30);
		txtAreaLateral.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAreaLateral.setFocusable(false);
		txtAreaLateral.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAreaLateral);
		
		txtAreaTotal = new JTextField();
		txtAreaTotal.setBounds(140, 210, 100, 30);
		txtAreaTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAreaTotal.setFocusable(false);
		txtAreaTotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAreaTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 250, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
			
				double radio = Double.parseDouble ( txtRadio.getText() );
				double altura = Double.parseDouble ( txtAltura.getText() );
				
				double areaBase = Math.PI * Math.pow(radio, 2);
				double areaLateral = 2 * Math.PI * radio* altura;
				double areaTotal = 2 * areaBase + areaLateral;
			
				DecimalFormat df = new DecimalFormat("##.00");
				txtAreaBase.setText(df.format(areaBase) );
				txtAreaLateral.setText(df.format(areaLateral));
				txtAreaTotal.setText(df.format(areaTotal));
					
			}
		});
	}

}
