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

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		setJMenuBar(menuBar);
		
		JMenu archivo = new JMenu("Archivo");
		menuBar.add(archivo);
		
		JMenuItem salir = new JMenuItem("Salir");
		archivo.add(salir);
		
		JMenu inventario = new JMenu("Inventario");
		menuBar.add(inventario);
		
		JMenuItem agregarPR = new JMenuItem("Agregar producto");
		inventario.add(agregarPR);
		
		JMenuItem buscarPR = new JMenuItem("Buscar producto");
		inventario.add(buscarPR);
		
		JMenuItem listarPR = new JMenuItem("Listar productos");
		inventario.add(listarPR);
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
