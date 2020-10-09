package ejerciciointegrador1;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Cuadrado extends FiguraGeometrica {

    private double lado;

    /**
     * Constructor
     * @param lado
     */
    public Cuadrado(double lado) {
        this.lado = lado;
        //this.tipoFigura = "Cuadrado";
    }

    /**
     * Metodo para calcular el Area del Cuadrado
     * @return area
     */
    @Override
    public double getArea() {
        return Math.pow(this.getLado(), 2);
    }

    /**
     * Metodo para calcular el Perimetro del Cuadrado
     * @return perimetro
     */
    @Override
    public double getPerimetro() {
        return 4 * this.getLado();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     *
     */
    /*@Override
    public void mostrar() {
        System.out.println(this.tipoFigura +" cada Lado es de " + this.lado + " ; su Area es de " + this.area()
                + " y su Perimetro es de " + this.perimetro());
    } */
}
