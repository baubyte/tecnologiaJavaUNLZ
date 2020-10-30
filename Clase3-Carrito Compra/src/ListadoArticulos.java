import java.util.HashMap;

public class ListadoArticulos {
	
    public static ListadoArticulos singleton;
    public static ListadoArticulos getInstance(){
        if (singleton == null) {
            singleton = new ListadoArticulos();
        }
        return singleton;
    }
    private ListadoArticulos(){
    }
	public  double pi = 3.14;
	
	public  HashMap<String, Articulo> articulos = new HashMap<String,Articulo>();

	public  void mostrar() {
		for(  Articulo arti : this.articulos.values()    ) {
			arti.mostrar();
		}
	}
	
	public  void agregar(Articulo art) {
		this.articulos.put(art.getCod(),art);
	}

}
