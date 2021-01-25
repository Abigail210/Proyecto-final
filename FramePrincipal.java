package vista;

import javax.swing.JFrame;

import utils.Utils;

public class FramePrincipal extends JFrame {

    private PanelMenu panelMenu;
    private PanelLogin panelLogin;
    private PanelEmpleadoCrear panelEmpleadoCrear;
    private PanelEmpleadoLeerTodos panelEmpleadoLeerTodos;
    private PanelEmpleadoActualizar panelEmpleadoActualizar;
    private PanelEmpleadoBorrar panelEmpleadoBorrar;
    private PanelProductoCrear panelProductoCrear;
    private PanelProductoLeerTodos panelProductoLeerTodos;
    private PanelProductoActualizar panelProductoActualizar;
    private PanelProductoBorrar panelProductoBorrar;

    public FramePrincipal() {
        panelMenu = new PanelMenu();
        panelMenu.getMenuItemEmpleadoCrear().addActionListener(new ActionPanelEmpleadoCrear(this));
        panelMenu.getMenuItemEmpleadoLeerTodos().addActionListener(new ActionPanelEmpleadoLeerTodos(this));
        panelMenu.getMenuItemEmpleadoActualizar().addActionListener(new ActionPanelEmpleadoActualizar(this));
        panelMenu.getMenuItemEmpleadoBorrar().addActionListener(new ActionPanelEmpleadoBorrar(this));
        panelMenu.getMenuItemProductoCrear().addActionListener(new ActionPanelProductoCrear(this));
        panelMenu.getMenuItemProductoLeerTodos().addActionListener(new ActionPanelProductoLeerTodos(this));
        panelMenu.getMenuItemProductoActualizar().addActionListener(new ActionPanelProductoActualizar(this));
        panelMenu.getMenuItemProductoBorrar().addActionListener(new ActionPanelProductoBorrar(this));
        panelMenu.getMenuItemSalir().addActionListener(new ActionSalir(this));
        panelMenu.setVisible(false);

        panelLogin = new PanelLogin();
        panelLogin.getButtonLogin().addActionListener(new ActionLogin(this));
        panelLogin.setVisible(true);

        panelEmpleadoCrear = new PanelEmpleadoCrear();
        panelEmpleadoCrear.getButtonCrear().addActionListener(new ActionEmpleadoCrear(this));
        panelEmpleadoCrear.setVisible(false);

        panelEmpleadoLeerTodos = new PanelEmpleadoLeerTodos();
        panelEmpleadoLeerTodos.setVisible(false);

        panelEmpleadoActualizar = new PanelEmpleadoActualizar();
        panelEmpleadoActualizar.getTextfieldId().addActionListener(new ActionEmpleadoLeerId(this));
        panelEmpleadoActualizar.getButtonActualizar().addActionListener(new ActionEmpleadoActualizar(this));
        panelEmpleadoActualizar.setVisible(false);

        panelEmpleadoBorrar = new PanelEmpleadoBorrar();
        panelEmpleadoBorrar.getButtonBorrar().addActionListener(new ActionEmpleadoBorrar(this));
        panelEmpleadoBorrar.setVisible(false);

        panelProductoCrear = new PanelProductoCrear();
        panelProductoCrear.getButtonCrear().addActionListener(new ActionProductoCrear(this));
        panelProductoCrear.setVisible(false);

        panelProductoLeerTodos = new PanelProductoLeerTodos();
        panelProductoLeerTodos.setVisible(false);

        panelProductoActualizar = new PanelProductoActualizar();
        panelProductoActualizar.getTextfieldId().addActionListener(new ActionProductoLeerId(this));
        panelProductoActualizar.getButtonActualizar().addActionListener(new ActionProductoActualizar(this));
        panelProductoActualizar.setVisible(false);

        panelProductoBorrar = new PanelProductoBorrar();
        panelProductoBorrar.getButtonBorrar().addActionListener(new ActionProductoBorrar(this));
        panelProductoBorrar.setVisible(false);

        add(panelMenu);
        add(panelLogin);
        add(panelEmpleadoCrear);
        add(panelEmpleadoLeerTodos);
        add(panelEmpleadoActualizar);
        add(panelEmpleadoBorrar);
        add(panelProductoCrear);
        add(panelProductoLeerTodos);
        add(panelProductoActualizar);
        add(panelProductoBorrar);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle(Utils.SISTEMA_DE_INVENTARIO);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
    }

    public PanelMenu getPanelMenu() {
        return panelMenu;
    }

    public void setPanelMenu(PanelMenu panelMenu) {
        this.panelMenu = panelMenu;
    }

    public PanelLogin getPanelLogin() {
        return panelLogin;
    }

    public void setPanelLogin(PanelLogin panelLogin) {
        this.panelLogin = panelLogin;
    }

    public PanelEmpleadoCrear getPanelEmpleadoCrear() {
        return panelEmpleadoCrear;
    }

    public void setPanelEmpleadoCrear(PanelEmpleadoCrear panelEmpleadoCrear) {
        this.panelEmpleadoCrear = panelEmpleadoCrear;
    }

    public PanelEmpleadoLeerTodos getPanelEmpleadoLeerTodos() {
        return panelEmpleadoLeerTodos;
    }

    public void setPanelEmpleadoLeerTodos(PanelEmpleadoLeerTodos panelEmpleadoLeerTodos) {
        this.panelEmpleadoLeerTodos = panelEmpleadoLeerTodos;
    }

    public PanelEmpleadoActualizar getPanelEmpleadoActualizar() {
        return panelEmpleadoActualizar;
    }

    public void setPanelEmpleadoActualizar(PanelEmpleadoActualizar panelEmpleadoActualizar) {
        this.panelEmpleadoActualizar = panelEmpleadoActualizar;
    }

    public PanelEmpleadoBorrar getPanelEmpleadoBorrar() {
        return panelEmpleadoBorrar;
    }

    public void setPanelEmpleadoBorrar(PanelEmpleadoBorrar panelEmpleadoBorrar) {
        this.panelEmpleadoBorrar = panelEmpleadoBorrar;
    }

    public PanelProductoCrear getPanelProductoCrear() {
        return panelProductoCrear;
    }

    public void setPanelProductoCrear(PanelProductoCrear panelProductoCrear) {
        this.panelProductoCrear = panelProductoCrear;
    }

    public PanelProductoLeerTodos getPanelProductoLeerTodos() {
        return panelProductoLeerTodos;
    }

    public void setPanelProductoLeerTodos(PanelProductoLeerTodos panelProductoLeerTodos) {
        this.panelProductoLeerTodos = panelProductoLeerTodos;
    }

    public PanelProductoActualizar getPanelProductoActualizar() {
        return panelProductoActualizar;
    }

    public void setPanelProductoActualizar(PanelProductoActualizar panelProductoActualizar) {
        this.panelProductoActualizar = panelProductoActualizar;
    }

    public PanelProductoBorrar getPanelProductoBorrar() {
        return panelProductoBorrar;
    }

    public void setPanelProductoBorrar(PanelProductoBorrar panelProductoBorrar) {
        this.panelProductoBorrar = panelProductoBorrar;
    }
}
