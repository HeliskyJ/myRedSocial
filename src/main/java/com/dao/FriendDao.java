/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clase.myred.Friendship;
import com.clase.myred.Post;
import com.clase.myred.User;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hely
 */
public class FriendDao {
     public static List<Friendship> getAll() throws SQLException{
        List<Friendship> fs;
        fs = new ArrayList<>();
        
       
        String sql = "SELECT user.id, user_name, password, first_name, last_name, post.id, message FROM  user, post, friendship where friendship.user2_id=user.id and post.user_id=user.id and friendship.user2_id=user.id ";
        
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                fs.add( new Friendship(
                        new User(rs.getInt("id"), rs.getString("user_name"), rs.getString("password"), rs.getString("first_name"), rs.getString("last_name")),
                        new Post(rs.getInt("id"), rs.getString("message"), new User(rs.getInt("id"), rs.getString("user_name"), rs.getString("password"), rs.getString("first_name"), rs.getString("last_name")))
                )
                 );
            }
            return fs;
            
        }catch(SQLException e){
            System.out.println("Error de Conexión");
            return null;
        }
    }
    
    public static boolean add(int usu , int pos, boolean activ) {
        Connection con;
                java.util.Date ahora = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
  
        String sql = "insert into friendship (user1_id, user2_id,friendship_date, is_activate)"
            + " values ('"
            + usu + "','"
            + pos + "', '"
            + sdf.format(ahora) + "', '"
            + activ + "')";
        
 
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
        }

