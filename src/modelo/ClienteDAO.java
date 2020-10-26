/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author anthoni
 */
public class ClienteDAO implements CRUD {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
public String IdCliente(){
        String idv="";
        String sql="select max(IdCliente) from Cliente";
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
    
    public Cliente listarID(String DNI){
        Cliente c=new Cliente();
       String sql="select * from Cliente where DNI=?" ;
        try {
            
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, DNI);
            rs=ps.executeQuery();
            while(rs.next()){
                
                c.setIdCliente(rs.getString(1));
                c.setDNI(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setNumero(rs.getString(5));
                c.setSexo(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return c;
    }
    public List listar() {
        List<Cliente> lista =new ArrayList<>();
        String sql="select * from Cliente";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente c=new Cliente();
                c.setIdCliente(rs.getString(1));
                c.setDNI(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setNumero(rs.getString(5));
                c.setSexo(rs.getString(6));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String  sql="insert into Cliente(IdCliente,DNI,Nombre,Apellido,Numero,Sexo)values(?,?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update Cliente set DNI=?,Nombre=?,Apellido=?,Numero=?,Sexo=? where idCliente=?" ;
        try {
             con=cn.Conectar();
              ps=con.prepareStatement(sql);
              ps.setObject(1, o[0]);
              ps.setObject(2, o[1]);
              ps.setObject(3, o[2]);
              ps.setObject(4, o[3]);
              ps.setObject(5, o[4]);
              ps.setObject(6, o[5]);
              r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(String idCliente) {
        
        String sql="delete from Cliente where idCliente=?" ;
        try {
            con=cn.Conectar();
              ps=con.prepareStatement(sql);
              ps.setString(1, idCliente);
              ps.executeUpdate();
        } catch (Exception e) {
        }
       
    }
    
    
}
