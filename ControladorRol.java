package controlador;

import modelo.Rol;
import servicio.ServicioRol;
import servicio.ServicioRol;

public class ControladorRol {

    private ServicioRol servcicioRol;

    public ControladorRol() {
        servcicioRol = new ServicioRol();
    }

    public String leerTodosLosRoles() {
        return servcicioRol.leerTodosLosRoles();
    }

    public Rol leerRol(String id) {
        return servcicioRol.leerRol(id);
    }
}
