package acceso.datos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import modelo.Producto;
import utils.Utils;

public class AccesoProducto {

    private FileWriter writer;
    private FileReader reader;

    public void crearProducto(Producto producto) {
        StringBuilder builder = new StringBuilder();
        String todosLosProductos = leerTodosLosProductos();

        Scanner scanner = new Scanner(todosLosProductos);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            builder.append(line);
            builder.append(System.lineSeparator());
        }

        scanner.close();

        builder.append(producto.getId());
        builder.append(Utils.ESPACIOS);
        builder.append(producto.getNombre());
        builder.append(Utils.ESPACIOS);
        builder.append(producto.getCodigo());
        builder.append(Utils.ESPACIOS);
        builder.append(producto.getPrecio());
        builder.append(Utils.ESPACIOS);
        builder.append(producto.getCantidad());
        builder.append(System.lineSeparator());

        try {
            writer = new FileWriter(Utils.RUTA_PRODUCTO, false);
            writer.write(builder.toString());

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerTodosLosProductos() {
        StringBuilder builder = new StringBuilder();

        try {
            reader = new FileReader(Utils.RUTA_PRODUCTO);

            int valor = reader.read();

            while (valor != -1) {
                builder.append((char) valor);
                valor = reader.read();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();
    }

    public Producto leerProducto(String id) {
        Producto producto = new Producto();

        String todosLosProductos = leerTodosLosProductos();

        Scanner scanner = new Scanner(todosLosProductos);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.startsWith("-")) {
                continue;
            }

            String[] split = line.split(Utils.REGEX);

            if (split != null && split.length == 5) {
                if (id.equals(split[Utils.PRODUCTO_COLUMNA_ID])) {
                    producto.setId(split[Utils.PRODUCTO_COLUMNA_ID]);
                    producto.setNombre(split[Utils.PRODUCTO_COLUMNA_NOMBRE]);
                    producto.setCodigo(split[Utils.PRODUCTO_COLUMNA_CODIGO]);
                    producto.setPrecio(split[Utils.PRODUCTO_COLUMNA_PRECIO]);
                    producto.setCantidad(split[Utils.PRODUCTO_COLUMNA_CANTIDAD]);

                    break;
                }
            }
        }

        scanner.close();

        return producto;
    }

    public void actualizarProducto(Producto producto) {
        StringBuilder builder = new StringBuilder();
        String todosLosProductos = leerTodosLosProductos();

        Scanner scanner = new Scanner(todosLosProductos);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.startsWith("ID" + Utils.ESPACIOS) || line.startsWith("-")) {
                builder.append(line);
                builder.append(System.lineSeparator());

                continue;
            }

            String[] split = line.split(Utils.REGEX);

            if (split != null) {
                if (producto.getId().equals(split[Utils.PRODUCTO_COLUMNA_ID])) {
                    builder.append(producto.getId());
                    builder.append(Utils.ESPACIOS);
                    builder.append(producto.getNombre());
                    builder.append(Utils.ESPACIOS);
                    builder.append(producto.getCodigo());
                    builder.append(Utils.ESPACIOS);
                    builder.append(producto.getPrecio());
                    builder.append(Utils.ESPACIOS);
                    builder.append(producto.getCantidad());
                    builder.append(System.lineSeparator());
                    continue;
                }

                builder.append(line);
                builder.append(System.lineSeparator());
            }
        }

        scanner.close();

        try {
            writer = new FileWriter(Utils.RUTA_PRODUCTO, false);
            writer.write(builder.toString());

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void borrarProducto(String id) {
        StringBuilder builder = new StringBuilder();
        String todosLosProductos = leerTodosLosProductos();

        Scanner scanner = new Scanner(todosLosProductos);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.startsWith("ID" + Utils.ESPACIOS) || line.startsWith("-")) {
                builder.append(line);
                builder.append(System.lineSeparator());

                continue;
            }

            String[] split = line.split(Utils.REGEX);

            if (split != null) {
                if (id.equals(split[Utils.PRODUCTO_COLUMNA_ID])) {
                    continue;
                }

                builder.append(line);
                builder.append(System.lineSeparator());
            }
        }

        scanner.close();

        try {
            writer = new FileWriter(Utils.RUTA_PRODUCTO, false);
            writer.write(builder.toString());

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
