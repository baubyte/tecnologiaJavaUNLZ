package clase3;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Articulo {

    private int cod;
    private String descripcion;
    private double precio;

    /**
     * Constructor
     */
    public Articulo(int cod, String descripcion, double precio) {
        this.cod = cod;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     * Setters
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getters
     */
    public int getCod() {
        return cod;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
