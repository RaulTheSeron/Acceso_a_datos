/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Controlador.Controlador;
import com.db4o.ObjectContainer;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * Interfaz de la aplicación
 * @author raul_
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    Controlador controlador = new Controlador();
    ObjectContainer db;
    
    boolean conectada = false;
    
    public ventanaPrincipal() {
        initComponents();
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        this.panelOperaciones.setVisible(false);
        this.setTitle("Tarea Online 4 - Base de datos Biblioteca");
        this.setLocationRelativeTo(null);
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Carlos Ruiz Zafon");
        modelo.addElement("Brandon Sanderson");
        
        this.comboAutores.setModel(modelo);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eti1 = new javax.swing.JLabel();
        panelOperaciones = new javax.swing.JPanel();
        btnAutores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaConsultas = new javax.swing.JList<>();
        btnLibrosAutor = new javax.swing.JButton();
        btnAutoresEsp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboAutores = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnPrecio = new javax.swing.JButton();
        btnAumentoPrecios = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioInferior = new javax.swing.JTextField();
        txtPrecioSuperior = new javax.swing.JTextField();
        txtNombreLibro = new javax.swing.JTextField();
        btnLibros = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuConectar = new javax.swing.JMenuItem();
        menuDesconectar = new javax.swing.JMenuItem();
        menuCargar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eti1.setText("Aviso: Conecte la Base de datos para poder trabajar. Si es su primera ejecucion del programa, cargue los datos de prueba.");

        panelOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnAutores.setText("Mostrar Autores");
        btnAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoresActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaConsultas);

        btnLibrosAutor.setText("Mostar Libros de Autor");
        btnLibrosAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosAutorActionPerformed(evt);
            }
        });

        btnAutoresEsp.setText("Mostrar Autores Españoles");
        btnAutoresEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoresEspActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista autores:");

        comboAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAutoresActionPerformed(evt);
            }
        });

        btnPrecio.setText("Filtrar por precio");
        btnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioActionPerformed(evt);
            }
        });

        btnAumentoPrecios.setText("Aumentar precios un 5%");
        btnAumentoPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentoPreciosActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar libro");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio inferior:");

        jLabel3.setText("Precio superior:");

        btnLibros.setText("Mostrar libros");
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });

        jLabel4.setText("Titulo:");

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLibrosAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLibros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOperacionesLayout.createSequentialGroup()
                                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel3))
                                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioSuperior)
                                    .addComponent(txtPrecioInferior))
                                .addGap(6, 6, 6))
                            .addGroup(panelOperacionesLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboAutores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(btnAutoresEsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAumentoPrecios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperacionesLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator7)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addComponent(btnAutores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnLibrosAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAutoresEsp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(panelOperacionesLayout.createSequentialGroup()
                                .addComponent(txtPrecioInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecioSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAumentoPrecios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLibros)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );

        jMenu1.setText("Menu");

        menuConectar.setText("Conectar BD");
        menuConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConectarActionPerformed(evt);
            }
        });
        jMenu1.add(menuConectar);

        menuDesconectar.setText("DesconectarBD");
        menuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDesconectarActionPerformed(evt);
            }
        });
        jMenu1.add(menuDesconectar);

        menuCargar.setText("Cargar valores de prueba");
        menuCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCargarActionPerformed(evt);
            }
        });
        jMenu1.add(menuCargar);
        jMenu1.add(jSeparator1);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eti1)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(eti1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConectarActionPerformed

        if(!this.conectada){
            db= this.controlador.abrirBD(db);
            if(db!=null){
                JOptionPane.showMessageDialog(this, "Base de datos conectada");
                this.conectada=true;
                this.eti1.setVisible(false);
                this.panelOperaciones.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al conectar la BBDD");
            }
        } else{
            JOptionPane.showMessageDialog(this, "La BBDD ya esta conectada");
        }
    }//GEN-LAST:event_menuConectarActionPerformed

    private void menuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDesconectarActionPerformed
        if(conectada == false){
            JOptionPane.showMessageDialog(this, "La BBDD no esta conectada");
        }
        else{
            this.controlador.cerrarBBDD(db);
            this.eti1.setVisible(true);
            this.panelOperaciones.setVisible(false);
            JOptionPane.showMessageDialog(this, "Base de datos desconectada");
            this.conectada=false;
        }
    }//GEN-LAST:event_menuDesconectarActionPerformed

    private void btnAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoresActionPerformed
        this.listaConsultas.setModel(this.controlador.buscarAutores(db));
    }//GEN-LAST:event_btnAutoresActionPerformed

    private void btnLibrosAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosAutorActionPerformed
        String autor = this.comboAutores.getSelectedItem().toString();
        this.listaConsultas.setModel(this.controlador.buscarLibrosAutor(db, autor));
    }//GEN-LAST:event_btnLibrosAutorActionPerformed

    private void btnAutoresEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoresEspActionPerformed
        this.listaConsultas.setModel(this.controlador.buscarAutoresEspañoles(db));
    }//GEN-LAST:event_btnAutoresEspActionPerformed

    private void menuCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCargarActionPerformed
        if(conectada == false){
           JOptionPane.showMessageDialog(this,"Conecte la base de datos primero.");
        }
        else{
            try {
                this.controlador.insertarValores(db);
            } catch (ParseException ex) {
                Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this,"Datos insertados correctamente.");
        }    
    }//GEN-LAST:event_menuCargarActionPerformed

    private void btnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioActionPerformed
        if(this.txtPrecioInferior.getText().compareTo("")==0 || this.txtPrecioSuperior.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this,"Rellena los campos de los precios correctamente");
        }
        else{
            double inferior = Double.parseDouble(this.txtPrecioInferior.getText());
            double superior = Double.parseDouble(this.txtPrecioSuperior.getText());
            DefaultListModel modelo = controlador.buscarLibrosPrecio(db, inferior, superior);
            if(!modelo.isEmpty()){
                this.listaConsultas.setModel(modelo);
            }
            else{
                JOptionPane.showMessageDialog(this,"No existen libros cuyo precio este entre los valores indicados.");
            }
        }    
    }//GEN-LAST:event_btnPrecioActionPerformed

    private void btnAumentoPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentoPreciosActionPerformed
        this.controlador.modificarPrecios(db);
        JOptionPane.showMessageDialog(this, "Precios modificados correctamente.");
    }//GEN-LAST:event_btnAumentoPreciosActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        this.listaConsultas.setModel(this.controlador.buscarLibros(db));
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void comboAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAutoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAutoresActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String titulo = this.txtNombreLibro.getText();
        if(titulo.compareToIgnoreCase("")==0){
            JOptionPane.showMessageDialog(this,"Introduzca un titulo.");
        }
        else{
            JOptionPane.showMessageDialog(this,this.controlador.borrarLibro(db, titulo));
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentoPrecios;
    private javax.swing.JButton btnAutores;
    private javax.swing.JButton btnAutoresEsp;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnLibrosAutor;
    private javax.swing.JButton btnPrecio;
    private javax.swing.JComboBox<String> comboAutores;
    private javax.swing.JLabel eti1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JList<String> listaConsultas;
    private javax.swing.JMenuItem menuCargar;
    private javax.swing.JMenuItem menuConectar;
    private javax.swing.JMenuItem menuDesconectar;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JTextField txtNombreLibro;
    private javax.swing.JTextField txtPrecioInferior;
    private javax.swing.JTextField txtPrecioSuperior;
    // End of variables declaration//GEN-END:variables
}
