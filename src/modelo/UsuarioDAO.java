
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
            }
        } catch (Exception e) {
        }
        return eu;
    }
    
    
   public int agregar(Object[] ob) {
        int r=0;
        String  sql="insert into Usuario(usuario,clave,idNivel,IdEmpleado)values(?,?,?,?)";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setObject(1, ob[0]);
            ps.setObject(2, ob[1]);
            ps.setObject(3, ob[2]);
            ps.setObject(4, ob[3]);
           
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
              ps.setString(4,IdEmpleado);
              ps.executeUpdate();
        } catch (Exception e) {
        }
       
    }
}
