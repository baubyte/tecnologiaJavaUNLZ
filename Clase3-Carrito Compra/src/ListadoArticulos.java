import java.util.HashMap;

public class ListadoArticulos {
	
	public static double pi = 3.14;
	
	public static HashMap<String, Articulo> articulos = new HashMap<String,Articulo>();

	public static void mostrar() {
		for(  Articulo arti : ListadoArticulos.articulos.values()    ) {
			arti.mostrar();
		}
	}
	
	public static void agregar(Articulo art) {
		ListadoArticulos.articulos.put(art.getCod(),art);
	}

}
