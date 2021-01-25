package controlador;

import modelo.Permiso;
import servicio.ServicioPermiso;
import servicio.ServicioPermiso;

public class ControladorPermiso {

    private ServicioPermiso servicioPermiso;

    public ControladorPermiso() {
        servicioPermiso = new ServicioPermiso();
    }

    public String leerTodosLosPermisos() {
        return servicioPermiso.leerTodosLosPermisos();
    }

    public Permiso leerPermiso(String id) {
        return servicioPermiso.leerPermiso(id);
    }
}
