import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Archivador {
	
	public boolean crear(String ruta)  {
		File archivo = new File(ruta);
		try {
		return archivo.createNewFile();
		}catch(Exception e) {
			return false;
		}
	}
	

	public Object cargar(String ruta) {
		try {
			File archivo = new File(ruta);
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(archivo));
			
			Object obj = input.readObject();
			input.close();
			return obj;

		} catch (Exception e) {
			return "";
		}
	}

	public void guardar(Object objeto, String ruta) {
		File archivo = new File(ruta);

		try {

			ObjectOutputStream ouput = new ObjectOutputStream(new FileOutputStream(archivo, false));
			ouput.writeObject(objeto);

		} catch (Exception e) {

		}

	}

}
