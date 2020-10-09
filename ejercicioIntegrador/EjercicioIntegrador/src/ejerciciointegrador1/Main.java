/** Ejercicios objetos Tecnología Java:
 *      Crear una clase figura, de la cual hereden triangulo, cuadrado, rectángulo y círculo.
 *      La clase figura debe tener los métodos área y perímetro.
 *      También un método llamado areaMayorA que reciba una figura y nos devuelva true o false dependiendo de si su
 *      área es mayor a la de otra figura.
 *      Todas las figuras deberán ser guardadas en un array list;
 *      Y al terminar el programa nos tiene que mostrar un listado de todas las figuras con sus dimensiones.
 *      Ej:
 *      Circulo Radio: 92
 *      Triangulo Base 20, Altura: 25
 */
package ejerciciointegrador1;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Instaciamos el Objeto figuraGeometrica
         */
        FiguraGeometrica figuraGeometrica;
        /**
         * Creamos las Cuadrado
         */
        figuraGeometrica = new Cuadrado(50);
        /**
         * Agregamos Cuadrado al ArrayList
         */
        ListaFigurasGeometricas.agregar(figuraGeometrica);
        /**
         * Creamos las Rectangulo
         */
        figuraGeometrica = new Rectangulo(20, 30);
        /**
         * Agregamos Rectangulo al ArrayList
         */
        ListaFigurasGeometricas.agregar(figuraGeometrica);
        /**
         * Creamos las Triangulo
         */
        figuraGeometrica = new Triangulo(20, 50, 30);
        /**
         * Agregamos Triangulo al ArrayList
         */
        ListaFigurasGeometricas.agregar(figuraGeometrica);
        /**
         * Creamos las Circulo
         */
        figuraGeometrica = new Circulo(50);
        /**
         * Agregamos Circulo al ArrayList
         */
        ListaFigurasGeometricas.agregar(figuraGeometrica);

        /**Mostramos las Figuras*/
        ListaFigurasGeometricas.mostrar();
        System.out.println( figuraGeometrica.areaMayorA(new Triangulo(20, 50, 30)));

    }

}
