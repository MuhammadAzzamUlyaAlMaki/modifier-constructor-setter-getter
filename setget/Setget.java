/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.setget;

/**
 *
 * @author SMK TELKOM 21
 */
public class Setget {

    private String username;
    private String password;
    
    public Setget(String username, String password){
        this.username = username;
        this.password = password;
    }

    // ini method setter
    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    // ini method getter
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
