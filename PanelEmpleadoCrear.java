package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.Utils;

public class PanelEmpleadoCrear extends JPanel {

    private JLabel labeTitulo;
    private JLabel labelId;
    private JLabel labelNombre;
    private JLabel labelRol;
    private JLabel labelUsuario;
    private JLabel labelPassword;
    private JLabel labelResultado;

    private JTextField textfieldId;
    private JTextField textfieldNombre;
    private JTextField textfieldRol;
    private JTextField textfieldUsuario;
    private JTextField textfieldPassword;

    private JButton buttonCrear;
    private JButton buttonCancelar;

    public PanelEmpleadoCrear() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setBounds(10, 100, screenSize.width - 20, screenSize.height - 200);

        labeTitulo = new JLabel(Utils.CREAR_EMPLEADO);
        labeTitulo.setBounds(10, 10, screenSize.width - 100, 50);
        labeTitulo.setFont(Utils.obtenerFontTitulo());

        labelId = new JLabel(Utils.ID);
        labelId.setBounds(10, 100, 100, 30);

        labelNombre = new JLabel(Utils.NOMBRE);
        labelNombre.setBounds(10, 150, 100, 30);

        labelRol = new JLabel(Utils.ROL);
        labelRol.setBounds(10, 200, 100, 30);

        labelUsuario = new JLabel(Utils.USUARIO);
        labelUsuario.setBounds(10, 250, 100, 30);

        labelPassword = new JLabel(Utils.PASSWORD);
        labelPassword.setBounds(10, 300, 100, 30);

        labelResultado = new JLabel();
        labelResultado.setBounds(600, 100, 500, 30);

        textfieldId = new JTextField();
        textfieldId.setBounds(200, 100, 300, 30);

        textfieldNombre = new JTextField();
        textfieldNombre.setBounds(200, 150, 300, 30);

        textfieldRol = new JTextField();
        textfieldRol.setBounds(200, 200, 300, 30);

        textfieldUsuario = new JTextField();
        textfieldUsuario.setBounds(200, 250, 300, 30);

        textfieldPassword = new JTextField();
        textfieldPassword.setBounds(200, 300, 300, 30);

        buttonCrear = new JButton();
        buttonCrear.setText(Utils.CREAR);
        buttonCrear.setBounds(10, 350, 100, 30);

        buttonCancelar = new JButton();
        buttonCancelar.setText(Utils.CANCELAR);
        buttonCancelar.setBounds(200, 350, 100, 30);

        add(labeTitulo);
        add(labelId);
        add(labelNombre);
        add(labelRol);
        add(labelUsuario);
        add(labelPassword);
        add(labelResultado);
        add(textfieldId);
        add(textfieldNombre);
        add(textfieldRol);
        add(textfieldUsuario);
        add(textfieldPassword);
        add(buttonCrear);
        add(buttonCancelar);
    }

    public JLabel getLabeTitulo() {
        return labeTitulo;
    }

    public void setLabeTitulo(JLabel labeTitulo) {
        this.labeTitulo = labeTitulo;
    }

    public JLabel getLabelId() {
        return labelId;
    }

    public void setLabelId(JLabel labelId) {
        this.labelId = labelId;
    }

    public JLabel getLabelNombre() {
        return labelNombre;
    }

    public void setLabelNombre(JLabel labelNombre) {
        this.labelNombre = labelNombre;
    }

    public JLabel getLabelRol() {
        return labelRol;
    }

    public void setLabelRol(JLabel labelRol) {
        this.labelRol = labelRol;
    }

    public JLabel getLabelUsuario() {
        return labelUsuario;
    }

    public void setLabelUsuario(JLabel labelUsuario) {
        this.labelUsuario = labelUsuario;
    }

    public JLabel getLabelPassword() {
        return labelPassword;
    }

    public void setLabelPassword(JLabel labelPassword) {
        this.labelPassword = labelPassword;
    }

    public JLabel getLabelResultado() {
        return labelResultado;
    }

    public void setLabelResultado(JLabel labelResultado) {
        this.labelResultado = labelResultado;
    }

    public JTextField getTextfieldId() {
        return textfieldId;
    }

    public void setTextfieldId(JTextField textfieldId) {
        this.textfieldId = textfieldId;
    }

    public JTextField getTextfieldNombre() {
        return textfieldNombre;
    }

    public void setTextfieldNombre(JTextField textfieldNombre) {
        this.textfieldNombre = textfieldNombre;
    }

    public JTextField getTextfieldRol() {
        return textfieldRol;
    }

    public void setTextfieldRol(JTextField textfieldRol) {
        this.textfieldRol = textfieldRol;
    }

    public JTextField getTextfieldUsuario() {
        return textfieldUsuario;
    }

    public void setTextfieldUsuario(JTextField textfieldUsuario) {
        this.textfieldUsuario = textfieldUsuario;
    }

    public JTextField getTextfieldPassword() {
        return textfieldPassword;
    }

    public void setTextfieldPassword(JTextField textfieldPassword) {
        this.textfieldPassword = textfieldPassword;
    }

    public JButton getButtonCrear() {
        return buttonCrear;
    }

    public void setButtonCrear(JButton buttonCrear) {
        this.buttonCrear = buttonCrear;
    }

    public JButton getButtonCancelar() {
        return buttonCancelar;
    }

    public void setButtonCancelar(JButton buttonCancelar) {
        this.buttonCancelar = buttonCancelar;
    }
}
