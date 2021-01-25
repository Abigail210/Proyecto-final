package acceso.datos;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import modelo.Permiso;
import utils.Utils;

public class AccesoPermiso {

    private FileReader reader;

    public String leerTodosLosPermisos() {
        StringBuilder builder = new StringBuilder();

        try {
            reader = new FileReader(Utils.RUTA_PERMISO);

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

    public Permiso leerPermiso(String id) {
        Permiso permiso = new Permiso();

        String todosLosPermisos = leerTodosLosPermisos();

        Scanner scanner = new Scanner(todosLosPermisos);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] split = line.split(Utils.REGEX);

            if (split != null && split.length == 2) {
                if (id.equals(split[Utils.PERMISO_COLUMNA_ID])) {
                    permiso.setId(split[Utils.PERMISO_COLUMNA_ID]);
                    permiso.setNombre(split[Utils.PERMISO_COLUMNA_NOMBRE]);

                    break;
                }
            }
        }

        scanner.close();

        return permiso;
    }
}
