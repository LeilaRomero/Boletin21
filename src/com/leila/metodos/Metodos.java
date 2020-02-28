package com.leila.metodos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class Metodos {

    PrintWriter escribir = null;
    FileWriter fich;
    Scanner sc;

    public Libros pedirDatos() {
        Libros lib = new Libros(JOptionPane.showInputDialog("Añadir titulo"),
                JOptionPane.showInputDialog("Añadir autor"),
                Float.parseFloat(JOptionPane.showInputDialog("Poner precio")),
                Integer.parseInt(JOptionPane.showInputDialog("Cantidad")));
        return lib;
    }

    public void mostar(ArrayList<Libros> listaLibros) {
        System.out.println("Mostrar :");
        Iterator it = listaLibros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public void añadirLibro(String nomeFich) {
        try {
            Libros libro = pedirDatos();

            fich = new FileWriter(nomeFich, true);
            escribir = new PrintWriter(fich);
            escribir.println(libro.toString());
        } catch (IOException ex) {
            System.out.println("error " + ex.toString());
        } finally {
            escribir.close();
        }

    }

    public String tituloAConsultar() {
        String titulo = JOptionPane.showInputDialog("Introduce o titulo");
        return titulo;
    }

    public void consulta(File fich) {
        try {
            String titulo = tituloAConsultar();
            sc = new Scanner(fich).useDelimiter(",\\s*");
            while (sc.hasNext()) {
                if (titulo.equals(sc.next())) {
                    String autor = sc.next();
                    float precio = Float.parseFloat(sc.next());
                    System.out.println("El precio es de: " + precio);
                } else if (sc.hasNext()) {
                    sc.nextLine();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro" + ex.toString());
        } finally {
            escribir.close();
        }
    }

    public void ver(File fich) {
        try {
            System.out.println("Contenido libreria ");
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error" + ex.toString());
        } finally {
            escribir.close();
        }
    }

    public void darDeBaja(ArrayList<Libros> listaLibros, File fich) {
        Libros libro = new Libros();
        Iterator it = listaLibros.iterator();
        if (listaLibros.isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "No existen libros");
        } else {
            while (it.hasNext()) {
                libro = (Libros) it.next();
                if (libro.getcantidad() == 0) {
                    listaLibros.remove(libro);
                    break;
                }
            }
        }
    }

    public void actualizarLibreria(String nomeFich, ArrayList<Libros> listaLibros) {
        try {

            fich = new FileWriter(nomeFich);
            escribir = new PrintWriter(fich);
            for (int i = 0; i < listaLibros.size(); i++) {
                escribir.println(listaLibros.get(i));
            }
        } catch (IOException ex) {
            System.out.println("Error" + ex.toString());
        } finally {
            escribir.close();
        }
    }

    public void cambiarPrecio(ArrayList<Libros> listaLibros) {
        String titulo = tituloAConsultar();
        float nuevoPrecio = Float.parseFloat(JOptionPane.showInputDialog("El nuevo precio es de: "));
        for (int i = 0; i < listaLibros.size(); i++) {
            Libros li = listaLibros.get(i);
            String titulo1 = li.getTitulo();
            if (titulo.equals(titulo1)) {
                li.setPrecio(nuevoPrecio);
            }
        }

    }

    public void salir() {
        System.exit(0);
    }

}
