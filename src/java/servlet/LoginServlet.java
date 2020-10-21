package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;
import models.User;

/**
 *
 * @author 798382
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       
        
        HttpSession session = request.getSession();
        String logout = request.getParameter("logout");

        if (logout != null) {
            session.invalidate();
            session = request.getSession();
            request.setAttribute("message", "You have successfully logged out");
        }
        
        if (session.getAttribute("user") != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        
        }
 getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String inputUsername = request.getParameter("username");
        String inputPassword = request.getParameter("password");

        if ((inputUsername != null) || (!"".equals(inputUsername)) && (inputPassword != null) || (!"".equals(inputPassword))) {
            AccountService account = new AccountService();
            User user = account.login(inputUsername, inputPassword);
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);

                response.sendRedirect("home");
            } else {
                request.setAttribute("message", "invalid login, please try again");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }
        }

    }

}
