import java.io.Serializable;

public class Rectangulo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public double base;
	public double altura;
	
	
	public String toString() {
		return this.base + " x "+this.altura;
	}
}
