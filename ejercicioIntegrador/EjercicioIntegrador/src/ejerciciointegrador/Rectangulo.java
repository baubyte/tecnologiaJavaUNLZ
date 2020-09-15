package ejerciciointegrador;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Rectangulo extends FiguraGeometrica {

    public double base;
    public double altura;

    /**
     * Constructor
     *
     * @param base
     * @param altura
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.tipoFigura = "Rectangulo";
    }

    /**
     * Metodo para calcular el Area del Rectangulo
     *
     * @return area
     */
    @Override
    public double area() {
        return this.altura * this.base;
    }

    /**
     * Metodo para calcular el Perimetro del Rectangulo
     *
     * @return perimetro
     */
    @Override
    public double perimetro() {
        return 2 * this.altura + 2 * this.base;
    }

    /**
     *
     */
    @Override
    public void mostrar() {
        System.out.println(this.tipoFigura +" su Base es de " + this.base + " ; su Altura es de " + this.altura
                + " ; su Area es de " + this.area() + " y su Perimetro es de " + this.perimetro());
    }

}
