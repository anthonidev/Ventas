
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
    
}
