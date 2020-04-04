package Servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatosServicios {

    private static BaseDatosServicios baseDatos;
    private String URL = "jdbc:h2:tcp://localhost/~/manga-anime-empire";

    public static BaseDatosServicios getInstancia() {
        if (baseDatos == null)
            baseDatos = new BaseDatosServicios();

        return baseDatos;
    }

    public Connection getConexion() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, "sa", "");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conexion;

    }

    public void testConexion(){

        try {
            getConexion().close();
            System.out.println("Conexión realizado con exito...");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
