package prueba;

import vista.FramePrincipal;

public class PruebaFramePrincipal {

    public static void main(String[] args) {
        PruebaFramePrincipal x = new PruebaFramePrincipal();
        x.go();
    }

    public void go() {
        FramePrincipal framePrincipal = new FramePrincipal();
        framePrincipal.setVisible(true);
    }
}
