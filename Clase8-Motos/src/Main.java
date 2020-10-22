import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Archivador archi = new Archivador();

		ArrayList<Moto> listaMotos = new ArrayList<Moto>();

		System.out.println("Elija archivo");

		String ruta = sc.next();

		if (!archi.crear(ruta)) {

			listaMotos = ((ArrayList<Moto>) archi.cargar(ruta));
			archi.guardar(listaMotos, ruta);

		}

		while (true) {
			for (Moto moto : listaMotos) {
				System.out.println(moto);
			}

			System.out.println("Ingrese la patente de la nueva moto (F para salir)");
			String patente = sc.next();

			if (patente.toUpperCase().equals("F")) {
				break;
			}

			System.out.println("Ingrese velocidad del motor");
			double velocidad = sc.nextDouble();

			System.out.println("Ingrese el kilometraje");
			double kilometraje = sc.nextDouble();

			System.out.println("¿Es todo terreno?");
			if (sc.next().toUpperCase().equals("S")) {
				listaMotos.add(new MotoTodoTerreno(patente, kilometraje, new Motor(velocidad, kilometraje)));
			} else {
				listaMotos.add(new Moto(patente, kilometraje, new Motor(velocidad, kilometraje)));

			}

			archi.guardar(listaMotos, ruta);

		}

		while (true) {

			System.out.println(
					"Ingrese la cantidad de horas a recorrer" + " (Ingrese un numero negativo para finalizar. Ej: -1)");

			double horas = sc.nextDouble();
			if (horas < 0) {
				break;
			}

			System.out.println("¿Es ruta?");
			boolean isRuta = sc.next().toUpperCase().equals("S");

			for (Moto moto : listaMotos) {

				double kmRecorridos = moto.recorrer(horas, isRuta);

				System.out.println(moto + ". Recorrió " + String.format("%1$,.5f", kmRecorridos));

			}

			archi.guardar(listaMotos, ruta);
		}

	}

}
