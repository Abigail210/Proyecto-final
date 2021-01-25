package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionSalir extends AbstractAction {
    
    private FramePrincipal framePrincipal;
    
    public ActionSalir(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        framePrincipal.dispose();
    }
}
