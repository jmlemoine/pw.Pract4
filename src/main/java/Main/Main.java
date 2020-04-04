package Main;

import Servicios.BaseDatosServicios;
import Servicios.BootStrapServicios;
import Servicios.UsuarioServicios;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args){

        try {

            BootStrapServicios.iniciarBaseDatos();

            BaseDatosServicios.getInstancia().testConexion();

            BootStrapServicios.crearTablas();

            UsuarioServicios serviciouser = new UsuarioServicios();
            serviciouser.crearUsuarioPorDefecto();



        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

}
