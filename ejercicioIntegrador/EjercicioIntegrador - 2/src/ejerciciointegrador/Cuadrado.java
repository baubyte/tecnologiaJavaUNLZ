package ejerciciointegrador;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Cuadrado extends FiguraGeometrica {

    public double lado;

    /**
     * Constructor
     * @param lado
     */
    public Cuadrado(double lado) {
        this.lado = lado;
        this.tipoFigura = "Cuadrado";
    }

    /**
     * Metodo para calcular el Area del Cuadrado
     * @return area
     */
    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    /**
     * Metodo para calcular el Perimetro del Cuadrado
     * @return perimetro
     */
    @Override
    public double perimetro() {
        return 4 * this.lado;
    }

    /**
     *
     */
    @Override
    public void mostrar() {
        System.out.println(this.tipoFigura +" cada Lado es de " + this.lado + " ; su Area es de " + this.area()
                + " y su Perimetro es de " + this.perimetro());
    }
}
