/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
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

    ProductoDAO dao=new ProductoDAO();
    ProveedorDAO Pdao=new ProveedorDAO();
    Producto pr=new Producto();
    
    DefaultTableModel modelo= new DefaultTableModel();
    public Productos() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        PanelCli.setBackground(new Color(0,0,0,0));
        iniciar();
        fechaActual();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCli = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        actualizar = new javax.swing.JButton();
        Elimnar = new javax.swing.JButton();
        txtidProvedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        agregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtidProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        PanelCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(166, 163, 111));
        PanelCli.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 170, 20));

        actualizar.setBackground(new Color(0,0,0,0));
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bnt-actualizar.png"))); // NOI18N
        actualizar.setBorder(null);
        actualizar.setOpaque(false);
        actualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-actualizarP.png"))); // NOI18N
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        PanelCli.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 180, 50));

        Elimnar.setBackground(new Color(0,0,0,0));
        Elimnar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-eliminarcli.png"))); // NOI18N
        Elimnar.setBorder(null);
        Elimnar.setOpaque(false);
        Elimnar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-eliminarcliP.png"))); // NOI18N
        Elimnar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimnarActionPerformed(evt);
            }
        });
        PanelCli.add(Elimnar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 180, 180, 50));

        txtidProvedor.setBackground(new Color(0,0,0,0));
        txtidProvedor.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtidProvedor.setBorder(null);
        txtidProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidProvedorActionPerformed(evt);
            }
        });
        PanelCli.add(txtidProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 170, 40));

        txtNombreProveedor.setBackground(new java.awt.Color(0, 102, 102));
        txtNombreProveedor.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNombreProveedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelCli.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 310, 40));

        jSeparator4.setForeground(new java.awt.Color(166, 163, 111));
        PanelCli.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 310, 20));

        txtPrecio.setBackground(new Color(0,0,0,0));
        txtPrecio.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtPrecio.setBorder(null);
        PanelCli.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 310, 40));

        jSeparator5.setForeground(new java.awt.Color(166, 163, 111));
        PanelCli.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 310, 20));

        agregar.setBackground(new Color(0,0,0,0));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AGREGAR.png"))); // NOI18N
        agregar.setBorder(null);
        agregar.setOpaque(false);
        agregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AGREGARp.png"))); // NOI18N
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        PanelCli.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 180, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(166, 163, 111));
        jLabel2.setText("IdProvedor:");
        PanelCli.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 170, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(166, 163, 111));
        jLabel4.setText("Nombre:");
        PanelCli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 130, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/B.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        txtNombre.setBackground(new Color(0,0,0,0));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNombre.setBorder(null);
        PanelCli.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 310, 40));

        tabla.setBackground(new java.awt.Color(255, 255, 204));
        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setForeground(new java.awt.Color(102, 102, 102));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDPRODUCTO", "NOMBRE", "Descripcion", "IDPROVEDOR", "PRECIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        PanelCli.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 720, 490));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(166, 163, 111));
        jLabel6.setText("Descripcion:");
        PanelCli.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 210, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(166, 163, 111));
        jLabel5.setText("Precio:");
        PanelCli.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 100, 30));

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
        PanelCli.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, -1, -1));

        jButton7.setBackground(new Color(0,0,0,0));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-C.png"))); // NOI18N
        jButton7.setText("x");
        jButton7.setBorder(null);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setOpaque(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-CEP.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 20, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        PanelCli.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 350, 160));
        PanelCli.add(txtidProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Panelproductos.png"))); // NOI18N
        PanelCli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PanelCli);
        PanelCli.setBounds(0, 0, 1370, 920);

        setSize(new java.awt.Dimension(1349, 904));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
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
       int fila=tabla.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Seleccione una fila");
        }else{
            
         
           String idProducto=tabla.getValueAt(fila, 0).toString();
           String nombre=tabla.getValueAt(fila, 1).toString();
           String descripcion=tabla.getValueAt(fila, 2).toString();
           String idprovedor=tabla.getValueAt(fila, 3).toString();
           String precio=tabla.getValueAt(fila, 4).toString();
           
           
        
        txtidProduto.setText(idProducto);
        txtNombre.setText(nombre);
        txtidProvedor.setText(idprovedor);
        txtPrecio.setText(precio);
        txtDescripcion.setText(descripcion);
      buscarProveedor();
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscarProveedor();
    }//GEN-LAST:event_jButton2ActionPerformed

    void buscarProveedor(){
        int r;
        String cod=txtidProvedor.getText();
        if(txtidProvedor.getText().equals("")){
            JOptionPane.showMessageDialog(this, "debe ingresar cod cliente");
        }else{
            Proveedor Proveedor=Pdao.listarID(cod);
            if(Proveedor.getIdProveedor()!=null){
                txtNombreProveedor.setText(Proveedor.getNombre());
                txtPrecio.requestFocus();
            }else{
                            r=JOptionPane.showConfirmDialog(this, "Cliente no registrado, Desea registrar");
                            if(r==0){
                                Proveedores Pv = new Proveedores();
                                    Pv.setVisible(true);
                                dispose();
                            }
            }
        }
    }
    
    void iniciar(){
       listar();
       idAleatorio();
       txtidProduto.setVisible(false);
   }
    void fechaActual(){
        
        String dia,mes,año;
        Calendar c= Calendar.getInstance();
        
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH)+1);
        año = Integer.toString(c.get(Calendar.YEAR));
        
//        txtFechaHoy.setText(año+"-"+mes+"-"+dia);
        
    }
    
    void agregar(){
        String idProducto=txtidProduto.getText();
        String nombre=txtNombre.getText();
        String descripcion=txtDescripcion.getText();
        String idProvedor=txtidProvedor.getText();
        String pre=txtPrecio.getText();
        double precio = Double.parseDouble(pre);
        
        Object[] ob=new Object[5];
        ob[0]=idProducto;
        ob[1]=nombre;
        ob[2]=descripcion;
        ob[3]=idProvedor;
        ob[4]=precio;
        
         dao.add(ob);
    }
    
    void idAleatorio(){
        int numero = ThreadLocalRandom.current().nextInt(10000, 99999 + 1);
        txtidProduto.setText(Integer.toString(numero));
        txtidProduto.setEditable(false);
        txtidProduto.setEnabled(false);
    }
    
  
        
    void actualizar(){
        int fila=tabla.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Seleccione una fila");
        }else{
            String idProducto=txtidProduto.getText();
        String nombre=txtNombre.getText();
        String descripcion=txtDescripcion.getText();
        String idProvedor=txtidProvedor.getText();
        String pre=txtPrecio.getText();
        double precio = Double.parseDouble(pre);
        
        Object[] ob=new Object[5];
            ob[4]=idProducto;
            ob[0]=nombre;
            ob[1]=descripcion;
            ob[2]=idProvedor;
            ob[3]=precio;

        
         dao.actualizar(ob);
         System.out.println("exito");
        }      
       
    }
    void eliminar(){
         int fila=tabla.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Seleccione una fila");
        }else{
            String idProducto=tabla.getValueAt(fila, 0).toString();
            dao.eliminar(idProducto);
        }
    }
    void listar(){
        List<Producto> lista=dao.listar();
        modelo=(DefaultTableModel)tabla.getModel();
        Object[]ob=new Object[5];
        for(int i=0;i< lista.size();i++){
            ob[0]=lista.get(i).getIdProducto();
            ob[1]=lista.get(i).getNombre(); 
            ob[2]=lista.get(i).getDescripcion(); 
            ob[3]=lista.get(i).getIdProveedor();
            ob[4]=lista.get(i).getPrecio();
            
            modelo.addRow(ob);
        }
        
        tabla.setModel(modelo);
    }
    void nuevo(){
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtidProvedor.setText("");
        txtNombreProveedor.setText("");
        txtPrecio.setText("");
        txtNombre.requestFocus();
        
        
    }
    void limpiar(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Elimnar;
    private javax.swing.JPanel PanelCli;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtidProduto;
    private javax.swing.JTextField txtidProvedor;
    // End of variables declaration//GEN-END:variables
}
