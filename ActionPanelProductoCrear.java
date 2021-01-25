package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import utils.Utils;

public class ActionPanelProductoCrear extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionPanelProductoCrear(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Utils.limpiarCampos(framePrincipal);
        Utils.quitarPaneles(framePrincipal);

        framePrincipal.getPanelProductoCrear().getTextfieldId().setText(Utils.generarUUID());
        framePrincipal.getPanelProductoCrear().getTextfieldId().setEditable(false);
        framePrincipal.getPanelProductoCrear().setVisible(true);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
