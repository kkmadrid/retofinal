/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author kaká
 */
public class ClsJdbc {

    String driver = "com.mysql.cj.jdbc.Driver";
    String usuario = "root";
    String contrasenia = "";
    String bd = "bd_elecciones";
    String puerto = "3306";
    //string url se debe coolocar la direccion donde se encuentra ubicado el servidor, local o externo
    String url = "jdbc:mysql://localhost:" + puerto + "/" + bd;
    public Connection conexion;

    public void CrearConexion() {
        try {
            Class.forName(driver);
            this.conexion = DriverManager.getConnection(url, usuario, contrasenia);
            if (conexion != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println("Conexion fallida" + e.getMessage());
        }
    }


}
