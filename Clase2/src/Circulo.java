
public class Circulo extends Figura{
	
	public double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
		this.tipoFigura = "Circulo";
	}

	public double perimetro() {
		return Math.PI * 2 * this.radio;
	}
	
	public double area() {
		return Math.PI * Math.pow(radio,2);
		
	}
	
}
