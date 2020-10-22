
public class NotasPorAlumno {
	
	private String materia;
	private double[] notas;
	
	public NotasPorAlumno(String nombreMateria,
			int cantidadNotas) {
		this.materia = nombreMateria;
		this.notas = new double[cantidadNotas];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = -1;
		}
	}
//En reparacion
//	public NotasPorAlumno(String nombreMateria,
//			double[] arrayNotas) {
//		this.materia = nombreMateria;
//		this.notas = arrayNotas;
//	}

	public String getMateria() {
		return materia;
	}
	
	
	public double getPromedio() {
		int contador=0;
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			if( notas[i] >0 ) {
				suma+= notas[i];
				contador++;
			}
			
		}

		return ( contador != 0  ) ? (suma / contador) : -1;
				
	}
	
	
	
	
	public boolean setNotas(int pos, double nota) {
		if( pos-1 > notas.length 
				||  pos<1   || nota > 10
				|| nota < 0) {
			return false;
		}
		this.notas[pos-1] = nota;
		return true;
		
		
		
	}
	
	
	
	
}
