import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarPr extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new ListarPr().setVisible(true);
	
	}

	/**
	 * Create the frame.
	 */
	public ListarPr() {
		setBounds(100, 100, 450, 300);
		setSize(450 , 370);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INVENTARIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(158, 10, 107, 32);
		contentPane.add(lblNewLabel);
		
		JTextArea LISTA = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(LISTA);
		scrollPane.setBounds(38, 53, 361, 170);
		contentPane.add(scrollPane);
		
		
		StringBuilder sb= new StringBuilder();
		for(ConstructorPR producto: RegistrarPr.inventario ){
			sb.append("ID: ").append(producto.ID+"\n");
			sb.append("nombre: ").append(producto.nombre+"\n");
			sb.append("precio: ").append(producto.precio+"\n");
			sb.append("cantidad: ").append(producto.cantidad+"\n\n");
		}
		LISTA.setText(sb.toString());
		
		JButton CERRAR = new JButton("VOLVER");
		CERRAR.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				
			}
		});
		CERRAR.setBounds(168, 233, 85, 30);
		contentPane.add(CERRAR);
	}
}
