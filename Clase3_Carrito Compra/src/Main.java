import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*Se solicita crear un programa el cual tenga empleados de distintas
		 * categorias.
		 * 
		 * Cada persona va a tener un inventario de articulos.
		 * Los cuales vamos a cargar
		 * 
		 * Estos articulos la persona los tendra que comprar
		 * 
		 * */
		
	
		
		Articulo arti = new Articulo("G01", "Pepsi 1L", 200);
		
		ListadoArticulos.agregar(arti);
		
		arti  = new Articulo("G03", "Fanta 1L", 320);
		
		ListadoArticulos.agregar(arti);
		
		 arti = new Articulo("D02", "Desodorante Axe", 89);
		
		 ListadoArticulos.agregar(arti);
		
		 arti = new Articulo("A09", "Cerveza 2L", 250);
		 
		 ListadoArticulos.agregar(arti);
		
		
		 
		 Persona comprador = new Persona("Norberto", 600);
		 Scanner sc = new Scanner(System.in);


		 
		 while(true) {
			 System.out.println("1. Comprar");
			 System.out.println("2. Cargar efectivo");
			 System.out.println("3. Mostrar mochila");
			 System.out.println("0. Salir");

			 int opcion =  sc.nextInt();
			 
			 if(opcion == 0) {
				 break;
			 }
			 
			switch (opcion) {
			case 1:
				ListadoArticulos.mostrar();
				comprador.mostrarDinero();
				System.out.println("Ingrese codigo");
				String codigo = sc.next();
				comprador.comprar(codigo);
				
				break;
				
			case 2:
				System.out.println("Ingrese cantidad de efectivo");
				comprador.addDinero(sc.nextDouble());
				break;
				
			case 3: 
				comprador.mostrarMochila();
				break;

			} 
			
			 
			 
			 
			 
		 }

		 
		
		 
		
		
		
		

	}

}
