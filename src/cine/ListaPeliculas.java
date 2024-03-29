package cine;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaPeliculas extends javax.swing.JFrame {

    public ListaPeliculas() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        setLocationRelativeTo(null);
        table.getTableHeader().setReorderingAllowed(false);
        table.setDefaultRenderer(Object.class, new ImgTable());
        table.setRowHeight(230);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getTableHeader().setUI(null);

        File archivo = new File("mispeliculas.txt");
        Scanner s = null;
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            s = new Scanner(archivo);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                JLabel lbl = new JLabel();
                lbl.setSize(165, 230);
                String[] campos = linea.split(",");
                ImageIcon icon = new ImageIcon(campos[3]);
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
                lbl.setText(null);
                lbl.setIcon(icono);
                model.addRow(new Object[]{campos[0], campos[1], campos[2], lbl});
            }
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.toString());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        table.setBackground(Color.white);
    }
public void Refresh(){
    File archivo = new File("mispeliculas.txt");
        Scanner s = null;
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            s = new Scanner(archivo);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                JLabel lbl = new JLabel();
                lbl.setSize(165, 230);
                String[] campos = linea.split(",");
                ImageIcon icon = new ImageIcon(campos[3]);
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
                lbl.setText(null);
                lbl.setIcon(icono);
                model.addRow(new Object[]{campos[0], campos[1], campos[2], lbl});
            }
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.toString());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        close = new javax.swing.JLabel();
        volver = new javax.swing.JLabel();
        topbar = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        modify = new javax.swing.JLabel();
        back1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        close1 = new javax.swing.JLabel();
        volver1 = new javax.swing.JLabel();
        topbar1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        delete1 = new javax.swing.JLabel();
        modify1 = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Duración", "Clasificación", "Caratula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(160);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(4);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(5);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(52);
        }

        back.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 700, 490));

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
        back.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 40));

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
        back.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

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
        back.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 40));

        title.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        title.setText("Peliculas Disponibles");
        back.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, 26));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 51, 51));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("Eliminar");
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        delete.setOpaque(true);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        back.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 60, 30));

        modify.setBackground(new java.awt.Color(255, 255, 255));
        modify.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        modify.setForeground(new java.awt.Color(0, 153, 0));
        modify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modify.setText("Modificar");
        modify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        modify.setOpaque(true);
        modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifyMouseExited(evt);
            }
        });
        back.add(modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 60, 30));

        back1.setBackground(new java.awt.Color(255, 255, 255));
        back1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        back1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Duración", "Clasificación", "Caratula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(0).setPreferredWidth(160);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(1).setPreferredWidth(4);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(2).setPreferredWidth(5);
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(3).setPreferredWidth(52);
        }

        back1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 700, 490));

        close1.setBackground(new java.awt.Color(255, 255, 255));
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete_25px.png"))); // NOI18N
        close1.setOpaque(true);
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close1MouseExited(evt);
            }
        });
        back1.add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 40));

        volver1.setBackground(new java.awt.Color(255, 255, 255));
        volver1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Back Arrow_28px.png"))); // NOI18N
        volver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver1.setOpaque(true);
        volver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volver1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volver1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volver1MouseExited(evt);
            }
        });
        back1.add(volver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        topbar1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        topbar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topbar1MouseDragged(evt);
            }
        });
        topbar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topbar1MousePressed(evt);
            }
        });
        back1.add(topbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 40));

        title1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        title1.setText("Peliculas Disponibles");
        back1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, 26));

        delete1.setBackground(new java.awt.Color(255, 255, 255));
        delete1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        delete1.setForeground(new java.awt.Color(255, 51, 51));
        delete1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete1.setText("Eliminar");
        delete1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        delete1.setOpaque(true);
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete1MouseExited(evt);
            }
        });
        back1.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 60, 30));

        modify1.setBackground(new java.awt.Color(255, 255, 255));
        modify1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        modify1.setForeground(new java.awt.Color(0, 153, 0));
        modify1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modify1.setText("Modificar");
        modify1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        modify1.setOpaque(true);
        modify1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modify1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modify1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modify1MouseExited(evt);
            }
        });
        back1.add(modify1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 60, 30));

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(0, 102, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("Agregar");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        back1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 60, 30));

        refresh.setBackground(new java.awt.Color(255, 255, 255));
        refresh.setFont(new java.awt.Font("Microsoft JhengHei", 1, 11)); // NOI18N
        refresh.setForeground(new java.awt.Color(153, 0, 153));
        refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refresh.setText("Actualizar");
        refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        refresh.setOpaque(true);
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        back1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 60, 30));

        back.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(255, 51, 51));
        close.setIcon(new ImageIcon("src/imagenes/Deletewhite_25px.png"));
    }//GEN-LAST:event_closeMouseEntered

    public static int x;
    public static int y;

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(255, 255, 255));
        close.setIcon(new ImageIcon("src/imagenes/Delete_25px.png"));
    }//GEN-LAST:event_closeMouseExited

    private void topbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_topbarMouseDragged

    private void topbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_topbarMousePressed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String name = String.valueOf(model.getValueAt(table.getSelectedRow(), 0));
            int j = JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrar la pelicula " + "\"" + name + "\"" + "?, esta acción no es reversible", name, JOptionPane.YES_NO_OPTION);
            if (j == JOptionPane.YES_OPTION) {

                for (int i = 0; i < model.getRowCount(); i++) {
                    if (model.getValueAt(i, 0).equals(name)) {
                        model.removeRow(i);
                        File archivo = new File("mispeliculas.txt");
                        FileHandle a = new FileHandle();
                        a.delete(archivo, name);
                    }
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No hay peliculas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(new Color(255, 51, 51));
        delete.setForeground(Color.WHITE);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(Color.WHITE);
        delete.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_deleteMouseExited

    private void modifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyMouseEntered
        modify.setForeground(Color.WHITE);
        modify.setBackground(new Color(0, 153, 0));
    }//GEN-LAST:event_modifyMouseEntered

    private void modifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyMouseExited
        modify.setForeground(new Color(0, 153, 0));
        modify.setBackground(Color.WHITE);
    }//GEN-LAST:event_modifyMouseExited

    public static String nombre;
    public static String fichero;
    
    private void modifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyMouseClicked

        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String name = String.valueOf(model.getValueAt(table.getSelectedRow(), 0));
            nombre=name;
            String campos[]=FileHandle.getField(nombre,3).split("/");
            fichero=campos[3];
            String durcombo = String.valueOf(model.getValueAt(table.getSelectedRow(), 1));
            String clasicombo = String.valueOf(model.getValueAt(table.getSelectedRow(), 2));
            JLabel portada=(JLabel)model.getValueAt(table.getSelectedRow(), 3);
            EditPeliculas ventana = new EditPeliculas(name, durcombo,clasicombo,portada);
            ventana.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No hay peliculas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_modifyMouseClicked

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

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        AddPeliculas ventana=new AddPeliculas();
        ventana.setVisible(true);
        
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setForeground(Color.WHITE);
        add.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setForeground(new Color(0,102,255));
        add.setBackground(Color.WHITE);
    }//GEN-LAST:event_addMouseExited

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_close1MouseClicked

    private void close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_close1MouseEntered

    private void close1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_close1MouseExited

    private void volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_volver1MouseClicked

    private void volver1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_volver1MouseEntered

    private void volver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_volver1MouseExited

    private void topbar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbar1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_topbar1MouseDragged

    private void topbar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbar1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_topbar1MousePressed

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delete1MouseClicked

    private void delete1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_delete1MouseEntered

    private void delete1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_delete1MouseExited

    private void modify1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modify1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modify1MouseClicked

    private void modify1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modify1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modify1MouseEntered

    private void modify1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modify1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modify1MouseExited

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        DefaultTableModel model=(DefaultTableModel) table.getModel();
       model.setRowCount(0);
        Refresh();
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
     refresh.setBackground(new Color(153,0,153));
     refresh.setForeground(Color.WHITE);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
      refresh.setBackground(Color.WHITE);
     refresh.setForeground(new Color(153,0,153));
    }//GEN-LAST:event_refreshMouseExited

    /**
     * bo
     *
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
            java.util.logging.Logger.getLogger(ListaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JPanel back;
    private javax.swing.JPanel back1;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel delete1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel modify;
    private javax.swing.JLabel modify1;
    private javax.swing.JLabel refresh;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel topbar;
    private javax.swing.JLabel topbar1;
    private javax.swing.JLabel volver;
    private javax.swing.JLabel volver1;
    // End of variables declaration//GEN-END:variables
}
