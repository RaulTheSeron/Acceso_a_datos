
package Controlador;

import javax.swing.JOptionPane;
import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.XQuery;


public class Controlador {
   
    /**
     * Método cuya función es realizar consultas a la base de datos.
     * @param query String que contiene el script con la consulta.
     * @param contexto Contexto de la base de datos a la que la aplicación está
     * conectada.
     * @return String con los datos devueltos por la consulta a la base da datos.
     */
    public String queryDB(String query,Context contexto) {
        try {
            return new XQuery(query).execute(contexto);
        } catch (BaseXException ex) {
            JOptionPane.showMessageDialog(null, "error en la Consulta: "+ex.getMessage());
            return null;
        }
    }
}
