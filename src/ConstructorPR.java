
public class ConstructorPR {	
	public int ID;
	public String nombre;
	public int cantidad;
	public double precio;
	
	public ConstructorPR( int ID, String nombre, int cantidad, double precio) {
		this.ID=ID;
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.precio=precio; 
		
	}
	//metodos get
	public int GetId(){return ID;}
	
	public String GetNombre() {return nombre;}
	
	public int GetCantidad() {return cantidad;}
	
	public double GetPrecio() {return precio;}
	
	
	
	//metodos set
	public void SetId(int id) {
		this.ID = ID;
	}
	public void SetNombre(String nomnre) {
		this.nombre = nombre;
	}
	public void SetCantidad(int cantidad) {
		this.cantidad=cantidad;
	}
	public void SetPrecio(double precio) {
		this.precio=precio;
	}


}
