
public class Manzana implements Pesable{

	private double masa = 4;
	
	private double volumen;
	
	
	public Manzana(double volumen) {
		super();
		this.volumen = volumen;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}


	public double getMasa() {
		return masa;
	}

	@Override
	public double getPeso() {
		return this.volumen * this.masa;
	}

}
