
package Clases;


public class Libro {
    private String titulo;
    private double precio;
    private String editorial;
    private String tipo;
    private Autor autor;

    //Contructores
    public Libro(String titulo, double precio, String editorial, String tipo) {
        setTitulo(titulo);
        setPrecio(precio);
        setEditorial(editorial);
        setTipo(tipo);
    }
    
    public Libro(){
    }
    
    
    //Getters
    public String getTitulo() {
        return titulo;
    }
    public double getPrecio() {
        return precio;
    }
    public String getEditorial() {
        return editorial;
    }
    public String getTipo() {
        return tipo;
    }
    public Autor getAutor() {
        return autor;
    }
    
    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "| Precio: " + precio + "| Editorial: " + editorial + "| Tipo: " + tipo + "| Autor: " + this.getAutor().getNombre();
    }
    
    
}
