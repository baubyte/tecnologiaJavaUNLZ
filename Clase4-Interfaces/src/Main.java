
public class Main {

	public static void main(String[] args) {
		Balanza balanza = new Balanza();
//		Caballo caballo = new Caballo();
//		Perro perro = new Perro();
//		perro.setPeso(40);
		
		Manzana manzana = new Manzana(20);
		
		
		Pesable[] pesables = new Pesable[5];
		
		pesables[0] = new Perro(20);
		pesables[1] = new Caballo(210);
		pesables[2] = new Manzana(20);
		pesables[3] = new Perro(30);
		pesables[4] = new Manzana(5);
		
		
		for (Pesable pesable : pesables) {
			balanza.pesar(pesable);
		}
		
		

	}

}
