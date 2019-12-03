/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class Padre extends javax.swing.JFrame {

    /**
     * Creates new form Padre
     */
    public Padre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        contenedor = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenuArchivo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnMenuSalir = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnMenuAdministrar = new javax.swing.JMenu();
        btnAgregarProducto = new javax.swing.JMenuItem();
        btnMenuAbrirHijo = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");

        btnMenuArchivo.setText("Archivo");
        btnMenuArchivo.add(jSeparator1);

        btnMenuSalir.setText("Salir");
        btnMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuSalirActionPerformed(evt);
            }
        });
        btnMenuArchivo.add(btnMenuSalir);

        jMenuItem2.setText("Cerrar Sesion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btnMenuArchivo.add(jMenuItem2);

        jMenuBar1.add(btnMenuArchivo);

        jMenu2.setText("Editar");

        btnMenuAdministrar.setText("Administrar");

        btnAgregarProducto.setText("Agregar producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        btnMenuAdministrar.add(btnAgregarProducto);

        btnMenuAbrirHijo.setText("productos");
        btnMenuAbrirHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAbrirHijoActionPerformed(evt);
            }
        });
        btnMenuAdministrar.add(btnMenuAbrirHijo);

        jMenu2.add(btnMenuAdministrar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuSalirActionPerformed
        // Preguntamos si está seguro de que quiere salir
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro de querer salir de la aplicación?", "Salir de la aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        // Si se presiona el boton "Si" devolverá un cero (0), por lo que debemos
        // cerrar la aplicación
        if(respuesta == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnMenuSalirActionPerformed

    private void btnMenuAbrirHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAbrirHijoActionPerformed
        // Creamos la instancia de la clase Hijo
        Hijo h = new Hijo();
        // Añadimos el formulario instanciado al contenedor (jDesktopPane)
        contenedor.add(h);
        h.setVisible(true);
        
    }//GEN-LAST:event_btnMenuAbrirHijoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        Agregarproducto nuevo = new Agregarproducto ();
             contenedor.add(nuevo);
                nuevo.setVisible(true);
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int sel = JOptionPane.showConfirmDialog(null, 
                "¿Desea cerrar sesion?", "ALERTA", JOptionPane.YES_NO_OPTION);
        if (sel==JOptionPane.YES_OPTION){
        Login salir = new Login();
            salir.setVisible(true);
            this.dispose();}
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Padre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAgregarProducto;
    private javax.swing.JMenuItem btnMenuAbrirHijo;
    private javax.swing.JMenu btnMenuAdministrar;
    private javax.swing.JMenu btnMenuArchivo;
    private javax.swing.JMenuItem btnMenuSalir;
    private javax.swing.JDesktopPane contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
