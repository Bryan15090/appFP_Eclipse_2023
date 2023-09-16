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

public class _05 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtNum;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_05 frame = new _05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _05() {
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
				int num = Integer.parseInt(txtNum.getText());
				
				for (int x = 1; x <= 12; x++) {
					txaRpta.append(num + "x" + x + " = " + (num * x) +"\n" );
				  
				}
				
			
				
			}
		}); 
		
	}

}
