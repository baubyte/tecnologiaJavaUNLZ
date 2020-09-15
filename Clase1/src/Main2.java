import java.util.Scanner;

public class Main2 {


	
	public static void main(String[] args) {
		Auto a1;
		Scanner sc = new Scanner(System.in);
		double kilometros;
		double meta;
		
		a1 = new Auto();
		
		System.out.print("Cuantos kilometros se va a recorrer? ");
		meta = 100;
		
		while(a1.distancia_recorrida < meta) {
			System.out.print("Ingrese Kilimetros a avanzar: ");
			kilometros = sc.nextDouble();
			a1.recorrer(kilometros);
			a1.mostrar_kilometros();
		


			
		}
		

		
		

	}

}
