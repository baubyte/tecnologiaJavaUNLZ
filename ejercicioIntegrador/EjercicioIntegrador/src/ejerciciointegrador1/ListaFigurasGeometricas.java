package ejerciciointegrador1;

import java.util.ArrayList;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class ListaFigurasGeometricas {

    public static ArrayList<FiguraGeometrica> listaFigurasGeometricas = new ArrayList();

    public static void mostrar() {
        for (FiguraGeometrica figura : listaFigurasGeometricas) {
            figura.mostrar();
        }
    }

    public static void agregar(FiguraGeometrica figura) {
        listaFigurasGeometricas.add(figura);
    }

}
