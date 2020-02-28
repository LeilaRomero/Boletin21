package com.leila.metodos;

/**
 *
 * @author Leila
 */
public class Libros {

    String titulo, autor;
    float precio;
    int cantidad;

    public Libros() {
    }

    public Libros(String titulo, String autor, float precio, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Libros " + "\n Titulo=" + titulo + "\n Autor=" + autor + "\n Precio=" + precio + "\n Cantidad=" + cantidad;
    }

}
