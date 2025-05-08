import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import javax.swing.*;

public class ModificarPR extends JFrame {
	private ConstructorPR PrAmodificar = null;
	private int idBuscado;

	public ModificarPR() {
		setTitle("modificar producto");
		setSize(338, 447);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		//componenetes
		JLabel lblAsk = new JLabel("Escriba el id: ");
		lblAsk.setBounds(29, 11, 100, 25);
		
		JTextField txtIdToFinf = new JTextField();
		txtIdToFinf.setBounds(128, 11, 100, 25);
		//
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(180, 51, 100, 25);
		//
		JTextArea txtInfo = new JTextArea();
		txtInfo.setBounds(50, 87, 230, 118);
		//
		JLabel txtNewInfo = new JLabel("Coloque a continuación los nuevos valores");
		txtNewInfo.setBounds(29, 212, 240, 25);
		//nuevo nombre:
		JLabel lblNewNombre = new JLabel("Nuevo nombre: ");
		lblNewNombre.setBounds(49, 248, 100, 25);
		
		JTextField txtNewName = new JTextField();
		txtNewName.setBounds(145, 248, 139, 25);
		//nueva  cantidad:
		JLabel lblNewCantidad = new JLabel("Nueva Cantidad: ");
		lblNewCantidad.setBounds(49, 284, 100, 25);
		
		JTextField txtNewCantidad = new JTextField();
		txtNewCantidad.setBounds(145, 284, 139, 25);
		//nuevo precio
		JLabel lblNewPrecio = new JLabel("Nuevo Precio:");
		lblNewPrecio.setBounds(49, 320, 100, 25);
		
		JTextField txtNewPrecio = new JTextField();
		txtNewPrecio.setBounds(145, 320, 139, 25);
		//boton modificar
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(99, 372, 100, 25);
		
		
		//add:
		getContentPane().add(lblAsk);
		getContentPane().add(txtIdToFinf);
		getContentPane().add(btnBuscar);
		getContentPane().add(txtInfo);
		getContentPane().add(txtNewInfo);
		
		getContentPane().add(lblNewNombre);
		getContentPane().add(txtNewName);
		
		getContentPane().add(lblNewCantidad);
		getContentPane().add(txtNewCantidad);
		
		getContentPane().add(lblNewPrecio);
		getContentPane().add(txtNewPrecio);
		
		getContentPane().add(btnModificar);
		
		//logica
		txtInfo.setEditable(false);
		
		btnBuscar.addActionListener(e -> {
			try {
				idBuscado = Integer.parseInt(txtIdToFinf.getText());
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "ID no valido");
			}
			System.out.println("id: "+idBuscado);
			
			for(ConstructorPR p:RegistrarPr.inventario) {
				if(p.ID == idBuscado) {
					PrAmodificar = p;
					break;
				}
			}
			if(PrAmodificar == null) {
				txtInfo.setText("Producto no encontrado");
				txtNewName.setText("");
				txtNewCantidad.setText("");
				txtNewPrecio.setText("");
			}else {
				txtInfo.setText("Producto a modificar: \n\n");
				txtInfo.append("id: " + PrAmodificar.ID + "\n"+
						"Producto: " + PrAmodificar.nombre + "\n"+
						"Cantidad : " + PrAmodificar.cantidad + "\n"+
						"Precio: " + PrAmodificar.precio);
				
				txtNewName.setText(PrAmodificar.nombre);
				txtNewCantidad.setText(""+PrAmodificar.cantidad);
				txtNewPrecio.setText(""+PrAmodificar.precio);
				
				txtIdToFinf.setText("");
				
			}
		});
		
		btnModificar.addActionListener(e -> {
			if (PrAmodificar == null) {
				JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún producto a modificar");
				return;
			}
			String name = txtNewName.getText();
			int cant = 0;
			double precio = 0;
			try {
				cant = Integer.parseInt(txtNewCantidad.getText());
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "Debe colocar una cantidad entera");
				return;
			}
			if(cant<0) {
				JOptionPane.showMessageDialog(null, "No puede colocar una cantidad negativa");
				return;
			}
			
			try {
				precio = Double.parseDouble(txtNewPrecio.getText());
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "Debe colocar un precio de tipo numero");
				return;
			}
			if(precio<0) {
				JOptionPane.showMessageDialog(null, "No puede colocar un precio negativ");
				return;
			}
			
			for(ConstructorPR p:RegistrarPr.inventario) {
				if(p.GetId() == idBuscado) {
					p.SetNombre(name);
					p.SetCantidad(cant);
					p.SetPrecio(precio);
					JOptionPane.showMessageDialog(null,"Se ha modificado el producto");
					break;
				}
			}
		});
		
	}

	public static void main(String[] args) {
		ModificarPR frameModificar = new ModificarPR();
		frameModificar.setVisible(true);
	}
}
