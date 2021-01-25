package acceso.datos;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import modelo.Rol;
import utils.Utils;

public class AccesoRol {

    private FileReader reader;

    public String leerTodosLosRoles() {
        StringBuilder builder = new StringBuilder();

        try {
            reader = new FileReader(Utils.RUTA_ROL);

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

    public Rol leerRol(String id) {
        Rol rol = new Rol();

        String todosLosRoles = leerTodosLosRoles();

        Scanner scanner = new Scanner(todosLosRoles);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] split = line.split(Utils.REGEX);

            if (split != null && split.length == 3) {
                if (id.equals(split[Utils.ROL_COLUMNA_ID])) {
                    rol.setId(split[Utils.ROL_COLUMNA_ID]);
                    rol.setNombre(split[Utils.ROL_COLUMNA_NOMBRE]);
                    rol.setPermisos(split[Utils.ROL_COLUMNA_PERMISOS]);

                    break;
                }
            }
        }

        scanner.close();

        return rol;
    }
}
