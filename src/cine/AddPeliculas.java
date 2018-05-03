/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jesus David
 */
public class AddPeliculas extends javax.swing.JFrame {

    /**
     * Creates new form AddPeliculas
     */
    public AddPeliculas() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        setLocationRelativeTo(null);
        System.out.println(this.clasicombo.getItemCount());
        System.out.println(this.clasicombo.getSelectedIndex());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JPanel();
        volver = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        topbar = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        duracion = new javax.swing.JLabel();
        namesep = new javax.swing.JSeparator();
        guardar = new javax.swing.JLabel();
        duracioncomb = new javax.swing.JComboBox<>();
        select = new javax.swing.JLabel();
        cover = new javax.swing.JLabel();
        selectimage = new javax.swing.JLabel();
        clasicombo = new javax.swing.JComboBox<>();
        clasilb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setBackground(new java.awt.Color(255, 255, 255));
        volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Back Arrow_28px.png"))); // NOI18N
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.setOpaque(true);
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        Back.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        title.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(153, 0, 153));
        title.setText("Agregar Peliculas");
        Back.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 26));

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
        Back.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 40, 40));

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
        Back.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 40));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(153, 153, 153));
        name.setText("Nombre");
        Back.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        nametxt.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        nametxt.setBorder(null);
        nametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nametxtFocusLost(evt);
            }
        });
        Back.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 20));

        duracion.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        duracion.setForeground(new java.awt.Color(153, 153, 153));
        duracion.setText("Duración");
        Back.add(duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        namesep.setBackground(new java.awt.Color(204, 204, 204));
        namesep.setForeground(new java.awt.Color(255, 255, 255));
        namesep.setOpaque(true);
        Back.add(namesep, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 230, -1));

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        guardar.setForeground(new java.awt.Color(153, 0, 153));
        guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar.setText("Guardar");
        guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        guardar.setOpaque(true);
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarMouseExited(evt);
            }
        });
        Back.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 70, 30));

        duracioncomb.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        duracioncomb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00" }));
        duracioncomb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                duracioncombFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                duracioncombFocusLost(evt);
            }
        });
        Back.add(duracioncomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, -1));

        select.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 12)); // NOI18N
        select.setText("Seleccione una portada");
        Back.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        cover.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Back.add(cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 270, 370));

        selectimage.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        selectimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectimage.setText("Seleccionar imagen");
        selectimage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        selectimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectimageMouseClicked(evt);
            }
        });
        Back.add(selectimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 130, 30));

        clasicombo.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        clasicombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "T ( para todo público)", "7 (mayores de 7 años)", "12 (mayores de 12 años)", "15 (mayores de 15 años)", "18 (mayores de 18 años)" }));
        clasicombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clasicomboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                clasicomboFocusLost(evt);
            }
        });
        Back.add(clasicombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, -1));

        clasilb.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        clasilb.setForeground(new java.awt.Color(153, 153, 153));
        clasilb.setText("Clasificación");
        Back.add(clasilb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_topbarMouseDragged

    private void topbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_topbarMousePressed

    public static int x;
    public static int y;
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(255, 51, 51));
        close.setIcon(new ImageIcon("src/imagenes/Deletewhite_25px.png"));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(255, 255, 255));
        close.setIcon(new ImageIcon("src/imagenes/Delete_25px.png"));
    }//GEN-LAST:event_closeMouseExited

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        Admin u = new Admin();
        this.setVisible(false);
        u.setVisible(true);
    }//GEN-LAST:event_volverMouseClicked

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new Color(231, 231, 231));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_volverMouseExited

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        File archivo = new File("mispeliculas.txt");
        if (nametxt.getText().length() != 0 && swf == true && clasicombo.getSelectedIndex() != 0) {
            
            if (FileHandle.existsonfile(archivo, 0, nametxt.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Ya existe esta película", "Aviso", JOptionPane.QUESTION_MESSAGE);
            } else {
                try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new FileWriter(archivo, true));) {
                    Object name = nametxt.getText();

                    Object clasi = null;
                    if (clasicombo.getSelectedIndex() == 1) {
                        clasi = "T";
                    } else if (clasicombo.getSelectedIndex() == 2) {
                        clasi = "7";
                    } else if (clasicombo.getSelectedIndex() == 3) {
                        clasi = "12";
                    } else if (clasicombo.getSelectedIndex() == 4) {
                        clasi = "15";
                    } else if (clasicombo.getSelectedIndex() == 5) {
                        clasi = "18";
                    }
                    bw.write(name + "," + duracioncomb.getSelectedItem() + "," + clasi + "," + "src/imagenes/portadas/" + fichero.getName());
                    bw.newLine();
                    nametxt.setText("");
                    nametxt.grabFocus();
                    swf = false;
                    File file = new File("src/imagenes/portadas/" + fichero.getName());
                    Files.copy(fichero.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    cover.setIcon(null);
                    clasicombo.setSelectedIndex(0);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "No deben haber campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_guardarMouseClicked

    File fichero;
    boolean swf = false;
    

    private void selectimageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectimageMouseClicked

        int resultado;
        CargarFoto ventana = new CargarFoto();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        ventana.upload.setFileFilter(filtro);
        resultado = ventana.upload.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado) {

            fichero = ventana.upload.getSelectedFile();
            try {

                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(cover.getWidth(), cover.getHeight(), Image.SCALE_SMOOTH));
                cover.setText(null);
                cover.setIcon(icono);
                swf = true;
                File file = new File("src/imagenes/portadas/" + fichero.getName());
                Files.copy(fichero.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "Error abriendo la imagen " + ex);

            }

        }

    }//GEN-LAST:event_selectimageMouseClicked

    private void nametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametxtFocusGained
        namesep.setBackground(new Color(153, 0, 153));
        name.setForeground(new Color(153, 0, 153));
    }//GEN-LAST:event_nametxtFocusGained

    private void nametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametxtFocusLost
        namesep.setBackground(new Color(204, 204, 204));
        name.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_nametxtFocusLost

    private void duracioncombFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_duracioncombFocusGained
        duracion.setForeground(new Color(153, 0, 153));
    }//GEN-LAST:event_duracioncombFocusGained

    private void duracioncombFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_duracioncombFocusLost
        duracion.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_duracioncombFocusLost

    private void guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseEntered
        guardar.setBackground(new Color(153, 0, 153));
        guardar.setForeground(new Color(255, 255, 255));


    }//GEN-LAST:event_guardarMouseEntered

    private void clasicomboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clasicomboFocusGained
        clasilb.setForeground(new Color(153, 0, 153));
    }//GEN-LAST:event_clasicomboFocusGained

    private void clasicomboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clasicomboFocusLost
        clasilb.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_clasicomboFocusLost

    private void guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseExited
        guardar.setForeground(new Color(153, 0, 153));
        guardar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_guardarMouseExited

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
            java.util.logging.Logger.getLogger(AddPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back;
    private javax.swing.JComboBox<String> clasicombo;
    private javax.swing.JLabel clasilb;
    private javax.swing.JLabel close;
    private javax.swing.JLabel cover;
    private javax.swing.JLabel duracion;
    private javax.swing.JComboBox<String> duracioncomb;
    private javax.swing.JLabel guardar;
    private javax.swing.JLabel name;
    private javax.swing.JSeparator namesep;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel select;
    private javax.swing.JLabel selectimage;
    private javax.swing.JLabel title;
    private javax.swing.JLabel topbar;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
