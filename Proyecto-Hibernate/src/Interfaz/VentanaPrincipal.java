package Interfaz;

import Controlador.Controlador;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Clase que contiene la interfaz de la aplicación y una serie de métodos 
 * relacionados con la misma.
 * @author raul_
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Acceso a Datos - Tarea online 3");
        this.setLocationRelativeTo(null);
        iniciarComponentes();
    }

    /**
     * Método que se encarga de presentar el estado inicial de la interfaz.
     */
    public void iniciarComponentes() {
        this.comboElemento.setVisible(false);
        this.cmbFiltro.setSelectedItem(0);
        this.etiFiltro.setText("Nombre pelicula:");
    }

    /**
     * Funcion encargada de cargar el combo cuando se elige filtrar por
     * caracteristicas especiales con las opciones disponibles. Esta carga no se
     * hace con una consulta a la base de datos debido al formato de este campo
     * (una unica cadena con todas las caracteristicas especiales.)
     */
    public void cargaCaracteristicasEspeciales() {

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();

        modelo.addElement("Deleted Scenes");
        modelo.addElement("Trailers");
        modelo.addElement("Behind the Scenes");
        modelo.addElement("Commentaries");

        this.comboElemento.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbFiltro = new javax.swing.JComboBox<>();
        etiFiltro = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        comboElemento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaConsultas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtar pelicula por: ");

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Categoría", "Actor", "Características especiales", "Longitud < 100" }));
        cmbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltroItemStateChanged(evt);
            }
        });

        etiFiltro.setText("jLabel2");

        jLabel2.setText("Resultado de consulta.");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        comboElemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane1.setViewportView(listaConsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFiltro)
                    .addComponent(comboElemento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(etiFiltro)
                    .addComponent(cmbFiltro, 0, 225, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etiFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnSalir))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que se lanza cuando se selecciona una nueva opción del combo que 
     * con las opciones de filtrado. Este llama a la función actualizarInteraz, 
     * que se engarda de cambiar la interfaz en función de la opción seleccionada
     * en el combo.
     * @param evt evento que lanza este método (seleccion de nueva opción del 
     * combo)
     */
    private void cmbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltroItemStateChanged
        if (evt.getStateChange() == evt.SELECTED) {
            actulizarInterfaz();
        }
    }//GEN-LAST:event_cmbFiltroItemStateChanged

    /**
     * Método que se lanza al pulsar el botón "Salir" que se encarga de cerrar
     * la aplicación.
     * @param evt evento que lanza este método (pulsar botón salir).
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * Método que se lanza al pulsar el botón "Buscar" que se encarga de llamar
     * a un método de la clase Controlador en función de la opción seleccionada
     * en el combo con las opciones de filtrado. Tras la llamada, carga en el 
     * JList (listaConsultas) de la interfaz el modelo devuelto por el método 
     * llamado.
     * @param evt evento que lanza este método (pulsar botón buscar). 
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String opcion = this.cmbFiltro.getSelectedItem().toString();

        switch (opcion) {
            case "Nombre":
                String titulo = this.txtFiltro.getText();

                if (titulo.compareToIgnoreCase("") == 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduzca el titulo de la pelicula.");
                } else {
                    this.listaConsultas.setModel(Controlador.buscarPorNombre(titulo));
                }
                break;

            case "Categoría":
                String categoria = this.comboElemento.getSelectedItem().toString();
                this.listaConsultas.setModel(Controlador.buscarPorCategoria(categoria));
                break;

            case "Actor":
                String actor = this.txtFiltro.getText();

                if (actor.compareToIgnoreCase("") == 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduzca el nombre del actor.");
                } else {
                    this.listaConsultas.setModel(Controlador.buscarPorActor(actor));
                }
                break;

            case "Características especiales":
                String caracteristica = this.comboElemento.getSelectedItem().toString();
                this.listaConsultas.setModel(Controlador.buscarPorCaracteristicas(caracteristica));
                break;
                
            case "Longitud < 100":
                this.listaConsultas.setModel(Controlador.buscarPorLongitud());
                break;

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * Método encargardo de actualizar los componentes de la interfaz en función
     * de la opción seleccionada en el combo con las opciones de filtrado.
     */
    public void actulizarInterfaz() {
        String opcion;
        opcion = this.cmbFiltro.getSelectedItem().toString();

        switch (opcion) {
            case "Nombre":
                this.etiFiltro.setText("Nombre película: ");
                this.comboElemento.setVisible(false);
                this.etiFiltro.setVisible(true);
                this.txtFiltro.setVisible(true);
                break;
            case "Categoría":
                this.etiFiltro.setText("Categoría: ");
                this.etiFiltro.setVisible(true);
                this.txtFiltro.setVisible(false);
                this.comboElemento.setModel(Controlador.obtenerCategorias());
                this.comboElemento.setVisible(true);
                break;
            case "Actor":
                this.comboElemento.setVisible(false);
                this.etiFiltro.setText("Nombre Actor: ");
                this.etiFiltro.setVisible(true);
                this.txtFiltro.setVisible(true);
                break;
            case "Características especiales":
                this.etiFiltro.setText("Característica: ");
                this.cargaCaracteristicasEspeciales();
                this.comboElemento.setVisible(true);
                this.etiFiltro.setVisible(true);
                this.txtFiltro.setVisible(false);
                break;
            case "Longitud < 100":
                this.comboElemento.setVisible(false);
                this.etiFiltro.setVisible(false);
                this.txtFiltro.setVisible(false);
                break;

        }
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> comboElemento;
    private javax.swing.JLabel etiFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaConsultas;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
