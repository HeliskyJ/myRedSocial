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
public class User {
    
        private int id;
    private String user_name;
    private String password;
    private String first_name;
    private String last_name;
    private LocalDate created;
    private LocalDate last_connection;

 
    public User(int id, String user_name, String password, String first_name, String last_name){
        this.id = id;
        this.user_name = user_name;
        this.password= password;
        this.first_name = first_name;
        this.last_name=last_name;
    }
    public User(int id, String user_name, String password){
        this.id = id;
        this.user_name = user_name;
        this.password= password;
    }

       public User( int id, String user_name, String password, String first_name) {
          this.id = id;
        this.user_name = user_name;
        this.password= password;
        this.first_name = first_name;
    }
    public User( String user_name, String password, String first_name){
        this.user_name = user_name;
        this.password= password;
        this.first_name = first_name;
    }
    public User( String user_name, String password, String first_name, String last_name){
        this.user_name = user_name;
        this.password= password;
        this.first_name = first_name;
        this.last_name=last_name;
    }
        public User( String user_name, String password, String first_name, String last_name, Date created){
        this.user_name = user_name;
        this.password= password;
        this.first_name = first_name;
        this.last_name=last_name;
        this.created=created.toLocalDate();
    }
        public User( int id, String user_name, String password, String first_name, String last_name, Date created){
        this.id=id;
        this.user_name = user_name;
        this.password= password;
        this.first_name = first_name;
        this.last_name=last_name;
        this.created=created.toLocalDate();
    }
        
    public void setCreated(LocalDate created) {
        this.created = created;
    }
        public void setLast_connection(LocalDate last_connection) {
        this.last_connection= last_connection;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id){
       this.id = id;
    }
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getFirst_name(){
        return first_name;
    }
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }        
    public String getLast_name(){
        return last_name;
    }
    public void setLast_name(String last_name){
        this.last_name=last_name;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreated() {
        return created;
    }
    public LocalDate getLast_connection() {
    return last_connection;
    }

    public void setCreated(int dia, int mes, int anio) {
        this.created= LocalDate.of(anio, mes, dia);
    }

    public void setLast_connection(int dia, int mes, int anio) {
    this.last_connection= LocalDate.of(anio, mes, dia);
    }
    public String getDateString(){
        return created.toString();
    }
    public String getDati(){
    return last_connection.toString();
    }
}
