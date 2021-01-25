package vista;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import controlador.ControladorProducto;
import controlador.ControladorProducto;
import modelo.Producto;
import utils.Utils;

public class ActionProductoCrear extends AbstractAction {

    private FramePrincipal framePrincipal;

    public ActionProductoCrear(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ControladorProducto controladorProducto = new ControladorProducto();

        String id = framePrincipal.getPanelProductoCrear().getTextfieldId().getText();

        Producto producto = new Producto();
        producto.setId(id);
        producto.setNombre(framePrincipal.getPanelProductoCrear().getTextfieldNombre().getText());
        producto.setCodigo(framePrincipal.getPanelProductoCrear().getTextfieldCodigo().getText());
        producto.setPrecio(framePrincipal.getPanelProductoCrear().getTextfieldPrecio().getText());
        producto.setCantidad(framePrincipal.getPanelProductoCrear().getTextfieldCantidad().getText());

        controladorProducto.crearProducto(producto);

        Utils.limpiarCampos(framePrincipal);
        framePrincipal.getPanelProductoCrear().getLabelResultado().setText(Utils.PRODUCTO_CREADO_EXITOSAMENTE + ":  " + id);
        framePrincipal.getPanelProductoCrear().getTextfieldId().setText(Utils.generarUUID());

        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}
