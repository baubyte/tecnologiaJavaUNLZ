
public class Auto {
	String modelo;
	int puertas = 2;
	String color = "Blanco";
	
	double distancia_recorrida = 0;
	
	public void  recorrer(double kilometros) {
		this.distancia_recorrida = this.distancia_recorrida +kilometros;

		
	}
	
	public void mostrar_kilometros() {
		System.out.println(this.distancia_recorrida);
	}
	
	
}
