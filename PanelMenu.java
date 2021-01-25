package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import utils.Utils;

public class PanelMenu extends JPanel {

    private JMenuItem menuItemEmpleadoCrear;
    private JMenuItem menuItemEmpleadoLeerTodos;
    private JMenuItem menuItemEmpleadoActualizar;
    private JMenuItem menuItemEmpleadoBorrar;

    private JMenuItem menuItemProductoCrear;
    private JMenuItem menuItemProductoLeerTodos;
    private JMenuItem menuItemProductoActualizar;
    private JMenuItem menuItemProductoBorrar;

    private JMenuItem menuItemSalir;

    private JMenu menuEmpleado;
    private JMenu menuProducto;
    private JMenu menuSalir;

    private JMenuBar menuBar;

    public PanelMenu() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setBounds(10, 10, screenSize.width - 20, 70);

        menuItemEmpleadoCrear = new JMenuItem();
        menuItemEmpleadoCrear.setText(Utils.CREAR);
        menuItemEmpleadoCrear.setVisible(false);

        menuItemEmpleadoLeerTodos = new JMenuItem();
        menuItemEmpleadoLeerTodos.setText(Utils.LEER_TODOS);
        menuItemEmpleadoLeerTodos.setVisible(false);

        menuItemEmpleadoActualizar = new JMenuItem();
        menuItemEmpleadoActualizar.setText(Utils.ACTUALIZAR);
        menuItemEmpleadoActualizar.setVisible(false);

        menuItemEmpleadoBorrar = new JMenuItem();
        menuItemEmpleadoBorrar.setText(Utils.BORRAR);
        menuItemEmpleadoBorrar.setVisible(false);

        menuEmpleado = new JMenu(Utils.EMPLEADO);
        menuEmpleado.add(menuItemEmpleadoCrear);
        menuEmpleado.add(menuItemEmpleadoLeerTodos);
        menuEmpleado.add(menuItemEmpleadoActualizar);
        menuEmpleado.add(menuItemEmpleadoBorrar);

        menuItemProductoCrear = new JMenuItem();
        menuItemProductoCrear.setText(Utils.CREAR);
        menuItemProductoCrear.setVisible(false);

        menuItemProductoLeerTodos = new JMenuItem();
        menuItemProductoLeerTodos.setText(Utils.LEER_TODOS);
        menuItemProductoLeerTodos.setVisible(false);

        menuItemProductoActualizar = new JMenuItem();
        menuItemProductoActualizar.setText(Utils.ACTUALIZAR);
        menuItemProductoActualizar.setVisible(false);

        menuItemProductoBorrar = new JMenuItem();
        menuItemProductoBorrar.setText(Utils.BORRAR);
        menuItemProductoBorrar.setVisible(false);

        menuProducto = new JMenu(Utils.PRODUCTO);
        menuProducto.add(menuItemProductoCrear);
        menuProducto.add(menuItemProductoLeerTodos);
        menuProducto.add(menuItemProductoActualizar);
        menuProducto.add(menuItemProductoBorrar);

        menuItemSalir = new JMenuItem(Utils.SALIR);

        menuSalir = new JMenu(Utils.SALIR);
        menuSalir.add(menuItemSalir);

        menuBar = new JMenuBar();
        menuBar.setBounds(10, 10, screenSize.width - 40, 50);
        menuBar.add(menuEmpleado);
        menuBar.add(menuProducto);
        menuBar.add(menuSalir);

        add(menuBar);
    }

    public JMenuItem getMenuItemEmpleadoCrear() {
        return menuItemEmpleadoCrear;
    }

    public void setMenuItemEmpleadoCrear(JMenuItem menuItemEmpleadoCrear) {
        this.menuItemEmpleadoCrear = menuItemEmpleadoCrear;
    }

    public JMenuItem getMenuItemEmpleadoLeerTodos() {
        return menuItemEmpleadoLeerTodos;
    }

    public void setMenuItemEmpleadoLeerTodos(JMenuItem menuItemEmpleadoLeerTodos) {
        this.menuItemEmpleadoLeerTodos = menuItemEmpleadoLeerTodos;
    }

    public JMenuItem getMenuItemEmpleadoActualizar() {
        return menuItemEmpleadoActualizar;
    }

    public void setMenuItemEmpleadoActualizar(JMenuItem menuItemEmpleadoActualizar) {
        this.menuItemEmpleadoActualizar = menuItemEmpleadoActualizar;
    }

    public JMenuItem getMenuItemEmpleadoBorrar() {
        return menuItemEmpleadoBorrar;
    }

    public void setMenuItemEmpleadoBorrar(JMenuItem menuItemEmpleadoBorrar) {
        this.menuItemEmpleadoBorrar = menuItemEmpleadoBorrar;
    }

    public JMenuItem getMenuItemProductoCrear() {
        return menuItemProductoCrear;
    }

    public void setMenuItemProductoCrear(JMenuItem menuItemProductoCrear) {
        this.menuItemProductoCrear = menuItemProductoCrear;
    }

    public JMenuItem getMenuItemProductoLeerTodos() {
        return menuItemProductoLeerTodos;
    }

    public void setMenuItemProductoLeerTodos(JMenuItem menuItemProductoLeerTodos) {
        this.menuItemProductoLeerTodos = menuItemProductoLeerTodos;
    }

    public JMenuItem getMenuItemProductoActualizar() {
        return menuItemProductoActualizar;
    }

    public void setMenuItemProductoActualizar(JMenuItem menuItemProductoActualizar) {
        this.menuItemProductoActualizar = menuItemProductoActualizar;
    }

    public JMenuItem getMenuItemProductoBorrar() {
        return menuItemProductoBorrar;
    }

    public void setMenuItemProductoBorrar(JMenuItem menuItemProductoBorrar) {
        this.menuItemProductoBorrar = menuItemProductoBorrar;
    }

    public JMenuItem getMenuItemSalir() {
        return menuItemSalir;
    }

    public void setMenuItemSalir(JMenuItem menuItemSalir) {
        this.menuItemSalir = menuItemSalir;
    }

    public JMenu getMenuEmpleado() {
        return menuEmpleado;
    }

    public void setMenuEmpleado(JMenu menuEmpleado) {
        this.menuEmpleado = menuEmpleado;
    }

    public JMenu getMenuProducto() {
        return menuProducto;
    }

    public void setMenuProducto(JMenu menuProducto) {
        this.menuProducto = menuProducto;
    }

    public JMenu getMenuSalir() {
        return menuSalir;
    }

    public void setMenuSalir(JMenu menuSalir) {
        this.menuSalir = menuSalir;
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }

    public void setMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }
}
