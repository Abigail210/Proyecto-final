package controlador;

import modelo.Empleado;
import servicio.ServicioEmpleado;
import servicio.ServicioEmpleado;

public class ControladorEmpleado {

    private ServicioEmpleado servicioEmpleado;

    public ControladorEmpleado() {
        servicioEmpleado = new ServicioEmpleado();
    }

    public void crearEmpleado(Empleado empleado) {
        servicioEmpleado.crearEmpleado(empleado);
    }

    public String leerTodosLosEmpleados() {
        return servicioEmpleado.leerTodosLosEmpleados();
    }

    public Empleado leerEmpleado(String id) {
        return servicioEmpleado.leerEmpleado(id);
    }

    public Empleado leerEmpleado(String usuario, String password) {
        return servicioEmpleado.leerEmpleado(usuario, password);
    }

    public void actualizarEmpleado(Empleado empleado) {
        servicioEmpleado.actualizarEmpleado(empleado);
    }

    public void borrarEmpleado(String id) {
        servicioEmpleado.borrarEmpleado(id);
    }
}
