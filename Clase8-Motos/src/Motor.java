import java.io.Serializable;

/*Generar un listado de motos, las cuales puedan ser normales y todo terreno.
Proporcionar una cantidad de horas y determinar cuantos kilometros recorrería cada
moto en el tiempo dado. Adicionalmete se debe informar si el camino a recorrer es ruta
o es otro.
En caso de no ser ruta, las motos normales sufriran una penalizacion del 45%
de la velocidad
La velocidad de las motos, es determinada por su motor.-*/

public class Motor implements Cloneable , Serializable{




	/**
	 * 
	 */
	private static final long serialVersionUID = 1090057031957122566L;

	private double velocidad;

	private double kilometraje;

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public Motor(double velocidad, double kilometraje) {
		this.velocidad = velocidad;
		this.kilometraje = kilometraje;
	}

	public Motor(double velocidad) {
		super();
		this.velocidad = velocidad;
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

	public Motor clone() {
		return new Motor(this.getVelocidad(),this.getKilometraje());
	}

}
