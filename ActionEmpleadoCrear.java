package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorEmpleado;
import controlador.ControladorEmpleado;
import modelo.Empleado;
import utils.Utils;

public class ActionEmpleadoCrear extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionEmpleadoCrear(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        
        String id = framePrincipal.getPanelEmpleadoCrear().getTextfieldId().getText();
        
        Empleado empleado = new Empleado();
        empleado.setId(id);
        empleado.setNombre(framePrincipal.getPanelEmpleadoCrear().getTextfieldNombre().getText());
        empleado.setRol(framePrincipal.getPanelEmpleadoCrear().getTextfieldRol().getText());
        empleado.setUsuario(framePrincipal.getPanelEmpleadoCrear().getTextfieldUsuario().getText());
        empleado.setPassword(framePrincipal.getPanelEmpleadoCrear().getTextfieldPassword().getText());
        
        controladorEmpleado.crearEmpleado(empleado);
        
        Utils.limpiarCampos(framePrincipal);
        framePrincipal.getPanelEmpleadoCrear().getLabelResultado().setText(Utils.EMPLEADO_CREADO_EXITOSAMENTE + ":  " + id);
        framePrincipal.getPanelEmpleadoCrear().getTextfieldId().setText(Utils.generarUUID());
        
        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
