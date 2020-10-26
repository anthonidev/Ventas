package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    
     public String IdProductos(){
        String idv="";
        String sql="select max(idProducto) from Producto";
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
    public Producto listarID(String idProducto) {
        Producto pr = new Producto();
        String sql = "select * from Producto where idProducto=?";
        try {

            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, idProducto);
            rs = ps.executeQuery();
            while (rs.next()) {

                pr.setIdProducto(rs.getString(1));
                pr.setNombre(rs.getString(2));
                pr.setDescripcion(rs.getString(3));
                pr.setIdProveedor(rs.getString(4));
                pr.setPrecio(rs.getDouble(5));
                pr.setStock(rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return pr;
    }

    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from Producto";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pr = new Producto();
                pr.setIdProducto(rs.getString(1));
                pr.setNombre(rs.getString(2));
                pr.setDescripcion(rs.getString(3));
                pr.setIdProveedor(rs.getString(4));
                pr.setPrecio(rs.getDouble(5));
                pr.setStock(rs.getInt(6));

                lista.add(pr);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into Producto(IdProducto,nombre,Descripcion,idProveedor,precio,Stock)values(?,?,?,?,?,?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update Producto set nombre=?,Descripcion=?,idProveedor=?,precio=?,Stock=? where IdProducto=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);

            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public void eliminar(String IdProducto) {

        String sql = "delete from Producto where IdProducto=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, IdProducto);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
}
