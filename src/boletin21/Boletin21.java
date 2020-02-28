package boletin21;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.leila.metodos.*;
import com.leila.metodos.Libros;
import java.io.File;

/**
 *
 * @author Leila
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int Opcion;
        com.leila.metodos.Metodos obj = new com.leila.metodos.Metodos();
        ArrayList<com.leila.metodos.Libros>listaLibros=new ArrayList<>();
        File listaFichero = new File("Libreria.txt");

        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***"
                    + "\n 1 -- Añadir libros"
                    + "\n 2 -- Consultar libro"
                    + "\n 3 -- Ver libro"
                    + "\n 4 -- Dar de baja libros y actualizar la lista"
                    + "\n 5 -- Cambiar precio y actualizar lista"
                    + "\n 6 -- Salir"));
            switch (Opcion) {
                case 1:
                    obj.añadirLibro("Libreria.txt");
                    break;
                case 2:
                    obj.consulta(listaFichero);
                    break;
                case 3:
                    obj.ver(listaFichero);
                    break;
                case 4:
                    obj.darDeBaja(listaLibros, listaFichero);
                    break;
                case 5:
                    obj.cambiarPrecio(listaLibros);
                    break;
                case 6:
                    obj.salir();
                    break;
            }
        } while (Opcion < 6);

    }

}