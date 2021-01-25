package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import utils.Utils;

public class ActionPanelEmpleadoBorrar extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionPanelEmpleadoBorrar(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Utils.limpiarCampos(framePrincipal);
        Utils.quitarPaneles(framePrincipal);

        framePrincipal.getPanelEmpleadoBorrar().setVisible(true);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
