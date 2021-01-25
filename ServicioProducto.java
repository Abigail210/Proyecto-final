package servicio;

import acceso.datos.AccesoProducto;
import acceso.datos.AccesoProducto;
import modelo.Producto;

public class ServicioProducto {

    private AccesoProducto accesoProducto;

    public ServicioProducto() {
        accesoProducto = new AccesoProducto();
    }

    public void crearProducto(Producto producto) {
        accesoProducto.crearProducto(producto);
    }

    public String leerTodosLosProductos() {
        return accesoProducto.leerTodosLosProductos();
    }

    public Producto leerProducto(String id) {
        return accesoProducto.leerProducto(id);
    }

    public void actualizarProducto(Producto producto) {
        accesoProducto.actualizarProducto(producto);
    }

    public void borrarProducto(String id) {
        accesoProducto.borrarProducto(id);
    }
}
