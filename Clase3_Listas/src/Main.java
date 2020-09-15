import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		String[] array_articulos = new String[10];
		
		ArrayList<String> lista_articulos = new ArrayList<String>();
		
		array_articulos[0] = "Hoola";
		
		lista_articulos.add("Hola");
		
		lista_articulos.add("Chau");
		
		lista_articulos.add("Chau");
		
		lista_articulos.set(2, "nuevo valor");
		
		lista_articulos.remove(1);
		
		lista_articulos.add("Otro valor");
		
		lista_articulos.get(2);
		
		for(  String string : lista_articulos   ) {
			System.out.println(string);
		}
		
		
		
		HashMap<Integer,String> diccionario_articulos = new HashMap<Integer,String>();
		
		diccionario_articulos.put(0, "Perro");
		
		diccionario_articulos.put(2, "Gato");
		
		diccionario_articulos.put(8497, "Cangrejo");
		
		String valor = diccionario_articulos.get(8497);
		
		System.out.println("El valor es: " + valor);
		
		HashMap<String,String> diccionario2 = new HashMap<String,String>();
		
		diccionario2.put("gato", "Animal felino de cuatro patas");
		
		String  clave = "GaTo";
		
		
		diccionario2.get(clave.toLowerCase());
	
		
	}

}
