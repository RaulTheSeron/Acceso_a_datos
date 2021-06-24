package Vista;

import Controlador.Conector;
import Controlador.Controlador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.basex.core.BaseXException;
import org.basex.core.Context;

public class VentanaPrincipal extends javax.swing.JFrame {

    Conector conector;
    Controlador controlador;
    Context contexto;
    boolean conectada = false;

    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Acceso a Datos-Tercer Trimestral");
        this.setLocationRelativeTo(null);
        conector = new Conector();
        controlador = new Controlador();
        ocultarBotones();
    }

    /**
     * Método para mostrar los botones de la interfaz cuando se permitan realizar consultas a 
     * la base de datos.
     */
    public void mostrarBotones() {
        this.btonBailesPlazas.setVisible(true);
        this.btonProfBailes.setVisible(true);
        this.btnProfCuotas.setVisible(true);
        this.btonBailes2CuotasTri.setVisible(true);
        this.btonActBailesJesus.setVisible(true);
        this.btonBailesAcademias.setVisible(true);
        this.btnConsultaBaiJesus.setVisible(true);
        this.areaMuestra.setVisible(true);
    }

    /**
     * Método para ocultar los botones de la intarfaz para impedir intentar 
     * realizar consultas si la base de datos no esta conectada.
     */
    public void ocultarBotones() {
        this.btonBailesPlazas.setVisible(false);
        this.btonProfBailes.setVisible(false);
        this.btnProfCuotas.setVisible(false);
        this.btonBailes2CuotasTri.setVisible(false);
        this.btonActBailesJesus.setVisible(false);
        this.btonBailesAcademias.setVisible(false);
        this.btnConsultaBaiJesus.setVisible(false);
        this.areaMuestra.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btonBailesPlazas = new javax.swing.JButton();
        btonProfBailes = new javax.swing.JButton();
        btnProfCuotas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMuestra = new javax.swing.JTextArea();
        btonBailes2CuotasTri = new javax.swing.JButton();
        btonActBailesJesus = new javax.swing.JButton();
        btonBailesAcademias = new javax.swing.JButton();
        btnConsultaBaiJesus = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuConectar = new javax.swing.JMenuItem();
        menuDesconectar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btonBailesPlazas.setText("Nombres de bailes con menos de 20 plazas");
        btonBailesPlazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBailesPlazasActionPerformed(evt);
            }
        });

        btonProfBailes.setText("Profesores + Bailes");
        btonProfBailes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonProfBailesActionPerformed(evt);
            }
        });

        btnProfCuotas.setText("Profesores con cuotas mensuales");
        btnProfCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfCuotasActionPerformed(evt);
            }
        });

        areaMuestra.setColumns(20);
        areaMuestra.setRows(5);
        jScrollPane1.setViewportView(areaMuestra);

        btonBailes2CuotasTri.setText("Bailes de sala 2 con cuotra trimestral");
        btonBailes2CuotasTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBailes2CuotasTriActionPerformed(evt);
            }
        });

        btonActBailesJesus.setText("Actualizar balies de Jesus Lozano");
        btonActBailesJesus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonActBailesJesusActionPerformed(evt);
            }
        });

        btonBailesAcademias.setText("Mostar Bailes disponibles en academias");
        btonBailesAcademias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBailesAcademiasActionPerformed(evt);
            }
        });

        btnConsultaBaiJesus.setText("Consultar Bailes de Jesus Lozano");
        btnConsultaBaiJesus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaBaiJesusActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        menuConectar.setText("Conectar BD");
        menuConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConectarActionPerformed(evt);
            }
        });
        jMenu1.add(menuConectar);

        menuDesconectar.setText("Desconectar BD");
        menuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDesconectarActionPerformed(evt);
            }
        });
        jMenu1.add(menuDesconectar);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConsultaBaiJesus))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnProfCuotas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btonProfBailes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btonBailesPlazas, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btonBailesAcademias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(btonBailes2CuotasTri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btonActBailesJesus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfCuotas)
                    .addComponent(btonBailesAcademias))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btonProfBailes)
                    .addComponent(btonBailes2CuotasTri))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btonBailesPlazas)
                    .addComponent(btonActBailesJesus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultaBaiJesus)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConectarActionPerformed
        if (conectada == false) {
            conector.abrirBD();
            this.contexto = conector.getContexto();
            mostrarBotones();
            conectada = true;
        } else {
            JOptionPane.showMessageDialog(null, "La base de datos ya esta conectada!");
        }
    }//GEN-LAST:event_menuConectarActionPerformed

    /**
     * Metodo lanzado al pulsar la opción del menú "Salir". Su función es cerrar
     * la aplicación.
     * @param evt 
     */
    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    /**
     * Metodo que se lanza al pulsar la opción "Desconectar BD" cuya función es
     * llamar al método de la clase conector que desconectar la base de datos.
     * Comprueba si la base de datos esta conectada.
     * @param evt 
     */
    private void menuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDesconectarActionPerformed
        if (conectada == true) {
            try {
                conector.desconectar();
            } catch (BaseXException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            ocultarBotones();
            conectada = false;
        } else {
            JOptionPane.showMessageDialog(null, "La base de datos esta desconectada!");
        }
    }//GEN-LAST:event_menuDesconectarActionPerformed

    /*************************BOTONERA DE CONSULTAS*****************************/
    /*
    * Los siguientes métodos son lanzados al pulsar los botones de la interfaz. 
    * La función de cada uno es crear un String que contenga la consulta a 
    * a realizar a la base de datos para llamar al método queryDB de la clase 
    * controlador y cargar el String devuel dicho método en el área de text de 
    * de la interfaz
    */
    private void btonBailesPlazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBailesPlazasActionPerformed

        String consulta = "for $b in //baile where $b/plazas < 20 return data($b/nombre)";
        this.areaMuestra.setText(controlador.queryDB(consulta, contexto));
    }//GEN-LAST:event_btonBailesPlazasActionPerformed

    private void btonProfBailesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonProfBailesActionPerformed
        String consulta = "for $b in //baile\n"
                + "let $profesor := concat(data($b/profesor),\": \")\n"
                + "return concat($profesor,(data($b/nombre)))";
        this.areaMuestra.setText(controlador.queryDB(consulta, contexto));
    }//GEN-LAST:event_btonProfBailesActionPerformed

    private void btnProfCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfCuotasActionPerformed
        String consulta = "for $p in //baile\n"
                + "where $p/precio/@cuota = \"mensual\"\n"
                + "return data($p/profesor)";
        this.areaMuestra.setText(controlador.queryDB(consulta, contexto));
    }//GEN-LAST:event_btnProfCuotasActionPerformed

    private void btonBailes2CuotasTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBailes2CuotasTriActionPerformed
        String consulta = "for $b in //baile[sala=2]\n"
                + "where $b/precio/@cuota = \"trimestral\"\n"
                + "return data($b/nombre)";
        this.areaMuestra.setText(controlador.queryDB(consulta, contexto));
    }//GEN-LAST:event_btonBailes2CuotasTriActionPerformed

    private void btonActBailesJesusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonActBailesJesusActionPerformed
        String consulta = "for $b in //baile\n"
                + "where $b/profesor = \"Jesús Lozano\"\n"
                + "return replace value of node $b/sala with(10)";
        this.areaMuestra.setText(controlador.queryDB(consulta, contexto));
    }//GEN-LAST:event_btonActBailesJesusActionPerformed

    private void btonBailesAcademiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBailesAcademiasActionPerformed
        String consulta = "for $b in //baile\n"
                + "where $b/@id =(\n"
                + "  for $a in //disponibles\n"
                + "  return data($a/id))\n"
                + "return data($b/nombre)";
        this.areaMuestra.setText(this.controlador.queryDB(consulta, contexto));
    }//GEN-LAST:event_btonBailesAcademiasActionPerformed

    private void btnConsultaBaiJesusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaBaiJesusActionPerformed
        String consulta = "for $b in //baile[profesor = \"Jesús Lozano\"]\n"
                + "return $b";
        this.areaMuestra.setText(this.controlador.queryDB(consulta, contexto));
    }//GEN-LAST:event_btnConsultaBaiJesusActionPerformed

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
    private javax.swing.JTextArea areaMuestra;
    private javax.swing.JButton btnConsultaBaiJesus;
    private javax.swing.JButton btnProfCuotas;
    private javax.swing.JButton btonActBailesJesus;
    private javax.swing.JButton btonBailes2CuotasTri;
    private javax.swing.JButton btonBailesAcademias;
    private javax.swing.JButton btonBailesPlazas;
    private javax.swing.JButton btonProfBailes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuConectar;
    private javax.swing.JMenuItem menuDesconectar;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}
