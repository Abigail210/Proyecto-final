package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorEmpleado;
import controlador.ControladorEmpleado;
import modelo.Empleado;
import utils.Utils;

public class ActionEmpleadoLeerId extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionEmpleadoLeerId(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        
        String id = framePrincipal.getPanelEmpleadoActualizar().getTextfieldId().getText();
        
        Empleado empleado = controladorEmpleado.leerEmpleado(id);
        
        Utils.limpiarCampos(framePrincipal);
        
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldId().setText(id);
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldNombre().setText(empleado.getNombre());
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldRol().setText(empleado.getRol());
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldUsuario().setText(empleado.getUsuario());
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldPassword().setText(empleado.getPassword());
        
        framePrincipal.getPanelEmpleadoActualizar().getTextfieldId().setEditable(false);
        
        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
