
public class Circulo extends FiguraGeometrica {

	private double radio;

	public double getArea() {
		
		return Math.PI * Math.pow(radio, 2);
		
	};
	
	public double getPerimetro() {
		
		return  Math.PI * 2 * radio;
		
	};
	
	
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	
	
	
	
	
	
}
