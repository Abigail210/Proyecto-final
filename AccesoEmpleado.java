package acceso.datos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import modelo.Empleado;
import utils.Utils;

public class AccesoEmpleado {

    private FileWriter writer;
    private FileReader reader;

    public void crearEmpleado(Empleado empleado) {
        StringBuilder builder = new StringBuilder();
        String todosLosEmpleados = leerTodosLosEmpleados();

        Scanner scanner = new Scanner(todosLosEmpleados);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            builder.append(line);
            builder.append(System.lineSeparator());
        }

        scanner.close();

        builder.append(empleado.getId());
        builder.append(Utils.ESPACIOS);
        builder.append(empleado.getNombre());
        builder.append(Utils.ESPACIOS);
        builder.append(empleado.getRol());
        builder.append(Utils.ESPACIOS);
        builder.append(empleado.getUsuario());
        builder.append(Utils.ESPACIOS);
        builder.append(empleado.getPassword());
        builder.append(System.lineSeparator());

        try {
            writer = new FileWriter(Utils.RUTA_EMPLEADO, false);
            writer.write(builder.toString());

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerTodosLosEmpleados() {
        StringBuilder builder = new StringBuilder();

        try {
            reader = new FileReader(Utils.RUTA_EMPLEADO);

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
    
    public Empleado leerEmpleado(String id) {
        Empleado empleado = new Empleado();

        String todosLosEmpleados = leerTodosLosEmpleados();

        Scanner scanner = new Scanner(todosLosEmpleados);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            if (line.startsWith("-")) {
                continue;
            }

            String[] split = line.split(Utils.REGEX);

            if (split != null && split.length == 5) {
                if (id.equals(split[Utils.EMPLEADO_COLUMNA_ID])) {
                    empleado.setId(split[Utils.EMPLEADO_COLUMNA_ID]);
                    empleado.setNombre(split[Utils.EMPLEADO_COLUMNA_NOMBRE]);
                    empleado.setRol(split[Utils.EMPLEADO_COLUMNA_ROL]);
                    empleado.setUsuario(split[Utils.EMPLEADO_COLUMNA_USUARIO]);
                    empleado.setPassword(split[Utils.EMPLEADO_COLUMNA_PASSWORD]);

                    break;
                }
            }
        }

        scanner.close();

        return empleado;
    }

    public Empleado leerEmpleado(String usuario, String password) {
        Empleado empleado = new Empleado();

        String todosLosEmpleados = leerTodosLosEmpleados();

        Scanner scanner = new Scanner(todosLosEmpleados);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            if (line.startsWith("-")) {
                continue;
            }

            String[] split = line.split(Utils.REGEX);

            if (split != null && split.length == 5) {
                if (usuario.equals(split[Utils.EMPLEADO_COLUMNA_USUARIO]) && password.equals(split[Utils.EMPLEADO_COLUMNA_PASSWORD])) {
                    empleado.setId(split[Utils.EMPLEADO_COLUMNA_ID]);
                    empleado.setNombre(split[Utils.EMPLEADO_COLUMNA_NOMBRE]);
                    empleado.setRol(split[Utils.EMPLEADO_COLUMNA_ROL]);
                    empleado.setUsuario(split[Utils.EMPLEADO_COLUMNA_USUARIO]);
                    empleado.setPassword(split[Utils.EMPLEADO_COLUMNA_PASSWORD]);

                    break;
                }
            }
        }

        scanner.close();

        return empleado;
    }

    public void actualizarEmpleado(Empleado empleado) {
        StringBuilder builder = new StringBuilder();
        String todosLosEmpleados = leerTodosLosEmpleados();

        Scanner scanner = new Scanner(todosLosEmpleados);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            if (line.startsWith("ID" + Utils.ESPACIOS) || line.startsWith("-")) {
                builder.append(line);
                builder.append(System.lineSeparator());
                
                continue;
            }
            
            String[] split = line.split(Utils.REGEX);
             
            if (split != null) {
                if (empleado.getId().equals(split[Utils.EMPLEADO_COLUMNA_ID])) {
                    builder.append(empleado.getId());
                    builder.append(Utils.ESPACIOS);
                    builder.append(empleado.getNombre());
                    builder.append(Utils.ESPACIOS);
                    builder.append(empleado.getRol());
                    builder.append(Utils.ESPACIOS);
                    builder.append(empleado.getUsuario());
                    builder.append(Utils.ESPACIOS);
                    builder.append(empleado.getPassword());
                    builder.append(System.lineSeparator());
                    continue;
                }

                builder.append(line);
                builder.append(System.lineSeparator());
            }
        }

        scanner.close();

        try {
            writer = new FileWriter(Utils.RUTA_EMPLEADO, false);
            writer.write(builder.toString());

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void borrarEmpleado(String id) {
        StringBuilder builder = new StringBuilder();
        String todosLosEmpleados = leerTodosLosEmpleados();

        Scanner scanner = new Scanner(todosLosEmpleados);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            if (line.startsWith("ID" + Utils.ESPACIOS) || line.startsWith("-")) {
                builder.append(line);
                builder.append(System.lineSeparator());
                
                continue;
            }

            String[] split = line.split(Utils.REGEX);

            if (split != null) {
                if (id.equals(split[Utils.EMPLEADO_COLUMNA_ID])) {
                    continue;
                }

                builder.append(line);
                builder.append(System.lineSeparator());
            }
        }
        
        scanner.close();

        try {
            writer = new FileWriter(Utils.RUTA_EMPLEADO, false);
            writer.write(builder.toString());

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
