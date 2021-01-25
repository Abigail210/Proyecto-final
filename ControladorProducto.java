package controlador;

import modelo.Producto;
import servicio.ServicioProducto;
import servicio.ServicioProducto;

public class ControladorProducto {

    private ServicioProducto servicioProducto;

    public ControladorProducto() {
        servicioProducto = new ServicioProducto();
    }


    public void crearProducto(Producto producto) {
        servicioProducto.crearProducto(producto);
    }

    public String leerTodosLosProductos() {
        return servicioProducto.leerTodosLosProductos();
    }

    public Producto leerProducto(String id) {
        return servicioProducto.leerProducto(id);
    }

    public void actualizarProducto(Producto producto) {
        servicioProducto.actualizarProducto(producto);
    }

    public void borrarProducto(String id) {
        servicioProducto.borrarProducto(id);
    }
}
