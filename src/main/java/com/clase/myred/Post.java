/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clase.myred;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author hely
 */
public class Post {
    
    private int id;
    private String message;
    private LocalDateTime post_date;
    private User usuario;
    
    public Post(int i, String m, LocalDateTime p){
        this.id=i;
        this.message=m;
        this.post_date=p;    
    }   
    public Post(String m){
        this.message = m;
    }
  /*  public Post(int i, String m, String p, int u){
        this.id=i;
        this.message=m;
        this.post_date=LocalDateTime.parse(p);
        this.user_id=u;
    }   */
        public Post(int i, String m, User u){
        this.id=i;
        this.message=m;
        this.usuario=u;
    } 
    public Post(int i, String m, String p, User u){
        this.id=i;
        this.message=m;
        this.post_date=LocalDateTime.parse(p, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.usuario=u;
    }
    public Post(int i, String m, LocalDateTime p, User u){
        this.id=i;
        this.message=m;
        this.post_date= p;
        this.usuario=u;
    }
    public Post(String m, LocalDateTime p, User u){
        this.message=m;
        this.post_date= p;
        this.usuario=u;
    }
    public Post( User u){
        this.usuario=u;
    }
    
    public void setId(int i){
        this.id= i;
   }
    
    public int getId(){
        return id;
    }
    public void setMessage(String m){
        this.message=m;
    }
    public String getMessage(){
        return message;
    }
    public void setPost_date(LocalDateTime p){
        this.post_date=p;
    }
    public LocalDateTime getPost_date(){
        return post_date;
    }
    public void setUser(User u){
        this.usuario=u;
    }
    public User getUser(){
        return usuario;
    }
    public String getDateString(){
        return post_date.toString();
    }
}
