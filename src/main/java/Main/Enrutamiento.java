package Main;

import Objetos.Articulo;
import Objetos.Etiqueta;
import Objetos.Usuario;
import Servicios.ArticuloServicios;

import java.util.ArrayList;

public class Enrutamiento {

    static ArrayList<Etiqueta> etiquetasAux = new ArrayList<>();
    static ArrayList<Articulo> articulos = ArticuloServicios.listarArticulos();
    static String nombreUsuario = "";
    static Boolean etiquetasBool = false;
    static Usuario usuario;

}
