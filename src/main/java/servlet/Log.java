/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.clase.myred.User;
import com.dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hely
 */
public class Log extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                     HttpSession sesion = request.getSession();
                     
              String userin = request.getParameter("u");
              String contra = request.getParameter("con");
    
   User uno = (User) UserDao.getUser(userin);

     
    if(uno == null){  
           sesion.setAttribute("isAuthenticathed",false);
           request.getRequestDispatcher("noUser.jsp").forward(request, response);
           }       
    else  if( contra.equals(uno.getPassword())) {
               sesion.setAttribute("isAuthenticathed",true);
               sesion.setAttribute("usuario",uno.getUser_name());
               sesion.setAttribute("id",uno.getId());
               System.out.println("este esjfksjfslkfjsf "+ uno.getUser_name());
               System.out.println("este esjABCD "+ uno.getId());
               request.getRequestDispatcher("/user/home.jsp").forward(request, response);     
    } else{   sesion.setAttribute("isAuthenticathed",false);
              request.getRequestDispatcher("noUser.jsp").forward(request, response);        
          }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
