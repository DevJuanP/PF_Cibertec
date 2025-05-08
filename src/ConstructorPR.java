
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
	public int GetId(){return this.ID;}
	
	public String GetNombre() {return this.nombre;}
	
	public int GetCantidad() {return this.cantidad;}
	
	public double GetPrecio() {return this.precio;}
	
	
	
	//metodos set
	public void SetId(int id) {
		this.ID = id;
	}
	public void SetNombre(String nomnre) {
		this.nombre = nomnre;
	}
	public void SetCantidad(int cantidad) {
		this.cantidad=cantidad;
	}
	public void SetPrecio(double precio) {
		this.precio=precio;
	}


}
