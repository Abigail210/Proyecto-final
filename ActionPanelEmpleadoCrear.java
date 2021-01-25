package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import utils.Utils;

public class ActionPanelEmpleadoCrear extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionPanelEmpleadoCrear(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Utils.limpiarCampos(framePrincipal);
        Utils.quitarPaneles(framePrincipal);

        framePrincipal.getPanelEmpleadoCrear().getTextfieldId().setText(Utils.generarUUID());
        framePrincipal.getPanelEmpleadoCrear().getTextfieldId().setEditable(false);
        framePrincipal.getPanelEmpleadoCrear().setVisible(true);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
