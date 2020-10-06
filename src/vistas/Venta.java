/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import vistas.Menu;

/**
 *
 * @author anthoni
 */
public class Venta extends javax.swing.JFrame {

    /**
     * Creates new form Venta
     */
    public Venta() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        PanelVentas.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelVentas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        PanelVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setText("N° DE SERIE");
        PanelVentas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        PanelVentas.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 180, 40));

        jTextField2.setBackground(new java.awt.Color(162, 162, 151));
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        PanelVentas.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 380, 30));
        PanelVentas.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 130, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/B.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BP.png"))); // NOI18N
        PanelVentas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "COD", "PRODUCTO", "CANTIDAD", "PRECIO UNI", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        PanelVentas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 810, 560));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel2.setText("COD. Cliente:");
        PanelVentas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel5.setText("Cantidad:");
        PanelVentas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, -1, -1));

        jTextField6.setBackground(new java.awt.Color(162, 162, 151));
        jTextField6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelVentas.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 380, 30));
        PanelVentas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 220, 10));

        jTextField5.setBackground(new Color(0,0,0,0));
        jTextField5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField5.setBorder(null);
        PanelVentas.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 130, 40));

        jTextField4.setBackground(new Color(0,0,0,0));
        jTextField4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField4.setBorder(null);
        PanelVentas.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 220, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel6.setText("Precio:");
        PanelVentas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setText("COD. Producto:");
        PanelVentas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar1.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Limpiar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelVentas.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 790, -1, -1));

        jTextField3.setBackground(new Color(0,0,0,0));
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField3.setBorder(null);
        PanelVentas.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 220, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/B.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BP.png"))); // NOI18N
        PanelVentas.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PanelVentas.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, 70, 40));

        jButton3.setBackground(new Color(0,0,0,0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setOpaque(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarp.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarF.png"))); // NOI18N
        PanelVentas.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 710, -1, -1));
        PanelVentas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 220, 10));

        jTextField7.setBackground(new java.awt.Color(153, 153, 153));
        jTextField7.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("15");
        jTextField7.setBorder(null);
        PanelVentas.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 780, 140, 50));

        jButton7.setBackground(new Color(0,0,0,0));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setOpaque(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        PanelVentas.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 50, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VE1.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setOpaque(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VE.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PanelVentas.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 790, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Total a Pagar:");
        PanelVentas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 790, -1, -1));

        jButton6.setBackground(new Color(0,0,0,0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-C.png"))); // NOI18N
        jButton6.setText("x");
        jButton6.setBorder(null);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setOpaque(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-CEP.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        PanelVentas.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 20, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PanelVentas.png"))); // NOI18N
        PanelVentas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        getContentPane().add(PanelVentas);
        PanelVentas.setBounds(0, 0, 1370, 910);

        setSize(new java.awt.Dimension(1353, 901));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         Menu mn = new Menu();
        mn.setVisible(true);
                dispose();
        
    }//GEN-LAST:event_jButton7ActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}