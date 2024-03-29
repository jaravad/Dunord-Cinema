/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Jesus David
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        setLocationRelativeTo(null);
    }
    public static boolean sw;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        topbar = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        usuario.setForeground(new java.awt.Color(153, 153, 153));
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Person_85px.png"))); // NOI18N
        usuario.setText("Usuario");
        usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        usuario.setOpaque(true);
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usuarioMouseExited(evt);
            }
        });
        background.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 100));

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete_25px.png"))); // NOI18N
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        background.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 40, 40));

        topbar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        topbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topbarMouseDragged(evt);
            }
        });
        topbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topbarMousePressed(evt);
            }
        });
        background.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 40));

        admin.setBackground(new java.awt.Color(255, 255, 255));
        admin.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        admin.setForeground(new java.awt.Color(153, 153, 153));
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Admin_85px.png"))); // NOI18N
        admin.setText("Administrador");
        admin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        admin.setOpaque(true);
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
        });
        background.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 190, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        LogInUsuario ventana = new LogInUsuario();
        this.setVisible(false);
        ventana.setVisible(true);
        sw=true;
    }//GEN-LAST:event_usuarioMouseClicked

    private void usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseEntered
        usuario.setBackground(new Color(240,240,240));
        usuario.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_usuarioMouseEntered

    private void usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseExited
        usuario.setBackground(new Color(255,255,255));
        usuario.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_usuarioMouseExited

    private void topbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y+evt.getY()-y);
    }//GEN-LAST:event_topbarMouseDragged

    public static int x;
    public static int y;
    private void topbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_topbarMousePressed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(255,51,51));
        close.setIcon(new ImageIcon("src/imagenes/Deletewhite_25px.png"));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(255,255,255));
        close.setIcon(new ImageIcon("src/imagenes/Delete_25px.png"));
    }//GEN-LAST:event_closeMouseExited

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        LogInAdmin ventana = new LogInAdmin();
        this.setVisible(false);
        ventana.setVisible(true);
        sw=false;
    }//GEN-LAST:event_adminMouseClicked

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
        admin.setBackground(new Color(240,240,240));
        admin.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_adminMouseEntered

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
        admin.setBackground(new Color(255,255,255));
        admin.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_adminMouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JPanel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel topbar;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
