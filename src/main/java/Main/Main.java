package Main;

import Servicios.BaseDatosServicios;
import Servicios.BootStrapServicios;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args){

        try {

            BootStrapServicios.iniciarBaseDatos();

            BaseDatosServicios.getInstancia().testConexion();

            BootStrapServicios.crearTablas();

            

        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

}
