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
public class Rectangulo extends FiguraGeometrica {

    private double altura = 0d;
    private double ancho = 0d;

    public Rectangulo() {
        super();
    }

    public Rectangulo(double altura, double ancho) {
        super();
        this.altura = altura;
        this.ancho = ancho;
    }

    public Rectangulo(String nombre, double altura, double ancho) {
        super(nombre);
        this.altura = altura;
        this.ancho = ancho;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return getAltura() * getAncho();

    }

}
