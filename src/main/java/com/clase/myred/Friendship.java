/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clase.myred;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author hely
 */
public class Friendship {
    private int id;
    private User user;
    private User usuario;
    private LocalDate friendship_date;
    private boolean is_active;
    
    
    public Friendship( int i, User us, User s, LocalDate f, boolean a){
       this.id=i;
       this.user=us;
       this.usuario=s;
       this.friendship_date=f;
       this.is_active= a;
    }
    public Friendship(int i, User us, User s, String f, boolean a){
       this.id=i;
       this.user=us;
       this.usuario=s;
       this.friendship_date=LocalDate.parse(f);
       this.is_active= a;
    }
    public Friendship(int i, User us, User s, Date f, boolean a){
       this.id=i;
       this.user=us;
       this.usuario=s;
       this.friendship_date=f.toLocalDate();
       this.is_active= a;
    }

    public Friendship(User user, Post post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void  setId(int i){
       this.id=i;
    }  
    public int getId(){
        return id;
    }
    public void setUser(User us){
        this.user=us;
    }
    public User getUser(){
        return user;
    }
    public void setUsuario(User s){
        this.usuario=s;
    }
    public User getUsuario(){
        return usuario;
    }
    public void setFriendship_date(LocalDate f){
        this.friendship_date=f;
    }
    public LocalDate getFriendship_date(){
        return friendship_date;
    }
    public void setIsActive(boolean a){
        this.is_active=a;
    }
    public boolean getIsActive(){
        return is_active;
    }
}

