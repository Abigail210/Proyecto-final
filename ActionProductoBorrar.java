package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorProducto;
import controlador.ControladorProducto;
import utils.Utils;

public class ActionProductoBorrar extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionProductoBorrar(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorProducto controladorProducto = new ControladorProducto();

        String id = framePrincipal.getPanelProductoBorrar().getTextfieldId().getText();

        controladorProducto.borrarProducto(id);

        Utils.limpiarCampos(framePrincipal);

        framePrincipal.getPanelProductoBorrar().getLabelResultado().setText(Utils.PRODUCTO_BORRADO_EXITOSAMENTE + ":  " + id);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
