import java.util.Scanner;

public class MainExcepciones {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

			try {
				int entero = s.nextInt();
				System.out.println(entero);
			}catch (Exception e) {
				System.out.println("Se ingreso un valor incorrecto");
			}
			System.out.println("fin del programa");

	}

}
