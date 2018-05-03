/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Jesus David
 */
public class Sala extends javax.swing.JFrame {

    /**
     * Creates new form Sala
     */
    public Sala() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        setLocationRelativeTo(null);

        sillas = new ArrayList<Silla>();
        Silla a1 = new Silla(A1, true);
        Silla a2 = new Silla(A2, true);
        Silla a3 = new Silla(A3, true);
        Silla a4 = new Silla(A4, true);
        Silla a5 = new Silla(A5, true);
        Silla a6 = new Silla(A6, true);
        Silla a7 = new Silla(A7, true);
        Silla a8 = new Silla(A8, true);
        Silla a9 = new Silla(A9, true);
        Silla a10 = new Silla(A10, true);
        Silla b1 = new Silla(B1, true);
        Silla b2 = new Silla(B2, true);
        Silla b3 = new Silla(B3, true);
        Silla b4 = new Silla(B4, true);
        Silla b5 = new Silla(B5, true);
        Silla b6 = new Silla(B6, true);
        Silla b7 = new Silla(B7, true);
        Silla b8 = new Silla(B8, true);
        Silla b9 = new Silla(B9, true);
        Silla b10 = new Silla(B10, true);
        Silla c1 = new Silla(C1, true);
        Silla c2 = new Silla(C2, true);
        Silla c3 = new Silla(C3, true);
        Silla c4 = new Silla(C4, true);
        Silla c5 = new Silla(C5, true);
        Silla c6 = new Silla(C6, true);
        Silla c7 = new Silla(C7, true);
        Silla c8 = new Silla(C8, true);
        Silla c9 = new Silla(C9, true);
        Silla c10 = new Silla(C10, true);
        Silla d1 = new Silla(D1, true);
        Silla d2 = new Silla(D2, true);
        Silla d3 = new Silla(D3, true);
        Silla d4 = new Silla(D4, true);
        Silla d5 = new Silla(D5, true);
        Silla d6 = new Silla(D6, true);
        Silla d7 = new Silla(D7, true);
        Silla d8 = new Silla(D8, true);
        Silla d9 = new Silla(D9, true);
        Silla d10 = new Silla(D10, true);
        Silla e1 = new Silla(E1, true);
        Silla e2 = new Silla(E2, true);
        Silla e3 = new Silla(E3, true);
        Silla e4 = new Silla(E4, true);
        Silla e5 = new Silla(E5, true);
        Silla e6 = new Silla(E6, true);
        Silla e7 = new Silla(E7, true);
        Silla e8 = new Silla(E8, true);
        Silla e9 = new Silla(E9, true);
        Silla e10 = new Silla(E10, true);
        Silla f1 = new Silla(F1, true);
        Silla f2 = new Silla(F2, true);
        Silla f3 = new Silla(F3, true);
        Silla f4 = new Silla(F4, true);
        Silla f5 = new Silla(F5, true);
        Silla f6 = new Silla(F6, true);
        Silla f7 = new Silla(F7, true);
        Silla f8 = new Silla(F8, true);
        Silla f9 = new Silla(F9, true);
        Silla f10 = new Silla(F10, true);
        Silla g1 = new Silla(G1, true);
        Silla g2 = new Silla(G2, true);
        Silla g3 = new Silla(G3, true);
        Silla g4 = new Silla(G4, true);
        Silla g5 = new Silla(G5, true);
        Silla g6 = new Silla(G6, true);
        Silla g7 = new Silla(G7, true);
        Silla g8 = new Silla(G8, true);
        Silla g9 = new Silla(G9, true);
        Silla g10 = new Silla(G10, true);
        sillas.add(a1);
        sillas.add(a2);
        sillas.add(a3);
        sillas.add(a4);
        sillas.add(a5);
        sillas.add(a6);
        sillas.add(a7);
        sillas.add(a8);
        sillas.add(a9);
        sillas.add(a10);
        sillas.add(b1);
        sillas.add(b2);
        sillas.add(b3);
        sillas.add(b4);
        sillas.add(b5);
        sillas.add(b6);
        sillas.add(b7);
        sillas.add(b8);
        sillas.add(b9);
        sillas.add(b10);
        sillas.add(c1);
        sillas.add(c2);
        sillas.add(c3);
        sillas.add(c4);
        sillas.add(c5);
        sillas.add(c6);
        sillas.add(c7);
        sillas.add(c8);
        sillas.add(c9);
        sillas.add(c10);
        sillas.add(d1);
        sillas.add(d2);
        sillas.add(d3);
        sillas.add(d4);
        sillas.add(d5);
        sillas.add(d6);
        sillas.add(d7);
        sillas.add(d8);
        sillas.add(d9);
        sillas.add(d10);
        sillas.add(e1);
        sillas.add(e2);
        sillas.add(e3);
        sillas.add(e4);
        sillas.add(e5);
        sillas.add(e6);
        sillas.add(e7);
        sillas.add(e8);
        sillas.add(e9);
        sillas.add(e10);
        sillas.add(f1);
        sillas.add(f2);
        sillas.add(f3);
        sillas.add(f4);
        sillas.add(f5);
        sillas.add(f6);
        sillas.add(f7);
        sillas.add(f8);
        sillas.add(f9);
        sillas.add(f10);
        sillas.add(g1);
        sillas.add(g2);
        sillas.add(g3);
        sillas.add(g4);
        sillas.add(g5);
        sillas.add(g6);
        sillas.add(g7);
        sillas.add(g8);
        sillas.add(g9);
        sillas.add(g10);

        File archivo = new File("Sillas/" + HorariosSala.globalcode + ".txt");
        Scanner s = null;
        try {
            s = new Scanner(archivo);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] campos = linea.split(",");
                for (Silla x : sillas) {
                    if (String.valueOf(x.posicion.getName()).equals(campos[0])) {
                        x.state = Boolean.parseBoolean(campos[1]);
                    }
                }
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
        LlenarSillas();

    }

    ArrayList<Silla> sillas;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        A5 = new javax.swing.JLabel();
        A6 = new javax.swing.JLabel();
        A7 = new javax.swing.JLabel();
        A8 = new javax.swing.JLabel();
        A9 = new javax.swing.JLabel();
        A10 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        B9 = new javax.swing.JLabel();
        B10 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        D8 = new javax.swing.JLabel();
        D9 = new javax.swing.JLabel();
        D10 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        E7 = new javax.swing.JLabel();
        E8 = new javax.swing.JLabel();
        E9 = new javax.swing.JLabel();
        E10 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        F6 = new javax.swing.JLabel();
        F7 = new javax.swing.JLabel();
        F8 = new javax.swing.JLabel();
        F9 = new javax.swing.JLabel();
        F10 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        G2 = new javax.swing.JLabel();
        G3 = new javax.swing.JLabel();
        G4 = new javax.swing.JLabel();
        G5 = new javax.swing.JLabel();
        G6 = new javax.swing.JLabel();
        G7 = new javax.swing.JLabel();
        G8 = new javax.swing.JLabel();
        G9 = new javax.swing.JLabel();
        G10 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        volver = new javax.swing.JLabel();
        topbar = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        pantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        title.setText("Reserva de Asientos");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 180, 26));

        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        A1.setName("A1"); // NOI18N
        A1.setOpaque(true);
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });
        jPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 30, -1));

        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        A2.setName("A2"); // NOI18N
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });
        jPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 30, -1));

        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        A3.setName("A3"); // NOI18N
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });
        jPanel1.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 30, -1));

        A4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        A4.setName("A4"); // NOI18N
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
        });
        jPanel1.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 30, -1));

        A5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        A5.setName("A5"); // NOI18N
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A5MouseClicked(evt);
            }
        });
        jPanel1.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 30, -1));

        A6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        A6.setName("A6"); // NOI18N
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A6MouseClicked(evt);
            }
        });
        jPanel1.add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 30, -1));

        A7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        A7.setName("A7"); // NOI18N
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A7MouseClicked(evt);
            }
        });
        jPanel1.add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 30, -1));

        A8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        A8.setName("A8"); // NOI18N
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A8MouseClicked(evt);
            }
        });
        jPanel1.add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 30, -1));

        A9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        A9.setName("A9"); // NOI18N
        A9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A9MouseClicked(evt);
            }
        });
        jPanel1.add(A9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 30, -1));

        A10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        A10.setName("A10"); // NOI18N
        A10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A10MouseClicked(evt);
            }
        });
        jPanel1.add(A10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 30, -1));

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        B1.setName("B1"); // NOI18N
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 30, -1));

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        B2.setName("B2"); // NOI18N
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 30, -1));

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        B3.setName("B3"); // NOI18N
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });
        jPanel1.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 30, -1));

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        B4.setName("B4"); // NOI18N
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });
        jPanel1.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 30, -1));

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        B5.setName("B5"); // NOI18N
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });
        jPanel1.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 30, -1));

        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        B6.setName("B6"); // NOI18N
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });
        jPanel1.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 30, -1));

        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        B7.setName("B7"); // NOI18N
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });
        jPanel1.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 30, -1));

        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        B8.setName("B8"); // NOI18N
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });
        jPanel1.add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 30, -1));

        B9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        B9.setName("B9"); // NOI18N
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9MouseClicked(evt);
            }
        });
        jPanel1.add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 30, -1));

        B10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        B10.setName("B10"); // NOI18N
        B10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B10MouseClicked(evt);
            }
        });
        jPanel1.add(B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 30, -1));

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        C1.setName("C1"); // NOI18N
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 30, -1));

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        C2.setName("C2"); // NOI18N
        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 30, -1));

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        C3.setName("C3"); // NOI18N
        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 30, -1));

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        C4.setName("C4"); // NOI18N
        jPanel1.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 30, -1));

        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        C5.setName("C5"); // NOI18N
        jPanel1.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 30, -1));

        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        C6.setName("C6"); // NOI18N
        jPanel1.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 30, -1));

        C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        C7.setName("C7"); // NOI18N
        jPanel1.add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, -1));

        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        C8.setName("C8"); // NOI18N
        jPanel1.add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 30, -1));

        C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        C9.setName("C9"); // NOI18N
        jPanel1.add(C9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 30, -1));

        C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        C10.setName("C10"); // NOI18N
        jPanel1.add(C10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 30, -1));

        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        D1.setName("D1"); // NOI18N
        jPanel1.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 30, -1));

        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        D2.setName("D2"); // NOI18N
        jPanel1.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 30, -1));

        D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        D3.setName("D3"); // NOI18N
        jPanel1.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 30, -1));

        D4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        D4.setName("D4"); // NOI18N
        jPanel1.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 30, -1));

        D5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        D5.setName("D5"); // NOI18N
        jPanel1.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 30, -1));

        D6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        D6.setName("D6"); // NOI18N
        jPanel1.add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 30, -1));

        D7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        D7.setName("D7"); // NOI18N
        jPanel1.add(D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 30, -1));

        D8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        D8.setName("D8"); // NOI18N
        jPanel1.add(D8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 30, -1));

        D9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        D9.setName("D9"); // NOI18N
        jPanel1.add(D9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 30, -1));

        D10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        D10.setName("D10"); // NOI18N
        jPanel1.add(D10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 30, -1));

        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        E1.setName("E1"); // NOI18N
        jPanel1.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 30, -1));

        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        E2.setName("E2"); // NOI18N
        jPanel1.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 30, -1));

        E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        E3.setName("E3"); // NOI18N
        jPanel1.add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 30, -1));

        E4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        E4.setName("E4"); // NOI18N
        jPanel1.add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 30, -1));

        E5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        E5.setName("E5"); // NOI18N
        jPanel1.add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 30, -1));

        E6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        E6.setName("E6"); // NOI18N
        jPanel1.add(E6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 30, -1));

        E7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        E7.setName("E7"); // NOI18N
        jPanel1.add(E7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 30, -1));

        E8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        E8.setName("E8"); // NOI18N
        jPanel1.add(E8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 30, -1));

        E9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        E9.setName("E9"); // NOI18N
        jPanel1.add(E9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 30, -1));

        E10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        E10.setName("E10"); // NOI18N
        jPanel1.add(E10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 30, -1));

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        F1.setName("F1"); // NOI18N
        jPanel1.add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 30, -1));

        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        F2.setName("F2"); // NOI18N
        jPanel1.add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 30, -1));

        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        F3.setName("F3"); // NOI18N
        jPanel1.add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 30, -1));

        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        F4.setName("F4"); // NOI18N
        jPanel1.add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 30, -1));

        F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        F5.setName("F5"); // NOI18N
        jPanel1.add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 30, -1));

        F6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        F6.setName("F6"); // NOI18N
        jPanel1.add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 30, -1));

        F7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        F7.setName("F7"); // NOI18N
        jPanel1.add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 30, -1));

        F8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        F8.setName("F8"); // NOI18N
        jPanel1.add(F8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 30, -1));

        F9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        F9.setName("F9"); // NOI18N
        jPanel1.add(F9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 30, -1));

        F10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        F10.setName("F10"); // NOI18N
        jPanel1.add(F10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 30, -1));

        G1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        G1.setName("G1"); // NOI18N
        jPanel1.add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 30, -1));

        G2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        G2.setName("G2"); // NOI18N
        jPanel1.add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 30, -1));

        G3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        G3.setName("G3"); // NOI18N
        jPanel1.add(G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 30, -1));

        G4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        G4.setName("G4"); // NOI18N
        jPanel1.add(G4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 30, -1));

        G5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        G5.setName("G5"); // NOI18N
        jPanel1.add(G5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 30, -1));

        G6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        G6.setName("G6"); // NOI18N
        jPanel1.add(G6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 30, -1));

        G7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        G7.setName("G7"); // NOI18N
        jPanel1.add(G7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 30, -1));

        G8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        G8.setName("G8"); // NOI18N
        jPanel1.add(G8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 30, -1));

        G9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        G9.setName("G9"); // NOI18N
        jPanel1.add(G9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 30, -1));

        G10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponible.png"))); // NOI18N
        G10.setName("G10"); // NOI18N
        jPanel1.add(G10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 30, -1));

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
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 40, 40));

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
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

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
        jPanel1.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 40));

        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.setText("Guardar");
        save.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 70, 30));

        pantalla.setBackground(new java.awt.Color(153, 153, 153));
        pantalla.setOpaque(true);
        jPanel1.add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 430, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
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

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(255, 255, 255));
        close.setIcon(new ImageIcon("src/imagenes/Delete_25px.png"));
    }//GEN-LAST:event_closeMouseExited

    private void topbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_topbarMouseDragged

    public static int x;
    public static int y;

    private void topbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_topbarMousePressed

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        DobleClick(evt, A1);
    }//GEN-LAST:event_A1MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        DobleClick(evt, A2);
    }//GEN-LAST:event_A2MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
        DobleClick(evt, A3);
    }//GEN-LAST:event_A3MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked

        DobleClick(evt, A4);
    }//GEN-LAST:event_A4MouseClicked

    private void A5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseClicked
        DobleClick(evt, A5);
    }//GEN-LAST:event_A5MouseClicked

    private void A6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseClicked
        DobleClick(evt, A6);;
    }//GEN-LAST:event_A6MouseClicked

    private void A9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A9MouseClicked
        DobleClick(evt, A9);
    }//GEN-LAST:event_A9MouseClicked

    private void A8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MouseClicked
        DobleClick(evt, A8);
    }//GEN-LAST:event_A8MouseClicked

    private void A7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MouseClicked
        DobleClick(evt, A7);
    }//GEN-LAST:event_A7MouseClicked

    private void A10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A10MouseClicked
        DobleClick(evt, A10);
    }//GEN-LAST:event_A10MouseClicked

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        DobleClick(evt, B1);
    }//GEN-LAST:event_B1MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        DobleClick(evt, B2);
    }//GEN-LAST:event_B2MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        DobleClick(evt, B3);
    }//GEN-LAST:event_B3MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        DobleClick(evt, B4);
    }//GEN-LAST:event_B4MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        DobleClick(evt, B5);
    }//GEN-LAST:event_B5MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        DobleClick(evt, B6);
    }//GEN-LAST:event_B6MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        DobleClick(evt, B7);
    }//GEN-LAST:event_B7MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        DobleClick(evt, B8);
    }//GEN-LAST:event_B8MouseClicked

    private void B9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseClicked
        DobleClick(evt, B9);
    }//GEN-LAST:event_B9MouseClicked

    private void B10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B10MouseClicked
        DobleClick(evt, B10);
    }//GEN-LAST:event_B10MouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        File f = new File("Sillas/" + HorariosSala.globalcode + ".txt");
        try {
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(f));
            bw2.write("");
            bw2.close();
        } catch (Exception e) {
            System.out.println("Mensaje: " + e.toString());
        }

        for (Silla x : sillas) {
            System.out.println(x.posicion.getName());
            try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new FileWriter(f, true));) {
                bw.write(x.posicion.getName() + "," + String.valueOf(x.state));
                bw.newLine();

            } catch (Exception e) {
                System.out.println(e.toString());
            }

        }
    }//GEN-LAST:event_saveMouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        
        HorariosSala h=new HorariosSala();
        this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_volverMouseClicked

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new Color(231, 231, 231));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_volverMouseExited

    void DobleClick(java.awt.event.MouseEvent evt, JLabel lbl) {
        if (evt.getClickCount() == 2) {
            for (Silla x : sillas) {

                if (x.posicion.equals(lbl)) {
                    if (x.state == true) {
                        x.state = false;
                        lbl.setIcon(new ImageIcon("src/imagenes/red.png"));
                    } else {
                        x.state = true;
                        lbl.setIcon(new ImageIcon("src/imagenes/disponible.png"));
                    }
                    System.out.println(x.state);
                }
            }
        }
    }

    void LlenarSillas() {
        for (Silla x : sillas) {
            if (x.state == true) {
                x.posicion.setIcon(new ImageIcon("src/imagenes/disponible.png"));
            } else {
                x.posicion.setIcon(new ImageIcon("src/imagenes/red.png"));
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A10;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel A5;
    private javax.swing.JLabel A6;
    private javax.swing.JLabel A7;
    private javax.swing.JLabel A8;
    private javax.swing.JLabel A9;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B10;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B9;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C10;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel C9;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D10;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JLabel D8;
    private javax.swing.JLabel D9;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E10;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel E7;
    private javax.swing.JLabel E8;
    private javax.swing.JLabel E9;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F10;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel F6;
    private javax.swing.JLabel F7;
    private javax.swing.JLabel F8;
    private javax.swing.JLabel F9;
    private javax.swing.JLabel G1;
    private javax.swing.JLabel G10;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel G3;
    private javax.swing.JLabel G4;
    private javax.swing.JLabel G5;
    private javax.swing.JLabel G6;
    private javax.swing.JLabel G7;
    private javax.swing.JLabel G8;
    private javax.swing.JLabel G9;
    private javax.swing.JLabel close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pantalla;
    private javax.swing.JLabel save;
    private javax.swing.JLabel title;
    private javax.swing.JLabel topbar;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
