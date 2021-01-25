package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.Utils;

public class PanelProductoCrear extends JPanel {

    private JLabel labeTitulo;
    private JLabel labelId;
    private JLabel labelNombre;
    private JLabel labelCodigo;
    private JLabel labelPrecio;
    private JLabel labelCantidad;
    private JLabel labelResultado;

    private JTextField textfieldId;
    private JTextField textfieldNombre;
    private JTextField textfieldCodigo;
    private JTextField textfieldPrecio;
    private JTextField textfieldCantidad;

    private JButton buttonCrear;
    private JButton buttonCancelar;

    public PanelProductoCrear() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setBounds(10, 100, screenSize.width - 20, screenSize.height - 200);

        labeTitulo = new JLabel(Utils.CREAR_PRODUCTO);
        labeTitulo.setBounds(10, 10, screenSize.width - 100, 50);
        labeTitulo.setFont(Utils.obtenerFontTitulo());

        labelId = new JLabel(Utils.ID);
        labelId.setBounds(10, 100, 100, 30);

        labelNombre = new JLabel(Utils.NOMBRE);
        labelNombre.setBounds(10, 150, 100, 30);

        labelCodigo = new JLabel(Utils.CODIGO);
        labelCodigo.setBounds(10, 200, 100, 30);

        labelPrecio = new JLabel(Utils.PRECIO);
        labelPrecio.setBounds(10, 250, 100, 30);

        labelCantidad = new JLabel(Utils.CANTIDAD);
        labelCantidad.setBounds(10, 300, 100, 30);

        labelResultado = new JLabel();
        labelResultado.setBounds(600, 100, 500, 30);

        textfieldId = new JTextField();
        textfieldId.setBounds(200, 100, 300, 30);

        textfieldNombre = new JTextField();
        textfieldNombre.setBounds(200, 150, 300, 30);

        textfieldCodigo = new JTextField();
        textfieldCodigo.setBounds(200, 200, 300, 30);

        textfieldPrecio = new JTextField();
        textfieldPrecio.setBounds(200, 250, 300, 30);

        textfieldCantidad = new JTextField();
        textfieldCantidad.setBounds(200, 300, 300, 30);

        buttonCrear = new JButton();
        buttonCrear.setText(Utils.CREAR);
        buttonCrear.setBounds(10, 350, 100, 30);

        buttonCancelar = new JButton();
        buttonCancelar.setText(Utils.CANCELAR);
        buttonCancelar.setBounds(200, 350, 100, 30);

        add(labeTitulo);
        add(labelId);
        add(labelNombre);
        add(labelCodigo);
        add(labelPrecio);
        add(labelCantidad);
        add(labelResultado);
        add(textfieldId);
        add(textfieldNombre);
        add(textfieldCodigo);
        add(textfieldPrecio);
        add(textfieldCantidad);
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

    public JLabel getLabelCodigo() {
        return labelCodigo;
    }

    public void setLabelCodigo(JLabel labelCodigo) {
        this.labelCodigo = labelCodigo;
    }

    public JLabel getLabelPrecio() {
        return labelPrecio;
    }

    public void setLabelPrecio(JLabel labelPrecio) {
        this.labelPrecio = labelPrecio;
    }

    public JLabel getLabelCantidad() {
        return labelCantidad;
    }

    public void setLabelCantidad(JLabel labelCantidad) {
        this.labelCantidad = labelCantidad;
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

    public JTextField getTextfieldCodigo() {
        return textfieldCodigo;
    }

    public void setTextfieldCodigo(JTextField textfieldCodigo) {
        this.textfieldCodigo = textfieldCodigo;
    }

    public JTextField getTextfieldPrecio() {
        return textfieldPrecio;
    }

    public void setTextfieldPrecio(JTextField textfieldPrecio) {
        this.textfieldPrecio = textfieldPrecio;
    }

    public JTextField getTextfieldCantidad() {
        return textfieldCantidad;
    }

    public void setTextfieldCantidad(JTextField textfieldCantidad) {
        this.textfieldCantidad = textfieldCantidad;
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
