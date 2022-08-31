/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author ATERCERO
 */
public class Libro {
    private String id;
    private String nombre;
    private String autor; 
    private String descripcion; 
    private double precio;

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", nombre=" + nombre + ", autor=" + autor + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

    public Libro() {
    }

    public Libro(String id, String nombre, String autor, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
