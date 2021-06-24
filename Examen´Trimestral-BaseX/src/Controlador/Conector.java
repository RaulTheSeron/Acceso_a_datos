package Controlador;


import javax.swing.JOptionPane;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.DropDB;
import org.basex.core.cmd.Open;

/**
 * Clase encargada de conectar la aplicación a la base de datos.
 * @author raul_
 */
public class Conector {

    private Context contexto;

    /**
     * Método cuya finalidad es crear una base de datos a partir del archivo xml
     * local "bailes.xml"
     */
    public void crearBD() {
        contexto = new Context();
        try {
            CreateDB bd = new CreateDB("Bailes", "src\\Modelo\\");
            bd.execute(contexto);
        } catch (BaseXException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error al crear la BD");
        }
    }

    /**
     * Método cuya finalidad es abrir la base de datos para poder ejecutar 
     * consultas.
     */
    public void abrirBD() {
        try {
            if (contexto == null) {
                crearBD();
                JOptionPane.showMessageDialog(null, "Conexion exitosa a la BD");
            }
            Open bd = new Open("Bailes");
            bd.execute(contexto);
        } catch (BaseXException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "La base de datos no ha podido abrirse");
        }
    }

    /**
     * Método cuya finalidad es desconectar la base de datos
     * @throws BaseXException si ocurre un error al intentar eliminar la base
     * de datos.
     */
    public void desconectar() throws BaseXException {
        new DropDB("Bailes").execute(contexto);
        JOptionPane.showMessageDialog(null, "Desconexion exitosa a la BD");
    }

    
    public Context getContexto() {
        return contexto;
    }


}
