
public class Rectangulo {

	private double base;
	private double altura;
	
	
	
	
	public void mostarValor(double valor) {
		System.out.println("Me mostraron el double: "+valor);
	}
	
	
	public void mostarValor(int valor) {
		System.out.println("Me mostraron el entero: "+valor);
	}
	
	public void mostarValor(String valor) {
		System.out.println("Me mostraron el texto: "+valor);
	}
	
	public void mostarValor(Rectangulo valor) {
		System.out.println("Me mostraron el regtangulo: "+valor);
	}
	
	public void mostarValor(Object valor) {
		System.out.println("Me mostraron un objeto: "+valor);
	}
	
	
	
	
	
	
	
	public boolean equals( Rectangulo reg ) {
		
		boolean baseIgual = this.base == reg.base;
		boolean alturaIgual = this.altura == reg.altura;
		
		return (baseIgual && alturaIgual);
		
	}
	
	
	public String toString() {
		return "a: "+this.altura + " y b: "+this.base;
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
		super();
		this.base = base;
		this.altura = altura;
	}
	
	
}
