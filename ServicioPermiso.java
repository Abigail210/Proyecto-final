package servicio;

import acceso.datos.AccesoPermiso;
import acceso.datos.AccesoPermiso;
import modelo.Permiso;

public class ServicioPermiso {

    private AccesoPermiso accesoPermiso;

    public ServicioPermiso() {
        accesoPermiso = new AccesoPermiso();
    }

    public String leerTodosLosPermisos() {
        return accesoPermiso.leerTodosLosPermisos();
    }

    public Permiso leerPermiso(String id) {
        return accesoPermiso.leerPermiso(id);
    }
}
