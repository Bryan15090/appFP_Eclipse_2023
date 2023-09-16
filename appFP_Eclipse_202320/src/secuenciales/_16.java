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

public class _16 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtHorasT, txtPagoxhora ;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_16 frame = new _16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 450);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblJuan = new JLabel("Horas trabajadas: ");
		lblJuan.setBounds(50,50,130,30);
		getContentPane().add(lblJuan);
		
		JLabel lblRosa = new JLabel("Pago por hora: ");
		lblRosa.setBounds(50,90,130,30);
		getContentPane().add(lblRosa);
		
		txtHorasT = new JTextField();
		txtHorasT.setBounds(160, 50, 100, 30);
		txtHorasT.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHorasT.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtHorasT);
		
		txtPagoxhora = new JTextField();
		txtPagoxhora.setBounds(160, 90, 100, 30);
		txtPagoxhora.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPagoxhora.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPagoxhora);
		

		txaRpta = new JTextArea();
		txaRpta.setBounds(50,200,180,150);
		txaRpta.setFocusable(false);
		getContentPane().add(txaRpta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 130, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			
			private void btnCalcular_actionPerformed() {
			
				double horasT = Double.parseDouble(txtHorasT.getText());
				double pagoxhoras = Double.parseDouble(txtPagoxhora.getText());
				
				double sueldo_basico = horasT * pagoxhoras;
				double bonificacion	 = sueldo_basico * 0.20;
				double sueldo_bruto = sueldo_basico + bonificacion;
				double descuento= sueldo_bruto *0.10;
				double sueldo_neto = sueldo_bruto - descuento;
			
				DecimalFormat df = new DecimalFormat("##.00");
				txaRpta.setText("");
				txaRpta.append("Sueldo basico:" + df.format(sueldo_basico)+"\n");
				txaRpta.append("Sueldo bruto:" + df.format(sueldo_bruto)+"\n");
				txaRpta.append("Sueldo neto:" + df.format(sueldo_neto)+"\n");
					
			}
		});
	}

}
