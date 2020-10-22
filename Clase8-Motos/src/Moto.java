import java.io.Serializable;

/**
 * Es una moto.
 *  
 *  **/


public class Moto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2175597182672718796L;

	private Motor motor;

	private double kilometraje;

	private String patente;

	public double recorrer(double horas, boolean isRuta) {
		double kmReccoridos = this.getKmARecorrer(horas, isRuta);
		recorrerKm(kmReccoridos);
		return kmReccoridos;

	}

	
	/**
	 * Aumenta el kilometraje de la moto y su motor
	 * @param kilometros la cantidad de kilometros a aumentar.
	 * **/
	public void recorrerKm(double kilometros) {

		this.addKilometraje(kilometros);
		this.getMotor().addKilometraje(kilometros);

	}

	public double getKmARecorrer(double horas, boolean isRuta) {
		if (isRuta) {
			return this.getVelocidad() * horas;
		}
		return this.getVelocidadFueraDeRuta() * horas;

	}

	public double tiempoTardado(double kilometros, boolean isRuta) {
		if (isRuta) {
			return kilometros / this.getVelocidad();
		}
		return kilometros / this.getVelocidadFueraDeRuta();
	}

	public Moto(String patente, double kilometraje, Motor motor) {
		this.motor = motor;
		this.kilometraje = kilometraje;
		this.patente = patente;
	}

	public double getVelocidad() {
		return this.getMotor().getVelocidad();
	}

	public double getVelocidadFueraDeRuta() {
		return this.getVelocidad() * 0.55;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public void addKilometraje(double kilometros) {
		this.setKilometraje(this.getKilometraje() + kilometros);
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	
	public String toString() {
		return "Patente: "+this.getPatente()
		+", Kilometraje: "+this.getKilometraje()
		+", Velocidad: "+this.getVelocidad();
	}
}
