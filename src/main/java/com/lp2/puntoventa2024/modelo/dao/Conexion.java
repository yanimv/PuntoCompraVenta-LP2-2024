/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lp2.puntoventa2024.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    String url = "jdbc:postgresql://localhost:5432/yourdatabase";
    String usuario = "your user";
    String password = "your password";

    public Connection conectarBD() {
        Connection conectar = null;
        try {

            conectar = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conectar;
    }

}
