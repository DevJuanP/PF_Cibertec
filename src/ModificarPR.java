import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;

public class ModificarPR extends JFrame {


	public ModificarPR() {
		setTitle("modificar producto");
		setSize(380, 380);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		//componenetes
		JLabel lblAsk = new JLabel("Escriba el id: ");
		lblAsk.setBounds(50, 30, 100, 25);
		
		JTextField txtIdToFinf = new JTextField();
		txtIdToFinf.setBounds(182, 30, 100, 25);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(180, 70, 100, 25);
		
		JTextArea txtInfo = new JTextArea();
		txtInfo.setBounds(50, 100, 230, 80);
		
		//add:
		getContentPane().add(lblAsk);
		getContentPane().add(txtIdToFinf);
		getContentPane().add(btnBuscar);
		getContentPane().add(txtInfo);
		
		//logica
		btnBuscar.addActionListener(e -> {
			int idBuscado = Integer.parseInt(txtIdToFinf.getText());
			System.out.println("id: "+idBuscado);
			ConstructorPR PrAmodificar = null;
			
			for(ConstructorPR p:RegistrarPr.inventario) {
				if(p.ID == idBuscado) {
					PrAmodificar = p;
					System.out.println("producto: "+"id: " + PrAmodificar.ID + "\n"+
						"Producto: " + PrAmodificar.nombre + "\n"+
						"Cantidad : " + PrAmodificar.cantidad + "\n"+
						"Precio: " + PrAmodificar.precio);
					break;
				}
			}
			
			if(PrAmodificar == null) {
				txtInfo.setText("Producto no encontrado");
			}else {
				
				txtInfo.setText("id: " + PrAmodificar.ID + "\n"+
						"Producto: " + PrAmodificar.nombre + "\n"+
						"Cantidad : " + PrAmodificar.cantidad + "\n"+
						"Precio: " + PrAmodificar.precio);
			}
		});
	}

	public static void main(String[] args) {
		ModificarPR frameModificar = new ModificarPR();
		frameModificar.setVisible(true);
	}
}
