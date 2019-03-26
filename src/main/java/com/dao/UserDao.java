/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clase.myred.User;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hely
 */
public class UserDao {
    public static User getUser(String useri) {
   
       
        String sql = "SELECT id, user_name, password FROM user WHERE user_name='"+ useri +"'";
        
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
       rs.first();
                User usero;
            usero = new User(
                    rs.getInt("id"),
                    rs.getString("user_name"),
                    rs.getString("password")
                    
            );
            
            return usero;
      
        }catch(SQLException e){
            System.out.println("Error al hacer el select " + e);
            return null;
        }
       
    }
    
    public static boolean add(User us) {
        Connection con;
        java.util.Date ahora = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String sql = "insert into user (id,user_name, password, first_name, last_name, created)"
            + " values ('"
            + us.getId() + "','"
            + us.getUser_name() + "', '"
            + us.getPassword() + "', '"
            + us.getFirst_name() + "','"
            + us.getLast_name() + "','"
            + sdf.format(ahora) + "')";
 
        try {
            con = Conexion.getConexion();
            Statement stmt = (Statement) con.createStatement();
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            System.out.println("error DB: " + ex.getMessage());
            return false;
        }                 
    }

  public static List<User> getAll(){
        List<User> listUser;
        listUser = new ArrayList<>();
        
       
       String sql = "SELECT id, user_name, first_name, last_name, password FROM user";
        
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                listUser.add( new User(
                        rs.getInt("id"),
                        rs.getString("user_name"),
                        rs.getString("password"),
                        rs.getString("last_name"),
                        rs.getString("password")
                    )
                );
            }
            return listUser;
            
        }catch(SQLException e){
            System.out.println("Error de getAll");
            return null;
        }
    }
    
            
}
