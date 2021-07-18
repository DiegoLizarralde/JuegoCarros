/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegocarros.datos;
import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author diego
 */
public class BD {

        private Connection connection = null;


        public void  Conectar() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String Conectar = "jdbc:mysql://localhost:3306/juegocarrosbd";
                connection = (Connection) DriverManager.getConnection(Conectar, "root", "");
            } catch (ClassNotFoundException exception) {
                System.out.println("Error: El driver no fue encontrado" + exception.toString());
            } catch (SQLException exception) {
                System.out.println("Error: La base de datos no fue encontrada" + exception.toString());
            }


        }

        public void insertar(String Datos) {
            Integer num_Reg = 0;
            Statement statement = null;
            try {
                statement = connection.createStatement();
                num_Reg = statement.executeUpdate(Datos);
            } catch (SQLException exception) {
                System.out.println("Ha ocurrido un error en la consulta: " + exception.toString());
            }

        }

}
