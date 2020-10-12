/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author 798382
 */
public class AccountService {
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password){
        
        if((username.equals("abe") || username.equals("barb")) && (password.equals("password")))
        {
            User user = new User(username,password);
            return user;
        }
        return null;
       
    }

   
    
}
