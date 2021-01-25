package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import utils.Utils;

public class ActionPanelProductoActualizar extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionPanelProductoActualizar(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Utils.limpiarCampos(framePrincipal);
        Utils.quitarPaneles(framePrincipal);

        framePrincipal.getPanelProductoActualizar().getTextfieldId().setEditable(true);
        framePrincipal.getPanelProductoActualizar().setVisible(true);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
