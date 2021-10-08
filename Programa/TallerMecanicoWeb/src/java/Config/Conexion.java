/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author richa
 */
public class Conexion {
    private Connection con;
    
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
         
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tallermecanico","root","534444");
            System.out.println("Conexion realizada");
        } catch (Exception e) {
            System.out.println("Error");
       }
        
    
    }
    public Connection getConnection(){
          return con;  
        }
}
