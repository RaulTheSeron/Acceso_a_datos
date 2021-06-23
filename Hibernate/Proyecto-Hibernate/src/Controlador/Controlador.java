package Controlador;

import Clases.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Clase encargada de extraer información de la base de datos y devolverla en un
 * formato que pueda ser cargado directamente en la interfaz(JList en este caso).
 *
 * @author raul_
 */
public class Controlador {

    /**
     * Método encargado de realizar las consultas a la base de datos y de
     * obtener la información.
     *
     * @param consulta String que contiene la consulta a realizar a la bd.
     * @return lista con la información obtenida de la base de datos.
     */
    public static List ejecutarConsulta(String consulta) {

        List resultado = null;

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        if (session != null) {
            Query q = session.createQuery(consulta);
            resultado = q.list();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear la sesion!");
        }

        return resultado;
    }

    /**
     * Método que devuelve los nombres de todas las categorias almacenadas en
     * la base de datos. 
     *
     * @return Modelo de ComboBox que se usará para rellenar el comboBox de la
     * interfaz asociado a las categorías.
     */
    public static DefaultComboBoxModel obtenerCategorias() {                    

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> listaCategorias = null;

        String consulta = "SELECT c.name from Category c";
        listaCategorias = (ArrayList<String>) ejecutarConsulta(consulta);

        for (String cat : listaCategorias) {
            modelo.addElement(cat);
        }

        return modelo;
    }

    /**
     * Método que devuelve los datos de una película en función del título(title)
     * de esta. 
     * @param titulo String que representa el título de la pelicula.
     * @return Modelo de lista con la información obtenida al realizar la 
     * consulta.
     */
    public static DefaultListModel buscarPorNombre(String titulo) {             

        DefaultListModel modelo = new DefaultListModel();
        ArrayList<Film> listaPelis = null;

        titulo = "'" + titulo + "%'";

        String consulta = "FROM Film WHERE title like " + titulo;
        listaPelis = (ArrayList<Film>) ejecutarConsulta(consulta);

        if (listaPelis.isEmpty()) {
            modelo.addElement("No existen peliculas con ese titulo");
        } else {
            for (Film peli : listaPelis) {
                modelo.addElement(peli.toString());
            }
        }

        return modelo;
    }

    /**
     * Método que devuelve datos de las películas en función de la categoría de 
     * las mismas.
     * @param categoria String que representa la categoría que se usará como 
     * condición para obtener la información de la bd. 
     * @return Modelo de lista que tendrá una fila por cada pelicula o fila 
     * que devuelva la consulta a la bd.
     */
    public static DefaultListModel buscarPorCategoria(String categoria) {       

        DefaultListModel modelo = new DefaultListModel();
        ArrayList<Film> peliculas = null;

        categoria = "'" + categoria + "%'";

        String consulta = "SELECT fc.film "
                + "FROM FilmCategory fc "
                + "WHERE fc.category.name like " + categoria;

        peliculas = (ArrayList<Film>) ejecutarConsulta(consulta);

        for (Film peli : peliculas) {
            modelo.addElement(peli.toString());
        }

        return modelo;
    }

    /**
     * Método que devuelve datos de las películas en las que ha actuado el actor
     * que se pasa como parámetro.
     * @param actor String con el nombre (no tiene en cuenta el apellido) del 
     * actor que se usara como condición para realizar la consulta a la bd.
     * @return Modelo de lista que tendrá una fila por cada película o fila 
     * que devuelva la consulta a la bd.
     */
    public static DefaultListModel buscarPorActor(String actor) {               

        DefaultListModel modelo = new DefaultListModel();
        ArrayList<Film> peliculas = null;
        actor = "'" + actor + "%'";

        String consulta = ("SELECT fa.film "
                + "FROM FilmActor fa "
                + "WHERE fa.actor.firstName like" + actor);

        peliculas = (ArrayList<Film>) ejecutarConsulta(consulta);

        if (peliculas.isEmpty()) {
            modelo.addElement("No se encuentran peliculas donde actue ese actor.");
        } else {
            for (Film peli : peliculas) {
                modelo.addElement(peli.toString());
            }
        }

        return modelo;
    }

    /**
     * Método que devuelve los datos de las peliculas que tienen al menos la 
     * caracteristicas (specialFeature) pasada como parámetro.
     * @param caracteristica String que representa la característica especial
     * que se usa como condición para realizar la consulta a la bd.
     * @return Modelo de lista que tendrá una fila por cada pelicula o fila 
     * que devuelva la consulta a la bd.
     */
    public static DefaultListModel buscarPorCaracteristicas(String caracteristica){ 

        DefaultListModel modelo = new DefaultListModel();
        ArrayList<Film> peliculas = null;
        caracteristica = "'" + caracteristica + "'";

        

        String consulta = "FROM Film WHERE specialFeatures = " + caracteristica;
        peliculas = (ArrayList<Film>)ejecutarConsulta(consulta);

        for (Film peli : peliculas) {
            modelo.addElement(peli.toString());
        }

        return modelo;
    }

    /**
     * Método que devuelve la información de las películas cuyo campo lenght 
     * (longitud) es inferior a 100.
     * @return Modelo de lista que tendrá una fila por cada pelicula o fila 
     * que devuelva la consulta a la bd.
     */
    public static DefaultListModel buscarPorLongitud() {

        DefaultListModel modelo = new DefaultListModel();
        ArrayList<Film> peliculas = null;

        String consulta = "FROM Film WHERE length < 100";
        peliculas = (ArrayList<Film>)ejecutarConsulta(consulta);

        for (Film peli : peliculas) {
            modelo.addElement(peli.toString());
        }

        return modelo;
    }
}
