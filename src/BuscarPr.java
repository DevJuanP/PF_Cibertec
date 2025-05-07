import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;


public class BuscarPr extends JFrame {
	
	public BuscarPr() {
		setTitle("inicio de sesion");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel lblBuscar = new JLabel("Nombre a buscar: ");
		lblBuscar.setBounds(30, 30, 120, 25);
		
		JTextField  txtBuscar = new JTextField();
		txtBuscar.setBounds(160, 30, 120, 25);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(150, 80, 150, 25);
		
		JTextArea txtResultados = new JTextArea();
		
		JScrollPane sp = new JScrollPane();
		sp.setViewportView(txtResultados);
		sp.setBounds(80, 140, 330, 170);
		
		add(lblBuscar);
		add(txtBuscar);
		add(btnBuscar);
		add(sp);
		
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
