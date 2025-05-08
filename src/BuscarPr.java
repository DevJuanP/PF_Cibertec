import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.Font;


public class BuscarPr extends JFrame {
	
	public BuscarPr() {
		getContentPane().setBackground(new Color(223, 240, 216));
		setTitle("inicio de sesion");
		setSize(500, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel lblBuscar = new JLabel("Nombre a buscar: ");
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBuscar.setBounds(59, 30, 120, 25);
		
		JTextField  txtBuscar = new JTextField();
		txtBuscar.setBounds(178, 30, 120, 25);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(164, 81, 150, 25);
		btnBuscar.setBackground(new Color(76, 175, 80)); 

		
		JTextArea txtResultados = new JTextArea();
		
		JScrollPane sp = new JScrollPane();
		sp.setBounds(80, 140, 330, 170);
		sp.setViewportView(txtResultados);
		getContentPane().setLayout(null);
		
		getContentPane().add(lblBuscar);
		getContentPane().add(txtBuscar);
		getContentPane().add(btnBuscar);
		getContentPane().add(sp);
		
		//lógica:
		btnBuscar.addActionListener(e -> {
			String txtToAsk = txtBuscar.getText().toLowerCase();
			txtResultados.setText("");
			for(ConstructorPR p:RegistrarPr.inventario) {
				if(p.nombre.toLowerCase().contains(txtToAsk)) {
					txtResultados.append("id: " + p.ID + "\n"+
										"Producto: " + p.nombre + "\n"+
										"Cantidad : " + p.cantidad + "\n"+
										"Precio: " + p.precio + "\n\n");
				}
			}
			
			if (txtResultados.getText().isEmpty()) txtResultados.setText("Producto no encontrado");
		});
		

	}

	
	public static void main(String[] args) {
		new BuscarPr().setVisible(true);
	}
}
