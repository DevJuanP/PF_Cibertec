import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MenuPrincipal extends JFrame {


	public MenuPrincipal() {
		getContentPane().setBackground(new Color(223, 240, 216));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU DE INVENTARIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(50, 100, 350, 40);
		getContentPane().add(lblNewLabel);
		AddToInventario.cargarData();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 300);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(new Color(76, 175, 80)); 
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		setJMenuBar(menuBar);
		
		//archivo
		JMenu archivo = new JMenu("Archivo");
		
		JMenuItem salir = new JMenuItem("Salir");
		
		
		//inventario
		JMenu inventario = new JMenu("Inventario");
		
		JMenuItem agregarPR = new JMenuItem("Agregar producto");
		JMenuItem buscarPR = new JMenuItem("Buscar producto");
		JMenuItem listarPR = new JMenuItem("Listar productos");
		JMenuItem ModificarPR = new JMenuItem("Modificar productos");
		
		//ayuda
		JMenu ayuda = new JMenu("Ayuda");
		JMenuItem itemAbout = new JMenuItem("Acerca de");	
		
		//add
		menuBar.add(archivo);
		menuBar.add(inventario);
		menuBar.add(ayuda);
		
			archivo.add(salir);
	
			inventario.add(agregarPR);
			inventario.add(buscarPR);
			inventario.add(listarPR);
			inventario.add(ModificarPR);
		
			ayuda.add(itemAbout);
		
		//lógica
		salir.addActionListener(e -> System.exit(0));	
			
		agregarPR.addActionListener(e->new RegistrarPr().setVisible(true));
		buscarPR.addActionListener(e->new BuscarPr().setVisible(true));
		listarPR.addActionListener(e->new ListarPr().setVisible(true));
		ModificarPR.addActionListener(e->new ModificarPR().setVisible(true));
		
		
		itemAbout.addActionListener(e -> JOptionPane.showMessageDialog(this,"Sistema de inventario \n versión 1.1 Autores: yo pues","Acerca de",JOptionPane.INFORMATION_MESSAGE));
		
		//carga productos
		
	}
	
	public static void main(String[] args) {
		//AddToInventario.cargarData();
		MenuPrincipal frame = new MenuPrincipal();
		frame.setVisible(true);
	}
}
