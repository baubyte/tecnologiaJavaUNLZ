
public class Rectangulo extends FiguraGeometrica{

	private double base;
	private double altura;
	
	public double getArea() {
		return this.getAltura() * this.getBase();
	}
	
	public double getPerimetro() {
		return 2 *  this.getAltura() + 2 * this.getBase();
	}
	
	
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
	
	
	
	
}
