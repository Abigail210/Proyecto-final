package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorEmpleado;
import controlador.ControladorEmpleado;
import utils.Utils;

public class ActionPanelEmpleadoLeerTodos extends AbstractAction {
    
private FramePrincipal framePrincipal;
    
    public ActionPanelEmpleadoLeerTodos(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Utils.limpiarCampos(framePrincipal);
        Utils.quitarPaneles(framePrincipal);
        
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        
        framePrincipal.getPanelEmpleadoLeerTodos().getTextArea().setText(controladorEmpleado.leerTodosLosEmpleados());
        framePrincipal.getPanelEmpleadoLeerTodos().getTextArea().setEditable(false);
        framePrincipal.getPanelEmpleadoLeerTodos().setVisible(true);
        
        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
