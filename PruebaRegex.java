package prueba;

import utils.Utils;

public class PruebaRegex {

    public static void main(String[] args) {
        String spaces = Utils.ESPACIOS;
        System.out.println("No. de espacios: " + spaces.length());

        // String regex = "\\s{" + spaces.length() + ",}+";
        // \s{20,}+
        String regex = Utils.REGEX;

        String x = "ab                   cdef"; // Aqui hay 19 espacios
        String y = "ab                    cdef"; // Aqui hay 20 espacios
        String z = "ab                     cdef"; // Aqui hay 21 espacios
        String zz = "ab                     cd                     ef"; // Aqui hay 21 espacios

        System.out.println("x: " + x.replaceAll(regex, "#"));
        System.out.println("y: " + y.replaceAll(regex, "#"));
        System.out.println("z: " + z.replaceAll(regex, "#"));
        System.out.println("zz: " + zz.replaceAll(regex, "#"));
    }
}
