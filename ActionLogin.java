package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorEmpleado;
import controlador.ControladorPermiso;
import controlador.ControladorRol;
import modelo.Empleado;
import modelo.Permiso;
import modelo.Rol;

public class ActionLogin extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionLogin(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PanelMenu panelMenu = framePrincipal.getPanelMenu();
        PanelLogin panelLogin = framePrincipal.getPanelLogin();

        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        ControladorRol controladorRol = new ControladorRol();
        ControladorPermiso controladorPermiso = new ControladorPermiso();

        Empleado empleado = controladorEmpleado.leerEmpleado(panelLogin.getTextfieldUsuario().getText(),
                panelLogin.getTextfieldPassword().getText());
        Rol rol = controladorRol.leerRol(empleado.getRol());

        String permisos = rol.getPermisos();

        String[] splitPermiso = permisos.split(",");

        for (int i = 0; i < splitPermiso.length; i++) {
            Permiso permiso = controladorPermiso.leerPermiso(splitPermiso[i]);

            if (panelMenu.getMenuItemEmpleadoCrear().getText().startsWith(permiso.getNombre())) {
                panelMenu.getMenuItemEmpleadoCrear().setVisible(true);
            } else if (panelMenu.getMenuItemEmpleadoLeerTodos().getText().startsWith(permiso.getNombre())) {
                panelMenu.getMenuItemEmpleadoLeerTodos().setVisible(true);
            } else if (panelMenu.getMenuItemEmpleadoActualizar().getText().startsWith(permiso.getNombre())) {
                panelMenu.getMenuItemEmpleadoActualizar().setVisible(true);
            } else if (panelMenu.getMenuItemEmpleadoBorrar().getText().startsWith(permiso.getNombre())) {
                panelMenu.getMenuItemEmpleadoBorrar().setVisible(true);
            }

            if (panelMenu.getMenuItemProductoCrear().getText().startsWith(permiso.getNombre())) {
                panelMenu.getMenuItemProductoCrear().setVisible(true);
            } else if (panelMenu.getMenuItemProductoLeerTodos().getText().startsWith(permiso.getNombre())) {
                panelMenu.getMenuItemProductoLeerTodos().setVisible(true);
            } else if (panelMenu.getMenuItemProductoActualizar().getText().startsWith(permiso.getNombre())) {
                panelMenu.getMenuItemProductoActualizar().setVisible(true);
            } else if (panelMenu.getMenuItemProductoBorrar().getText().startsWith(permiso.getNombre())) {
                panelMenu.getMenuItemProductoBorrar().setVisible(true);
            }
        }

        panelLogin.getTextfieldUsuario().setText("");
        panelLogin.getTextfieldPassword().setText("");
        panelLogin.setVisible(false);
        panelMenu.setVisible(true);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
