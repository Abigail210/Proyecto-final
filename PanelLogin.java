package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import utils.Utils;

public class PanelLogin extends JPanel {

    private JLabel labeTitulo;
    private JLabel labelUsuario;
    private JLabel labelPassword;

    private JTextField textfieldUsuario;
    private JTextField textfieldPassword;

    private JButton buttonLogin;
    private JButton buttonCancelar;

    public PanelLogin() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setBounds(10, 100, screenSize.width - 20, screenSize.height - 200);

        labeTitulo = new JLabel(Utils.LOGIN);
        labeTitulo.setBounds(10, 10, screenSize.width - 100, 50);
        labeTitulo.setFont(Utils.obtenerFontTitulo());

        labelUsuario = new JLabel(Utils.USUARIO);
        labelUsuario.setBounds(10, 100, 100, 30);

        labelPassword = new JLabel(Utils.PASSWORD);
        labelPassword.setBounds(10, 200, 100, 30);

        textfieldUsuario = new JTextField();
        textfieldUsuario.setBounds(200, 100, 300, 30);

        textfieldPassword = new JTextField();
        textfieldPassword.setBounds(200, 200, 300, 30);

        buttonLogin = new JButton();
        buttonLogin.setText(Utils.LOGIN);
        buttonLogin.setBounds(10, 300, 100, 30);

        buttonCancelar = new JButton();
        buttonCancelar.setText(Utils.CANCELAR);
        buttonCancelar.setBounds(200, 300, 100, 30);

        add(labeTitulo);
        add(labelUsuario);
        add(labelPassword);
        add(textfieldUsuario);
        add(textfieldPassword);
        add(buttonLogin);
        add(buttonCancelar);
    }

    public JLabel getLabeTitulo() {
        return labeTitulo;
    }

    public void setLabeTitulo(JLabel labeTitulo) {
        this.labeTitulo = labeTitulo;
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

    public JButton getButtonLogin() {
        return buttonLogin;
    }

    public void setButtonLogin(JButton buttonLogin) {
        this.buttonLogin = buttonLogin;
    }

    public JButton getButtonCancelar() {
        return buttonCancelar;
    }

    public void setButtonCancelar(JButton buttonCancelar) {
        this.buttonCancelar = buttonCancelar;
    }
}
