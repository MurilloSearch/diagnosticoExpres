package Formularios;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class menuFRM extends javax.swing.JFrame {

    IFRM_Diagnostico IFRM_Diagnostico = null;
    IFRM_Modelo IFRM_Modelo = null;
    IFRM_Instrucciones IFRM_Instrucciones  =null;
    IFRM_About IFRM_About = null;
    
    public menuFRM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pEscritorio = new javax.swing.JDesktopPane();
        bg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        pestanaArchivo = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        pestanaModelado = new javax.swing.JMenu();
        modelo = new javax.swing.JMenuItem();
        pestanaAyuda = new javax.swing.JMenu();
        instrucciones = new javax.swing.JMenuItem();
        acerdaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Diagnostico Express");
        setResizable(false);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SISTEMA DE DIAGNÓSTICOS EXPRESS.png"))); // NOI18N

        pEscritorio.setLayer(bg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pEscritorioLayout = new javax.swing.GroupLayout(pEscritorio);
        pEscritorio.setLayout(pEscritorioLayout);
        pEscritorioLayout.setHorizontalGroup(
            pEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        pEscritorioLayout.setVerticalGroup(
            pEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pestanaArchivo.setText("Archivo");

        Nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        pestanaArchivo.add(Nuevo);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        pestanaArchivo.add(Salir);

        jMenuBar1.add(pestanaArchivo);

        pestanaModelado.setText("Modelado");

        modelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        modelo.setText("Abrir Modelo");
        modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloActionPerformed(evt);
            }
        });
        pestanaModelado.add(modelo);

        jMenuBar1.add(pestanaModelado);

        pestanaAyuda.setText("Ayuda");

        instrucciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        instrucciones.setText("Instrucciones");
        instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruccionesActionPerformed(evt);
            }
        });
        pestanaAyuda.add(instrucciones);

        acerdaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        acerdaDe.setText("Acerca de");
        acerdaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acerdaDeActionPerformed(evt);
            }
        });
        pestanaAyuda.add(acerdaDe);

        jMenuBar1.add(pestanaAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pEscritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        IFRM_Diagnostico = new IFRM_Diagnostico();
        Iniciar_Ventana(IFRM_Diagnostico);
    }//GEN-LAST:event_NuevoActionPerformed

    private void modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloActionPerformed
        IFRM_Modelo = new IFRM_Modelo();
        Iniciar_Ventana(IFRM_Modelo);
    }//GEN-LAST:event_modeloActionPerformed

    private void instruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instruccionesActionPerformed
        
        IFRM_Instrucciones = new IFRM_Instrucciones();
        Iniciar_Ventana(IFRM_Instrucciones);
    }//GEN-LAST:event_instruccionesActionPerformed

    private void acerdaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acerdaDeActionPerformed
        IFRM_About = new IFRM_About();
        Iniciar_Ventana(IFRM_About);
    }//GEN-LAST:event_acerdaDeActionPerformed

public void Iniciar_Ventana(Component Objeto_FRM) {
        if (JInternalFrames_Abiertos(IFRM_Diagnostico) && JInternalFrames_Abiertos(IFRM_Modelo)) {
            pEscritorio.add(Objeto_FRM);
            Dimension desktopSize = pEscritorio.getSize();
            Dimension FrameSize = Objeto_FRM.getSize();
            Objeto_FRM.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            Objeto_FRM.setVisible(true);
        }

    }

    private boolean JInternalFrames_Abiertos(JInternalFrame jif) { // Creamos un metodo publico de tipo boolean.
        JInternalFrame[] jif_Activos = menuFRM.pEscritorio.getAllFrames(); // Este arreglo almacena todos los JInternalFrames que esten abierto en el jDesktopPane.
        
        for (int i = 0; i < jif_Activos.length; i++) { // Creamos un ciclo for para recorrer nuestro arreglo utilizando la propiedad length de nuestro arreglo.

            // Validamos con un if si nuestro arreglo en la posición i es igual al JInternalFrame que esta activo en el jDesktopPane, si es igual devolverá true.
            if (jif.getClass().isInstance(jif_Activos[i])) {
                JOptionPane.showMessageDialog(null, "Ya tienes una ventana abierta. \n\nCierra las demás.", "Información", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        return true;
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
            java.util.logging.Logger.getLogger(menuFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuFRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem acerdaDe;
    private javax.swing.JLabel bg;
    private javax.swing.JMenuItem instrucciones;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem modelo;
    public static javax.swing.JDesktopPane pEscritorio;
    private javax.swing.JMenu pestanaArchivo;
    private javax.swing.JMenu pestanaAyuda;
    private javax.swing.JMenu pestanaModelado;
    // End of variables declaration//GEN-END:variables
}
