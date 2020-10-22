import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Archivador archivador = new Archivador();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del Archivo");
		
		String nombreArchivo = sc.nextLine();
		
		
		if(archivador.crear(nombreArchivo)) {
			System.out.println("ingrese base");
			double base = sc.nextDouble();
			System.out.println("ingrese altura");
			double altura = sc.nextDouble();;
			
			
			Rectangulo reg = new Rectangulo(base, altura);
			archivador.guardar(reg, nombreArchivo);
		}else {
			
			Rectangulo reg =(Rectangulo) archivador.cargar(nombreArchivo);
			System.out.println(reg);
			
		}
		
		

	}

}
