/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumno;

import java.util.Scanner;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EjercicioAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while  (true)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del Alumno:");
        String nombre = sc.next();
        /**Comparamos para Salir de la Ejecucion*/
            if (nombre.toUpperCase().equals("E")) {
                break;
            }
        
        System.out.println("Ingrese Cantidad de Notas:");
        int  cantNotas = sc.nextInt();
        
        Alumno alu = new Alumno (nombre,cantNotas);
        
        for (int i = 0; i < alu.notas.length; i++) {
            System.out.println("Ingrese la Nota Nº" +(i+1));
            alu.notas[i] = sc.nextDouble();
        }
        
        System.out.println("El Promedio del Alumno es: " + alu.promedio());
        System.out.println("El Estado del Alumno es: " + alu.estado());
        }
    }

}
