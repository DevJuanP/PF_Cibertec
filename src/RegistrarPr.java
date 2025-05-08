import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class RegistrarPr extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField NOMBRE;
	private JTextField CANTIDAD;
	private JTextField PRECIO;
    public static ArrayList<ConstructorPR> inventario = new ArrayList<>();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			try {
					RegistrarPr frame = new RegistrarPr();
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
	public RegistrarPr() {
		
		setFont(new Font("Arial", Font.PLAIN, 13));
		setTitle("AGREGAR PRODUCTO");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Precio:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(58, 151, 82, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Cantidad:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(58, 117, 82, 24);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nombre:");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(58, 83, 82, 24);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("ID:");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(58, 49, 82, 24);
		contentPane.add(lblNewLabel_3_3);
		
		ID = new JTextField();
		ID.setEditable(false);
		ID.setBounds(198, 52, 177, 24);
		contentPane.add(ID);
		ID.setColumns(10);
		
		NOMBRE = new JTextField();
		NOMBRE.setColumns(10);
		NOMBRE.setBounds(198, 86, 177, 24);
		contentPane.add(NOMBRE);
		
		CANTIDAD = new JTextField();
		CANTIDAD.setColumns(10);
		CANTIDAD.setBounds(198, 120, 177, 24);
		contentPane.add(CANTIDAD);
		
		PRECIO = new JTextField();
		PRECIO.setColumns(10);
		PRECIO.setBounds(198, 154, 177, 24);
		contentPane.add(PRECIO);
		
		//logica
		int id = inventario.size()+1;
		ID.setText(""+id);
		JButton btnNewButton = new JButton("AGREGAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lelctura de datos
		try {		
			int currentId= inventario.size()+1;
			String nombre= NOMBRE.getText();
			int cantidad= Integer.parseInt(CANTIDAD.getText());
			double precio = Double.parseDouble(PRECIO.getText());
			
			inventario.add(new ConstructorPR(currentId,nombre,cantidad,precio));
			System.out.println(inventario+"jonas gei");
			JOptionPane.showMessageDialog(null,"Item registrado con exito :D");
			
			//LIMPIEZA 
			int newId = inventario.size()+1;
			ID.setText(""+newId);
			NOMBRE.setText("");
			CANTIDAD.setText("");
			PRECIO.setText("");
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null,"Ha ocurrido un error: verifique los que los datos de ID, nombre, cantidad y precio sean correctos");
		}catch(Exception ex) {JOptionPane.showConfirmDialog(null,"ERROR");
		}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(128, 203, 136, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("PRODUCTO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(103, 10, 194, 29);
		contentPane.add(lblNewLabel);
	}
}
