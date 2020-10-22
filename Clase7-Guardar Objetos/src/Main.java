import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Rectangulo> rectangulos = new ArrayList<Rectangulo>();
			
		
		Scanner s = new Scanner(System.in);
		System.out.println("Archivo");
		String nombreArchivo = s.nextLine();
	
		File archivo = new File(nombreArchivo);
		
		
		
		try {
			if (archivo.createNewFile()) {
				System.out.println("Se ha creado el archivo");
				rectangulos.add(new Rectangulo(22,22));
				rectangulos.add(new Rectangulo(111,111));
				rectangulos.add(new Rectangulo(255,255));
				rectangulos.add(new Rectangulo(344,344));
				ObjectOutputStream oS;
				oS = new ObjectOutputStream(new FileOutputStream(archivo,false));
				oS.writeObject(rectangulos);
				oS.close();
			} else {
				System.out.println("Ya existia el archivo");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	
		ObjectInputStream iS;

		try {

			iS = new ObjectInputStream(new FileInputStream(archivo));
			
			try {
				ArrayList<Rectangulo> listRectangulos = (ArrayList<Rectangulo>)  iS.readObject();
				for( Rectangulo rectangu : listRectangulos ) {
					System.out.println(rectangu.altura + "//"+rectangu.base);
				}
				
			}catch(java.io.EOFException e) {
				System.out.println("Fin del archivo");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
