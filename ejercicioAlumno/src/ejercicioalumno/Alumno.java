/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumno;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Alumno {

    String nombre;

    double[] notas;

    /**
     * Constructor
     */
    public Alumno(String nombre, int cantNotas) {
        this.nombre = nombre;
        this.notas = new double[cantNotas];

    }

    /**
     * Calcula el Pomedio
     */
    public double promedio() {
        double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];

        }
        return sumaNotas / notas.length;
    }

    /**
     * Estado del Alumno
     */
    public String estado() {
        if (this.promedio() > 7 ) {
            return "Aprobado";
        }else {
        return "Desaprobado";
        }

    }

}
