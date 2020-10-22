import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
while(true) {
		//ArrayList<Rectangulo> rectangulos = new ArrayList<Rectangulo>();
		
Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el nombre del Archivo");
		
		String nombreArchivo = s.nextLine();
	
		File archivo = new File(nombreArchivo);
		
		
		
		try {
			if (archivo.createNewFile()) {
				System.out.println("Se ha creado el archivo");

				 ObjectOutputStream ouput 
				 = new ObjectOutputStream(new FileOutputStream(archivo,false));

				System.out.println("ingrese base");
				double base = s.nextDouble();
				System.out.println("ingrese altura");
				double altura = s.nextDouble();;
				
				
				Rectangulo reg = new Rectangulo(base, altura);
				
				ouput.writeObject(reg);

			} else {
				System.out.println("Ya existia el archivo");
				
				ObjectInputStream input = 
						new ObjectInputStream(new FileInputStream(archivo));
				Rectangulo reg = (Rectangulo) input.readObject();
				
				System.out.println(reg);
				
				
				
			}
			
			
			
			
			
			
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		

	}
	}
}
