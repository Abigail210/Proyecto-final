package prueba;

import controlador.ControladorPermiso;
import controlador.ControladorPermiso;
import modelo.Permiso;

public class PruebaPermiso {

    public static void main(String[] args) {
        
        ControladorPermiso v = new ControladorPermiso();
        System.out.println(v.leerTodosLosPermisos());
        
        Permiso p = (v.leerPermiso("1"));
       
        System.out.println(p.getNombre());
    }

}
