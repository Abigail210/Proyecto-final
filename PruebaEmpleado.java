package prueba;

import controlador.ControladorEmpleado;
import controlador.ControladorEmpleado;
import modelo.Empleado;
import utils.Utils;

public class PruebaEmpleado {

    public static void main(String[] args) {
        PruebaEmpleado pruebaEmpleado = new PruebaEmpleado();
        
        //pruebaEmpleado.crearEmpleado();
        
        pruebaEmpleado.leerTodosLosEmpleados();
        
        //pruebaEmpleado.leerEmpleado();
        
        //pruebaEmpleado.actualizarEmpleado();
        
        //pruebaEmpleado.borrarEmpleado();
    }

    public void crearEmpleado() {
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        
        Empleado empleado = new Empleado();
        empleado.setId(Utils.generarUUID());
        empleado.setNombre("Matt");
        empleado.setRol("3");
        empleado.setUsuario("yyy");
        empleado.setPassword("asdgfdg");
        
        controladorEmpleado.crearEmpleado(empleado);
    }
    
    public void leerTodosLosEmpleados() {
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        
        System.out.println(controladorEmpleado.leerTodosLosEmpleados());
    }
    
    public void leerEmpleado() {
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        
        Empleado empleado = controladorEmpleado.leerEmpleado("abi", "password");
        System.out.println("ID: " + empleado.getId());
        System.out.println("NOMBRE: " + empleado.getNombre());
        System.out.println("ROL: " + empleado.getRol());
        System.out.println("USUARIO: " + empleado.getUsuario());
        System.out.println("PASSWORD: " + empleado.getPassword());
    }
    
    public void actualizarEmpleado() {
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        
        Empleado empleado = new Empleado();
        empleado.setId("f7e0e9229d6d4834a15d23aea23720d3");
        empleado.setNombre("ABigail");
        empleado.setRol("1");
        empleado.setUsuario("abi");
        empleado.setPassword("password");
        
        controladorEmpleado.actualizarEmpleado(empleado);
    }
    
    public void borrarEmpleado() {
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        
        controladorEmpleado.borrarEmpleado("2b38c17acba24da9ac994170d35d5a91");
    }
}
