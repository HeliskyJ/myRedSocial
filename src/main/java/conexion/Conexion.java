/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author menzm
 */
public class Conexion {
    private static Connection con;
    private static String stringConexion;
    private static boolean conected = false;
    
    public static Connection getConexion(){
        
        try{ Class.forName("com.mysql.jdbc.Driver");
        stringConexion = "jdbc:mysql://localhost:3306/fb2?useSSL=false";
        
        con = DriverManager.getConnection(stringConexion,"root", "hely12345");
        conected = true;
        return con;
        
    } catch(ClassNotFoundException | SQLException ex) {
        System.out.println("Error MIO"+ ex.getMessage());
        return null;
    }
  }
    public static void close() throws SQLException{
        if (conected== true){
            con.close();
        }
    }
}


