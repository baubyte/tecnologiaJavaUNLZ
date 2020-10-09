package ejerciciointegrador1;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    /**
     * Constructor
     *
     * @param base
     * @param altura
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        //this.tipoFigura = "Rectangulo";
    }

    /**
     * Metodo para calcular el Area del Rectangulo
     *
     * @return area
     */
    @Override
    public double getArea() {
        return this.altura * this.getBase();
    }

    /**
     * Metodo para calcular el Perimetro del Rectangulo
     *
     * @return perimetro
     */
    @Override
    public double getPerimetro() {
        return 2 * this.getAltura()  + 2 * this.getBase() ;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    /**
     *
     */
    //@Override
    /*public void mostrar() {
        System.out.println(this.tipoFigura +" su Base es de " + this.base + " ; su Altura es de " + this.altura
                + " ; su Area es de " + this.area() + " y su Perimetro es de " + this.perimetro());
    }*/

}
