
package Controlador;

import Clases.*;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Constraint;
import com.db4o.query.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;

/**
 * Clase encargada de crear la base de datos. Consta de métodos para generar los
 * datos de prueba, así como para consultar los mismos posteriormente.
 * @author raul_
 */
public class Controlador {
    
    /**
     * Método que crea/abre la base de datos Biblioteca.db40
     * @param db contenedor de objetos que permite ejecutar el método openFile 
     * para abrir la base de datos a partir de un fichero con extensión .db4o
     * @return contenedor de objetos que contendrá la información de la bd.
     */
    public ObjectContainer abrirBD(ObjectContainer db){
        
        try{
            db = Db4oEmbedded.openFile("Biblioteca.db4o");        
        }catch(Exception ex){
            ex.printStackTrace();
            ex.getMessage();
        }finally{
            return db;
        }
        
    }
    
    /**
     * Método cuya función es insertar valores en la base de datos a traves del
     * objeto contenedor db.
     * @param db Objeto contenedor que representa la bd.
     * @throws ParseException 
     */
    public void insertarValores(ObjectContainer db) throws ParseException{
        Libro l1 = new Libro("El Imperio Final",12.00,"Tor Books","Novela");
        Libro l2 = new Libro("El Camino de los Reyes",35.00,"Victor Gollancz Ltd","Novela");
        Libro l3 = new Libro("El Lazarillo de Tormes",6.00,"Editorial Juventud","Novela");
        Libro l4 = new Libro("El Principe de la niebla",16.00,"Editorial Zafon","Ciencia-ficcion");
        Libro l5 = new Libro("La sombra del viento",10.00,"Francisco de Robles","Historia");
        
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy"); 
        
        Autor a1 = new Autor();
        a1.setNombre("Carlos Ruiz Zafon");
        a1.setNacionalidad("Español");
        Date fecha1 = objSDF.parse("25-10-1964"); 
        a1.setFecha_nacimiento(fecha1);
        a1.setTipo("Con autor");
        
        Autor a2= new Autor();
        a2.setNombre("Brandon Sanderson");
        a2.setNacionalidad("Americano");
        Date fecha2 = objSDF.parse("19-12-1975");
        a2.setFecha_nacimiento(fecha2);
        a2.setTipo("Con autor");
        
        Autor a3 = new Autor();
        a3.setNombre(null);
        a3.setNacionalidad(null);
        a3.setTipo("Anonimo");
        a3.setFecha_nacimiento(null);
        
        
        l1.setAutor(a2);
        l2.setAutor(a2);
        l3.setAutor(a1);
        l4.setAutor(a1);
        l5.setAutor(a3);
        
        db.store(l1);
        db.store(l2);
        db.store(l3);
        db.store(l4);
        db.store(l5);
        db.store(a1);
        db.store(a2);
        db.store(a3);
    }
    
    /**
     * Metodo para cerrar la base de datos.
     * @param db 
     */
    public void cerrarBBDD(ObjectContainer db){
        db.close();
    } 
    
    /**************************MÉTODOS DE CONSULTAS****************************/
    public DefaultListModel buscarAutores(ObjectContainer db){
        Autor a = new Autor(null,null,null,"Con autor");
        ObjectSet res = db.queryByExample(a);
        return(mostrarValores(res));
    }
    
    public DefaultListModel buscarLibros(ObjectContainer db){
        Libro l = new Libro(null,0.0,null,null);
        ObjectSet res = db.queryByExample(l);
        return(mostrarValores(res));
    }
    
    public DefaultListModel buscarLibrosAutor(ObjectContainer db,String nombre){
        Autor a = new Autor(nombre,null,null,null);
        ObjectSet res = db.queryByExample(a);
        Autor b = (Autor)res.next();
        
        Libro l = new Libro(null,0.0,null,null);
        l.setAutor(a);
        
        ObjectSet res2 = db.queryByExample(l);
        return(mostrarValores(res2));
    }
    
    public DefaultListModel buscarAutoresEspañoles(ObjectContainer db){
        Autor a = new Autor(null,"Español",null,null);
        ObjectSet res = db.queryByExample(a);
        return(mostrarValores(res));
    }
    
    public DefaultListModel buscarLibrosPrecio(ObjectContainer db,double inf,double sup){
        Query q = db.query();
        q.constrain(Libro.class);
        Constraint constraint = q.descend("precio").constrain(sup).smaller();
        q.descend("precio").constrain(inf).greater().and(constraint);
        
        ObjectSet res = q.execute();
        return(mostrarValores(res));
    }
    
    public void modificarPrecios(ObjectContainer db){
        ObjectSet res = db.queryByExample(new Libro(null,0,null,null));
        
        for(int i=0; i<res.size(); i++){
            Libro l = (Libro)res.next();
            l.setPrecio(l.getPrecio()*1.05);
            db.store(l);
        }
    }
    
    public String borrarLibro(ObjectContainer db,String titulo){
        Query q = db.query();
        q.constrain(Libro.class);
        q.descend("titulo").constrain(titulo);
        ObjectSet res = q.execute();
        
        if(res.hasNext()){
            Libro l = (Libro)res.next();
            db.delete(l);
            return "Libro borrado correctamente!";
        }else
            return "No existen libros con ese titulo";
        
    }
    
    public DefaultListModel mostrarValores(ObjectSet res){
        DefaultListModel modelo = new DefaultListModel();
        
        while(res.hasNext()){
            Object o = res.next();
            if(!modelo.contains(o)){
                modelo.addElement(o.toString());
            }
        }
        
        return modelo;
    }
}
