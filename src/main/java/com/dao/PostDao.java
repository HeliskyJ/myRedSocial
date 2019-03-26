/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clase.myred.Post;
import com.clase.myred.User;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hely
 */
public class PostDao {
     public static boolean add(Post po,  int use) {
        Connection con;
    LocalDateTime date=LocalDateTime.now();
        
        String sql = "insert into post ( message,post_date, user_id)"
            + " values ('"
            + po.getMessage() + "',  '"
            +date+"', '" 
            + use + "')";
 
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

  public static List<Post> getAll() throws SQLException{
        List<Post> listPost;
        listPost = new ArrayList<>();
        
       
       String sql = "select user.id, user_name, password, first_name, last_name, post.id, message, user_id from post, user where user.id = post.user_id";
        
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                listPost.add( new Post(
                        rs.getInt("id"),
                        rs.getString("message"),
                        new User(rs.getInt("id"), rs.getString("user_name"), rs.getString("password"), rs.getString("first_name"), rs.getString("last_name"))
                    )
                );
            }
            return listPost;
            
        }catch(SQLException e){
            System.out.println("Error de getAll");
            return null;
        }
    }

    
    }
    

