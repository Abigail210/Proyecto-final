package servicio;

import acceso.datos.AccesoRol;
import acceso.datos.AccesoRol;
import modelo.Rol;

public class ServicioRol {

    private AccesoRol accesoRol;

    public ServicioRol() {
        accesoRol = new AccesoRol();
    }

    public String leerTodosLosRoles() {
        return accesoRol.leerTodosLosRoles();
    }

    public Rol leerRol(String id) {
        return accesoRol.leerRol(id);
    }

}
