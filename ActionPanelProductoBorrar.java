package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import utils.Utils;

public class ActionPanelProductoBorrar extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionPanelProductoBorrar(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Utils.limpiarCampos(framePrincipal);
        Utils.quitarPaneles(framePrincipal);

        framePrincipal.getPanelProductoBorrar().setVisible(true);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
