package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorProducto;
import controlador.ControladorProducto;
import utils.Utils;

public class ActionPanelProductoLeerTodos extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionPanelProductoLeerTodos(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Utils.limpiarCampos(framePrincipal);
        Utils.quitarPaneles(framePrincipal);

        ControladorProducto controladorProducto = new ControladorProducto();

        framePrincipal.getPanelProductoLeerTodos().getTextArea().setText(controladorProducto.leerTodosLosProductos());
        framePrincipal.getPanelProductoLeerTodos().getTextArea().setEditable(false);
        framePrincipal.getPanelProductoLeerTodos().setVisible(true);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
