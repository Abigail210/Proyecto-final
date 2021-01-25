package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorProducto;
import controlador.ControladorProducto;
import modelo.Producto;
import utils.Utils;

public class ActionProductoLeerId extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionProductoLeerId(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorProducto controladorProducto = new ControladorProducto();

        String id = framePrincipal.getPanelProductoActualizar().getTextfieldId().getText();

        Producto producto = controladorProducto.leerProducto(id);

        Utils.limpiarCampos(framePrincipal);

        framePrincipal.getPanelProductoActualizar().getTextfieldId().setText(id);
        framePrincipal.getPanelProductoActualizar().getTextfieldNombre().setText(producto.getNombre());
        framePrincipal.getPanelProductoActualizar().getTextfieldCodigo().setText(producto.getCodigo());
        framePrincipal.getPanelProductoActualizar().getTextfieldPrecio().setText(producto.getPrecio());
        framePrincipal.getPanelProductoActualizar().getTextfieldCantidad().setText(producto.getCantidad());

        framePrincipal.getPanelProductoActualizar().getTextfieldId().setEditable(false);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
