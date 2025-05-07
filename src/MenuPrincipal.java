import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;

public class MenuPrincipal extends JFrame {


	public MenuPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		setJMenuBar(menuBar);
		
		//archivo
		JMenu archivo = new JMenu("Archivo");
		
		JMenuItem salir = new JMenuItem("Salir");
		
		menuBar.add(archivo);
		archivo.add(salir);
		
		//inventario
		JMenu inventario = new JMenu("Inventario");
		
		JMenuItem agregarPR = new JMenuItem("Agregar producto");
		JMenuItem buscarPR = new JMenuItem("Buscar producto");
		JMenuItem listarPR = new JMenuItem("Listar productos");
		
		//ayuda
		JMenu ayuda = new JMenu("Ayuda");
		
		//add
		menuBar.add(inventario);
		menuBar.add(ayuda);
	
		inventario.add(agregarPR);
		inventario.add(buscarPR);
		inventario.add(listarPR);
		
		//lógica
		agregarPR.addActionListener(e->new RegistrarPr().setVisible(true));
		buscarPR.addActionListener(e->new RegistrarPr().setVisible(true));
		listarPR.addActionListener(e->new RegistrarPr().setVisible(true));
	}
	
	public static void main(String[] args) {
		MenuPrincipal frame = new MenuPrincipal();
		frame.setVisible(true);
	}
}
