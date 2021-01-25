package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.Utils;

public class PanelProductoBorrar extends JPanel {

    private JLabel labeTitulo;
    private JLabel labelId;
    private JLabel labelResultado;

    private JTextField textfieldId;

    private JButton buttonBorrar;
    private JButton buttonCancelar;

    public PanelProductoBorrar() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setBounds(10, 100, screenSize.width - 20, screenSize.height - 200);

        labeTitulo = new JLabel(Utils.BORRAR_PRODUCTO);
        labeTitulo.setBounds(10, 10, screenSize.width - 100, 50);
        labeTitulo.setFont(Utils.obtenerFontTitulo());

        labelId = new JLabel(Utils.ID);
        labelId.setBounds(10, 100, 100, 30);

        labelResultado = new JLabel();
        labelResultado.setBounds(600, 100, 500, 30);

        textfieldId = new JTextField();
        textfieldId.setBounds(200, 100, 300, 30);

        buttonBorrar = new JButton();
        buttonBorrar.setText(Utils.BORRAR);
        buttonBorrar.setBounds(10, 350, 100, 30);

        buttonCancelar = new JButton();
        buttonCancelar.setText(Utils.CANCELAR);
        buttonCancelar.setBounds(200, 350, 100, 30);

        add(labeTitulo);
        add(labelId);
        add(labelResultado);
        add(textfieldId);
        add(buttonBorrar);
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

    public JButton getButtonBorrar() {
        return buttonBorrar;
    }

    public void setButtonBorrar(JButton buttonBorrar) {
        this.buttonBorrar = buttonBorrar;
    }

    public JButton getButtonCancelar() {
        return buttonCancelar;
    }

    public void setButtonCancelar(JButton buttonCancelar) {
        this.buttonCancelar = buttonCancelar;
    }
}
