package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorProducto;
import controlador.ControladorProducto;
import modelo.Producto;
import utils.Utils;

public class ActionProductoActualizar extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionProductoActualizar(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorProducto controladorProducto = new ControladorProducto();

        String id = framePrincipal.getPanelProductoActualizar().getTextfieldId().getText();

        Producto producto = new Producto();
        producto.setId(id);
        producto.setNombre(framePrincipal.getPanelProductoActualizar().getTextfieldNombre().getText());
        producto.setCodigo(framePrincipal.getPanelProductoActualizar().getTextfieldCodigo().getText());
        producto.setPrecio(framePrincipal.getPanelProductoActualizar().getTextfieldPrecio().getText());
        producto.setCantidad(framePrincipal.getPanelProductoActualizar().getTextfieldCantidad().getText());

        controladorProducto.actualizarProducto(producto);

        Utils.limpiarCampos(framePrincipal);

        framePrincipal.getPanelProductoActualizar().getLabelResultado()
                .setText(Utils.PRODUCTO_ACTUALIZADO_EXITOSAMENTE + ":  " + id);
        framePrincipal.getPanelProductoActualizar().getTextfieldId().setEditable(true);

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
