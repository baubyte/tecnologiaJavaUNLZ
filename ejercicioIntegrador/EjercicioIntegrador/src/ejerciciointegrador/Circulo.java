package ejerciciointegrador;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Circulo extends FiguraGeometrica {

    public double radio;

    /**
     * Constructor
     *
     * @param radio
     */
    public Circulo(double radio) {
        this.radio = radio;
        this.tipoFigura = "Circulo";
    }

    /**
     * Metodo para calcular el Area del Circulo
     *
     * @return area
     */
    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);

    }

    /**
     * Metodo para calcular el Perimetro del Circulo
     *
     * @return perimetro
     */
    @Override
    public double perimetro() {
        return Math.PI * 2 * this.radio;
    }

    /**
     *
     */
    @Override
    public void mostrar() {
        System.out.println(this.tipoFigura +" su Radio es de " + this.radio + " ; su Area es de " + this.area()
                + " y su Perimetro es de " + this.perimetro());
    }

}
