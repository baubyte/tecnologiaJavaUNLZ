package ejerciciointegrador1;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public abstract class FiguraGeometrica {

    //public String tipoFigura;

    /**
     * Metodo para calcular el Area de la Figura Geometrica
     *
     * @return area
     */
    public double getArea() {
        return 1;
    }

    /**
     * Metodo para calcular el Perimetro de la Figura Geometrica
     *
     * @return perimetro
     */
    public double getPerimetro() {
        return 1;
    }

    public void mostrar() {
    }

    /**
     * Metodo que nos Devuelve True o False si el area de la figura que se le
     * pasa es mayor a otra.
     */
    /*public boolean areaMayorA(FiguraGeometrica figura) {
        boolean areaMayor = this.area() == figura.area();
        return areaMayor;
    }*/
}
