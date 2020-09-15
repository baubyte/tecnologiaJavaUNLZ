
public class Rectangulo {
	int base;
	int altura;
	
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
	public void mostrar() {
		
		
		System.out.println(this.altura);
		
	}
	
	public int perimetro() {
		return 2*this.altura + 2*this.base;
	}
	
	public int area() {
		return this.altura*this.base;
	}
}	
