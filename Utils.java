package utils;

import java.awt.Font;
import java.util.UUID;

import vista.FramePrincipal;

public final class Utils {

    public static final String ACTUALIZAR = "Actualizar";
    public static final String ACTUALIZAR_EMPLEADO = "ACTUALIZAR  EMPLEADO";
    public static final String ACTUALIZAR_PRODUCTO = "ACTUALIZAR  PRODUCTO";
    public static final String BORRAR = "Borrar";
    public static final String BORRAR_EMPLEADO = "BORRAR  EMPLEADO";
    public static final String BORRAR_PRODUCTO = "BORRAR  PRODUCTO";
    public static final String CANCELAR = "CANCELAR";
    public static final String CANTIDAD = "Cantidad:";
    public static final String CODIGO = "Codigo:";
    public static final String CREAR = "Crear";
    public static final String CREAR_EMPLEADO = "CREAR  EMPLEADO";
    public static final String CREAR_PRODUCTO = "CREAR  PRODUCTO";
    public static final String EMPLEADO = "Empleado";
    public static final String EMPLEADO_ACTUALIZADO_EXITOSAMENTE = "EMPLEADO  ACTUALIZADO  EXITOSAMENTE";
    public static final String EMPLEADO_BORRADO_EXITOSAMENTE = "EMPLEADO  BORRADO  EXITOSAMENTE";
    public static final String EMPLEADO_CREADO_EXITOSAMENTE = "EMPLEADO  CREADO  EXITOSAMENTE";
    public static final String FONT_VERDANA = "Verdana";
    public static final String ID = "Id:";
    public static final String LEER = "Leer";
    public static final String LEER_EMPLEADO = "LEER  EMPLEADO";
    public static final String LEER_TODOS = "Leer Todos";
    public static final String LEER_TODOS_LOS_EMPLEADOS = "LEER  TODOS  LOS  EMPLEADOS";
    public static final String LEER_TODOS_LOS_PRODUCTOS = "LEER  TODOS  LOS  PRODUCTOS";
    public static final String LOGIN = "LOGIN";
    public static final String NOMBRE = "Nombre:";
    public static final String PASSWORD = "Password:";
    public static final String PRECIO = "Precio:";
    public static final String PRODUCTO = "Producto";
    public static final String PRODUCTO_ACTUALIZADO_EXITOSAMENTE = "PRODUCTO  ACTUALIZADO  EXITOSAMENTE";
    public static final String PRODUCTO_BORRADO_EXITOSAMENTE = "PRODUCTO  BORRADO  EXITOSAMENTE";
    public static final String PRODUCTO_CREADO_EXITOSAMENTE = "PRODUCTO  CREADO  EXITOSAMENTE";
    public static final String ROL = "Rol:";
    public static final String SALIR = "Salir";
    public static final String SISTEMA_DE_INVENTARIO = "SISTEMA  DE  INVENTARIO";
    public static final String USUARIO = "Usuario:";

    // Son 20 espacios
    public static final String ESPACIOS = "                    ";

    // Al menos debe haber el numero de ESPACIOS (20) o mas como separacion entre
    // columnas
    public static final String REGEX = "\\s{" + ESPACIOS.length() + ",}+";

    public static final int EMPLEADO_COLUMNA_ID = 0;
    public static final int EMPLEADO_COLUMNA_NOMBRE = 1;
    public static final int EMPLEADO_COLUMNA_ROL = 2;
    public static final int EMPLEADO_COLUMNA_USUARIO = 3;
    public static final int EMPLEADO_COLUMNA_PASSWORD = 4;

    public static final int PERMISO_COLUMNA_ID = 0;
    public static final int PERMISO_COLUMNA_NOMBRE = 1;

    public static final int PRODUCTO_COLUMNA_ID = 0;
    public static final int PRODUCTO_COLUMNA_NOMBRE = 1;
    public static final int PRODUCTO_COLUMNA_CODIGO = 2;
    public static final int PRODUCTO_COLUMNA_PRECIO = 3;
    public static final int PRODUCTO_COLUMNA_CANTIDAD = 4;

    public static final int ROL_COLUMNA_ID = 0;
    public static final int ROL_COLUMNA_NOMBRE = 1;
    public static final int ROL_COLUMNA_PERMISOS = 2;

    public static final String RUTA_EMPLEADO = "D:\\tmp\\empleado.txt";
    public static final String RUTA_PRODUCTO = "D:\\tmp\\producto.txt";
    public static final String RUTA_ROL = "D:\\tmp\\rol.txt";
    public static final String RUTA_PERMISO = "D:\\tmp\\permiso.txt";
    public static final String RUTA_TEMP = "D:\\tmp\\temp.txt";

    private Utils() {
    }

    public static String generarUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static Font obtenerFontTitulo() {
        return new Font(FONT_VERDANA, Font.BOLD, 24);
    }

    public static void limpiarCampos(FramePrincipal framePrincipal) {
        framePrincipal.getPanelLogin().getTextfieldUsuario().setText("");
        framePrincipal.getPanelLogin().getTextfieldPassword().setText("");

        framePrincipal.getPanelEmpleadoCrear().getLabelResultado().setText("");
        framePrincipal.getPanelEmpleadoCrear().getTextfieldId().setText("");
        framePrincipal.getPanelEmpleadoCrear().getTextfieldNombre().setText("");
        framePrincipal.getPanelEmpleadoCrear().getTextfieldRol().setText("");
        framePrincipal.getPanelEmpleadoCrear().getTextfieldUsuario().setText("");
        framePrincipal.getPanelEmpleadoCrear().getTextfieldPassword().setText("");

        framePrincipal.getPanelEmpleadoLeerTodos().getTextArea().setText("");

        framePrincipal.getPanelEmpleadoActualizar().getLabelResultado().setText("");
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldId().setText("");
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldNombre().setText("");
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldRol().setText("");
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldUsuario().setText("");
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldPassword().setText("");

        framePrincipal.getPanelEmpleadoBorrar().getLabelResultado().setText("");
        framePrincipal.getPanelEmpleadoBorrar().getTextfieldId().setText("");
        
        framePrincipal.getPanelProductoCrear().getLabelResultado().setText("");
        framePrincipal.getPanelProductoCrear().getTextfieldId().setText("");
        framePrincipal.getPanelProductoCrear().getTextfieldNombre().setText("");
        framePrincipal.getPanelProductoCrear().getTextfieldCodigo().setText("");
        framePrincipal.getPanelProductoCrear().getTextfieldPrecio().setText("");
        framePrincipal.getPanelProductoCrear().getTextfieldCantidad().setText("");

        framePrincipal.getPanelProductoLeerTodos().getTextArea().setText("");

        framePrincipal.getPanelProductoActualizar().getLabelResultado().setText("");
        framePrincipal.getPanelProductoActualizar().getTextfieldId().setText("");
        framePrincipal.getPanelProductoActualizar().getTextfieldNombre().setText("");
        framePrincipal.getPanelProductoActualizar().getTextfieldCodigo().setText("");
        framePrincipal.getPanelProductoActualizar().getTextfieldPrecio().setText("");
        framePrincipal.getPanelProductoActualizar().getTextfieldCantidad().setText("");

        framePrincipal.getPanelProductoBorrar().getLabelResultado().setText("");
        framePrincipal.getPanelProductoBorrar().getTextfieldId().setText("");
    }

    public static void quitarPaneles(FramePrincipal framePrincipal) {
        framePrincipal.getPanelLogin().setVisible(false);
        
        framePrincipal.getPanelEmpleadoCrear().setVisible(false);
        framePrincipal.getPanelEmpleadoLeerTodos().setVisible(false);
        framePrincipal.getPanelEmpleadoActualizar().setVisible(false);
        framePrincipal.getPanelEmpleadoBorrar().setVisible(false);
        
        framePrincipal.getPanelProductoCrear().setVisible(false);
        framePrincipal.getPanelProductoLeerTodos().setVisible(false);
        framePrincipal.getPanelProductoActualizar().setVisible(false);
        framePrincipal.getPanelProductoBorrar().setVisible(false);
    }
}
