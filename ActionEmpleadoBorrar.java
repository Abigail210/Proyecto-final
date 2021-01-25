package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorEmpleado;
import controlador.ControladorEmpleado;
import utils.Utils;

public class ActionEmpleadoBorrar extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionEmpleadoBorrar(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        
        String id = framePrincipal.getPanelEmpleadoBorrar().getTextfieldId().getText();
        
        controladorEmpleado.borrarEmpleado(id);
        
        Utils.limpiarCampos(framePrincipal);
        
        framePrincipal.getPanelEmpleadoBorrar().getLabelResultado().setText(Utils.EMPLEADO_BORRADO_EXITOSAMENTE + ":  " + id);
        
        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
