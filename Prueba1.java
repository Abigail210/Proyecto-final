package prueba;

import acceso.datos.AccesoEmpleado;
import controlador.ControladorEmpleado;
import servicio.ServicioEmpleado;

public class Prueba1 {

    public static void main(String[] args) {
        
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        System.out.println(controladorEmpleado.leerTodosLosEmpleados());
        
    }
}
