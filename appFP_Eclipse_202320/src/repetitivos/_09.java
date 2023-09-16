package repetitivos;

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

public class _09 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNum;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_09 frame = new _09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 500);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNum = new JLabel("Numero: ");
		lblNum.setBounds(50,50,80,30);
		getContentPane().add(lblNum);
		
		txtNum = new JTextField();
		txtNum.setBounds(140,50,80,30);
		txtNum.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNum);

		txaRpta = new JTextArea();
		txaRpta.setBounds(50,100,180,200);
		txaRpta.setFocusable(false);
		getContentPane().add(txaRpta);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,400,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int n = Integer.parseInt(txtNum.getText());
				
				if(n >= 0 && n<=50) {
		            for(int i = 0; i < n; i++) {
		                txaRpta.append("*");
		            }
		            txaRpta.append("");

		            for(int i = 0; i < n-2; i++) {
		            	txaRpta.append("*");
		                for(int j = 0; j < n-2; j++) {
		                	txaRpta.append(" ");
		                }
		                txaRpta.append("*");
		            }
		           
	
		            for(int i = 0; i < n; i++) {
		            	txaRpta.append("*");
		            }
		        }else {
		        	txaRpta.append("Error. El dato a ingresar de "
		                    + "estar entre 0 y 50");
		        }
			
				
			}
		}); 
		
	}

}
