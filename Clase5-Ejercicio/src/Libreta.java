import java.util.HashMap;

public class Libreta {

	private String nombre;
	private int cod;
	private String carrera;
	private HashMap<String, NotasPorAlumno> notasPorAlumno = new HashMap<String, NotasPorAlumno>();

	public double getPromedioGeneral() {
		double sumador = 0;
		for (NotasPorAlumno notas : this.notasPorAlumno.values()) {
			sumador += notas.getPromedio();
		}
		return (this.notasPorAlumno.size() != 0) ? sumador / this.notasPorAlumno.size() : -1;
	}

	public boolean setNota(String materia, int pos, double nota) {
		if (this.existeMateria(materia)) {
			return this.getNotas(materia).setNotas(pos, nota);
		}
		return false;

	}

	public boolean agregarMateria(String materia, int cantidad) {

		if (!this.existeMateria(materia)) {
			this.notasPorAlumno.put(materia.toLowerCase(), new NotasPorAlumno(materia, cantidad));
			return true;
		}
		return false;
	}

	public boolean existeMateria(String materia) {
		return this.notasPorAlumno.containsKey(materia.toLowerCase());
	}
	
	private NotasPorAlumno getNotas(String nombreMateria) {
		return this.notasPorAlumno.get(nombreMateria.toLowerCase());
	}

}
