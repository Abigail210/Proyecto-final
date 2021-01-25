package prueba;

import controlador.ControladorRol;
import controlador.ControladorRol;
import modelo.Rol;

public class PruebaRol {
    
    public static void main(String [] args) {
        
        ControladorRol r = new ControladorRol();
        System.out.println(r.leerTodosLosRoles());
        
        Rol rol = r.leerRol("2");
        System.out.println(rol.getPermisos());
        
    }
}
