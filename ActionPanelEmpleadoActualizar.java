package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import utils.Utils;

public class ActionPanelEmpleadoActualizar extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionPanelEmpleadoActualizar(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Utils.limpiarCampos(framePrincipal);
        Utils.quitarPaneles(framePrincipal);

        framePrincipal.getPanelEmpleadoActualizar().getTextfieldId().setEditable(true);
        framePrincipal.getPanelEmpleadoActualizar().setVisible(true);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
