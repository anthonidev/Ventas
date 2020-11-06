
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con=new Conexion();
    Connection acceso;
    
     
    
    
    
    public EntidadUsuario ValidadUsuario(String usuario, String clave){
            EntidadUsuario eu=new EntidadUsuario();

        String sql="select * from Usuario where usuario=? and  clave=?";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            rs=ps.executeQuery();
            while(rs.next()){
                eu.setUsuario(rs.getString(1));
                eu.setClave(rs.getString(2));
                eu.setIdNivel(rs.getString(3));
                eu.setIdEmpleado(rs.getString(4));
                eu.setMode(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return eu;
    }
    
    
   public int agregar(Object[] ob) {
        int r=0;
        String  sql="insert into Usuario(usuario,clave,idNivel,IdEmpleado,mode)values(?,?,?,?,?)";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, ob[3]);
            ps.setObject(5, ob[4]);
           
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
   
    public void eliminarUsuario(String IdEmpleado) {
        
        String sql="delete from Usuario where IdEmpleado=?" ;
        try {
            acceso=con.Conectar();
              ps=acceso.prepareStatement(sql);
              ps.setString(1,IdEmpleado);
              ps.executeUpdate();
        } catch (Exception e) {
        }
       
    }
    
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update Usuario set clave=?,idNivel=?,IdEmpleado=?,mode=? where usuario=?";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);

            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public int actualizaru(Object[] o) {
        int r = 0;
        String sql = "update Usuario set usuario=?,clave=?,idNivel=?,idEmpleado=?,mode=? where IdEmpleado=?";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);

            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}
