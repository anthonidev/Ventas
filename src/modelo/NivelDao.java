/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author anthoni
 */
public class NivelDao {
    
    
    
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Nivel listarID(String idNivel){
        Nivel c=new Nivel();
       String sql="select * from Nivel where idNivel=?" ;
        try {
            
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, idNivel);
            rs=ps.executeQuery();
            while(rs.next()){
                
                c.setIdNivel(rs.getString(1));
                c.setNivel(rs.getString(2));
                
            }
        } catch (Exception e) {
        }
        return c;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
