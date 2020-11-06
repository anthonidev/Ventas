/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.ProductoDAO;
import modelo.Proveedor;
import modelo.ProveedorDAO;
import vistas.Menu;

/**
 *
 * @author anthoni
 */
public class Productos extends javax.swing.JFrame {

    ProductoDAO dao = new ProductoDAO();
    ProveedorDAO Pdao = new ProveedorDAO();
    Producto pr = new Producto();

    DefaultTableModel modelo = new DefaultTableModel();
    public String modo;
    public Productos() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        PanelCli.setBackground(new Color(0, 0, 0, 0));
        iniciar();
        fechaActual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCli = new javax.swing.JPanel();
        actualizar = new javax.swing.JButton();
        Elimnar = new javax.swing.JButton();
        txtidProvedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        JsStock = new javax.swing.JSpinner();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtidProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        PanelCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actualizar.setBackground(new Color(0,0,0,0));
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizarpack.png"))); // NOI18N
        actualizar.setBorder(null);
        actualizar.setOpaque(false);
        actualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        PanelCli.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 760, 231, 64));

        Elimnar.setBackground(new Color(0,0,0,0));
        Elimnar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ELiminarpack.png"))); // NOI18N
        Elimnar.setBorder(null);
        Elimnar.setOpaque(false);
        Elimnar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminarpack1.png"))); // NOI18N
        Elimnar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimnarActionPerformed(evt);
            }
        });
        PanelCli.add(Elimnar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 760, 231, 64));

        txtidProvedor.setBackground(new Color(0,0,0,0));
        txtidProvedor.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtidProvedor.setBorder(null);
        txtidProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidProvedorActionPerformed(evt);
            }
        });
        txtidProvedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidProvedorKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidProvedorKeyReleased(evt);
            }
        });
        PanelCli.add(txtidProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 150, 30));

        txtNombreProveedor.setBackground(new Color(0,0,0,0));
        txtNombreProveedor.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNombreProveedor.setBorder(null);
        PanelCli.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 384, 310, 30));

        txtPrecio.setBackground(new Color(0,0,0,0));
        txtPrecio.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtPrecio.setBorder(null);
        PanelCli.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 445, 80, 30));

        agregar.setBackground(new Color(0,0,0,0));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar.png"))); // NOI18N
        agregar.setBorder(null);
        agregar.setOpaque(false);
        agregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarP.png"))); // NOI18N
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        PanelCli.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 760, 231, 64));

        jButton2.setBackground(new Color(0,0,0,0));
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 40, 30));

        txtNombre.setBackground(new Color(0,0,0,0));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        PanelCli.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 235, 260, 30));

        tabla.setBackground(new java.awt.Color(242, 152, 114));
        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDPRODUCTO", "NOMBRE", "Descripcion", "IDPROVEDOR", "PRECIO", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setOpaque(false);
        tabla.setRequestFocusEnabled(false);
        tabla.setSelectionBackground(new java.awt.Color(145, 255, 242));
        tabla.setSelectionForeground(new java.awt.Color(166, 82, 45));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        PanelCli.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 800, 570));

        jButton3.setBackground(new Color(0,0,0,0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setOpaque(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        JsStock.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        PanelCli.add(JsStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 90, 30));

        jButton7.setBackground(new Color(0,0,0,0));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-C.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setOpaque(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-CEP.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtDescripcion.setBackground(new Color(0,0,0,0));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setRows(5);
        txtDescripcion.setCaretColor(new java.awt.Color(0, 153, 153));
        txtDescripcion.setOpaque(false);
        jScrollPane2.setViewportView(txtDescripcion);

        PanelCli.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 360, 170));

        jButton1.setBackground(new Color(0,0,0,0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/goprov.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/goprovf.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 908, -1, 120));

        jButton4.setBackground(new Color(0,0,0,0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iraVentas.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sombrairVentas.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 908, -1, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ProductosPanel.png"))); // NOI18N
        PanelCli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1360, 1070));
        PanelCli.add(txtidProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 160, 40));

        getContentPane().add(PanelCli);
        PanelCli.setBounds(0, 0, 1360, 1080);

        setSize(new java.awt.Dimension(1365, 1074));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        mn.mode=modo;
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtidProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidProvedorActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        agregar();
        limpiar();
        iniciar();
        fechaActual();
        nuevo();
    }//GEN-LAST:event_agregarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        actualizar();
        limpiar();
        iniciar();
        fechaActual();
        nuevo();
    }//GEN-LAST:event_actualizarActionPerformed

    private void ElimnarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimnarActionPerformed
        eliminar();
        limpiar();
        iniciar();
        fechaActual();
        nuevo();
    }//GEN-LAST:event_ElimnarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {

            String idProducto = tabla.getValueAt(fila, 0).toString();
            String nombre = tabla.getValueAt(fila, 1).toString();
            String descripcion = tabla.getValueAt(fila, 2).toString();
            String idprovedor = tabla.getValueAt(fila, 3).toString();
            String precio = tabla.getValueAt(fila, 4).toString();
            int Stock = (int) tabla.getValueAt(fila, 5);

            txtidProduto.setText(idProducto);
            txtNombre.setText(nombre);
            txtidProvedor.setText(idprovedor);
            txtPrecio.setText(precio);
            txtDescripcion.setText(descripcion);
            JsStock.setValue(Stock);
            buscarProveedor() ;
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscarProveedor();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtidProvedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidProvedorKeyReleased
       if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            buscarProveedor() ;
        }
    }//GEN-LAST:event_txtidProvedorKeyReleased

    private void tablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMouseEntered

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Venta Vt = new Venta();
        Vt.setVisible(true);
         Vt.modo=modo;
                dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Proveedores p = new Proveedores();
        p.setVisible(true);
         p.modo=modo;
                dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Diseño();
    }//GEN-LAST:event_formWindowActivated

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
       char TipoTecla=evt.getKeyChar();
        if(Character.isDigit(TipoTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtidProvedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidProvedorKeyTyped
         if( txtidProvedor.getText().length()==5){
            evt.consume();
        }
        
        char TipoTecla=evt.getKeyChar();
        if(!Character.isDigit(TipoTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtidProvedorKeyTyped

    void buscarProveedor() {
        int r;
        String cod = txtidProvedor.getText();
        if (txtidProvedor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "debe ingresar cod cliente");
        } else {
            Proveedor Proveedor = Pdao.listarID(cod);
            if (Proveedor.getIdProveedor() != null) {
                txtNombreProveedor.setText(Proveedor.getNombre());
                txtPrecio.requestFocus();
            } else {
                r = JOptionPane.showConfirmDialog(this, "Cliente no registrado, Desea registrar");
                if (r == 0) {
                    Proveedores Pv = new Proveedores();
                    Pv.setVisible(true);
                    dispose();
                }
            }
        }
    }
     void Diseño(){
    if("0".equals(modo)){
             jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ProductosPanel.png"))); // NOI18N
         }else if("1".equals(modo)){
              jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productoClaro.png"))); // NOI18N
         }else if("2".equals(modo)){
              jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ProductoDarkV.png"))); // NOI18N
         }else {
              jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ProductoDarkM.png"))); // NOI18N
         }
}

    void iniciar() {
        listar();
        idAleatorio();
        txtidProduto.setVisible(false);
       txtNombreProveedor.setEditable(false);


    }

    void fechaActual() {

        String dia, mes, año;
        Calendar c = Calendar.getInstance();

        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        año = Integer.toString(c.get(Calendar.YEAR));

//        txtFechaHoy.setText(año+"-"+mes+"-"+dia);
    }

    void agregar() {
        String idProducto = txtidProduto.getText();
        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        String idProvedor = txtidProvedor.getText();
        String pre = txtPrecio.getText();
        double precio = Double.parseDouble(pre);
        int Stock = (int) JsStock.getValue();

        Object[] ob = new Object[6];
        ob[0] = idProducto;
        ob[1] = nombre;
        ob[2] = descripcion;
        ob[3] = idProvedor;
        ob[4] = precio;
        ob[5] = Stock;

        dao.add(ob);
    }

    void idAleatorio() {
        String idcli=dao.IdProductos();
        int id=Integer.valueOf(idcli);
       txtidProduto.setText(Integer.toString(id+1));
    
    }

    void actualizar() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            String idProducto = txtidProduto.getText();
            String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            String idProvedor = txtidProvedor.getText();
            String pre = txtPrecio.getText();
            double precio = Double.parseDouble(pre);
            int Stock = (int) JsStock.getValue();

            Object[] ob = new Object[6];
            ob[5] = idProducto;
            ob[0] = nombre;
            ob[1] = descripcion;
            ob[2] = idProvedor;
            ob[3] = precio;
            ob[4] = Stock;

            dao.actualizar(ob);

        }

    }

    void eliminar() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            String idProducto = tabla.getValueAt(fila, 0).toString();
            dao.eliminar(idProducto);
        }
    }

    void listar() {
        List<Producto> lista = dao.listar();
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdProducto();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getDescripcion();
            ob[3] = lista.get(i).getIdProveedor();
            ob[4] = lista.get(i).getPrecio();
            ob[5] = lista.get(i).getStock();

            modelo.addRow(ob);
        }

        tabla.setModel(modelo);
    }

    void nuevo() {
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtidProvedor.setText("");
        txtNombreProveedor.setText("");
        txtPrecio.setText("");
        txtNombre.requestFocus();

    }

    void limpiar() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Elimnar;
    private javax.swing.JSpinner JsStock;
    private javax.swing.JPanel PanelCli;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtidProduto;
    private javax.swing.JTextField txtidProvedor;
    // End of variables declaration//GEN-END:variables
}
