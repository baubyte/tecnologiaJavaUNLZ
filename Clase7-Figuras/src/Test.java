
public class Test {

	public static void main(String[] args) {

		double base = 5;
		
		double altura = 8;
		
		
		FiguraGeometrica figura = new Rectangulo(base, altura);
				
		figura.getArea();
		
			
		
		Rectangulo rec = (Rectangulo) figura;
		
		
		Rectangulo rec2 = rec;
		
		rec2.setAltura(88);
		
		System.out.println(rec.getAltura());
		
	
	}

}
