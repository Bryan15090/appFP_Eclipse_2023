package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _08 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtBase, txtExponente, txtResultado;
	
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
		setBounds(0, 0, 300, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblBase = new JLabel("Base: ");
		lblBase.setBounds(50,50,80,30);
		getContentPane().add(lblBase);
		
		JLabel lblExponente = new JLabel("Exponente: ");
		lblExponente.setBounds(50,100,80,30);
		getContentPane().add(lblExponente);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(50,150,80,30);
		getContentPane().add(lblResultado);

		txtBase = new JTextField();
		txtBase.setBounds(140,50,80,30);
		txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBase);
		
		txtExponente = new JTextField();
		txtExponente.setBounds(140,100,80,30);
		txtExponente.setHorizontalAlignment(SwingConstants.RIGHT);
		txtExponente.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtExponente);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(140,150,80,30);
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setFocusable(false);
		txtResultado.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,200,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				int base = Integer.parseInt(txtBase.getText());
				int exponente = Integer.parseInt(txtExponente.getText());
				
				int resultado = 1;
		        int i = 0;
		        
		        while (i < exponente) {
		            resultado *= base;
		            i++;
		        }
		        txtResultado.setText(""+ resultado);
				
			}
		}); 
		
	}

}
