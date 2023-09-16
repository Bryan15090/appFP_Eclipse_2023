package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _17 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtCDocenas, txtDocenas;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_17 frame = new _17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCDocenas = new JLabel("Costo Docenas: ");
		lblCDocenas.setBounds(50,50,100,30);
		getContentPane().add(lblCDocenas);
		
		JLabel lblDocenas = new JLabel("Docenas: ");
		lblDocenas.setBounds(50,100,100,30);
		getContentPane().add(lblDocenas);
		

		txtCDocenas = new JTextField();
		txtCDocenas.setBounds(140,50,130,30);
		txtCDocenas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCDocenas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCDocenas);
		
		txtDocenas = new JTextField();
		txtDocenas.setBounds(140,100,130,30);
		txtDocenas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDocenas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDocenas);
		
		txaRpta = new JTextArea();
		txaRpta.setBounds(50,150,180,150);
		txaRpta.setFocusable(false);
		getContentPane().add(txaRpta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,320,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int costo_docenas = Integer.parseInt(txtCDocenas.getText());
				int docenas = Integer.parseInt(txtDocenas.getText());
				
				double descuento;
				double lapiceros ;
				
				if (docenas >= 6) {
					descuento = 0.15;
				}else {
					descuento = 0.10;
				}
				
				double subtotal = costo_docenas * docenas;
				double monto_descuento = subtotal * descuento;
				double total = subtotal - monto_descuento;
				
				if(docenas >= 30) {
					lapiceros = (docenas /3)*2;
				}else {
					lapiceros = 0;
				}
				
				txaRpta.setText("");
				txaRpta.append("Monto de compra :" + subtotal + "\n");
				txaRpta.append("Descuento :" + monto_descuento + "\n");
				txaRpta.append("Total pagar :" + total + "\n");
				txaRpta.append("Obsequio lapiceros :" + lapiceros + "\n");
				
			}
		}); 
		
	}

}
