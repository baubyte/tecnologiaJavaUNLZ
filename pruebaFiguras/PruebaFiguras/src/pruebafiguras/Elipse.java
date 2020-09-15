/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebafiguras;

/**
 * 
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Elipse extends FiguraGeometrica {

    private double radioMayor = 0d;
    private double radioMenor = 0d;

    public Elipse() {
        super();
    }

    public Elipse(double radioMayor, double radioMenor) {
        super();
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public Elipse(String nombre, double radioMayor, double radioMenor) {
        super(nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;

    }

    /**
     * @return the radioMayor
     */
    public double getRadioMayor() {
        return radioMayor;
    }

    /**
     * @return the radioMenor
     */
    public double getRadioMenor() {
        return radioMenor;
    }

    /**
     * @param radioMayor the radioMayor to set
     */
    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    /**
     * @param radioMenor the radioMenor to set
     */
    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }
}