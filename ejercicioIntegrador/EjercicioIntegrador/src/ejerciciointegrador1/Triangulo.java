package ejerciciointegrador1;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;
    private double lado;

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
        //this.tipoFigura = "Triangulo";
    }

    /**
     * Metodo para calcular el Area del Triangulo
     *
     * @return area
     */
    @Override
    public double getArea() {
        return Math.pow(this.getLado(), 2);
    }

    /**
     * Metodo para calcular el Perimetro del Triangulo
     *
     * @return perimetro
     */
    @Override
    public double getPerimetro() {
        return 2 * this.lado + this.getBase();
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLado() {
        return lado;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     *
     */
    /*@Override
    public void mostrar() {
        System.out.println(this.tipoFigura +" su Base es de " + this.base + " ; su Altura es de " + this.altura
                + " ; su Lado es de " + this.lado + " ; su Area es de " + this.area() + " y su Perimetro es de " + this.perimetro());
    }*/
}
