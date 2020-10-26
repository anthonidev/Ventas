package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
   
    public String IdEmpleado(){
        String idv="";
        String sql="select max(IdEmpleado) from Empleado";
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
    
    
 public Empleado listarDNI(String IdEmpleado){
        Empleado em=new Empleado();
       String sql="select * from Empleado where DNI=?" ;
        try {
            
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, IdEmpleado);
            rs=ps.executeQuery();
            while(rs.next()){
                
                em.setIdEmpleado(    rs.getString(1));
                em.setDNI(rs.getString(2));
                em.setNombre(rs.getString(3));
                em.setApellido(rs.getString(4));
                em.setNumero(rs.getString(5));
                em.setFechaNa(rs.getString(6));
                em.setFechaIng(rs.getString(7));
                em.setIdCategoria(rs.getString(8));
                em.setSexo(rs.getString(9));
                
            }
        } catch (Exception e) {
        }
        return em;
    }   
 public List listarEmpleado() {
        List<Empleado> lista =new ArrayList<>();
        String sql="select * from Empleado";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Empleado em=new Empleado();
                em.setIdEmpleado(    rs.getString(1));
                em.setDNI(rs.getString(2));
                em.setNombre(rs.getString(3));
                em.setApellido(rs.getString(4));
                em.setNumero(rs.getString(5));
                em.setFechaNa(rs.getString(6));
                em.setFechaIng(rs.getString(7));
                em.setIdCategoria(rs.getString(8));
                em.setSexo(rs.getString(9));
                lista.add(em);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int add(Object[] o) {
        int r=0;
        String  sql="insert into Empleado(IdEmpleado,DNI,Nombre,Apellido,Numero,FechaNa,FechaIng,IdCategoria,sexo)values(?,?,?,?,?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public int actualizarEmpleado(Object[] o) {
        int r=0;
        String sql="update Empleado set DNI=?,Nombre=?,Apellido=?,Numero=?,FechaNa=?,FechaIng=?,IdCategoria=?,sexo=? where IdEmpleado=?" ;
        try {
             con=cn.Conectar();
              ps=con.prepareStatement(sql);
              ps.setObject(1, o[0]);
              ps.setObject(2, o[1]);
              ps.setObject(3, o[2]);
              ps.setObject(4, o[3]);
              ps.setObject(5, o[4]);
              ps.setObject(6, o[5]);
              ps.setObject(7, o[6]);
              ps.setObject(8, o[7]);
              ps.setObject(9, o[8]);
              r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public void eliminarEmpleado(String IdEmpleado) {
        
        String sql="delete from Empleado where IdEmpleado=?" ;
        try {
            con=cn.Conectar();
              ps=con.prepareStatement(sql);
              ps.setString(1,IdEmpleado);
              ps.executeUpdate();
        } catch (Exception e) {
        }
       
    }
    
}
