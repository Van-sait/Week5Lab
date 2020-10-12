
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;

/**
 *
 * @author 798382
 */
public class LoginServlet extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        
        HttpSession session = request.getSession();
        
        String logout = request.getParameter("logout");
        
        if(logout.equals("")){
            session.invalidate();
            session = request.getSession();
        }
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String inputUsername = request.getParameter("username");
        String inputPassword = request.getParameter("password");
        
        AccountService account =  new AccountService(inputUsername, inputPassword);
        
        if((inputUsername != null) || (!"".equals(inputUsername)) && (inputPassword != null) || (!"".equals(inputPassword))){
                if(account.getUsername().equals(inputUsername) && account.getPassword().equals(inputPassword)   ) {
                    
                }
        }
        
           }

   

}
