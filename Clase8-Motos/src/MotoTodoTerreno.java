
public class MotoTodoTerreno extends Moto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5541575475389668750L;

	public MotoTodoTerreno(String patente, double kilometraje, Motor motor) {
		super(patente, kilometraje, motor);
	}
	
	public double getVelocidadFueraDeRuta() {
		return this.getVelocidad();
	}
	
	public String toString() {
		return super.toString()+" (Es todo terreno)";
		
	}
	

}
