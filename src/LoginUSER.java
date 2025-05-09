import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginUSER extends JFrame {

	private JPanel contentPane;
	private JTextField USUARIO;
	private JPasswordField CONTRASEÑA;
	private HashMap<String, String> UsuariosRegistro;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUSER frame = new LoginUSER();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginUSER() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(223, 240, 216)); 
		
		JLabel lblNewLabel = new JLabel("Inicias sesion");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(161, 10, 122, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario.setBounds(44, 54, 122, 21);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(44, 120, 122, 19);
		contentPane.add(lblContrasea);
		
		USUARIO = new JTextField();
		USUARIO.setBounds(138, 54, 182, 21);
		contentPane.add(USUARIO);
		USUARIO.setColumns(10);
		
		CONTRASEÑA = new JPasswordField();
		CONTRASEÑA.setBounds(138, 112, 182, 21);
		contentPane.add(CONTRASEÑA);
		//EL HASHMAP ES UNA ESTRUCTURA  CLAVE- VALOR QUE ALAMACENA A ESTOS, DONDE LA CLAVE TIENE QUE COINCIDIR CON EL USUARIO REGISTRADO PARA DAR ACCESO(TRUE)
		UsuariosRegistro = new HashMap<>();
		UsuariosRegistro.put("Oscar","2709");
		UsuariosRegistro.put("Juan","2020");
		UsuariosRegistro.put("JHONAS","2021");
		UsuariosRegistro.put("JULISA","2022");

		
		
		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Usuario= USUARIO.getText();
				String Contraseña = new String(CONTRASEÑA.getPassword());
				
				
			if(Usuario.isEmpty()|| Contraseña.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Complete todos los campos.");
				//BUSCA SI EXITE EL USUARIO Y LUEGO SI LA CONTRASEÑA GUARDAD PERTECENE AL USUARIO	
				}else if(UsuariosRegistro.containsKey(Usuario)&& UsuariosRegistro.get(Usuario).equals(Contraseña)) {
					JOptionPane.showMessageDialog(null,"Inicio de sesion con exito");
					//EL DISPOSE CIERRA LA VENTANA ACTUAL SEGUN LA LINEA DE CODIGO QUE SE EJECUTE SEA CORRECTA
					new MenuPrincipal().setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrectos.");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(161, 172, 122, 21);
		btnNewButton.setBackground(new Color(76, 175, 80)); 
		btnNewButton.setForeground(Color.WHITE); 
		contentPane.add(btnNewButton);
	}
}

