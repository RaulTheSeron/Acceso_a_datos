
package Clases;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Autor {
    
    private String nombre;
    private String nacionalidad;
    private Date fecha_nacimiento;
    private String tipo;
    private Set libros = new HashSet(0);

    public Autor(){
    }
    
    public Autor(String nombre, String nacionalidad, Date fecha_nacimiento, String tipo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.tipo = tipo;
    }
    
    
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public String getTipo() {
        return tipo;
    }
    public Set getLibros() {
        return libros;
    }
    
    
    //Settes
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setNuevoLibro(Libro libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "| Nacionalidad: " + nacionalidad + "| Fecha de nacimiento: " + fecha_nacimiento + "| Tipo" + tipo;
    }
    
    
    
}
