
public class Test {

	public static void main(String[] args) {
		
		NotasPorAlumno npa = new NotasPorAlumno("Matematica", 4);
		
		
		if(npa.setNotas(-1, 5)   ) {
			System.out.println("Fallo pos negativa");
		}
		if(npa.setNotas(15, 5)) {
			System.out.println("Fallo pos superior al array");
		}
		if(		npa.setNotas(1, 11)  ) {
			System.out.println("Fallo nota sup a 10");
		}
		if(npa.setNotas(2, -15)) {
			System.out.println("Fallo nota negativa");
		}
		

		npa.setNotas(1, 7);
		npa.setNotas(2, 9);
		npa.setNotas(3, 5);
		
		if(npa.getPromedio() != 7) {
			System.out.println("El promedio no dio bien");
		}
		
		
		Libreta lib = new Libreta();
		lib.getPromedioGeneral();
		lib.agregarMateria("matematica",5);
		lib.setNota("Matematica",2,9);
		lib.setNota("Matematica",1,8);
		lib.setNota("Matematica",3,7);
		
		System.out.println(lib.getPromedioGeneral());
		
		

		
		
		
		

	}

}
