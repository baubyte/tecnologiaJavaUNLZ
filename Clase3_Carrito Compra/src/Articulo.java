
public class Articulo {
	private String cod;
	private String descripcion;
	private double precio;
	
	
	
	public Articulo(String cod, String descripcion, double precio) {
		super();
		this.cod = cod;
		this.descripcion = descripcion;
		this.precio = precio;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getCod() {
		return cod;
	}
	
	
	public void mostrar() {
		System.out.println("Cod: "+this.cod + " / Desc: " + this.descripcion + " / Precio: "+this.precio);
	}
	
}
