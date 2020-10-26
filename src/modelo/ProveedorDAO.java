
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAO {
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public String IdProductos(){
        String idv="";
        String sql="select max(IdProveedor) from Proveedor";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                idv=rs.getString(1);
            }
            
        } catch (Exception e) {
        }
        return idv;
    }
    
     public Proveedor listarID(String IdProveedor){
        Proveedor p=new Proveedor();
       String sql="select * from Proveedor where IdProveedor=?" ;
        try {
            
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, IdProveedor);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setIdProveedor(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setTelefono(rs.getString(3));
                p.setDireccion(rs.getString(4));
            }
        } catch (Exception e) {
        }
            return p;
    }
    public List listar() {
        List<Proveedor> lista =new ArrayList<>();
        String sql="select * from Proveedor";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Proveedor p=new Proveedor();
                p.setIdProveedor(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setTelefono(rs.getString(3));
                p.setDireccion(rs.getString(4));
                
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int add(Object[] o) {
        int r=0;
        String  sql="insert into Proveedor(IdProveedor,Nombre,Telefono,Direccion)values(?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public int actualizar(Object[] o) {
        int r=0;
        String sql="update Proveedor set Nombre=?,Telefono=?,Direccion=? where IdProveedor=?" ;
        try {
             con=cn.Conectar();
              ps=con.prepareStatement(sql);
              ps.setObject(1, o[0]);
              ps.setObject(2, o[1]);
              ps.setObject(3, o[2]);
              ps.setObject(4, o[3]);
              
             
              r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public void eliminar(String IdProveedor) {
        
        String sql="delete from Proveedor where IdProveedor=?" ;
        try {
            con=cn.Conectar();
              ps=con.prepareStatement(sql);
              ps.setString(1, IdProveedor);
              ps.executeUpdate();
        } catch (Exception e) {
        }
       
    }
    
}
