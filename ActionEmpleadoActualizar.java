package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorEmpleado;
import controlador.ControladorEmpleado;
import modelo.Empleado;
import utils.Utils;

public class ActionEmpleadoActualizar extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionEmpleadoActualizar(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        
        String id = framePrincipal.getPanelEmpleadoActualizar().getTextfieldId().getText();
        
        Empleado empleado = new Empleado();
        empleado.setId(id);
        empleado.setNombre(framePrincipal.getPanelEmpleadoActualizar().getTextfieldNombre().getText());
        empleado.setRol(framePrincipal.getPanelEmpleadoActualizar().getTextfieldRol().getText());
        empleado.setUsuario(framePrincipal.getPanelEmpleadoActualizar().getTextfieldUsuario().getText());
        empleado.setPassword(framePrincipal.getPanelEmpleadoActualizar().getTextfieldPassword().getText());
        
        controladorEmpleado.actualizarEmpleado(empleado);
        
        Utils.limpiarCampos(framePrincipal);
        
        framePrincipal.getPanelEmpleadoActualizar().getLabelResultado().setText(Utils.EMPLEADO_ACTUALIZADO_EXITOSAMENTE + ":  " + id);
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldId().setEditable(true);
        
        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
