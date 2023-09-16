package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class _15 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtRosa, txtDaniel, txtJuan;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_15 frame = new _15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblJuan = new JLabel("Juan: ");
		lblJuan.setBounds(50,50,130,30);
		getContentPane().add(lblJuan);
		
		JLabel lblRosa = new JLabel("Rosa: ");
		lblRosa.setBounds(50,90,130,30);
		getContentPane().add(lblRosa);
		
		JLabel lblDaniel = new JLabel("Daniel: ");
		lblDaniel.setBounds(50,130,130,30);
		getContentPane().add(lblDaniel);
		
		txtJuan = new JTextField();
		txtJuan.setBounds(160, 50, 100, 30);
		txtJuan.setHorizontalAlignment(SwingConstants.RIGHT);
		txtJuan.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtJuan);
		
		txtRosa = new JTextField();
		txtRosa.setBounds(160, 90, 100, 30);
		txtRosa.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRosa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtRosa);
		
		txtDaniel = new JTextField();
		txtDaniel.setBounds(160, 130, 100, 30);
		txtDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDaniel.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDaniel);
		
		txaRpta = new JTextArea();
		txaRpta.setBounds(50,220,180,150);
		txaRpta.setFocusable(false);
		getContentPane().add(txaRpta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 170, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
			
				double daniel = Double.parseDouble(txtDaniel.getText());
				double juan = Double.parseDouble(txtJuan.getText());
				double rosa = Double.parseDouble(txtRosa.getText());
				
				double dolar_daniel = daniel / 3.00;
				
				double total = dolar_daniel + juan + rosa;
				
				double p_juan = juan * 100 / total;
				double p_rosa = rosa * 100 / total;
				double p_daniel = dolar_daniel *100 / total;
			
				DecimalFormat df = new DecimalFormat("##.00");
				txaRpta.setText("");
				txaRpta.append("Total Dolares:" + df.format(total)+"\n");
				txaRpta.append("Juan aporta:" + df.format(p_juan)+"%\n");
				txaRpta.append("Rosa aporta:" + df.format(p_rosa)+"%\n");
				txaRpta.append("Daniel aporta:" + df.format(p_daniel)+"%\n");
					
			}
		});
	}

}
