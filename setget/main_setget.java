package com.mycompany.setget;


import com.mycompany.setget.Setget;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SMK TELKOM 21
 */
public class main_setget {
    public static void main(String[] args) {
         Setget dian = new Setget("l","k");

// menggunakan method setter
dian.setUsername("dian");
dian.setPassword("kopiJava");
//
// menggunakan method getter
System.out.println("Username: " + dian.getUsername());
System.out.println("Password: " + dian.getPassword());  
    }
}
