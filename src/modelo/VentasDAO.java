
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentasDAO {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    public String IdVentas(){
        String idv="";
        String sql="select max(idVentas) from Ventas";
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
    public String IdDetalle(){
        String idv="";
        String sql="select max(idDetalleventa) from DetalleVenta";
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
    
    
    public int GuradarVEntas(Ventas v){
        Ventas ventas=new Ventas();
        String sql="insert into Ventas(idVentas,idCliente,FechaVenta,Monto)values(?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, v.getIdVentas());
            ps.setString(2, v.getIdCliente());
            ps.setString(3, v.getFechaVenta());
            ps.setDouble(4, v.getMonto());
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public int GuardarDetalleVentas(DetalleVentas dv){
        Ventas ventas=new Ventas();
        String sql="insert into DetalleVenta(idDetalleventa,idVentas,idProducto,cantidad,precioventa)values(?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dv.getIdDetalleventa());
            ps.setString(2, dv.getIdVentas());
            ps.setString(3, dv.getIdProducto());
            ps.setInt(4, dv.getCantidad());
            ps.setDouble(5, dv.getPrecioventa());
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public List listar() {
        List<Ventas> lista =new ArrayList<>();
        String sql="select * from Ventas";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Ventas v=new Ventas();
                v.setIdVentas(rs.getString(1));
                v.setIdCliente(rs.getString(2));
                v.setFechaVenta(rs.getString(3));
                v.setMonto(rs.getDouble(4));
                
                lista.add(v);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public List listardetalle() {
        List<DetalleVentas> lista =new ArrayList<>();
        String sql="select * from DetalleVenta";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                DetalleVentas v=new DetalleVentas();
                v.setIdDetalleventa(rs.getString(1));
                v.setIdVentas(rs.getString(2));
                v.setIdProducto(rs.getString(3));
                v.setCantidad(rs.getInt(4));
                v.setPrecioventa(rs.getDouble(5));
                
                lista.add(v);
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
