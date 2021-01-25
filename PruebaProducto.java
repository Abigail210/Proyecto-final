package prueba;

import controlador.ControladorProducto;
import controlador.ControladorProducto;
import modelo.Producto;

public class PruebaProducto {

    public static void main(String[] args) {
        PruebaProducto pruebaProducto = new PruebaProducto();

        //pruebaProducto.crearProducto();

        pruebaProducto.leerTodosLosProductos();
    }

    public void crearProducto() {
        ControladorProducto controladorProducto = new ControladorProducto();

        Producto producto = new Producto();
        producto.setNombre("Guitarra 03");
        producto.setCodigo("5136");
        producto.setPrecio("9000.00");

        controladorProducto.crearProducto(producto);
    }

    public void leerTodosLosProductos() {
        ControladorProducto controladorProducto = new ControladorProducto();

        System.out.println(controladorProducto.leerTodosLosProductos());
    }
}
