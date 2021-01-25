package servicio;

import acceso.datos.AccesoEmpleado;
import acceso.datos.AccesoEmpleado;
import modelo.Empleado;

public class ServicioEmpleado {

    private AccesoEmpleado accesoEmpleado;

    public ServicioEmpleado() {
        accesoEmpleado = new AccesoEmpleado();
    }

    public void crearEmpleado(Empleado empleado) {
        accesoEmpleado.crearEmpleado(empleado);
    }

    public String leerTodosLosEmpleados() {
        return accesoEmpleado.leerTodosLosEmpleados();
    }

    public Empleado leerEmpleado(String id) {
        return accesoEmpleado.leerEmpleado(id);
    }

    public Empleado leerEmpleado(String usuario, String password) {
        return accesoEmpleado.leerEmpleado(usuario, password);
    }

    public void actualizarEmpleado(Empleado empleado) {
        accesoEmpleado.actualizarEmpleado(empleado);
    }

    public void borrarEmpleado(String id) {
        accesoEmpleado.borrarEmpleado(id);
    }
}
