import java.util.HashMap;

public class Persona {

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addDinero(double cantidad) {
		this.dinero += cantidad;
	}

	private HashMap<String, Integer> mochila = new HashMap<String,Integer>();
	
	
	
	
	private String nombre;

	private double dinero;
	
	public Persona(String nombre, double dinero) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
	}
	
	public void comprar(String codigo_articulo) {
		Articulo arti = ListadoArticulos.articulos.get(codigo_articulo);
		
		if(this.dinero >= arti.getPrecio()) {
			 this.addDinero( - arti.getPrecio());
			 this.agregar(codigo_articulo,1);

		}
		
		
		
	}
	
	
	public void agregar(String codigo_articulo, int cantidad) {
		if(this.mochila.containsKey(codigo_articulo)) {
			
			int anterior = this.mochila.get(codigo_articulo);
			
			this.mochila.replace(codigo_articulo,  anterior + cantidad     );
		}else {
			this.mochila.put(codigo_articulo, cantidad);
		}
	}
	
	
	public void mostrarMochila() {
		
		for ( String clave: this.mochila.keySet()) {
			Articulo arti = ListadoArticulos.articulos.get(clave);
			System.out.println(arti.getDescripcion() + ": "
			+ this.mochila.get(clave)		);
			
			
		}
		
	}
	
	public void mostrarDinero() {
		System.out.println("Dinero: "+this.dinero);
	}
	
	
	
}
