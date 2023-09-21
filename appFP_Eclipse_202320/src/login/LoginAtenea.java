package login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginAtenea extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JTextField txtUsuario;
	JPasswordField txtPassword;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAtenea frame = new LoginAtenea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginAtenea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		JPanel pnlLogin = new JPanel();
		pnlLogin.setBounds(0,0,400,50);
		pnlLogin.setBackground( new Color(94,17,97));
		pnlLogin.setLayout(null);
		getContentPane().add(pnlLogin);
		
		JLabel imgLogo = new JLabel();
		imgLogo.setIcon(new ImageIcon(LoginAtenea.class.getResource("/login/logo.png")));
		imgLogo.setBounds(96, 3, 208, 43);
		pnlLogin.add(imgLogo);
		
		JLabel imgSalir = new JLabel();
		imgSalir.setIcon(new ImageIcon(LoginAtenea.class.getResource("/login/Salir.png")));
		imgSalir.setBounds(365, 10, 32, 32);
		pnlLogin.add(imgSalir);
		
		JLabel lblUsuario = new JLabel("Usuario : ");
		lblUsuario.setBounds(50, 100, 80, 30);
		getContentPane().add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setBounds(50, 150, 80, 30);
		getContentPane().add(lblPassword);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(8);
		txtUsuario.setBounds(180,100,100,30);
		getContentPane().add(txtUsuario);
		
		txtPassword = new JPasswordField();
		txtPassword.setColumns(6);
		txtPassword.setBounds(180,150,100,30);
		txtPassword.setEchoChar('*');
		getContentPane().add(txtPassword);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBorderPainted(false);
		btnIniciar.setBounds(75, 230, 100, 30);
		btnIniciar.setBackground( new Color(94, 17, 97));
		btnIniciar.setCursor( new Cursor( Cursor.HAND_CURSOR));
		btnIniciar.setForeground(Color.white);
		btnIniciar.setFocusPainted(false);
		getContentPane().add(btnIniciar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBounds(230, 230, 100, 30);
		btnCancelar.setBackground( new Color(94, 17, 97));
		btnCancelar.setCursor( new Cursor( Cursor.HAND_CURSOR));
		btnCancelar.setForeground(Color.white);
		btnCancelar.setFocusPainted(false);
		getContentPane().add(btnCancelar);
		
		imgSalir.addMouseListener(new MouseAdapter() {
			@Override public void mouseClicked(MouseEvent e) {imgSalir_mouseClicked(); } });
		
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override public void focusGained(FocusEvent e) {txt_focusGained(e); }
			@Override public void focusLost(FocusEvent e) {txt_focusLost(e);}});
		txtUsuario.addKeyListener(new KeyAdapter() {
			@Override public void keyTyped(KeyEvent e) { txtUsuario_keyTyped(e); } });
		
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override public void focusGained(FocusEvent e) {txt_focusGained(e); }
			@Override public void focusLost(FocusEvent e) {txt_focusLost(e); } });
		txtPassword.addKeyListener(new KeyAdapter() {
			@Override public void keyTyped(KeyEvent e) { txtPassword_keyTyped(e); } });
		
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnIniciar_actionPerformed(); }});
		btnIniciar.addFocusListener(new FocusAdapter() {
			@Override public void focusGained(FocusEvent e) { btn_focusGainded ( btnIniciar); }
			@Override public void focusLost(FocusEvent e) { btn_focusLost ( btnIniciar) ; } });
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override public void mouseEntered(MouseEvent e) { btn_focusGainded(btnIniciar);}
			@Override public void mouseExited(MouseEvent e) { btn_focusLost(btnIniciar); } });
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCancelar_actionPerformed(); }});
		btnCancelar.addFocusListener(new FocusAdapter() {
			@Override public void focusGained(FocusEvent e) { btn_focusGainded ( btnCancelar); }
			@Override public void focusLost(FocusEvent e) { btn_focusLost ( btnCancelar) ; } });
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override public void mouseEntered(MouseEvent e) { btn_focusGainded(btnCancelar);}
			@Override public void mouseExited(MouseEvent e) { btn_focusLost(btnCancelar); } });
	}


	protected void txt_focusGained(FocusEvent e) {
		( (JTextField) e.getSource()) .setBackground(new Color(215,230,255));
		
	}

	
	protected void txt_focusLost(FocusEvent e) {
		( (JTextField) e.getSource()) .setBackground(Color.white);
		
	}

	protected void btnCancelar_actionPerformed() {
		txtUsuario.setText("");
		txtPassword.setText("");
		txtUsuario.requestFocus();
		
	}

	protected void btn_focusGainded(JButton btn) {
		btn.setBackground(Color.BLACK );
	}
	
	protected void btn_focusLost(JButton btn) {
		btn.setBackground( new Color (94,17,97));
		
	}


	protected void btnIniciar_actionPerformed() {
		if ( txtUsuario.getText().length() == txtUsuario.getColumns() &&
				String.valueOf( txtPassword.getPassword() ).length() == txtPassword.getColumns() ) {
					
				} else {
					JOptionPane.showMessageDialog(this, "Completar campos");
					btnCancelar_actionPerformed();
				}
		
	}
	

	protected void txtPassword_keyTyped(KeyEvent e) {
		JTextField txt =(JTextField) e.getSource();
		if ( Character.isLetter( e.getKeyChar() ) ||
				txt.getText().length() >=  txt.getColumns() ) 
			e.consume();
	}

	protected void txtUsuario_keyTyped(KeyEvent e) {
		JTextField txt =(JTextField) e.getSource();
		if ( Character.isDigit( e.getKeyChar() ) ||
				txt.getText().length() >=  txt.getColumns() ) 
			e.consume();
	}
	
	protected void imgSalir_mouseClicked() {
		if (JOptionPane.showConfirmDialog(this, "¿Desea salir?"," salir del sistema",
				JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE ) == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
}
