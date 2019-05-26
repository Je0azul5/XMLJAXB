/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LecturaYEscritura;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author jeazu
 */
@XmlRootElement(name = "libreria")
@XmlType(propOrder = {"nombre", "libros"})
public class Libreria {

    private String nombre;
    private ArrayList<Libro> libros = new ArrayList();

    public Libreria() {
    }

    public Libreria(String nombre) {
        this.nombre = nombre;
    }
    

    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//es un envoltorio y decimos que el arreglo de libor s se llama libro 

    @XmlElementWrapper(name = "libros")
    @XmlElement(name = "libro")
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Libreria{" + "nombre=" + nombre + ", libros=" + libros + '\n';
    }

}
