
public abstract class Animal  implements Pesable{

	private double peso;
	
	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Animal(double peso) {
		super();
		this.peso = peso;
	}
	
	
	
	
}
