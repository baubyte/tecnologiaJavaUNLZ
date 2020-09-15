package ejerciciointegrador;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Triangulo extends FiguraGeometrica {

    public double base;
    public double altura;
    public double lado;

    /**
     * Constructor
     *
     * @param base
     * @param altura
     * @param lado
     */
    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        this.tipoFigura = "Triangulo";
    }

    /**
     * Metodo para calcular el Area del Triangulo
     *
     * @return area
     */
    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    /**
     * Metodo para calcular el Perimetro del Triangulo
     *
     * @return perimetro
     */
    @Override
    public double perimetro() {
        return 2 * this.lado + this.base;
    }

    /**
     *
     */
    @Override
    public void mostrar() {
        System.out.println(this.tipoFigura +" su Base es de " + this.base + " ; su Altura es de " + this.altura
                + " ; su Lado es de " + this.lado + " ; su Area es de " + this.area() + " y su Perimetro es de " + this.perimetro());
    }
}
