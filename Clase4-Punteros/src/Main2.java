
public class Main2 {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(10, 10);
		Rectangulo r2 = new Rectangulo(10, 10);
		r2.setAltura(12);
		
		
		System.out.println(r1.equals(r2));
		
		System.out.println(r1);
		
		Rectangulo[] rectangulos = new Rectangulo[12];
		
		
		r1.mostarValor(1);
		
		
		r1.mostarValor(1.5);
		
		
		r2.mostarValor(r1);
		
		
		r2.mostarValor(rectangulos);
	}

}
