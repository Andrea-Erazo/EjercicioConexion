/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Andrea Erazo
 */
public class NewClass {
    Connection conectar = null;    

String usuario = "postgres";
String contraseña = "Programacion2";
String database = "javadb";
String ip = "localhost";
String puerto = "5432";

String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + database;

public Connection Conexion(){
   try{
       Class.forName("org.postgresql.Driver");
       conectar = DriverManager.getConnection(cadena, usuario, contraseña);
       System.out.println("Se ha realizado la conexion correctamente");
       
   } catch (Exception e) {
        System.out.println("Error al conectar la base de datos " + e.toString());
    }
   return conectar;
}
    
}
