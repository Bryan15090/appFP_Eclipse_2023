package condicionales;

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

public class _32 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtCategoria, txtPromedio, txtPension, txtDescuento, txtNPension;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_32 frame = new _32();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _32() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblCategoria = new JLabel("Categoria: ");
		lblCategoria.setBounds(50,50,130,30);
		getContentPane().add(lblCategoria);
		
		JLabel lblPromedio = new JLabel("Promedio: ");
		lblPromedio.setBounds(50,100,130,30);
		getContentPane().add(lblPromedio);
		
		JLabel lblpension = new JLabel("Pension: ");
		lblpension.setBounds(50,150,130,30);
		getContentPane().add(lblpension);
		
		JLabel lbldescuento = new JLabel("Descuento: ");
		lbldescuento.setBounds(50,200,130,30);
		getContentPane().add(lbldescuento);
		
		JLabel lblNPension = new JLabel("Nueva pension: ");
		lblNPension.setBounds(50,250,130,30);
		getContentPane().add(lblNPension);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(170,50,80,30);
		txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCategoria.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCategoria);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(170,100,80,30);
		txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPromedio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPromedio);
		
		txtPension = new JTextField();
		txtPension.setBounds(170,150,80,30);
		txtPension.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPension.setFocusable(false);
		txtPension.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPension);
		
		txtDescuento = new JTextField();
		txtDescuento.setBounds(170,200,80,30);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setFocusable(false);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDescuento);
				
		txtNPension = new JTextField();
		txtNPension.setBounds(170,250,80,30);
		txtNPension.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNPension.setFocusable(false);
		txtNPension.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtNPension);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100,300,100,30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}

			private void btnCalcular_actionPerformed() {
				String categoria = txtCategoria.getText();
				int promedio = Integer.parseInt(txtPromedio.getText());
				
				double pension = 0;
				double descuento = 0;
				double descuento1= 0;
				double nueva_pension =0;
				
				if (categoria.equals("A")) pension = 550;
				else if (categoria.equals("B")) pension = 500;
				else if (categoria.equals("C")) pension = 450;
				else if (categoria.equals("D")) pension = 400;

				
				if ( promedio < 14) descuento = 0;
				else if ( promedio >= 14 && promedio < 16) descuento = 0.10;
				else if ( promedio >= 16 && promedio < 18) descuento = 0.12;
				else if ( promedio >= 18 && promedio < 20) descuento = 0.15;
				
				descuento1 = pension * descuento;
				nueva_pension = pension - descuento1;
				
				
				DecimalFormat df = new DecimalFormat("###.00");
				txtPension.setText(df.format(pension));
				txtDescuento.setText(df.format(descuento1));
				txtNPension.setText(df.format(nueva_pension));
			
	
			}
		}); 
		
	}

}
