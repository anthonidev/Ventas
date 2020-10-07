
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
   Connection con;
   String url="jdbc:mysql://localhost:3306/Ventas";
   String user="root";
   String pass="Toni211299";
   public Connection Conectar(){
       try {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection(url,user,pass);
           
       } catch (Exception e) {
       }
       return con;
   }
   
}
