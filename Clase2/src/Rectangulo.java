
public class Rectangulo extends Figura{
	public double base;
	public double altura;
	
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
		this.tipoFigura = "Rectangulo";
	}
	
	
	public void mostrar() {
		
		
		System.out.println(this.altura);
		
	}
	
	public double perimetro() {
		return 2*this.altura + 2*this.base;
	}
	
	public double area() {
		return this.altura*this.base;
	}
}	
