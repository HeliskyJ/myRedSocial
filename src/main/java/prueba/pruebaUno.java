/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import com.clase.myred.User;
import com.dao.UserDao;




/**
 *
 * @author hely
 */
public class pruebaUno {
    
    public static void main(String args[]){
       
      
        
        User use = new User (02,"naquin", "abc", "Narciso","Javier");
       
        if(UserDao.add(use)){
            System.out.println("Query Ok");            
        }else{
            System.out.println("no se puedo insertar");
        }
        
     }
}
